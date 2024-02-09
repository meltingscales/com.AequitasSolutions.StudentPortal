package mono.androidx.appcompat.widget;

import android.content.Intent;
import androidx.appcompat.widget.ShareActionProvider;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ShareActionProvider_OnShareTargetSelectedListenerImplementor implements IGCUserPeer, ShareActionProvider.OnShareTargetSelectedListener {
    public static final String __md_methods = "n_onShareTargetSelected:(Landroidx/appcompat/widget/ShareActionProvider;Landroid/content/Intent;)Z:GetOnShareTargetSelected_Landroidx_appcompat_widget_ShareActionProvider_Landroid_content_Intent_Handler:AndroidX.AppCompat.Widget.ShareActionProvider/IOnShareTargetSelectedListenerInvoker, Xamarin.AndroidX.AppCompat\n";
    private ArrayList refList;

    private native boolean n_onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);

    static {
        Runtime.register("AndroidX.AppCompat.Widget.ShareActionProvider+IOnShareTargetSelectedListenerImplementor, Xamarin.AndroidX.AppCompat", ShareActionProvider_OnShareTargetSelectedListenerImplementor.class, __md_methods);
    }

    public ShareActionProvider_OnShareTargetSelectedListenerImplementor() {
        if (getClass() == ShareActionProvider_OnShareTargetSelectedListenerImplementor.class) {
            TypeManager.Activate("AndroidX.AppCompat.Widget.ShareActionProvider+IOnShareTargetSelectedListenerImplementor, Xamarin.AndroidX.AppCompat", "", this, new Object[0]);
        }
    }

    @Override // androidx.appcompat.widget.ShareActionProvider.OnShareTargetSelectedListener
    public boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent) {
        return n_onShareTargetSelected(shareActionProvider, intent);
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
