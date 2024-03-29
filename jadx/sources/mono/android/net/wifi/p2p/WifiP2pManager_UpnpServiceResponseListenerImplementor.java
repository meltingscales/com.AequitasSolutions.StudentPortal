package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiP2pManager_UpnpServiceResponseListenerImplementor implements IGCUserPeer, WifiP2pManager.UpnpServiceResponseListener {
    public static final String __md_methods = "n_onUpnpServiceAvailable:(Ljava/util/List;Landroid/net/wifi/p2p/WifiP2pDevice;)V:GetOnUpnpServiceAvailable_Ljava_util_List_Landroid_net_wifi_p2p_WifiP2pDevice_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IUpnpServiceResponseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onUpnpServiceAvailable(List list, WifiP2pDevice wifiP2pDevice);

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IUpnpServiceResponseListenerImplementor, Mono.Android", WifiP2pManager_UpnpServiceResponseListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_UpnpServiceResponseListenerImplementor() {
        if (getClass() == WifiP2pManager_UpnpServiceResponseListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IUpnpServiceResponseListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.UpnpServiceResponseListener
    public void onUpnpServiceAvailable(List list, WifiP2pDevice wifiP2pDevice) {
        n_onUpnpServiceAvailable(list, wifiP2pDevice);
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
