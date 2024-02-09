package mono.androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.appcompat.widget.FitWindowsViewGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class FitWindowsViewGroup_OnFitSystemWindowsListenerImplementor implements IGCUserPeer, FitWindowsViewGroup.OnFitSystemWindowsListener {
    public static final String __md_methods = "n_onFitSystemWindows:(Landroid/graphics/Rect;)V:GetOnFitSystemWindows_Landroid_graphics_Rect_Handler:AndroidX.AppCompat.Widget.IFitWindowsViewGroupOnFitSystemWindowsListenerInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native void n_onFitSystemWindows(Rect rect);

    static {
        Runtime.register("AndroidX.AppCompat.Widget.IFitWindowsViewGroupOnFitSystemWindowsListenerImplementor, Xamarin.AndroidX.AppCompat", FitWindowsViewGroup_OnFitSystemWindowsListenerImplementor.class, __md_methods);
    }

    public FitWindowsViewGroup_OnFitSystemWindowsListenerImplementor() {
        if (getClass() == FitWindowsViewGroup_OnFitSystemWindowsListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AppCompat.Widget.IFitWindowsViewGroupOnFitSystemWindowsListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
    public void onFitSystemWindows(Rect rect) {
        n_onFitSystemWindows(rect);
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
