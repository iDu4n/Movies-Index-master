package com.sg.moviesindex.databinding;
import com.sg.moviesindex.R;
import com.sg.moviesindex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMoviesInfoBindingImpl extends ActivityMoviesInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"content_movies_info"},
            new int[] {3},
            new int[] {com.sg.moviesindex.R.layout.content_movies_info});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ctbMovie, 4);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMoviesInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMoviesInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (com.sg.moviesindex.databinding.ContentMoviesInfoBinding) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.ivMovieLarge.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.secondaryLayout);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        secondaryLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (secondaryLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.movie == variableId) {
            setMovie((com.sg.moviesindex.model.tmdb.Movie) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.sg.moviesindex.model.tmdb.Movie Movie) {
        updateRegistration(0, Movie);
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        secondaryLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMovie((com.sg.moviesindex.model.tmdb.Movie) object, fieldId);
            case 1 :
                return onChangeSecondaryLayout((com.sg.moviesindex.databinding.ContentMoviesInfoBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMovie(com.sg.moviesindex.model.tmdb.Movie Movie, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.posterPath) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.title) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSecondaryLayout(com.sg.moviesindex.databinding.ContentMoviesInfoBinding SecondaryLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.sg.moviesindex.model.tmdb.Movie movie = mMovie;
        java.lang.String moviePosterPath = null;
        java.lang.String javaLangStringHttpsImageTmdbOrgTPW500MoviePosterPath = null;
        java.lang.String movieTitle = null;

        if ((dirtyFlags & 0x1dL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (movie != null) {
                        // read movie.posterPath
                        moviePosterPath = movie.getPosterPath();
                    }


                    // read ("https://image.tmdb.org/t/p/w500") + (movie.posterPath)
                    javaLangStringHttpsImageTmdbOrgTPW500MoviePosterPath = ("https://image.tmdb.org/t/p/w500") + (moviePosterPath);
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (movie != null) {
                        // read movie.title
                        movieTitle = movie.getTitle();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.sg.moviesindex.adapter.MoviesAdapter.loadImage(this.ivMovieLarge, javaLangStringHttpsImageTmdbOrgTPW500MoviePosterPath);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.secondaryLayout.setContentMovie(movie);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.toolbar.setTitle(movieTitle);
        }
        executeBindingsOn(secondaryLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): secondaryLayout
        flag 2 (0x3L): movie.posterPath
        flag 3 (0x4L): movie.title
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}