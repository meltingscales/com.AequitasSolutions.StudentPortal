package mono.androidx.recyclerview.widget;

import androidx.recyclerview.widget.AsyncListDiffer;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AsyncListDiffer_ListListenerImplementor implements IGCUserPeer, AsyncListDiffer.ListListener {
    public static final String __md_methods = "n_onCurrentListChanged:(Ljava/util/List;Ljava/util/List;)V:GetOnCurrentListChanged_Ljava_util_List_Ljava_util_List_Handler:AndroidX.RecyclerView.Widget.AsyncListDiffer/IListListenerInvoker, Xamarin.AndroidX.RecyclerView\n";
    private ArrayList refList;

    private native void n_onCurrentListChanged(List list, List list2);

    static {
        Runtime.register("AndroidX.RecyclerView.Widget.AsyncListDiffer+IListListenerImplementor, Xamarin.AndroidX.RecyclerView", AsyncListDiffer_ListListenerImplementor.class, __md_methods);
    }

    public AsyncListDiffer_ListListenerImplementor() {
        if (getClass() == AsyncListDiffer_ListListenerImplementor.class) {
            TypeManager.Activate("AndroidX.RecyclerView.Widget.AsyncListDiffer+IListListenerImplementor, Xamarin.AndroidX.RecyclerView", "", this, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
    public void onCurrentListChanged(List list, List list2) {
        n_onCurrentListChanged(list, list2);
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
