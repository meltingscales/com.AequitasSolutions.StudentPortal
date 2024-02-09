.class public Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;
.super Landroid/accounts/AccountAuthenticatorActivity;
.source "WebAuthenticatorNativeBrowserActivity.java"

# interfaces
.implements Lmono/android/IGCUserPeer;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onPause:()V:GetOnPauseHandler\nn_onResume:()V:GetOnResumeHandler\nn_onBackPressed:()V:GetOnBackPressedHandler\nn_onRetainNonConfigurationInstance:()Ljava/lang/Object;:GetOnRetainNonConfigurationInstanceHandler\nn_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 20
    const-class v0, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;

    const-string v1, "Xamarin.Auth.WebAuthenticatorNativeBrowserActivity, Xamarin.Auth"

    const-string v2, "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onPause:()V:GetOnPauseHandler\nn_onResume:()V:GetOnResumeHandler\nn_onBackPressed:()V:GetOnBackPressedHandler\nn_onRetainNonConfigurationInstance:()Ljava/lang/Object;:GetOnRetainNonConfigurationInstanceHandler\nn_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 26
    invoke-direct {p0}, Landroid/accounts/AccountAuthenticatorActivity;-><init>()V

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Xamarin.Auth.WebAuthenticatorNativeBrowserActivity, Xamarin.Auth"

    const-string v2, ""

    .line 28
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onBackPressed()V
.end method

.method private native n_onCreate(Landroid/os/Bundle;)V
.end method

.method private native n_onPause()V
.end method

.method private native n_onResume()V
.end method

.method private native n_onRetainNonConfigurationInstance()Ljava/lang/Object;
.end method

.method private native n_onSaveInstanceState(Landroid/os/Bundle;)V
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->refList:Ljava/util/ArrayList;

    .line 84
    :cond_0
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 89
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->n_onBackPressed()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->n_onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onPause()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->n_onPause()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->n_onResume()V

    return-void
.end method

.method public onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    .line 66
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->n_onRetainNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcrc64f98dd38067c0c88b/WebAuthenticatorNativeBrowserActivity;->n_onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
