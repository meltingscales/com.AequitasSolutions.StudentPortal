package mono.androidx.appcompat.widget;

import androidx.appcompat.widget.ContentFrameLayout;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ContentFrameLayout_OnAttachListenerImplementor implements IGCUserPeer, ContentFrameLayout.OnAttachListener {
    public static final String __md_methods = "n_onAttachedFromWindow:()V:GetOnAttachedFromWindowHandler:AndroidX.AppCompat.Widget.ContentFrameLayout/IOnAttachListenerInvoker, Xamarin.AndroidX.AppCompat\nn_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler:AndroidX.AppCompat.Widget.ContentFrameLayout/IOnAttachListenerInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native void n_onAttachedFromWindow();

    private native void n_onDetachedFromWindow();

    static {
        Runtime.register("AndroidX.AppCompat.Widget.ContentFrameLayout+IOnAttachListenerImplementor, Xamarin.AndroidX.AppCompat", ContentFrameLayout_OnAttachListenerImplementor.class, __md_methods);
    }

    public ContentFrameLayout_OnAttachListenerImplementor() {
        if (getClass() == ContentFrameLayout_OnAttachListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AppCompat.Widget.ContentFrameLayout+IOnAttachListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
    public void onAttachedFromWindow() {
        n_onAttachedFromWindow();
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
    public void onDetachedFromWindow() {
        n_onDetachedFromWindow();
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
