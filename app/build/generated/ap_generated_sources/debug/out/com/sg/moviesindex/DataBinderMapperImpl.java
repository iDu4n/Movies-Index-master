package com.sg.moviesindex;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sg.moviesindex.databinding.ActivityMainBindingImpl;
import com.sg.moviesindex.databinding.ActivityMoviesInfoBindingImpl;
import com.sg.moviesindex.databinding.AppBarMainBindingImpl;
import com.sg.moviesindex.databinding.CastListItemBindingImpl;
import com.sg.moviesindex.databinding.ContentMainBindingImpl;
import com.sg.moviesindex.databinding.ContentMoviesInfoBindingImpl;
import com.sg.moviesindex.databinding.FragmentFavouriteMoviesBindingImpl;
import com.sg.moviesindex.databinding.FragmentMoviesBindingImpl;
import com.sg.moviesindex.databinding.MovieListItemBindingImpl;
import com.sg.moviesindex.databinding.NavHeaderMainBindingImpl;
import com.sg.moviesindex.databinding.ReviewListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYMOVIESINFO = 2;

  private static final int LAYOUT_APPBARMAIN = 3;

  private static final int LAYOUT_CASTLISTITEM = 4;

  private static final int LAYOUT_CONTENTMAIN = 5;

  private static final int LAYOUT_CONTENTMOVIESINFO = 6;

  private static final int LAYOUT_FRAGMENTFAVOURITEMOVIES = 7;

  private static final int LAYOUT_FRAGMENTMOVIES = 8;

  private static final int LAYOUT_MOVIELISTITEM = 9;

  private static final int LAYOUT_NAVHEADERMAIN = 10;

  private static final int LAYOUT_REVIEWLISTITEM = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.activity_movies_info, LAYOUT_ACTIVITYMOVIESINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.app_bar_main, LAYOUT_APPBARMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.cast_list_item, LAYOUT_CASTLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.content_main, LAYOUT_CONTENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.content_movies_info, LAYOUT_CONTENTMOVIESINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.fragment_favourite_movies, LAYOUT_FRAGMENTFAVOURITEMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.fragment_movies, LAYOUT_FRAGMENTMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.movie_list_item, LAYOUT_MOVIELISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.nav_header_main, LAYOUT_NAVHEADERMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.sg.moviesindex.R.layout.review_list_item, LAYOUT_REVIEWLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMOVIESINFO: {
          if ("layout/activity_movies_info_0".equals(tag)) {
            return new ActivityMoviesInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_movies_info is invalid. Received: " + tag);
        }
        case  LAYOUT_APPBARMAIN: {
          if ("layout/app_bar_main_0".equals(tag)) {
            return new AppBarMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_bar_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CASTLISTITEM: {
          if ("layout/cast_list_item_0".equals(tag)) {
            return new CastListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cast_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTMAIN: {
          if ("layout/content_main_0".equals(tag)) {
            return new ContentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTMOVIESINFO: {
          if ("layout/content_movies_info_0".equals(tag)) {
            return new ContentMoviesInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_movies_info is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVOURITEMOVIES: {
          if ("layout/fragment_favourite_movies_0".equals(tag)) {
            return new FragmentFavouriteMoviesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favourite_movies is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIES: {
          if ("layout/fragment_movies_0".equals(tag)) {
            return new FragmentMoviesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movies is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIELISTITEM: {
          if ("layout/movie_list_item_0".equals(tag)) {
            return new MovieListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADERMAIN: {
          if ("layout/nav_header_main_0".equals(tag)) {
            return new NavHeaderMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header_main is invalid. Received: " + tag);
        }
        case  LAYOUT_REVIEWLISTITEM: {
          if ("layout/review_list_item_0".equals(tag)) {
            return new ReviewListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for review_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(29);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adult");
      sKeys.put(2, "backdropPath");
      sKeys.put(3, "budget");
      sKeys.put(4, "cast");
      sKeys.put(5, "castsList");
      sKeys.put(6, "checkBox");
      sKeys.put(7, "contentMovie");
      sKeys.put(8, "gender");
      sKeys.put(9, "genres");
      sKeys.put(10, "id");
      sKeys.put(11, "imdbId");
      sKeys.put(12, "locale");
      sKeys.put(13, "movie");
      sKeys.put(14, "originalLanguage");
      sKeys.put(15, "originalTitle");
      sKeys.put(16, "overview");
      sKeys.put(17, "popularity");
      sKeys.put(18, "posterPath");
      sKeys.put(19, "releaseDate");
      sKeys.put(20, "revenue");
      sKeys.put(21, "review");
      sKeys.put(22, "reviewsList");
      sKeys.put(23, "runtime");
      sKeys.put(24, "status");
      sKeys.put(25, "tagline");
      sKeys.put(26, "title");
      sKeys.put(27, "video");
      sKeys.put(28, "voteAverage");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_main_0", com.sg.moviesindex.R.layout.activity_main);
      sKeys.put("layout/activity_movies_info_0", com.sg.moviesindex.R.layout.activity_movies_info);
      sKeys.put("layout/app_bar_main_0", com.sg.moviesindex.R.layout.app_bar_main);
      sKeys.put("layout/cast_list_item_0", com.sg.moviesindex.R.layout.cast_list_item);
      sKeys.put("layout/content_main_0", com.sg.moviesindex.R.layout.content_main);
      sKeys.put("layout/content_movies_info_0", com.sg.moviesindex.R.layout.content_movies_info);
      sKeys.put("layout/fragment_favourite_movies_0", com.sg.moviesindex.R.layout.fragment_favourite_movies);
      sKeys.put("layout/fragment_movies_0", com.sg.moviesindex.R.layout.fragment_movies);
      sKeys.put("layout/movie_list_item_0", com.sg.moviesindex.R.layout.movie_list_item);
      sKeys.put("layout/nav_header_main_0", com.sg.moviesindex.R.layout.nav_header_main);
      sKeys.put("layout/review_list_item_0", com.sg.moviesindex.R.layout.review_list_item);
    }
  }
}
