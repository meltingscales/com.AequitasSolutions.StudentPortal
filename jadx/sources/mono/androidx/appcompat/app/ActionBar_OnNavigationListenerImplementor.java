package mono.androidx.appcompat.app;

import androidx.appcompat.app.ActionBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionBar_OnNavigationListenerImplementor implements IGCUserPeer, ActionBar.OnNavigationListener {
    public static final String __md_methods = "n_onNavigationItemSelected:(IJ)Z:GetOnNavigationItemSelected_IJHandler:AndroidX.AppCompat.App.ActionBar/IOnNavigationListenerInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native boolean n_onNavigationItemSelected(int i, long j);

    static {
        Runtime.register("AndroidX.AppCompat.App.ActionBar+IOnNavigationListenerImplementor, Xamarin.AndroidX.AppCompat", ActionBar_OnNavigationListenerImplementor.class, __md_methods);
    }

    public ActionBar_OnNavigationListenerImplementor() {
        if (getClass() == ActionBar_OnNavigationListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AppCompat.App.ActionBar+IOnNavigationListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    @Override // androidx.appcompat.app.ActionBar.OnNavigationListener
    public boolean onNavigationItemSelected(int i, long j) {
        return n_onNavigationItemSelected(i, j);
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
