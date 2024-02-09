package mono.com.google.firebase;

import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FirebaseAppLifecycleListenerImplementor implements IGCUserPeer, FirebaseAppLifecycleListener {
    public static final String __md_methods = "n_onDeleted:(Ljava/lang/String;Lcom/google/firebase/FirebaseOptions;)V:GetOnDeleted_Ljava_lang_String_Lcom_google_firebase_FirebaseOptions_Handler:Firebase.IFirebaseAppLifecycleListenerInvoker, Xamarin.Firebase.Common\n";
    private ArrayList refList;

    private native void n_onDeleted(String str, FirebaseOptions firebaseOptions);

    static {
        Runtime.register("Firebase.IFirebaseAppLifecycleListenerImplementor, Xamarin.Firebase.Common", FirebaseAppLifecycleListenerImplementor.class, __md_methods);
    }

    public FirebaseAppLifecycleListenerImplementor() {
        if (getClass() == FirebaseAppLifecycleListenerImplementor.class) {
            TypeManager.Activate("Firebase.IFirebaseAppLifecycleListenerImplementor, Xamarin.Firebase.Common", "", this, new Object[0]);
        }
    }

    @Override // com.google.firebase.FirebaseAppLifecycleListener
    public void onDeleted(String str, FirebaseOptions firebaseOptions) {
        n_onDeleted(str, firebaseOptions);
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
