package mono.androidx.core.view.accessibility;

import androidx.core.view.accessibility.AccessibilityManagerCompat;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AccessibilityManagerCompat_AccessibilityStateChangeListenerImplementor implements IGCUserPeer, AccessibilityManagerCompat.AccessibilityStateChangeListener {
    public static final String __md_methods = "n_onAccessibilityStateChanged:(Z)V:GetOnAccessibilityStateChanged_ZHandler:AndroidX.Core.View.Accessibility.AccessibilityManagerCompat/IAccessibilityStateChangeListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native void n_onAccessibilityStateChanged(boolean z);

    static {
        Runtime.register("AndroidX.Core.View.Accessibility.AccessibilityManagerCompat+IAccessibilityStateChangeListenerImplementor, Xamarin.AndroidX.Core", AccessibilityManagerCompat_AccessibilityStateChangeListenerImplementor.class, __md_methods);
    }

    public AccessibilityManagerCompat_AccessibilityStateChangeListenerImplementor() {
        if (getClass() == AccessibilityManagerCompat_AccessibilityStateChangeListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.Accessibility.AccessibilityManagerCompat+IAccessibilityStateChangeListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        n_onAccessibilityStateChanged(z);
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
