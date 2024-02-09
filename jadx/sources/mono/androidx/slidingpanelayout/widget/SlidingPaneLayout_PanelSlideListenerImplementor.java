package mono.androidx.slidingpanelayout.widget;

import android.view.View;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SlidingPaneLayout_PanelSlideListenerImplementor implements IGCUserPeer, SlidingPaneLayout.PanelSlideListener {
    public static final String __md_methods = "n_onPanelClosed:(Landroid/view/View;)V:GetOnPanelClosed_Landroid_view_View_Handler:AndroidX.SlidingPaneLayout.Widget.SlidingPaneLayout/IPanelSlideListenerInvoker, Xamarin.AndroidX.SlidingPaneLayout\nn_onPanelOpened:(Landroid/view/View;)V:GetOnPanelOpened_Landroid_view_View_Handler:AndroidX.SlidingPaneLayout.Widget.SlidingPaneLayout/IPanelSlideListenerInvoker, Xamarin.AndroidX.SlidingPaneLayout\nn_onPanelSlide:(Landroid/view/View;F)V:GetOnPanelSlide_Landroid_view_View_FHandler:AndroidX.SlidingPaneLayout.Widget.SlidingPaneLayout/IPanelSlideListenerInvoker, Xamarin.AndroidX.SlidingPaneLayout\n";
    private ArrayList refList;

    private native void n_onPanelClosed(View view);

    private native void n_onPanelOpened(View view);

    private native void n_onPanelSlide(View view, float f);

    static {
        Runtime.register("AndroidX.SlidingPaneLayout.Widget.SlidingPaneLayout+IPanelSlideListenerImplementor, Xamarin.AndroidX.SlidingPaneLayout", SlidingPaneLayout_PanelSlideListenerImplementor.class, __md_methods);
    }

    public SlidingPaneLayout_PanelSlideListenerImplementor() {
        if (getClass() == SlidingPaneLayout_PanelSlideListenerImplementor.class) {
            TypeManager.Activate("AndroidX.SlidingPaneLayout.Widget.SlidingPaneLayout+IPanelSlideListenerImplementor, Xamarin.AndroidX.SlidingPaneLayout", "", this, new Object[0]);
        }
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
    public void onPanelClosed(View view) {
        n_onPanelClosed(view);
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
    public void onPanelOpened(View view) {
        n_onPanelOpened(view);
    }

    @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
    public void onPanelSlide(View view, float f) {
        n_onPanelSlide(view, f);
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
