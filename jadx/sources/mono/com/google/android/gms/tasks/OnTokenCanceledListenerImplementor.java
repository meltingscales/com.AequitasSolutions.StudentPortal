package mono.com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnTokenCanceledListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnTokenCanceledListenerImplementor implements IGCUserPeer, OnTokenCanceledListener {
    public static final String __md_methods = "n_onCanceled:()V:GetOnCanceledHandler:Android.Gms.Tasks.IOnTokenCanceledListenerInvoker, Xamarin.GooglePlayServices.Tasks\n";
    private ArrayList refList;

    private native void n_onCanceled();

    static {
        Runtime.register("Android.Gms.Tasks.IOnTokenCanceledListenerImplementor, Xamarin.GooglePlayServices.Tasks", OnTokenCanceledListenerImplementor.class, __md_methods);
    }

    public OnTokenCanceledListenerImplementor() {
        if (getClass() == OnTokenCanceledListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Tasks.IOnTokenCanceledListenerImplementor, Xamarin.GooglePlayServices.Tasks", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        n_onCanceled();
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
