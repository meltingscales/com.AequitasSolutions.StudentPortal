.class public Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;
.super Landroid/webkit/WebChromeClient;
.source "MyWebChromeClient.java"

# interfaces
.implements Lmono/android/IGCUserPeer;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onJsAlert:(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z:GetOnJsAlert_Landroid_webkit_WebView_Ljava_lang_String_Ljava_lang_String_Landroid_webkit_JsResult_Handler\nn_onReceivedTitle:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnReceivedTitle_Landroid_webkit_WebView_Ljava_lang_String_Handler\nn_onCreateWindow:(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z:GetOnCreateWindow_Landroid_webkit_WebView_ZZLandroid_os_Message_Handler\nn_onShowFileChooser:(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z:GetOnShowFileChooser_Landroid_webkit_WebView_Landroid_webkit_ValueCallback_Landroid_webkit_WebChromeClient_FileChooserParams_Handler\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 18
    const-class v0, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;

    const-string v1, "Gastropod.Droid.MyWebChromeClient, Gastropod.Android"

    const-string v2, "n_onJsAlert:(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z:GetOnJsAlert_Landroid_webkit_WebView_Ljava_lang_String_Ljava_lang_String_Landroid_webkit_JsResult_Handler\nn_onReceivedTitle:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnReceivedTitle_Landroid_webkit_WebView_Ljava_lang_String_Handler\nn_onCreateWindow:(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z:GetOnCreateWindow_Landroid_webkit_WebView_ZZLandroid_os_Message_Handler\nn_onShowFileChooser:(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z:GetOnShowFileChooser_Landroid_webkit_WebView_Landroid_webkit_ValueCallback_Landroid_webkit_WebChromeClient_FileChooserParams_Handler\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 24
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Gastropod.Droid.MyWebChromeClient, Gastropod.Android"

    const-string v2, ""

    .line 26
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Gastropod.Droid.MyWebChromeClient, Gastropod.Android"

    const-string v1, "Android.Content.Context, Mono.Android"

    .line 33
    invoke-static {p1, v1, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
.end method

.method private native n_onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
.end method

.method private native n_onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
.end method

.method private native n_onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 71
    iget-object v0, p0, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;->refList:Ljava/util/ArrayList;

    .line 73
    :cond_0
    iget-object v0, p0, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;->n_onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    move-result p1

    return p1
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;->n_onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result p1

    return p1
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;->n_onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2, p3}, Lcrc6469d2efbd9eedbb4f/MyWebChromeClient;->n_onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    move-result p1

    return p1
.end method
