.class public Lcrc6450e07d0e82e86181/ResultCallback_1;
.super Ljava/lang/Object;
.source "ResultCallback_1.java"

# interfaces
.implements Lmono/android/IGCUserPeer;
.implements Lcom/google/android/gms/common/api/ResultCallback;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onResult:(Lcom/google/android/gms/common/api/Result;)V:GetOnResult_Lcom_google_android_gms_common_api_Result_Handler:Android.Gms.Common.Apis.IResultCallbackInvoker, Xamarin.GooglePlayServices.Basement\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    const-class v0, Lcrc6450e07d0e82e86181/ResultCallback_1;

    const-string v1, "Android.Gms.Common.Apis.ResultCallback`1, Xamarin.GooglePlayServices.Basement"

    const-string v2, "n_onResult:(Lcom/google/android/gms/common/api/Result;)V:GetOnResult_Lcom_google_android_gms_common_api_Result_Handler:Android.Gms.Common.Apis.IResultCallbackInvoker, Xamarin.GooglePlayServices.Basement\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc6450e07d0e82e86181/ResultCallback_1;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Android.Gms.Common.Apis.ResultCallback`1, Xamarin.GooglePlayServices.Basement"

    const-string v2, ""

    .line 24
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onResult(Lcom/google/android/gms/common/api/Result;)V
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcrc6450e07d0e82e86181/ResultCallback_1;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc6450e07d0e82e86181/ResultCallback_1;->refList:Ljava/util/ArrayList;

    .line 40
    :cond_0
    iget-object v0, p0, Lcrc6450e07d0e82e86181/ResultCallback_1;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 45
    iget-object v0, p0, Lcrc6450e07d0e82e86181/ResultCallback_1;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcrc6450e07d0e82e86181/ResultCallback_1;->n_onResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
