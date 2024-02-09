package mono.androidx.core.view;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ViewPropertyAnimatorUpdateListenerImplementor implements IGCUserPeer, ViewPropertyAnimatorUpdateListener {
    public static final String __md_methods = "n_onAnimationUpdate:(Landroid/view/View;)V:GetOnAnimationUpdate_Landroid_view_View_Handler:AndroidX.Core.View.IViewPropertyAnimatorUpdateListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native void n_onAnimationUpdate(View view);

    static {
        Runtime.register("AndroidX.Core.View.IViewPropertyAnimatorUpdateListenerImplementor, Xamarin.AndroidX.Core", ViewPropertyAnimatorUpdateListenerImplementor.class, __md_methods);
    }

    public ViewPropertyAnimatorUpdateListenerImplementor() {
        if (getClass() == ViewPropertyAnimatorUpdateListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.IViewPropertyAnimatorUpdateListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
    public void onAnimationUpdate(View view) {
        n_onAnimationUpdate(view);
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
