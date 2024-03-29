package mono.androidx.core.app;

import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SharedElementCallback_OnSharedElementsReadyListenerImplementor implements IGCUserPeer, SharedElementCallback.OnSharedElementsReadyListener {
    public static final String __md_methods = "n_onSharedElementsReady:()V:GetOnSharedElementsReadyHandler:AndroidX.Core.App.SharedElementCallback/IOnSharedElementsReadyListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native void n_onSharedElementsReady();

    static {
        Runtime.register("AndroidX.Core.App.SharedElementCallback+IOnSharedElementsReadyListenerImplementor, Xamarin.AndroidX.Core", SharedElementCallback_OnSharedElementsReadyListenerImplementor.class, __md_methods);
    }

    public SharedElementCallback_OnSharedElementsReadyListenerImplementor() {
        if (getClass() == SharedElementCallback_OnSharedElementsReadyListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.App.SharedElementCallback+IOnSharedElementsReadyListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
    public void onSharedElementsReady() {
        n_onSharedElementsReady();
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
