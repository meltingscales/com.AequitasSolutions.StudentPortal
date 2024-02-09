package mono.com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class OnConnectionFailedListenerImplementor implements IGCUserPeer, OnConnectionFailedListener {
    public static final String __md_methods = "n_onConnectionFailed:(Lcom/google/android/gms/common/ConnectionResult;)V:GetOnConnectionFailed_Lcom_google_android_gms_common_ConnectionResult_Handler:Android.Gms.Common.Api.Internal.IOnConnectionFailedListenerInvoker, Xamarin.GooglePlayServices.Base\n";
    private ArrayList refList;

    private native void n_onConnectionFailed(ConnectionResult connectionResult);

    static {
        Runtime.register("Android.Gms.Common.Api.Internal.IOnConnectionFailedListenerImplementor, Xamarin.GooglePlayServices.Base", OnConnectionFailedListenerImplementor.class, "n_onConnectionFailed:(Lcom/google/android/gms/common/ConnectionResult;)V:GetOnConnectionFailed_Lcom_google_android_gms_common_ConnectionResult_Handler:Android.Gms.Common.Api.Internal.IOnConnectionFailedListenerInvoker, Xamarin.GooglePlayServices.Base\n");
    }

    public OnConnectionFailedListenerImplementor() {
        if (getClass() == OnConnectionFailedListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Common.Api.Internal.IOnConnectionFailedListenerImplementor, Xamarin.GooglePlayServices.Base", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        n_onConnectionFailed(connectionResult);
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
