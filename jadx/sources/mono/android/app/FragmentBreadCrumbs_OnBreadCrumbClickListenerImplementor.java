package mono.android.app;

import android.app.FragmentBreadCrumbs;
import android.app.FragmentManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor implements IGCUserPeer, FragmentBreadCrumbs.OnBreadCrumbClickListener {
    public static final String __md_methods = "n_onBreadCrumbClick:(Landroid/app/FragmentManager$BackStackEntry;I)Z:GetOnBreadCrumbClick_Landroid_app_FragmentManager_BackStackEntry_IHandler:Android.App.FragmentBreadCrumbs/IOnBreadCrumbClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native boolean n_onBreadCrumbClick(FragmentManager.BackStackEntry backStackEntry, int i);

    static {
        Runtime.register("Android.App.FragmentBreadCrumbs+IOnBreadCrumbClickListenerImplementor, Mono.Android", FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor.class, __md_methods);
    }

    public FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor() {
        if (getClass() == FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor.class) {
            TypeManager.Activate("Android.App.FragmentBreadCrumbs+IOnBreadCrumbClickListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener
    public boolean onBreadCrumbClick(FragmentManager.BackStackEntry backStackEntry, int i) {
        return n_onBreadCrumbClick(backStackEntry, i);
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
