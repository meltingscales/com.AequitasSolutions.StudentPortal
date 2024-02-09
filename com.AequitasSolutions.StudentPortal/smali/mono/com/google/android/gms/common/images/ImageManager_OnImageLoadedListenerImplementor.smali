.class public Lmono/com/google/android/gms/common/images/ImageManager_OnImageLoadedListenerImplementor;
.super Ljava/lang/Object;
.source "ImageManager_OnImageLoadedListenerImplementor.java"

# interfaces
.implements Lmono/android/IGCUserPeer;
.implements Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onImageLoaded:(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V:GetOnImageLoaded_Landroid_net_Uri_Landroid_graphics_drawable_Drawable_ZHandler:Android.Gms.Common.Images.ImageManager/IOnImageLoadedListenerInvoker, Xamarin.GooglePlayServices.Base\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    const-class v0, Lmono/com/google/android/gms/common/images/ImageManager_OnImageLoadedListenerImplementor;

    const-string v1, "Android.Gms.Common.Images.ImageManager+IOnImageLoadedListenerImplementor, Xamarin.GooglePlayServices.Base"

    const-string v2, "n_onImageLoaded:(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V:GetOnImageLoaded_Landroid_net_Uri_Landroid_graphics_drawable_Drawable_ZHandler:Android.Gms.Common.Images.ImageManager/IOnImageLoadedListenerInvoker, Xamarin.GooglePlayServices.Base\n"

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

    const-class v1, Lmono/com/google/android/gms/common/images/ImageManager_OnImageLoadedListenerImplementor;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Android.Gms.Common.Images.ImageManager+IOnImageLoadedListenerImplementor, Xamarin.GooglePlayServices.Base"

    const-string v2, ""

    .line 24
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onImageLoaded(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lmono/com/google/android/gms/common/images/ImageManager_OnImageLoadedListenerImplementor;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lmono/com/google/android/gms/common/images/ImageManager_OnImageLoadedListenerImplementor;->refList:Ljava/util/ArrayList;

    .line 40
    :cond_0
    iget-object v0, p0, Lmono/com/google/android/gms/common/images/ImageManager_OnImageLoadedListenerImplementor;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 45
    iget-object v0, p0, Lmono/com/google/android/gms/common/images/ImageManager_OnImageLoadedListenerImplementor;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onImageLoaded(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lmono/com/google/android/gms/common/images/ImageManager_OnImageLoadedListenerImplementor;->n_onImageLoaded(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V

    return-void
.end method
