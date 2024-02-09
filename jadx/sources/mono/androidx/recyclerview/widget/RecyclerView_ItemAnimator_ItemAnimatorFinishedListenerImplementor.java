package mono.androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RecyclerView_ItemAnimator_ItemAnimatorFinishedListenerImplementor implements IGCUserPeer, RecyclerView.ItemAnimator.ItemAnimatorFinishedListener {
    public static final String __md_methods = "n_onAnimationsFinished:()V:GetOnAnimationsFinishedHandler:AndroidX.RecyclerView.Widget.RecyclerView/ItemAnimator/IItemAnimatorFinishedListenerInvoker, Xamarin.AndroidX.RecyclerView\n";
    private ArrayList refList;

    private native void n_onAnimationsFinished();

    static {
        Runtime.register("AndroidX.RecyclerView.Widget.RecyclerView+ItemAnimator+IItemAnimatorFinishedListenerImplementor, Xamarin.AndroidX.RecyclerView", RecyclerView_ItemAnimator_ItemAnimatorFinishedListenerImplementor.class, __md_methods);
    }

    public RecyclerView_ItemAnimator_ItemAnimatorFinishedListenerImplementor() {
        if (getClass() == RecyclerView_ItemAnimator_ItemAnimatorFinishedListenerImplementor.class) {
            TypeManager.Activate("AndroidX.RecyclerView.Widget.RecyclerView+ItemAnimator+IItemAnimatorFinishedListenerImplementor, Xamarin.AndroidX.RecyclerView", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
    public void onAnimationsFinished() {
        n_onAnimationsFinished();
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
