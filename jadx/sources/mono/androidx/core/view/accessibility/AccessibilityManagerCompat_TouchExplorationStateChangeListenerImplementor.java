package mono.androidx.core.view.accessibility;

import androidx.core.view.accessibility.AccessibilityManagerCompat;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AccessibilityManagerCompat_TouchExplorationStateChangeListenerImplementor implements IGCUserPeer, AccessibilityManagerCompat.TouchExplorationStateChangeListener {
    public static final String __md_methods = "n_onTouchExplorationStateChanged:(Z)V:GetOnTouchExplorationStateChanged_ZHandler:AndroidX.Core.View.Accessibility.AccessibilityManagerCompat/ITouchExplorationStateChangeListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native void n_onTouchExplorationStateChanged(boolean z);

    static {
        Runtime.register("AndroidX.Core.View.Accessibility.AccessibilityManagerCompat+ITouchExplorationStateChangeListenerImplementor, Xamarin.AndroidX.Core", AccessibilityManagerCompat_TouchExplorationStateChangeListenerImplementor.class, __md_methods);
    }

    public AccessibilityManagerCompat_TouchExplorationStateChangeListenerImplementor() {
        if (getClass() == AccessibilityManagerCompat_TouchExplorationStateChangeListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.Accessibility.AccessibilityManagerCompat+ITouchExplorationStateChangeListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        n_onTouchExplorationStateChanged(z);
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
