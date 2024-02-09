package mono.com.google.firebase.installations.internal;

import com.google.firebase.installations.internal.FidListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FidListenerImplementor implements IGCUserPeer, FidListener {
    public static final String __md_methods = "n_onFidChanged:(Ljava/lang/String;)V:GetOnFidChanged_Ljava_lang_String_Handler:Firebase.Installations.Internal.IFidListenerInvoker, Xamarin.Firebase.Installations.InterOp\n";
    private ArrayList refList;

    private native void n_onFidChanged(String str);

    static {
        Runtime.register("Firebase.Installations.Internal.IFidListenerImplementor, Xamarin.Firebase.Installations.InterOp", FidListenerImplementor.class, __md_methods);
    }

    public FidListenerImplementor() {
        if (getClass() == FidListenerImplementor.class) {
            TypeManager.Activate("Firebase.Installations.Internal.IFidListenerImplementor, Xamarin.Firebase.Installations.InterOp", "", this, new Object[0]);
        }
    }

    @Override // com.google.firebase.installations.internal.FidListener
    public void onFidChanged(String str) {
        n_onFidChanged(str);
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
