package crc64f98dd38067c0c88b;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WebAuthenticatorActivity_State implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Auth.WebAuthenticatorActivity+State, Xamarin.Auth", WebAuthenticatorActivity_State.class, "");
    }

    public WebAuthenticatorActivity_State() {
        if (getClass() == WebAuthenticatorActivity_State.class) {
            TypeManager.Activate("Xamarin.Auth.WebAuthenticatorActivity+State, Xamarin.Auth", "", this, new Object[0]);
        }
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
