package mono.com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ImageManager_OnImageLoadedListenerImplementor implements IGCUserPeer, ImageManager.OnImageLoadedListener {
    public static final String __md_methods = "n_onImageLoaded:(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V:GetOnImageLoaded_Landroid_net_Uri_Landroid_graphics_drawable_Drawable_ZHandler:Android.Gms.Common.Images.ImageManager/IOnImageLoadedListenerInvoker, Xamarin.GooglePlayServices.Base\n";
    private ArrayList refList;

    private native void n_onImageLoaded(Uri uri, Drawable drawable, boolean z);

    static {
        Runtime.register("Android.Gms.Common.Images.ImageManager+IOnImageLoadedListenerImplementor, Xamarin.GooglePlayServices.Base", ImageManager_OnImageLoadedListenerImplementor.class, __md_methods);
    }

    public ImageManager_OnImageLoadedListenerImplementor() {
        if (getClass() == ImageManager_OnImageLoadedListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Common.Images.ImageManager+IOnImageLoadedListenerImplementor, Xamarin.GooglePlayServices.Base", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.images.ImageManager.OnImageLoadedListener
    public void onImageLoaded(Uri uri, Drawable drawable, boolean z) {
        n_onImageLoaded(uri, drawable, z);
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
