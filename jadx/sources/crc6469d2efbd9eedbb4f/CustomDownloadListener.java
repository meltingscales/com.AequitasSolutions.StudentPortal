package crc6469d2efbd9eedbb4f;

import android.content.Context;
import android.webkit.DownloadListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class CustomDownloadListener implements IGCUserPeer, DownloadListener {
    public static final String __md_methods = "n_onDownloadStart:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V:GetOnDownloadStart_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_JHandler:Android.Webkit.IDownloadListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDownloadStart(String str, String str2, String str3, String str4, long j);

    static {
        Runtime.register("Gastropod.Droid.CustomDownloadListener, Gastropod.Android", CustomDownloadListener.class, "n_onDownloadStart:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V:GetOnDownloadStart_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_JHandler:Android.Webkit.IDownloadListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n");
    }

    public CustomDownloadListener() {
        if (getClass() == CustomDownloadListener.class) {
            TypeManager.Activate("Gastropod.Droid.CustomDownloadListener, Gastropod.Android", "", this, new Object[0]);
        }
    }

    public CustomDownloadListener(Context context) {
        if (getClass() == CustomDownloadListener.class) {
            TypeManager.Activate("Gastropod.Droid.CustomDownloadListener, Gastropod.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        n_onDownloadStart(str, str2, str3, str4, j);
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
