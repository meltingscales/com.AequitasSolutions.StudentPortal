.class public Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "JavascriptWebViewClient.java"

# interfaces
.implements Lmono/android/IGCUserPeer;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onPageStarted:(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetOnPageStarted_Landroid_webkit_WebView_Ljava_lang_String_Landroid_graphics_Bitmap_Handler\nn_onUnhandledKeyEvent:(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V:GetOnUnhandledKeyEvent_Landroid_webkit_WebView_Landroid_view_KeyEvent_Handler\nn_onPageFinished:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnPageFinished_Landroid_webkit_WebView_Ljava_lang_String_Handler\nn_shouldOverrideUrlLoading:(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z:GetShouldOverrideUrlLoading_Landroid_webkit_WebView_Landroid_webkit_WebResourceRequest_Handler\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 18
    const-class v0, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;

    const-string v1, "Gastropod.Droid.JavascriptWebViewClient, Gastropod.Android"

    const-string v2, "n_onPageStarted:(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetOnPageStarted_Landroid_webkit_WebView_Ljava_lang_String_Landroid_graphics_Bitmap_Handler\nn_onUnhandledKeyEvent:(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V:GetOnUnhandledKeyEvent_Landroid_webkit_WebView_Landroid_view_KeyEvent_Handler\nn_onPageFinished:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnPageFinished_Landroid_webkit_WebView_Ljava_lang_String_Handler\nn_shouldOverrideUrlLoading:(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z:GetShouldOverrideUrlLoading_Landroid_webkit_WebView_Landroid_webkit_WebResourceRequest_Handler\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 24
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Gastropod.Droid.JavascriptWebViewClient, Gastropod.Android"

    const-string v2, ""

    .line 26
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const-string p1, "Gastropod.Droid.JavascriptWebViewClient, Gastropod.Android"

    const-string p2, "Android.Content.Context, Mono.Android:System.String, mscorlib"

    .line 33
    invoke-static {p1, p2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
.end method

.method private native n_onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
.end method

.method private native n_onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V
.end method

.method private native n_shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 71
    iget-object v0, p0, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;->refList:Ljava/util/ArrayList;

    .line 73
    :cond_0
    iget-object v0, p0, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;->n_onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;->n_onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;->n_onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Lcrc6469d2efbd9eedbb4f/JavascriptWebViewClient;->n_shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    move-result p1

    return p1
.end method
