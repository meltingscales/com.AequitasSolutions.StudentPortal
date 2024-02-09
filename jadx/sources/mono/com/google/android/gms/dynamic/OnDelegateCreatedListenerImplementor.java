package mono.com.google.android.gms.dynamic;

import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnDelegateCreatedListenerImplementor implements IGCUserPeer, OnDelegateCreatedListener {
    public static final String __md_methods = "n_onDelegateCreated:(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V:GetOnDelegateCreated_Lcom_google_android_gms_dynamic_LifecycleDelegate_Handler:Android.Gms.Dynamic.IOnDelegateCreatedListenerInvoker, Xamarin.GooglePlayServices.Basement\n";
    private ArrayList refList;

    private native void n_onDelegateCreated(LifecycleDelegate lifecycleDelegate);

    static {
        Runtime.register("Android.Gms.Dynamic.IOnDelegateCreatedListenerImplementor, Xamarin.GooglePlayServices.Basement", OnDelegateCreatedListenerImplementor.class, __md_methods);
    }

    public OnDelegateCreatedListenerImplementor() {
        if (getClass() == OnDelegateCreatedListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Dynamic.IOnDelegateCreatedListenerImplementor, Xamarin.GooglePlayServices.Basement", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        n_onDelegateCreated(lifecycleDelegate);
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
