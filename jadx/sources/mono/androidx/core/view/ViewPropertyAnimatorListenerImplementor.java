package mono.androidx.core.view;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewPropertyAnimatorListenerImplementor implements IGCUserPeer, ViewPropertyAnimatorListener {
    public static final String __md_methods = "n_onAnimationCancel:(Landroid/view/View;)V:GetOnAnimationCancel_Landroid_view_View_Handler:AndroidX.Core.View.IViewPropertyAnimatorListenerInvoker, Xamarin.AndroidX.Core\nn_onAnimationEnd:(Landroid/view/View;)V:GetOnAnimationEnd_Landroid_view_View_Handler:AndroidX.Core.View.IViewPropertyAnimatorListenerInvoker, Xamarin.AndroidX.Core\nn_onAnimationStart:(Landroid/view/View;)V:GetOnAnimationStart_Landroid_view_View_Handler:AndroidX.Core.View.IViewPropertyAnimatorListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native void n_onAnimationCancel(View view);

    private native void n_onAnimationEnd(View view);

    private native void n_onAnimationStart(View view);

    static {
        Runtime.register("AndroidX.Core.View.IViewPropertyAnimatorListenerImplementor, Xamarin.AndroidX.Core", ViewPropertyAnimatorListenerImplementor.class, __md_methods);
    }

    public ViewPropertyAnimatorListenerImplementor() {
        if (getClass() == ViewPropertyAnimatorListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.IViewPropertyAnimatorListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel(View view) {
        n_onAnimationCancel(view);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationEnd(View view) {
        n_onAnimationEnd(view);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart(View view) {
        n_onAnimationStart(view);
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
