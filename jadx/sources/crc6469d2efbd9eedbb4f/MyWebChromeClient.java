package crc6469d2efbd9eedbb4f;

import android.content.Context;
import android.os.Message;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MyWebChromeClient extends WebChromeClient implements IGCUserPeer {
    public static final String __md_methods = "n_onJsAlert:(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z:GetOnJsAlert_Landroid_webkit_WebView_Ljava_lang_String_Ljava_lang_String_Landroid_webkit_JsResult_Handler\nn_onReceivedTitle:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnReceivedTitle_Landroid_webkit_WebView_Ljava_lang_String_Handler\nn_onCreateWindow:(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z:GetOnCreateWindow_Landroid_webkit_WebView_ZZLandroid_os_Message_Handler\nn_onShowFileChooser:(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z:GetOnShowFileChooser_Landroid_webkit_WebView_Landroid_webkit_ValueCallback_Landroid_webkit_WebChromeClient_FileChooserParams_Handler\n";
    private ArrayList refList;

    private native boolean n_onCreateWindow(WebView webView, boolean z, boolean z2, Message message);

    private native boolean n_onJsAlert(WebView webView, String str, String str2, JsResult jsResult);

    private native void n_onReceivedTitle(WebView webView, String str);

    private native boolean n_onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    static {
        Runtime.register("Gastropod.Droid.MyWebChromeClient, Gastropod.Android", MyWebChromeClient.class, __md_methods);
    }

    public MyWebChromeClient() {
        if (getClass() == MyWebChromeClient.class) {
            TypeManager.Activate("Gastropod.Droid.MyWebChromeClient, Gastropod.Android", "", this, new Object[0]);
        }
    }

    public MyWebChromeClient(Context context) {
        if (getClass() == MyWebChromeClient.class) {
            TypeManager.Activate("Gastropod.Droid.MyWebChromeClient, Gastropod.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return n_onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        n_onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return n_onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return n_onShowFileChooser(webView, valueCallback, fileChooserParams);
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
