package mono.com.google.firebase;

import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FirebaseApp_BackgroundStateChangeListenerImplementor implements IGCUserPeer, FirebaseApp.BackgroundStateChangeListener {
    public static final String __md_methods = "n_onBackgroundStateChanged:(Z)V:GetOnBackgroundStateChanged_ZHandler:Firebase.FirebaseApp/IBackgroundStateChangeListenerInvoker, Xamarin.Firebase.Common\n";
    private ArrayList refList;

    private native void n_onBackgroundStateChanged(boolean z);

    static {
        Runtime.register("Firebase.FirebaseApp+IBackgroundStateChangeListenerImplementor, Xamarin.Firebase.Common", FirebaseApp_BackgroundStateChangeListenerImplementor.class, __md_methods);
    }

    public FirebaseApp_BackgroundStateChangeListenerImplementor() {
        if (getClass() == FirebaseApp_BackgroundStateChangeListenerImplementor.class) {
            TypeManager.Activate("Firebase.FirebaseApp+IBackgroundStateChangeListenerImplementor, Xamarin.Firebase.Common", "", this, new Object[0]);
        }
    }

    @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
    public void onBackgroundStateChanged(boolean z) {
        n_onBackgroundStateChanged(z);
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
