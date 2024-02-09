.class public final Landroidx/mediarouter/media/MediaRouterParams$Builder;
.super Ljava/lang/Object;
.source "MediaRouterParams.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/mediarouter/media/MediaRouterParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field mDialogType:I

.field mExtras:Landroid/os/Bundle;

.field mOutputSwitcherEnabled:Z

.field mTransferToLocalEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 134
    iput v0, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mDialogType:I

    return-void
.end method

.method public constructor <init>(Landroidx/mediarouter/media/MediaRouterParams;)V
    .locals 1
    .param p1    # Landroidx/mediarouter/media/MediaRouterParams;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 134
    iput v0, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mDialogType:I

    const-string v0, "params should not be null!"

    .line 153
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    iget v0, p1, Landroidx/mediarouter/media/MediaRouterParams;->mDialogType:I

    iput v0, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mDialogType:I

    .line 157
    iget-boolean v0, p1, Landroidx/mediarouter/media/MediaRouterParams;->mOutputSwitcherEnabled:Z

    iput-boolean v0, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mOutputSwitcherEnabled:Z

    .line 158
    iget-boolean v0, p1, Landroidx/mediarouter/media/MediaRouterParams;->mTransferToLocalEnabled:Z

    iput-boolean v0, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mTransferToLocalEnabled:Z

    .line 159
    iget-object v0, p1, Landroidx/mediarouter/media/MediaRouterParams;->mExtras:Landroid/os/Bundle;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    iget-object p1, p1, Landroidx/mediarouter/media/MediaRouterParams;->mExtras:Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mExtras:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public build()Landroidx/mediarouter/media/MediaRouterParams;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 241
    new-instance v0, Landroidx/mediarouter/media/MediaRouterParams;

    invoke-direct {v0, p0}, Landroidx/mediarouter/media/MediaRouterParams;-><init>(Landroidx/mediarouter/media/MediaRouterParams$Builder;)V

    return-object v0
.end method

.method public setDialogType(I)Landroidx/mediarouter/media/MediaRouterParams$Builder;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 178
    iput p1, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mDialogType:I

    return-object p0
.end method

.method public setExtras(Landroid/os/Bundle;)Landroidx/mediarouter/media/MediaRouterParams$Builder;
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 232
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mExtras:Landroid/os/Bundle;

    return-object p0
.end method

.method public setOutputSwitcherEnabled(Z)Landroidx/mediarouter/media/MediaRouterParams$Builder;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 196
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 197
    iput-boolean p1, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mOutputSwitcherEnabled:Z

    :cond_0
    return-object p0
.end method

.method public setTransferToLocalEnabled(Z)Landroidx/mediarouter/media/MediaRouterParams$Builder;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 218
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 219
    iput-boolean p1, p0, Landroidx/mediarouter/media/MediaRouterParams$Builder;->mTransferToLocalEnabled:Z

    :cond_0
    return-object p0
.end method
