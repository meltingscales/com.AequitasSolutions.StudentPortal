package mono.androidx.core.view;

import android.view.MenuItem;
import androidx.core.view.MenuItemCompat;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MenuItemCompat_OnActionExpandListenerImplementor implements IGCUserPeer, MenuItemCompat.OnActionExpandListener {
    public static final String __md_methods = "n_onMenuItemActionCollapse:(Landroid/view/MenuItem;)Z:GetOnMenuItemActionCollapse_Landroid_view_MenuItem_Handler:AndroidX.Core.View.MenuItemCompat/IOnActionExpandListenerInvoker, Xamarin.AndroidX.Core\nn_onMenuItemActionExpand:(Landroid/view/MenuItem;)Z:GetOnMenuItemActionExpand_Landroid_view_MenuItem_Handler:AndroidX.Core.View.MenuItemCompat/IOnActionExpandListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native boolean n_onMenuItemActionCollapse(MenuItem menuItem);

    private native boolean n_onMenuItemActionExpand(MenuItem menuItem);

    static {
        Runtime.register("AndroidX.Core.View.MenuItemCompat+IOnActionExpandListenerImplementor, Xamarin.AndroidX.Core", MenuItemCompat_OnActionExpandListenerImplementor.class, __md_methods);
    }

    public MenuItemCompat_OnActionExpandListenerImplementor() {
        if (getClass() == MenuItemCompat_OnActionExpandListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.MenuItemCompat+IOnActionExpandListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.MenuItemCompat.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return n_onMenuItemActionCollapse(menuItem);
    }

    @Override // androidx.core.view.MenuItemCompat.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return n_onMenuItemActionExpand(menuItem);
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
