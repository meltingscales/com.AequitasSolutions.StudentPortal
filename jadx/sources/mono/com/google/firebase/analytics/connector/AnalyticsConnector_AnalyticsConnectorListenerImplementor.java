package mono.com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AnalyticsConnector_AnalyticsConnectorListenerImplementor implements IGCUserPeer, AnalyticsConnector.AnalyticsConnectorListener {
    public static final String __md_methods = "n_onMessageTriggered:(ILandroid/os/Bundle;)V:GetOnMessageTriggered_ILandroid_os_Bundle_Handler:Firebase.Analytics.Connector.IAnalyticsConnectorAnalyticsConnectorListenerInvoker, Xamarin.Firebase.Measurement.Connector\n";
    private ArrayList refList;

    private native void n_onMessageTriggered(int i, Bundle bundle);

    static {
        Runtime.register("Firebase.Analytics.Connector.IAnalyticsConnectorAnalyticsConnectorListenerImplementor, Xamarin.Firebase.Measurement.Connector", AnalyticsConnector_AnalyticsConnectorListenerImplementor.class, __md_methods);
    }

    public AnalyticsConnector_AnalyticsConnectorListenerImplementor() {
        if (getClass() == AnalyticsConnector_AnalyticsConnectorListenerImplementor.class) {
            TypeManager.Activate("Firebase.Analytics.Connector.IAnalyticsConnectorAnalyticsConnectorListenerImplementor, Xamarin.Firebase.Measurement.Connector", "", this, new Object[0]);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i, Bundle bundle) {
        n_onMessageTriggered(i, bundle);
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
