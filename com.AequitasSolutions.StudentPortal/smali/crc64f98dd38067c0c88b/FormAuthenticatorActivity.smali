.class public Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;
.super Landroid/app/Activity;
.source "FormAuthenticatorActivity.java"

# interfaces
.implements Lmono/android/IGCUserPeer;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onResume:()V:GetOnResumeHandler\nn_onBackPressed:()V:GetOnBackPressedHandler\nn_onRetainNonConfigurationInstance:()Ljava/lang/Object;:GetOnRetainNonConfigurationInstanceHandler\nn_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    const-class v0, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;

    const-string v1, "Xamarin.Auth.FormAuthenticatorActivity, Xamarin.Auth"

    const-string v2, "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onResume:()V:GetOnResumeHandler\nn_onBackPressed:()V:GetOnBackPressedHandler\nn_onRetainNonConfigurationInstance:()Ljava/lang/Object;:GetOnRetainNonConfigurationInstanceHandler\nn_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 25
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Xamarin.Auth.FormAuthenticatorActivity, Xamarin.Auth"

    const-string v2, ""

    .line 27
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onBackPressed()V
.end method

.method private native n_onCreate(Landroid/os/Bundle;)V
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

    .line 73
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->refList:Ljava/util/ArrayList;

    .line 75
    :cond_0
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 80
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->n_onBackPressed()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->n_onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->n_onResume()V

    return-void
.end method

.method public onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    .line 57
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->n_onRetainNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcrc64f98dd38067c0c88b/FormAuthenticatorActivity;->n_onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
