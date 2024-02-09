package crc6469d2efbd9eedbb4f;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class JavascriptWebViewClient extends WebViewClient implements IGCUserPeer {
    public static final String __md_methods = "n_onPageStarted:(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetOnPageStarted_Landroid_webkit_WebView_Ljava_lang_String_Landroid_graphics_Bitmap_Handler\nn_onUnhandledKeyEvent:(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V:GetOnUnhandledKeyEvent_Landroid_webkit_WebView_Landroid_view_KeyEvent_Handler\nn_onPageFinished:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnPageFinished_Landroid_webkit_WebView_Ljava_lang_String_Handler\nn_shouldOverrideUrlLoading:(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z:GetShouldOverrideUrlLoading_Landroid_webkit_WebView_Landroid_webkit_WebResourceRequest_Handler\n";
    private ArrayList refList;

    private native void n_onPageFinished(WebView webView, String str);

    private native void n_onPageStarted(WebView webView, String str, Bitmap bitmap);

    private native void n_onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent);

    private native boolean n_shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest);

    static {
        Runtime.register("Gastropod.Droid.JavascriptWebViewClient, Gastropod.Android", JavascriptWebViewClient.class, __md_methods);
    }

    public JavascriptWebViewClient() {
        if (getClass() == JavascriptWebViewClient.class) {
            TypeManager.Activate("Gastropod.Droid.JavascriptWebViewClient, Gastropod.Android", "", this, new Object[0]);
        }
    }

    public JavascriptWebViewClient(Context context, String str) {
        if (getClass() == JavascriptWebViewClient.class) {
            TypeManager.Activate("Gastropod.Droid.JavascriptWebViewClient, Gastropod.Android", "Android.Content.Context, Mono.Android:System.String, mscorlib", this, new Object[]{context, str});
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        n_onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        n_onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        n_onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return n_shouldOverrideUrlLoading(webView, webResourceRequest);
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
