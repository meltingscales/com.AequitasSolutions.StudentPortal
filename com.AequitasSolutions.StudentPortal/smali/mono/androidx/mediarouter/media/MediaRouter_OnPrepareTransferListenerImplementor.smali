.class public Lmono/androidx/mediarouter/media/MediaRouter_OnPrepareTransferListenerImplementor;
.super Ljava/lang/Object;
.source "MediaRouter_OnPrepareTransferListenerImplementor.java"

# interfaces
.implements Lmono/android/IGCUserPeer;
.implements Landroidx/mediarouter/media/MediaRouter$OnPrepareTransferListener;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onPrepareTransfer:(Landroidx/mediarouter/media/MediaRouter$RouteInfo;Landroidx/mediarouter/media/MediaRouter$RouteInfo;)Lcom/google/common/util/concurrent/ListenableFuture;:GetOnPrepareTransfer_Landroidx_mediarouter_media_MediaRouter_RouteInfo_Landroidx_mediarouter_media_MediaRouter_RouteInfo_Handler:AndroidX.MediaRouter.Media.MediaRouter/IOnPrepareTransferListenerInvoker, Xamarin.AndroidX.MediaRouter\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    const-class v0, Lmono/androidx/mediarouter/media/MediaRouter_OnPrepareTransferListenerImplementor;

    const-string v1, "AndroidX.MediaRouter.Media.MediaRouter+IOnPrepareTransferListenerImplementor, Xamarin.AndroidX.MediaRouter"

    const-string v2, "n_onPrepareTransfer:(Landroidx/mediarouter/media/MediaRouter$RouteInfo;Landroidx/mediarouter/media/MediaRouter$RouteInfo;)Lcom/google/common/util/concurrent/ListenableFuture;:GetOnPrepareTransfer_Landroidx_mediarouter_media_MediaRouter_RouteInfo_Landroidx_mediarouter_media_MediaRouter_RouteInfo_Handler:AndroidX.MediaRouter.Media.MediaRouter/IOnPrepareTransferListenerInvoker, Xamarin.AndroidX.MediaRouter\n"

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

    const-class v1, Lmono/androidx/mediarouter/media/MediaRouter_OnPrepareTransferListenerImplementor;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "AndroidX.MediaRouter.Media.MediaRouter+IOnPrepareTransferListenerImplementor, Xamarin.AndroidX.MediaRouter"

    const-string v2, ""

    .line 24
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onPrepareTransfer(Landroidx/mediarouter/media/MediaRouter$RouteInfo;Landroidx/mediarouter/media/MediaRouter$RouteInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lmono/androidx/mediarouter/media/MediaRouter_OnPrepareTransferListenerImplementor;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lmono/androidx/mediarouter/media/MediaRouter_OnPrepareTransferListenerImplementor;->refList:Ljava/util/ArrayList;

    .line 40
    :cond_0
    iget-object v0, p0, Lmono/androidx/mediarouter/media/MediaRouter_OnPrepareTransferListenerImplementor;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 45
    iget-object v0, p0, Lmono/androidx/mediarouter/media/MediaRouter_OnPrepareTransferListenerImplementor;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onPrepareTransfer(Landroidx/mediarouter/media/MediaRouter$RouteInfo;Landroidx/mediarouter/media/MediaRouter$RouteInfo;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lmono/androidx/mediarouter/media/MediaRouter_OnPrepareTransferListenerImplementor;->n_onPrepareTransfer(Landroidx/mediarouter/media/MediaRouter$RouteInfo;Landroidx/mediarouter/media/MediaRouter$RouteInfo;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
