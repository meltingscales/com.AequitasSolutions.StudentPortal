.class Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord$1;
.super Ljava/lang/Object;
.source "MediaRouteProviderService.java"

# interfaces
.implements Landroidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController$OnDynamicRoutesChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord;


# direct methods
.method constructor <init>(Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord;)V
    .locals 0

    .line 932
    iput-object p1, p0, Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord$1;->this$1:Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRoutesChanged(Landroidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController;Landroidx/mediarouter/media/MediaRouteDescriptor;Ljava/util/Collection;)V
    .locals 1
    .param p1    # Landroidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/mediarouter/media/MediaRouteDescriptor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Collection;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController;",
            "Landroidx/mediarouter/media/MediaRouteDescriptor;",
            "Ljava/util/Collection<",
            "Landroidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController$DynamicRouteDescriptor;",
            ">;)V"
        }
    .end annotation

    .line 938
    iget-object v0, p0, Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord$1;->this$1:Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/mediarouter/media/MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord;->sendDynamicRouteDescriptors(Landroidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController;Landroidx/mediarouter/media/MediaRouteDescriptor;Ljava/util/Collection;)V

    return-void
.end method
