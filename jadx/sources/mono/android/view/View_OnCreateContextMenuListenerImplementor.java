package mono.android.view;

import android.view.ContextMenu;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class View_OnCreateContextMenuListenerImplementor implements IGCUserPeer, View.OnCreateContextMenuListener {
    public static final String __md_methods = "n_onCreateContextMenu:(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V:GetOnCreateContextMenu_Landroid_view_ContextMenu_Landroid_view_View_Landroid_view_ContextMenu_ContextMenuInfo_Handler:Android.Views.View/IOnCreateContextMenuListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo);

    static {
        Runtime.register("Android.Views.View+IOnCreateContextMenuListenerImplementor, Mono.Android", View_OnCreateContextMenuListenerImplementor.class, __md_methods);
    }

    public View_OnCreateContextMenuListenerImplementor() {
        if (getClass() == View_OnCreateContextMenuListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnCreateContextMenuListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        n_onCreateContextMenu(contextMenu, view, contextMenuInfo);
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
