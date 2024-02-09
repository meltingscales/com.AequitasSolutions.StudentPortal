package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import java.util.Map;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class WifiP2pManager_DnsSdTxtRecordListenerImplementor implements IGCUserPeer, WifiP2pManager.DnsSdTxtRecordListener {
    public static final String __md_methods = "n_onDnsSdTxtRecordAvailable:(Ljava/lang/String;Ljava/util/Map;Landroid/net/wifi/p2p/WifiP2pDevice;)V:GetOnDnsSdTxtRecordAvailable_Ljava_lang_String_Ljava_util_Map_Landroid_net_wifi_p2p_WifiP2pDevice_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IDnsSdTxtRecordListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDnsSdTxtRecordAvailable(String str, Map map, WifiP2pDevice wifiP2pDevice);

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IDnsSdTxtRecordListenerImplementor, Mono.Android", WifiP2pManager_DnsSdTxtRecordListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_DnsSdTxtRecordListenerImplementor() {
        if (getClass() == WifiP2pManager_DnsSdTxtRecordListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IDnsSdTxtRecordListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.DnsSdTxtRecordListener
    public void onDnsSdTxtRecordAvailable(String str, Map map, WifiP2pDevice wifiP2pDevice) {
        n_onDnsSdTxtRecordAvailable(str, map, wifiP2pDevice);
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
