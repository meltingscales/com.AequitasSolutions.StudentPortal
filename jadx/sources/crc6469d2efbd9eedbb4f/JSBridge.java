package crc6469d2efbd9eedbb4f;

import android.webkit.JavascriptInterface;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class JSBridge implements IGCUserPeer {
    public static final String __md_methods = "n_InvokeAction:(Ljava/lang/String;)V:__export__\n";
    private ArrayList refList;

    private native void n_InvokeAction(String str);

    static {
        Runtime.register("Gastropod.Droid.JSBridge, Gastropod.Android", JSBridge.class, __md_methods);
    }

    public JSBridge() {
        if (getClass() == JSBridge.class) {
            TypeManager.Activate("Gastropod.Droid.JSBridge, Gastropod.Android", "", this, new Object[0]);
        }
    }

    public JSBridge(HybridWebViewRenderer hybridWebViewRenderer) {
        if (getClass() == JSBridge.class) {
            TypeManager.Activate("Gastropod.Droid.JSBridge, Gastropod.Android", "Gastropod.Droid.HybridWebViewRenderer, Gastropod.Android", this, new Object[]{hybridWebViewRenderer});
        }
    }

    @JavascriptInterface
    public void invokeAction(String str) {
        n_InvokeAction(str);
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
