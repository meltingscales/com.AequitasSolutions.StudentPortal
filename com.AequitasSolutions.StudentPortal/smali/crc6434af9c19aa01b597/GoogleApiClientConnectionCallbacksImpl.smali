.class public Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;
.super Ljava/lang/Object;
.source "GoogleApiClientConnectionCallbacksImpl.java"

# interfaces
.implements Lmono/android/IGCUserPeer;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/internal/ConnectionCallbacks;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onConnected:(Landroid/os/Bundle;)V:GetOnConnected_Landroid_os_Bundle_Handler:Android.Gms.Common.Api.Internal.IConnectionCallbacksInvoker, Xamarin.GooglePlayServices.Base\nn_onConnectionSuspended:(I)V:GetOnConnectionSuspended_IHandler:Android.Gms.Common.Api.Internal.IConnectionCallbacksInvoker, Xamarin.GooglePlayServices.Base\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 18
    const-class v0, Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;

    const-string v1, "Android.Gms.Common.Apis.GoogleApiClientConnectionCallbacksImpl, Xamarin.GooglePlayServices.Base"

    const-string v2, "n_onConnected:(Landroid/os/Bundle;)V:GetOnConnected_Landroid_os_Bundle_Handler:Android.Gms.Common.Api.Internal.IConnectionCallbacksInvoker, Xamarin.GooglePlayServices.Base\nn_onConnectionSuspended:(I)V:GetOnConnectionSuspended_IHandler:Android.Gms.Common.Api.Internal.IConnectionCallbacksInvoker, Xamarin.GooglePlayServices.Base\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Android.Gms.Common.Apis.GoogleApiClientConnectionCallbacksImpl, Xamarin.GooglePlayServices.Base"

    const-string v2, ""

    .line 26
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onConnected(Landroid/os/Bundle;)V
.end method

.method private native n_onConnectionSuspended(I)V
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;->refList:Ljava/util/ArrayList;

    .line 50
    :cond_0
    iget-object v0, p0, Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 55
    iget-object v0, p0, Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;->n_onConnected(Landroid/os/Bundle;)V

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcrc6434af9c19aa01b597/GoogleApiClientConnectionCallbacksImpl;->n_onConnectionSuspended(I)V

    return-void
.end method
