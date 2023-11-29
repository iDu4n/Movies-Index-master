package com.sg.moviesindex.databinding;
import com.sg.moviesindex.R;
import com.sg.moviesindex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CastListItemBindingImpl extends CastListItemBinding  {

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

    public CastListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private CastListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.cvMovie.setTag(null);
        this.ivProfile.setTag(null);
        this.tvCharacter.setTag(null);
        this.tvGender.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.gender == variableId) {
            setGender((java.lang.String) variable);
        }
        else if (BR.cast == variableId) {
            setCast((com.sg.moviesindex.model.tmdb.Cast) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGender(@Nullable java.lang.String Gender) {
        this.mGender = Gender;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.gender);
        super.requestRebind();
    }
    public void setCast(@Nullable com.sg.moviesindex.model.tmdb.Cast Cast) {
        this.mCast = Cast;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cast);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String gender = mGender;
        java.lang.String javaLangStringCharacterCastCharacter = null;
        java.lang.String javaLangStringHttpsImageTmdbOrgTPW500CastProfilePath = null;
        com.sg.moviesindex.model.tmdb.Cast cast = mCast;
        java.lang.String castName = null;
        java.lang.String javaLangStringGenderGender = null;
        java.lang.String castCharacter = null;
        java.lang.String castProfilePath = null;

        if ((dirtyFlags & 0x5L) != 0) {



                // read ("Gender: ") + (gender)
                javaLangStringGenderGender = ("Gender: ") + (gender);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (cast != null) {
                    // read cast.name
                    castName = cast.getName();
                    // read cast.character
                    castCharacter = cast.getCharacter();
                    // read cast.profilePath
                    castProfilePath = cast.getProfilePath();
                }


                // read ("Character: ") + (cast.character)
                javaLangStringCharacterCastCharacter = ("Character: ") + (castCharacter);
                // read ("https://image.tmdb.org/t/p/w500") + (cast.profilePath)
                javaLangStringHttpsImageTmdbOrgTPW500CastProfilePath = ("https://image.tmdb.org/t/p/w500") + (castProfilePath);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.sg.moviesindex.adapter.CastsAdapter.loadImage(this.ivProfile, javaLangStringHttpsImageTmdbOrgTPW500CastProfilePath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCharacter, javaLangStringCharacterCastCharacter);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, castName);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGender, javaLangStringGenderGender);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gender
        flag 1 (0x2L): cast
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}