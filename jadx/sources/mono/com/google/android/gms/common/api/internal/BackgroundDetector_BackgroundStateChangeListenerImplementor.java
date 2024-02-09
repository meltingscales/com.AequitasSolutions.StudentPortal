package mono.com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class BackgroundDetector_BackgroundStateChangeListenerImplementor implements IGCUserPeer, BackgroundDetector.BackgroundStateChangeListener {
    public static final String __md_methods = "n_onBackgroundStateChanged:(Z)V:GetOnBackgroundStateChanged_ZHandler:Android.Gms.Common.Apis.Internal.BackgroundDetector/IBackgroundStateChangeListenerInvoker, Xamarin.GooglePlayServices.Basement\n";
    private ArrayList refList;

    private native void n_onBackgroundStateChanged(boolean z);

    static {
        Runtime.register("Android.Gms.Common.Apis.Internal.BackgroundDetector+IBackgroundStateChangeListenerImplementor, Xamarin.GooglePlayServices.Basement", BackgroundDetector_BackgroundStateChangeListenerImplementor.class, __md_methods);
    }

    public BackgroundDetector_BackgroundStateChangeListenerImplementor() {
        if (getClass() == BackgroundDetector_BackgroundStateChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Common.Apis.Internal.BackgroundDetector+IBackgroundStateChangeListenerImplementor, Xamarin.GooglePlayServices.Basement", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public void onBackgroundStateChanged(boolean z) {
        n_onBackgroundStateChanged(z);
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
