package mono.android.support.v4.media.session;

import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MediaSessionCompat_OnActiveChangeListenerImplementor implements IGCUserPeer, MediaSessionCompat.OnActiveChangeListener {
    public static final String __md_methods = "n_onActiveChanged:()V:GetOnActiveChangedHandler:Android.Support.V4.Media.Session.MediaSessionCompat/IOnActiveChangeListenerInvoker, Xamarin.AndroidX.Media\n";
    private ArrayList refList;

    private native void n_onActiveChanged();

    static {
        Runtime.register("Android.Support.V4.Media.Session.MediaSessionCompat+IOnActiveChangeListenerImplementor, Xamarin.AndroidX.Media", MediaSessionCompat_OnActiveChangeListenerImplementor.class, __md_methods);
    }

    public MediaSessionCompat_OnActiveChangeListenerImplementor() {
        if (getClass() == MediaSessionCompat_OnActiveChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Support.V4.Media.Session.MediaSessionCompat+IOnActiveChangeListenerImplementor, Xamarin.AndroidX.Media", "", this, new Object[0]);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener
    public void onActiveChanged() {
        n_onActiveChanged();
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
