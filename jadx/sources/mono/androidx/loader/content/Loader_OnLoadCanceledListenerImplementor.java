package mono.androidx.loader.content;

import androidx.loader.content.Loader;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Loader_OnLoadCanceledListenerImplementor implements IGCUserPeer, Loader.OnLoadCanceledListener {
    public static final String __md_methods = "n_onLoadCanceled:(Landroidx/loader/content/Loader;)V:GetOnLoadCanceled_Landroidx_loader_content_Loader_Handler:AndroidX.Loader.Content.Loader/IOnLoadCanceledListenerInvoker, Xamarin.AndroidX.Loader\n";
    private ArrayList refList;

    private native void n_onLoadCanceled(Loader loader);

    static {
        Runtime.register("AndroidX.Loader.Content.Loader+IOnLoadCanceledListenerImplementor, Xamarin.AndroidX.Loader", Loader_OnLoadCanceledListenerImplementor.class, __md_methods);
    }

    public Loader_OnLoadCanceledListenerImplementor() {
        if (getClass() == Loader_OnLoadCanceledListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Loader.Content.Loader+IOnLoadCanceledListenerImplementor, Xamarin.AndroidX.Loader", "", this, new Object[0]);
        }
    }

    @Override // androidx.loader.content.Loader.OnLoadCanceledListener
    public void onLoadCanceled(Loader loader) {
        n_onLoadCanceled(loader);
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
