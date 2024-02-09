package mono.com.google.firebase.iid.internal;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FirebaseInstanceIdInternal_NewTokenListenerImplementor implements IGCUserPeer, FirebaseInstanceIdInternal.NewTokenListener {
    public static final String __md_methods = "n_onNewToken:(Ljava/lang/String;)V:GetOnNewToken_Ljava_lang_String_Handler:Firebase.Iid.Internal.IFirebaseInstanceIdInternalNewTokenListenerInvoker, Xamarin.Firebase.Iid.Interop\n";
    private ArrayList refList;

    private native void n_onNewToken(String str);

    static {
        Runtime.register("Firebase.Iid.Internal.IFirebaseInstanceIdInternalNewTokenListenerImplementor, Xamarin.Firebase.Iid.Interop", FirebaseInstanceIdInternal_NewTokenListenerImplementor.class, __md_methods);
    }

    public FirebaseInstanceIdInternal_NewTokenListenerImplementor() {
        if (getClass() == FirebaseInstanceIdInternal_NewTokenListenerImplementor.class) {
            TypeManager.Activate("Firebase.Iid.Internal.IFirebaseInstanceIdInternalNewTokenListenerImplementor, Xamarin.Firebase.Iid.Interop", "", this, new Object[0]);
        }
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        n_onNewToken(str);
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
