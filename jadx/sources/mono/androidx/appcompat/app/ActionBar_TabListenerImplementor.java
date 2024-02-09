package mono.androidx.appcompat.app;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ActionBar_TabListenerImplementor implements IGCUserPeer, ActionBar.TabListener {
    public static final String __md_methods = "n_onTabReselected:(Landroidx/appcompat/app/ActionBar$Tab;Landroidx/fragment/app/FragmentTransaction;)V:GetOnTabReselected_Landroidx_appcompat_app_ActionBar_Tab_Landroidx_fragment_app_FragmentTransaction_Handler:AndroidX.AppCompat.App.ActionBar/ITabListenerInvoker, Xamarin.AndroidX.AppCompat\nn_onTabSelected:(Landroidx/appcompat/app/ActionBar$Tab;Landroidx/fragment/app/FragmentTransaction;)V:GetOnTabSelected_Landroidx_appcompat_app_ActionBar_Tab_Landroidx_fragment_app_FragmentTransaction_Handler:AndroidX.AppCompat.App.ActionBar/ITabListenerInvoker, Xamarin.AndroidX.AppCompat\nn_onTabUnselected:(Landroidx/appcompat/app/ActionBar$Tab;Landroidx/fragment/app/FragmentTransaction;)V:GetOnTabUnselected_Landroidx_appcompat_app_ActionBar_Tab_Landroidx_fragment_app_FragmentTransaction_Handler:AndroidX.AppCompat.App.ActionBar/ITabListenerInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native void n_onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction);

    private native void n_onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction);

    private native void n_onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction);

    static {
        Runtime.register("AndroidX.AppCompat.App.ActionBar+ITabListenerImplementor, Xamarin.AndroidX.AppCompat", ActionBar_TabListenerImplementor.class, __md_methods);
    }

    public ActionBar_TabListenerImplementor() {
        if (getClass() == ActionBar_TabListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AppCompat.App.ActionBar+ITabListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    @Override // androidx.appcompat.app.ActionBar.TabListener
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        n_onTabReselected(tab, fragmentTransaction);
    }

    @Override // androidx.appcompat.app.ActionBar.TabListener
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        n_onTabSelected(tab, fragmentTransaction);
    }

    @Override // androidx.appcompat.app.ActionBar.TabListener
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        n_onTabUnselected(tab, fragmentTransaction);
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
