.class public Lcrc643f46942d9dd1fff9/ShellContentFragment;
.super Landroidx/fragment/app/Fragment;
.source "ShellContentFragment.java"

# interfaces
.implements Lmono/android/IGCUserPeer;
.implements Landroid/view/animation/Animation$AnimationListener;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_onCreateAnimation:(IZI)Landroid/view/animation/Animation;:GetOnCreateAnimation_IZIHandler\nn_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onAnimationEnd:(Landroid/view/animation/Animation;)V:GetOnAnimationEnd_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationRepeat:(Landroid/view/animation/Animation;)V:GetOnAnimationRepeat_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationStart:(Landroid/view/animation/Animation;)V:GetOnAnimationStart_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 21
    const-class v0, Lcrc643f46942d9dd1fff9/ShellContentFragment;

    const-string v1, "Xamarin.Forms.Platform.Android.ShellContentFragment, Xamarin.Forms.Platform.Android"

    const-string v2, "n_onCreateAnimation:(IZI)Landroid/view/animation/Animation;:GetOnCreateAnimation_IZIHandler\nn_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onAnimationEnd:(Landroid/view/animation/Animation;)V:GetOnAnimationEnd_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationRepeat:(Landroid/view/animation/Animation;)V:GetOnAnimationRepeat_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onAnimationStart:(Landroid/view/animation/Animation;)V:GetOnAnimationStart_Landroid_view_animation_Animation_Handler:Android.Views.Animations.Animation/IAnimationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 27
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc643f46942d9dd1fff9/ShellContentFragment;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Xamarin.Forms.Platform.Android.ShellContentFragment, Xamarin.Forms.Platform.Android"

    const-string v2, ""

    .line 29
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 35
    invoke-direct {p0, p1}, Landroidx/fragment/app/Fragment;-><init>(I)V

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc643f46942d9dd1fff9/ShellContentFragment;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Xamarin.Forms.Platform.Android.ShellContentFragment, Xamarin.Forms.Platform.Android"

    const-string v1, "System.Int32, mscorlib"

    invoke-static {p1, v1, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_onAnimationEnd(Landroid/view/animation/Animation;)V
.end method

.method private native n_onAnimationRepeat(Landroid/view/animation/Animation;)V
.end method

.method private native n_onAnimationStart(Landroid/view/animation/Animation;)V
.end method

.method private native n_onCreateAnimation(IZI)Landroid/view/animation/Animation;
.end method

.method private native n_onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end method

.method private native n_onDestroy()V
.end method


# virtual methods
.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcrc643f46942d9dd1fff9/ShellContentFragment;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc643f46942d9dd1fff9/ShellContentFragment;->refList:Ljava/util/ArrayList;

    .line 93
    :cond_0
    iget-object v0, p0, Lcrc643f46942d9dd1fff9/ShellContentFragment;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 98
    iget-object v0, p0, Lcrc643f46942d9dd1fff9/ShellContentFragment;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lcrc643f46942d9dd1fff9/ShellContentFragment;->n_onAnimationEnd(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcrc643f46942d9dd1fff9/ShellContentFragment;->n_onAnimationRepeat(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcrc643f46942d9dd1fff9/ShellContentFragment;->n_onAnimationStart(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcrc643f46942d9dd1fff9/ShellContentFragment;->n_onCreateAnimation(IZI)Landroid/view/animation/Animation;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lcrc643f46942d9dd1fff9/ShellContentFragment;->n_onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcrc643f46942d9dd1fff9/ShellContentFragment;->n_onDestroy()V

    return-void
.end method