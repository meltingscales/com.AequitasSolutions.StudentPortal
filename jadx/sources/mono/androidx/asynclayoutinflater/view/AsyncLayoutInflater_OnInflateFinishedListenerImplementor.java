package mono.androidx.asynclayoutinflater.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AsyncLayoutInflater_OnInflateFinishedListenerImplementor implements IGCUserPeer, AsyncLayoutInflater.OnInflateFinishedListener {
    public static final String __md_methods = "n_onInflateFinished:(Landroid/view/View;ILandroid/view/ViewGroup;)V:GetOnInflateFinished_Landroid_view_View_ILandroid_view_ViewGroup_Handler:AndroidX.AsyncLayoutInflater.View.AsyncLayoutInflater/IOnInflateFinishedListenerInvoker, Xamarin.AndroidX.AsyncLayoutInflater\n";
    private ArrayList refList;

    private native void n_onInflateFinished(View view, int i, ViewGroup viewGroup);

    static {
        Runtime.register("AndroidX.AsyncLayoutInflater.View.AsyncLayoutInflater+IOnInflateFinishedListenerImplementor, Xamarin.AndroidX.AsyncLayoutInflater", AsyncLayoutInflater_OnInflateFinishedListenerImplementor.class, __md_methods);
    }

    public AsyncLayoutInflater_OnInflateFinishedListenerImplementor() {
        if (getClass() == AsyncLayoutInflater_OnInflateFinishedListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AsyncLayoutInflater.View.AsyncLayoutInflater+IOnInflateFinishedListenerImplementor, Xamarin.AndroidX.AsyncLayoutInflater", "", this, new Object[0]);
        }
    }

    @Override // androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener
    public void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        n_onInflateFinished(view, i, viewGroup);
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
