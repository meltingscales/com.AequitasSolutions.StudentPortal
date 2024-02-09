package mono.androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewStubCompat_OnInflateListenerImplementor implements IGCUserPeer, ViewStubCompat.OnInflateListener {
    public static final String __md_methods = "n_onInflate:(Landroidx/appcompat/widget/ViewStubCompat;Landroid/view/View;)V:GetOnInflate_Landroidx_appcompat_widget_ViewStubCompat_Landroid_view_View_Handler:AndroidX.AppCompat.Widget.ViewStubCompat/IOnInflateListenerInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native void n_onInflate(ViewStubCompat viewStubCompat, View view);

    static {
        Runtime.register("AndroidX.AppCompat.Widget.ViewStubCompat+IOnInflateListenerImplementor, Xamarin.AndroidX.AppCompat", ViewStubCompat_OnInflateListenerImplementor.class, __md_methods);
    }

    public ViewStubCompat_OnInflateListenerImplementor() {
        if (getClass() == ViewStubCompat_OnInflateListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AppCompat.Widget.ViewStubCompat+IOnInflateListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    @Override // androidx.appcompat.widget.ViewStubCompat.OnInflateListener
    public void onInflate(ViewStubCompat viewStubCompat, View view) {
        n_onInflate(viewStubCompat, view);
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
