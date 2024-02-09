package crc64a0e0a82d0db9a07d;

import android.content.ClipboardManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ClipboardChangeListener implements IGCUserPeer, ClipboardManager.OnPrimaryClipChangedListener {
    public static final String __md_methods = "n_onPrimaryClipChanged:()V:GetOnPrimaryClipChangedHandler:Android.Content.ClipboardManager/IOnPrimaryClipChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onPrimaryClipChanged();

    static {
        Runtime.register("Xamarin.Essentials.ClipboardChangeListener, Xamarin.Essentials", ClipboardChangeListener.class, "n_onPrimaryClipChanged:()V:GetOnPrimaryClipChangedHandler:Android.Content.ClipboardManager/IOnPrimaryClipChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public ClipboardChangeListener() {
        if (getClass() == ClipboardChangeListener.class) {
            TypeManager.Activate("Xamarin.Essentials.ClipboardChangeListener, Xamarin.Essentials", "", this, new Object[0]);
        }
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public void onPrimaryClipChanged() {
        n_onPrimaryClipChanged();
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
