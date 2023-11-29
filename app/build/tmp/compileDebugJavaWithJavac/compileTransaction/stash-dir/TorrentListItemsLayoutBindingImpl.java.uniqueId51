package com.sg.moviesindex.databinding;
import com.sg.moviesindex.R;
import com.sg.moviesindex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TorrentListItemsLayoutBindingImpl extends TorrentListItemsLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvLLSP, 6);
        sViewsWithIds.put(R.id.ivDownloadButton, 7);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TorrentListItemsLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private TorrentListItemsLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvPeers.setTag(null);
        this.tvQuality.setTag(null);
        this.tvSeeds.setTag(null);
        this.tvSize.setTag(null);
        this.tvType.setTag(null);
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
        if (BR.torrent == variableId) {
            setTorrent((com.sg.moviesindex.model.yts.Torrent) variable);
        }
        else if (BR.stringBuilder == variableId) {
            setStringBuilder((android.text.SpannableStringBuilder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTorrent(@Nullable com.sg.moviesindex.model.yts.Torrent Torrent) {
        this.mTorrent = Torrent;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.torrent);
        super.requestRebind();
    }
    public void setStringBuilder(@Nullable android.text.SpannableStringBuilder StringBuilder) {
        this.mStringBuilder = StringBuilder;
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
        java.lang.String torrentGetTypeToString = null;
        java.lang.String torrentGetPeersToString = null;
        java.lang.String torrentGetSeedsToString = null;
        java.lang.String torrentGetQualityToString = null;
        java.lang.Long torrentGetSeeds = null;
        java.lang.String torrentGetQuality = null;
        java.lang.String torrentGetSize = null;
        java.lang.Long torrentGetPeers = null;
        com.sg.moviesindex.model.yts.Torrent torrent = mTorrent;
        java.lang.String torrentGetType = null;
        java.lang.String torrentGetSizeToString = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (torrent != null) {
                    // read torrent.getSeeds()
                    torrentGetSeeds = torrent.getSeeds();
                    // read torrent.getQuality()
                    torrentGetQuality = torrent.getQuality();
                    // read torrent.getSize()
                    torrentGetSize = torrent.getSize();
                    // read torrent.getPeers()
                    torrentGetPeers = torrent.getPeers();
                    // read torrent.getType()
                    torrentGetType = torrent.getType();
                }


                if (torrentGetSeeds != null) {
                    // read torrent.getSeeds().toString()
                    torrentGetSeedsToString = torrentGetSeeds.toString();
                }
                if (torrentGetQuality != null) {
                    // read torrent.getQuality().toString()
                    torrentGetQualityToString = torrentGetQuality.toString();
                }
                if (torrentGetSize != null) {
                    // read torrent.getSize().toString()
                    torrentGetSizeToString = torrentGetSize.toString();
                }
                if (torrentGetPeers != null) {
                    // read torrent.getPeers().toString()
                    torrentGetPeersToString = torrentGetPeers.toString();
                }
                if (torrentGetType != null) {
                    // read torrent.getType().toString()
                    torrentGetTypeToString = torrentGetType.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.sg.moviesindex.adapter.TorrentsListItemAdapter.format(this.tvPeers, "Peers: ", torrentGetPeersToString);
            com.sg.moviesindex.adapter.TorrentsListItemAdapter.format(this.tvQuality, "Quality: ", torrentGetQualityToString);
            com.sg.moviesindex.adapter.TorrentsListItemAdapter.format(this.tvSeeds, "Seeds: ", torrentGetSeedsToString);
            com.sg.moviesindex.adapter.TorrentsListItemAdapter.format(this.tvSize, "Size: ", torrentGetSizeToString);
            com.sg.moviesindex.adapter.TorrentsListItemAdapter.format(this.tvType, "Type: ", torrentGetTypeToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): torrent
        flag 1 (0x2L): stringBuilder
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}