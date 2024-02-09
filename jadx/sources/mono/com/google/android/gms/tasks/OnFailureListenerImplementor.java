package mono.com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnFailureListenerImplementor implements IGCUserPeer, OnFailureListener {
    public static final String __md_methods = "n_onFailure:(Ljava/lang/Exception;)V:GetOnFailure_Ljava_lang_Exception_Handler:Android.Gms.Tasks.IOnFailureListenerInvoker, Xamarin.GooglePlayServices.Tasks\n";
    private ArrayList refList;

    private native void n_onFailure(Exception exc);

    static {
        Runtime.register("Android.Gms.Tasks.IOnFailureListenerImplementor, Xamarin.GooglePlayServices.Tasks", OnFailureListenerImplementor.class, __md_methods);
    }

    public OnFailureListenerImplementor() {
        if (getClass() == OnFailureListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Tasks.IOnFailureListenerImplementor, Xamarin.GooglePlayServices.Tasks", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        n_onFailure(exc);
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
