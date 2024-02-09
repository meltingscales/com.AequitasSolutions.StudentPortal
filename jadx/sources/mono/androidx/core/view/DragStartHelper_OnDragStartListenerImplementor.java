package mono.androidx.core.view;

import android.view.View;
import androidx.core.view.DragStartHelper;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class DragStartHelper_OnDragStartListenerImplementor implements IGCUserPeer, DragStartHelper.OnDragStartListener {
    public static final String __md_methods = "n_onDragStart:(Landroid/view/View;Landroidx/core/view/DragStartHelper;)Z:GetOnDragStart_Landroid_view_View_Landroidx_core_view_DragStartHelper_Handler:AndroidX.Core.View.DragStartHelper/IOnDragStartListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native boolean n_onDragStart(View view, DragStartHelper dragStartHelper);

    static {
        Runtime.register("AndroidX.Core.View.DragStartHelper+IOnDragStartListenerImplementor, Xamarin.AndroidX.Core", DragStartHelper_OnDragStartListenerImplementor.class, __md_methods);
    }

    public DragStartHelper_OnDragStartListenerImplementor() {
        if (getClass() == DragStartHelper_OnDragStartListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.DragStartHelper+IOnDragStartListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.DragStartHelper.OnDragStartListener
    public boolean onDragStart(View view, DragStartHelper dragStartHelper) {
        return n_onDragStart(view, dragStartHelper);
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
