package crc64b5ccde371e18b5d0;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CustomTabActivityHelper implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Android.Support.CustomTabs.Chromium.SharedUtilities.CustomTabActivityHelper, Xamarin.Auth", CustomTabActivityHelper.class, "");
    }

    public CustomTabActivityHelper() {
        if (getClass() == CustomTabActivityHelper.class) {
            TypeManager.Activate("Android.Support.CustomTabs.Chromium.SharedUtilities.CustomTabActivityHelper, Xamarin.Auth", "", this, new Object[0]);
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
