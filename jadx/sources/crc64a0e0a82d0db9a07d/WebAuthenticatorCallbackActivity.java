package crc64a0e0a82d0db9a07d;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public abstract class WebAuthenticatorCallbackActivity extends Activity implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n";
    private ArrayList refList;

    private native void n_onCreate(Bundle bundle);

    static {
        Runtime.register("Xamarin.Essentials.WebAuthenticatorCallbackActivity, Xamarin.Essentials", WebAuthenticatorCallbackActivity.class, "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n");
    }

    public WebAuthenticatorCallbackActivity() {
        if (getClass() == WebAuthenticatorCallbackActivity.class) {
            TypeManager.Activate("Xamarin.Essentials.WebAuthenticatorCallbackActivity, Xamarin.Essentials", "", this, new Object[0]);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        n_onCreate(bundle);
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
