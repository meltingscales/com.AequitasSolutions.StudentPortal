.class public Lcrc64a0e0a82d0db9a07d/SingleLocationListener;
.super Ljava/lang/Object;
.source "SingleLocationListener.java"

# interfaces
.implements Lmono/android/IGCUserPeer;
.implements Landroid/location/LocationListener;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onLocationChanged:(Landroid/location/Location;)V:GetOnLocationChanged_Landroid_location_Location_Handler:Android.Locations.ILocationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onProviderDisabled:(Ljava/lang/String;)V:GetOnProviderDisabled_Ljava_lang_String_Handler:Android.Locations.ILocationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onProviderEnabled:(Ljava/lang/String;)V:GetOnProviderEnabled_Ljava_lang_String_Handler:Android.Locations.ILocationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onStatusChanged:(Ljava/lang/String;ILandroid/os/Bundle;)V:GetOnStatusChanged_Ljava_lang_String_ILandroid_os_Bundle_Handler:Android.Locations.ILocationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    const-class v0, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;

    const-string v1, "Xamarin.Essentials.SingleLocationListener, Xamarin.Essentials"

    const-string v2, "n_onLocationChanged:(Landroid/location/Location;)V:GetOnLocationChanged_Landroid_location_Location_Handler:Android.Locations.ILocationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onProviderDisabled:(Ljava/lang/String;)V:GetOnProviderDisabled_Ljava_lang_String_Handler:Android.Locations.ILocationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onProviderEnabled:(Ljava/lang/String;)V:GetOnProviderEnabled_Ljava_lang_String_Handler:Android.Locations.ILocationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onStatusChanged:(Ljava/lang/String;ILandroid/os/Bundle;)V:GetOnStatusChanged_Ljava_lang_String_ILandroid_os_Bundle_Handler:Android.Locations.ILocationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Xamarin.Essentials.SingleLocationListener, Xamarin.Essentials"

    const-string v2, ""

    .line 27
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onLocationChanged(Landroid/location/Location;)V
.end method

.method private native n_onProviderDisabled(Ljava/lang/String;)V
.end method

.method private native n_onProviderEnabled(Ljava/lang/String;)V
.end method

.method private native n_onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;->refList:Ljava/util/ArrayList;

    .line 67
    :cond_0
    iget-object v0, p0, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;->n_onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;->n_onProviderDisabled(Ljava/lang/String;)V

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;->n_onProviderEnabled(Ljava/lang/String;)V

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2, p3}, Lcrc64a0e0a82d0db9a07d/SingleLocationListener;->n_onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method
