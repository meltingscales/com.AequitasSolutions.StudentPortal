.class Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;
.super Landroid/media/MediaRouter2$TransferCallback;
.source "MediaRoute2Provider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/mediarouter/media/MediaRoute2Provider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TransferCallback"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/mediarouter/media/MediaRoute2Provider;


# direct methods
.method constructor <init>(Landroidx/mediarouter/media/MediaRoute2Provider;)V
    .locals 0

    .line 359
    iput-object p1, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    invoke-direct {p0}, Landroid/media/MediaRouter2$TransferCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onStop(Landroid/media/MediaRouter2$RoutingController;)V
    .locals 2
    .param p1    # Landroid/media/MediaRouter2$RoutingController;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 390
    iget-object v0, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    iget-object v0, v0, Landroidx/mediarouter/media/MediaRoute2Provider;->mControllerMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/mediarouter/media/MediaRouteProvider$RouteController;

    if-eqz v0, :cond_0

    .line 392
    iget-object p1, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    iget-object p1, p1, Landroidx/mediarouter/media/MediaRoute2Provider;->mCallback:Landroidx/mediarouter/media/MediaRoute2Provider$Callback;

    invoke-virtual {p1, v0}, Landroidx/mediarouter/media/MediaRoute2Provider$Callback;->onReleaseController(Landroidx/mediarouter/media/MediaRouteProvider$RouteController;)V

    goto :goto_0

    .line 394
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStop: No matching routeController found. routingController="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MR2Provider"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public onTransfer(Landroid/media/MediaRouter2$RoutingController;Landroid/media/MediaRouter2$RoutingController;)V
    .locals 3
    .param p1    # Landroid/media/MediaRouter2$RoutingController;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/media/MediaRouter2$RoutingController;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 365
    iget-object v0, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    iget-object v0, v0, Landroidx/mediarouter/media/MediaRoute2Provider;->mControllerMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    iget-object p1, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    iget-object p1, p1, Landroidx/mediarouter/media/MediaRoute2Provider;->mMediaRouter2:Landroid/media/MediaRouter2;

    invoke-virtual {p1}, Landroid/media/MediaRouter2;->getSystemController()Landroid/media/MediaRouter2$RoutingController;

    move-result-object p1

    const/4 v0, 0x3

    if-ne p2, p1, :cond_0

    .line 367
    iget-object p1, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    iget-object p1, p1, Landroidx/mediarouter/media/MediaRoute2Provider;->mCallback:Landroidx/mediarouter/media/MediaRoute2Provider$Callback;

    invoke-virtual {p1, v0}, Landroidx/mediarouter/media/MediaRoute2Provider$Callback;->onSelectFallbackRoute(I)V

    goto :goto_0

    .line 369
    :cond_0
    invoke-virtual {p2}, Landroid/media/MediaRouter2$RoutingController;->getSelectedRoutes()Ljava/util/List;

    move-result-object p1

    .line 370
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p1, "MR2Provider"

    const-string p2, "Selected routes are empty. This shouldn\'t happen."

    .line 371
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 375
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/MediaRoute2Info;

    invoke-virtual {p1}, Landroid/media/MediaRoute2Info;->getId()Ljava/lang/String;

    move-result-object p1

    .line 376
    new-instance v1, Landroidx/mediarouter/media/MediaRoute2Provider$GroupRouteController;

    iget-object v2, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    invoke-direct {v1, v2, p2, p1}, Landroidx/mediarouter/media/MediaRoute2Provider$GroupRouteController;-><init>(Landroidx/mediarouter/media/MediaRoute2Provider;Landroid/media/MediaRouter2$RoutingController;Ljava/lang/String;)V

    .line 377
    iget-object v2, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    iget-object v2, v2, Landroidx/mediarouter/media/MediaRoute2Provider;->mControllerMap:Ljava/util/Map;

    invoke-interface {v2, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    iget-object v1, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    iget-object v1, v1, Landroidx/mediarouter/media/MediaRoute2Provider;->mCallback:Landroidx/mediarouter/media/MediaRoute2Provider$Callback;

    invoke-virtual {v1, p1, v0}, Landroidx/mediarouter/media/MediaRoute2Provider$Callback;->onSelectRoute(Ljava/lang/String;I)V

    .line 379
    iget-object p1, p0, Landroidx/mediarouter/media/MediaRoute2Provider$TransferCallback;->this$0:Landroidx/mediarouter/media/MediaRoute2Provider;

    invoke-virtual {p1, p2}, Landroidx/mediarouter/media/MediaRoute2Provider;->setDynamicRouteDescriptors(Landroid/media/MediaRouter2$RoutingController;)V

    :goto_0
    return-void
.end method

.method public onTransferFailure(Landroid/media/MediaRoute2Info;)V
    .locals 2
    .param p1    # Landroid/media/MediaRoute2Info;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transfer failed. requestedRoute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MR2Provider"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
