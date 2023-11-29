package com.sg.moviesindex.view;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.sg.moviesindex.R;
import com.sg.moviesindex.fragments.FavouriteMovies;
import com.sg.moviesindex.model.tmdb.Discover;
import com.sg.moviesindex.model.tmdb.Genre;
import com.sg.moviesindex.model.tmdb.Movie;
import com.sg.moviesindex.service.FetchFirstTimeDataService;
import com.sg.moviesindex.service.FetchGenresListService;
import com.sg.moviesindex.utils.SearchUtil;

import java.util.ArrayList;

import io.reactivex.disposables.CompositeDisposable;


public class MainPage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth auth;
    private TextView textView;
    private FirebaseUser user;
    private ProgressBar progressBar;
    public static ArrayList<Movie> movieList = new ArrayList<>();
    private FragmentManager fragmentManager;
    public static int totalPages;
    public static int totalPagesGenres;
    public static int drawer = 0;
    public static int imageup = 0;
    public static long genreid;
    public static String region = "";
    public static int selected;
    public static ArrayList<Discover> discovers;
    public static ArrayList<Genre> genres;
    public static ArrayList<Discover> search;
    public static ArrayList<Movie> moviesearch;
    public static String queryM;
    private LinearLayout linearLayoutError;
    private Button refreshButtonError;
    private NavigationView navigationView;
    public FetchGenresListService genresList;
    private FetchFirstTimeDataService fetchFirstTimeDataService;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    final static int MY_PERMISSIONS_REQUESTS_NOTIFICATION_PERMISSIONS = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
       /* if(user == null) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
        } else {
            textView.setText(user.getEmail());
        }*/
        fragmentManager = getSupportFragmentManager();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        progressBar = findViewById(R.id.progressBar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        progressBar.animate().alpha(1).setDuration(500);
        progressBar.setIndeterminate(true);
        linearLayoutError = findViewById(R.id.llError);
        refreshButtonError = findViewById(R.id.buttonllError);
        navigationView.getMenu().getItem(0).setChecked(true);
        fetchFirstTimeDataService = new FetchFirstTimeDataService(linearLayoutError, refreshButtonError, progressBar, compositeDisposable, fragmentManager, MainPage.this);
        fetchFirstTimeDataService.getDataFirst();
        genresList = new FetchGenresListService(linearLayoutError, refreshButtonError, MainPage.this, compositeDisposable, fetchFirstTimeDataService, progressBar);
        requestNotificationPermissions();
    }

    @TargetApi(Build.VERSION_CODES.TIRAMISU)
    public void requestNotificationPermissions() {
        if (ContextCompat.checkSelfPermission(MainPage.this,
                Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainPage.this,
                    new String[]{Manifest.permission.POST_NOTIFICATIONS}, MY_PERMISSIONS_REQUESTS_NOTIFICATION_PERMISSIONS);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (MainPage.drawer != 0) {
            MainPage.drawer = 0;
            for (int i = 0; i < getSupportFragmentManager().getBackStackEntryCount(); i++) {
                getSupportFragmentManager().popBackStack();
            }
            navigationView.getMenu().getItem(0).setChecked(true);
            fetchFirstTimeDataService.getDataFirst();
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(View.VISIBLE);
        linearLayoutError.setVisibility(View.GONE);

        int id = item.getItemId();

        if (id == R.id.movies) {
            drawer = 0;
            for (int i = 0; i < getSupportFragmentManager().getBackStackEntryCount(); i++) {
                getSupportFragmentManager().popBackStack();
            }
            fetchFirstTimeDataService.getDataFirst();
        } else if (id == R.id.favmovies) {
            FragmentTransaction fragmentTransaction1;
            for (int i = 0; i < getSupportFragmentManager().getBackStackEntryCount(); i++) {
                getSupportFragmentManager().popBackStack();
            }
            drawer = 5;
            fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
            fragmentTransaction1.addToBackStack(null);
            fragmentTransaction1.replace(R.id.frame_layout, FavouriteMovies.newInstance()).commit();
        } else if (id == R.id.toprated) {
            drawer = 3;
            for (int i = 0; i < getSupportFragmentManager().getBackStackEntryCount(); i++) {
                getSupportFragmentManager().popBackStack();
            }
            fetchFirstTimeDataService.getDataFirst();
        } else if (id == R.id.genres) {
            drawer = 4;
            for (int i = 0; i < getSupportFragmentManager().getBackStackEntryCount(); i++) {
                getSupportFragmentManager().popBackStack();
            }
            genresList.getGenresList();
        } else if (id == R.id.upcoming_movies) {
            drawer = 2;
            for (int i = 0; i < getSupportFragmentManager().getBackStackEntryCount(); i++) {
                getSupportFragmentManager().popBackStack();
            }
            fetchFirstTimeDataService.getDataFirst();
        } else if (id == R.id.now_playing) {
            drawer = 1;
            for (int i = 0; i < getSupportFragmentManager().getBackStackEntryCount(); i++) {
                getSupportFragmentManager().popBackStack();
            }
            fetchFirstTimeDataService.getDataFirst();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_view, menu);
        MenuItem menuItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        SearchUtil searchUtil = new SearchUtil(linearLayoutError, refreshButtonError, compositeDisposable, fragmentManager, MainPage.this, progressBar, fetchFirstTimeDataService);
        searchUtil.search(searchView);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        compositeDisposable.clear();
    }

}
