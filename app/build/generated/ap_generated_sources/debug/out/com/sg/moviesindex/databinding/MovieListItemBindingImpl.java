package com.sg.moviesindex.databinding;
import com.sg.moviesindex.R;
import com.sg.moviesindex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MovieListItemBindingImpl extends MovieListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MovieListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private MovieListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.cvMovie.setTag(null);
        this.ivMovie.setTag(null);
        this.tvRating.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
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
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMovie((com.sg.moviesindex.model.tmdb.Movie) object, fieldId);
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
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.originalTitle) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.voteAverage) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String movieOriginalTitle = null;
        com.sg.moviesindex.model.tmdb.Movie movie = mMovie;
        java.lang.String javaLangStringMovieVoteAverage = null;
        java.lang.String moviePosterPath = null;
        java.lang.String javaLangStringHttpsImageTmdbOrgTPW500MoviePosterPath = null;
        java.lang.Double movieVoteAverage = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (movie != null) {
                        // read movie.originalTitle
                        movieOriginalTitle = movie.getOriginalTitle();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (movie != null) {
                        // read movie.posterPath
                        moviePosterPath = movie.getPosterPath();
                    }


                    // read ("https://image.tmdb.org/t/p/w500") + (movie.posterPath)
                    javaLangStringHttpsImageTmdbOrgTPW500MoviePosterPath = ("https://image.tmdb.org/t/p/w500") + (moviePosterPath);
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (movie != null) {
                        // read movie.voteAverage
                        movieVoteAverage = movie.getVoteAverage();
                    }


                    // read ("") + (movie.voteAverage)
                    javaLangStringMovieVoteAverage = ("") + (movieVoteAverage);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            com.sg.moviesindex.adapter.MoviesAdapter.loadImage(this.ivMovie, javaLangStringHttpsImageTmdbOrgTPW500MoviePosterPath);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRating, javaLangStringMovieVoteAverage);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, movieOriginalTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): movie.posterPath
        flag 2 (0x3L): movie.originalTitle
        flag 3 (0x4L): movie.voteAverage
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}