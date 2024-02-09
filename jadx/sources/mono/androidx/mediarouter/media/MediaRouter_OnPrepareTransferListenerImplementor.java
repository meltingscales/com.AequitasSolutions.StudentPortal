package mono.androidx.mediarouter.media;

import androidx.mediarouter.media.MediaRouter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaRouter_OnPrepareTransferListenerImplementor implements IGCUserPeer, MediaRouter.OnPrepareTransferListener {
    public static final String __md_methods = "n_onPrepareTransfer:(Landroidx/mediarouter/media/MediaRouter$RouteInfo;Landroidx/mediarouter/media/MediaRouter$RouteInfo;)Lcom/google/common/util/concurrent/ListenableFuture;:GetOnPrepareTransfer_Landroidx_mediarouter_media_MediaRouter_RouteInfo_Landroidx_mediarouter_media_MediaRouter_RouteInfo_Handler:AndroidX.MediaRouter.Media.MediaRouter/IOnPrepareTransferListenerInvoker, Xamarin.AndroidX.MediaRouter\n";
    private ArrayList refList;

    private native ListenableFuture n_onPrepareTransfer(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2);

    static {
        Runtime.register("AndroidX.MediaRouter.Media.MediaRouter+IOnPrepareTransferListenerImplementor, Xamarin.AndroidX.MediaRouter", MediaRouter_OnPrepareTransferListenerImplementor.class, __md_methods);
    }

    public MediaRouter_OnPrepareTransferListenerImplementor() {
        if (getClass() == MediaRouter_OnPrepareTransferListenerImplementor.class) {
            TypeManager.Activate("AndroidX.MediaRouter.Media.MediaRouter+IOnPrepareTransferListenerImplementor, Xamarin.AndroidX.MediaRouter", "", this, new Object[0]);
        }
    }

    @Override // androidx.mediarouter.media.MediaRouter.OnPrepareTransferListener
    public ListenableFuture onPrepareTransfer(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2) {
        return n_onPrepareTransfer(routeInfo, routeInfo2);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}
