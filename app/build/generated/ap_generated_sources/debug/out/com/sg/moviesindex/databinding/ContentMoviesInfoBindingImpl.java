package com.sg.moviesindex.databinding;
import com.sg.moviesindex.R;
import com.sg.moviesindex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContentMoviesInfoBindingImpl extends ContentMoviesInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ad, 7);
        sViewsWithIds.put(R.id.llMovieRating, 8);
        sViewsWithIds.put(R.id.circularProgress, 9);
        sViewsWithIds.put(R.id.circularProgressAppRate, 10);
        sViewsWithIds.put(R.id.ratingApp, 11);
        sViewsWithIds.put(R.id.buttonRate, 12);
        sViewsWithIds.put(R.id.spark_button, 13);
        sViewsWithIds.put(R.id.tvOverview, 14);
        sViewsWithIds.put(R.id.tvGenre, 15);
        sViewsWithIds.put(R.id.chip_group, 16);
        sViewsWithIds.put(R.id.castsLayout, 17);
        sViewsWithIds.put(R.id.casts, 18);
        sViewsWithIds.put(R.id.button1, 19);
        sViewsWithIds.put(R.id.rvCasts, 20);
        sViewsWithIds.put(R.id.reviews, 21);
        sViewsWithIds.put(R.id.reviewApp, 22);
        sViewsWithIds.put(R.id.buttonReview, 23);
        sViewsWithIds.put(R.id.rvReviews, 24);
        sViewsWithIds.put(R.id.reviewsListView, 25);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContentMoviesInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private ContentMoviesInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[23]
            , (android.widget.TextView) bindings[18]
            , (android.widget.LinearLayout) bindings[17]
            , (com.google.android.material.chip.ChipGroup) bindings[16]
            , (antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator) bindings[9]
            , (antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator) bindings[10]
            , (android.widget.LinearLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[11]
            , (com.google.android.material.textfield.TextInputEditText) bindings[22]
            , (android.widget.TextView) bindings[21]
            , (android.widget.ListView) bindings[25]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (com.varunest.sparkbutton.SparkButton) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvLanguage.setTag(null);
        this.tvMovieTitle.setTag(null);
        this.tvPlotsynopsis.setTag(null);
        this.tvPopularity.setTag(null);
        this.tvReleaseDate.setTag(null);
        this.tvStatus.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
        if (BR.checkBox == variableId) {
            setCheckBox((android.widget.CheckBox) variable);
        }
        else if (BR.locale == variableId) {
            setLocale((java.lang.String) variable);
        }
        else if (BR.contentMovie == variableId) {
            setContentMovie((com.sg.moviesindex.model.tmdb.Movie) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckBox(@Nullable android.widget.CheckBox CheckBox) {
        this.mCheckBox = CheckBox;
    }
    public void setLocale(@Nullable java.lang.String Locale) {
        this.mLocale = Locale;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.locale);
        super.requestRebind();
    }
    public void setContentMovie(@Nullable com.sg.moviesindex.model.tmdb.Movie ContentMovie) {
        updateRegistration(0, ContentMovie);
        this.mContentMovie = ContentMovie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.contentMovie);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeContentMovie((com.sg.moviesindex.model.tmdb.Movie) object, fieldId);
        }
        return false;
    }
    private boolean onChangeContentMovie(com.sg.moviesindex.model.tmdb.Movie ContentMovie, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.title) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.status) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.releaseDate) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.runtime) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.overview) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        long contentMovieRuntimeInt60 = 0;
        java.lang.String contentMovieOverview = null;
        long androidxDatabindingViewDataBindingSafeUnboxContentMovieRuntime = 0;
        java.lang.String contentMovieTitle = null;
        java.lang.String javaLangStringOriginalTitleNContentMovieTitle = null;
        java.lang.String javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrs = null;
        java.lang.String javaLangStringOriginalLanguageLocale = null;
        java.lang.String javaLangStringRuntimeContentMovieRuntimeInt60 = null;
        java.lang.Long contentMovieRuntime = null;
        java.lang.String javaLangStringReleaseDateContentMovieReleaseDate = null;
        java.lang.String javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrsContentMovieRuntimeInt60 = null;
        java.lang.String locale = mLocale;
        java.lang.String javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrsContentMovieRuntimeInt60JavaLangStringMins = null;
        java.lang.String contentMovieStatus = null;
        java.lang.String contentMovieReleaseDate = null;
        com.sg.moviesindex.model.tmdb.Movie contentMovie = mContentMovie;
        java.lang.String javaLangStringStatusContentMovieStatus = null;
        long ContentMovieRuntimeInt601 = 0;

        if ((dirtyFlags & 0x104L) != 0) {



                // read ("Original Language: ") + (locale)
                javaLangStringOriginalLanguageLocale = ("Original Language: ") + (locale);
        }
        if ((dirtyFlags & 0x1f9L) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (contentMovie != null) {
                        // read contentMovie.overview
                        contentMovieOverview = contentMovie.getOverview();
                    }
            }
            if ((dirtyFlags & 0x109L) != 0) {

                    if (contentMovie != null) {
                        // read contentMovie.title
                        contentMovieTitle = contentMovie.getTitle();
                    }


                    // read ("Original Title:\n") + (contentMovie.title)
                    javaLangStringOriginalTitleNContentMovieTitle = ("Original Title:\n") + (contentMovieTitle);
            }
            if ((dirtyFlags & 0x141L) != 0) {

                    if (contentMovie != null) {
                        // read contentMovie.runtime
                        contentMovieRuntime = contentMovie.getRuntime();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)
                    androidxDatabindingViewDataBindingSafeUnboxContentMovieRuntime = androidx.databinding.ViewDataBinding.safeUnbox(contentMovieRuntime);


                    // read (androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)) / (60)
                    contentMovieRuntimeInt60 = (androidxDatabindingViewDataBindingSafeUnboxContentMovieRuntime) / (60);
                    // read (androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)) % (60)
                    ContentMovieRuntimeInt601 = (androidxDatabindingViewDataBindingSafeUnboxContentMovieRuntime) % (60);


                    // read ("Runtime: ") + ((androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)) / (60))
                    javaLangStringRuntimeContentMovieRuntimeInt60 = ("Runtime: ") + (contentMovieRuntimeInt60);


                    // read (("Runtime: ") + ((androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)) / (60))) + ("Hrs ")
                    javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrs = (javaLangStringRuntimeContentMovieRuntimeInt60) + ("Hrs ");


                    // read ((("Runtime: ") + ((androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)) / (60))) + ("Hrs ")) + ((androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)) % (60))
                    javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrsContentMovieRuntimeInt60 = (javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrs) + (ContentMovieRuntimeInt601);


                    // read (((("Runtime: ") + ((androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)) / (60))) + ("Hrs ")) + ((androidx.databinding.ViewDataBinding.safeUnbox(contentMovie.runtime)) % (60))) + ("Mins")
                    javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrsContentMovieRuntimeInt60JavaLangStringMins = (javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrsContentMovieRuntimeInt60) + ("Mins");
            }
            if ((dirtyFlags & 0x111L) != 0) {

                    if (contentMovie != null) {
                        // read contentMovie.status
                        contentMovieStatus = contentMovie.getStatus();
                    }


                    // read ("Status: ") + (contentMovie.status)
                    javaLangStringStatusContentMovieStatus = ("Status: ") + (contentMovieStatus);
            }
            if ((dirtyFlags & 0x121L) != 0) {

                    if (contentMovie != null) {
                        // read contentMovie.releaseDate
                        contentMovieReleaseDate = contentMovie.getReleaseDate();
                    }


                    // read ("Release Date: ") + (contentMovie.releaseDate)
                    javaLangStringReleaseDateContentMovieReleaseDate = ("Release Date: ") + (contentMovieReleaseDate);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x104L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLanguage, javaLangStringOriginalLanguageLocale);
        }
        if ((dirtyFlags & 0x109L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMovieTitle, javaLangStringOriginalTitleNContentMovieTitle);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPlotsynopsis, contentMovieOverview);
        }
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPopularity, javaLangStringRuntimeContentMovieRuntimeInt60JavaLangStringHrsContentMovieRuntimeInt60JavaLangStringMins);
        }
        if ((dirtyFlags & 0x121L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvReleaseDate, javaLangStringReleaseDateContentMovieReleaseDate);
        }
        if ((dirtyFlags & 0x111L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvStatus, javaLangStringStatusContentMovieStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): contentMovie
        flag 1 (0x2L): checkBox
        flag 2 (0x3L): locale
        flag 3 (0x4L): contentMovie.title
        flag 4 (0x5L): contentMovie.status
        flag 5 (0x6L): contentMovie.releaseDate
        flag 6 (0x7L): contentMovie.runtime
        flag 7 (0x8L): contentMovie.overview
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}