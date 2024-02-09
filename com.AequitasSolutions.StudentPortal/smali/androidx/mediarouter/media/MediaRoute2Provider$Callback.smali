.class abstract Landroidx/mediarouter/media/MediaRoute2Provider$Callback;
.super Ljava/lang/Object;
.source "MediaRoute2Provider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/mediarouter/media/MediaRoute2Provider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "Callback"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 331
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onReleaseController(Landroidx/mediarouter/media/MediaRouteProvider$RouteController;)V
    .param p1    # Landroidx/mediarouter/media/MediaRouteProvider$RouteController;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onSelectFallbackRoute(I)V
.end method

.method public abstract onSelectRoute(Ljava/lang/String;I)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
