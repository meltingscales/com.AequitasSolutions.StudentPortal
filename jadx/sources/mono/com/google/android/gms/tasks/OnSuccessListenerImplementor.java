package mono.com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnSuccessListenerImplementor implements IGCUserPeer, OnSuccessListener {
    public static final String __md_methods = "n_onSuccess:(Ljava/lang/Object;)V:GetOnSuccess_Ljava_lang_Object_Handler:Android.Gms.Tasks.IOnSuccessListenerInvoker, Xamarin.GooglePlayServices.Tasks\n";
    private ArrayList refList;

    private native void n_onSuccess(Object obj);

    static {
        Runtime.register("Android.Gms.Tasks.IOnSuccessListenerImplementor, Xamarin.GooglePlayServices.Tasks", OnSuccessListenerImplementor.class, __md_methods);
    }

    public OnSuccessListenerImplementor() {
        if (getClass() == OnSuccessListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Tasks.IOnSuccessListenerImplementor, Xamarin.GooglePlayServices.Tasks", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        n_onSuccess(obj);
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
