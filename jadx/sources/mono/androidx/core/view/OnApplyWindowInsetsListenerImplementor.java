package mono.androidx.core.view;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnApplyWindowInsetsListenerImplementor implements IGCUserPeer, OnApplyWindowInsetsListener {
    public static final String __md_methods = "n_onApplyWindowInsets:(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;:GetOnApplyWindowInsets_Landroid_view_View_Landroidx_core_view_WindowInsetsCompat_Handler:AndroidX.Core.View.IOnApplyWindowInsetsListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native WindowInsetsCompat n_onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);

    static {
        Runtime.register("AndroidX.Core.View.IOnApplyWindowInsetsListenerImplementor, Xamarin.AndroidX.Core", OnApplyWindowInsetsListenerImplementor.class, __md_methods);
    }

    public OnApplyWindowInsetsListenerImplementor() {
        if (getClass() == OnApplyWindowInsetsListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.IOnApplyWindowInsetsListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return n_onApplyWindowInsets(view, windowInsetsCompat);
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
