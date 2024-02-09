package crc6469d2efbd9eedbb4f;

import com.google.firebase.iid.FirebaseInstanceIdService;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MyFirebaseIIDService extends FirebaseInstanceIdService implements IGCUserPeer {
    public static final String __md_methods = "n_onTokenRefresh:()V:GetOnTokenRefreshHandler\n";
    private ArrayList refList;

    private native void n_onTokenRefresh();

    static {
        Runtime.register("Gastropod.Droid.MyFirebaseIIDService, Gastropod.Android", MyFirebaseIIDService.class, __md_methods);
    }

    public MyFirebaseIIDService() {
        if (getClass() == MyFirebaseIIDService.class) {
            TypeManager.Activate("Gastropod.Droid.MyFirebaseIIDService, Gastropod.Android", "", this, new Object[0]);
        }
    }

    @Override // com.google.firebase.iid.FirebaseInstanceIdService
    public void onTokenRefresh() {
        n_onTokenRefresh();
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
