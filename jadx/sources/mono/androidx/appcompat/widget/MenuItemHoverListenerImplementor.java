package mono.androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.MenuItemHoverListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MenuItemHoverListenerImplementor implements IGCUserPeer, MenuItemHoverListener {
    public static final String __md_methods = "n_onItemHoverEnter:(Landroidx/appcompat/view/menu/MenuBuilder;Landroid/view/MenuItem;)V:GetOnItemHoverEnter_Landroidx_appcompat_view_menu_MenuBuilder_Landroid_view_MenuItem_Handler:AndroidX.AppCompat.Widget.IMenuItemHoverListenerInvoker, Xamarin.AndroidX.AppCompat\nn_onItemHoverExit:(Landroidx/appcompat/view/menu/MenuBuilder;Landroid/view/MenuItem;)V:GetOnItemHoverExit_Landroidx_appcompat_view_menu_MenuBuilder_Landroid_view_MenuItem_Handler:AndroidX.AppCompat.Widget.IMenuItemHoverListenerInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native void n_onItemHoverEnter(MenuBuilder menuBuilder, MenuItem menuItem);

    private native void n_onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem);

    static {
        Runtime.register("AndroidX.AppCompat.Widget.IMenuItemHoverListenerImplementor, Xamarin.AndroidX.AppCompat", MenuItemHoverListenerImplementor.class, __md_methods);
    }

    public MenuItemHoverListenerImplementor() {
        if (getClass() == MenuItemHoverListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AppCompat.Widget.IMenuItemHoverListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(MenuBuilder menuBuilder, MenuItem menuItem) {
        n_onItemHoverEnter(menuBuilder, menuItem);
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem) {
        n_onItemHoverExit(menuBuilder, menuItem);
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
