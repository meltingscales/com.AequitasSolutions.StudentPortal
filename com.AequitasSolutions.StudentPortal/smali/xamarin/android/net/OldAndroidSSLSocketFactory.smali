.class public Lxamarin/android/net/OldAndroidSSLSocketFactory;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "OldAndroidSSLSocketFactory.java"

# interfaces
.implements Lmono/android/IGCUserPeer;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_getDefaultCipherSuites:()[Ljava/lang/String;:GetGetDefaultCipherSuitesHandler\nn_getSupportedCipherSuites:()[Ljava/lang/String;:GetGetSupportedCipherSuitesHandler\nn_createSocket:(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_net_InetAddress_ILjava_net_InetAddress_IHandler\nn_createSocket:(Ljava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_net_InetAddress_IHandler\nn_createSocket:(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_lang_String_ILjava_net_InetAddress_IHandler\nn_createSocket:(Ljava/lang/String;I)Ljava/net/Socket;:GetCreateSocket_Ljava_lang_String_IHandler\nn_createSocket:(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;:GetCreateSocket_Ljava_net_Socket_Ljava_lang_String_IZHandler\nn_createSocket:()Ljava/net/Socket;:GetCreateSocketHandler\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 22
    const-class v0, Lxamarin/android/net/OldAndroidSSLSocketFactory;

    const-string v1, "Xamarin.Android.Net.OldAndroidSSLSocketFactory, Mono.Android"

    const-string v2, "n_getDefaultCipherSuites:()[Ljava/lang/String;:GetGetDefaultCipherSuitesHandler\nn_getSupportedCipherSuites:()[Ljava/lang/String;:GetGetSupportedCipherSuitesHandler\nn_createSocket:(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_net_InetAddress_ILjava_net_InetAddress_IHandler\nn_createSocket:(Ljava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_net_InetAddress_IHandler\nn_createSocket:(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;:GetCreateSocket_Ljava_lang_String_ILjava_net_InetAddress_IHandler\nn_createSocket:(Ljava/lang/String;I)Ljava/net/Socket;:GetCreateSocket_Ljava_lang_String_IHandler\nn_createSocket:(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;:GetCreateSocket_Ljava_net_Socket_Ljava_lang_String_IZHandler\nn_createSocket:()Ljava/net/Socket;:GetCreateSocketHandler\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 28
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lxamarin/android/net/OldAndroidSSLSocketFactory;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Xamarin.Android.Net.OldAndroidSSLSocketFactory, Mono.Android"

    const-string v2, ""

    .line 30
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_createSocket()Ljava/net/Socket;
.end method

.method private native n_createSocket(Ljava/lang/String;I)Ljava/net/Socket;
.end method

.method private native n_createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
.end method

.method private native n_createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
.end method

.method private native n_createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
.end method

.method private native n_createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
.end method

.method private native n_getDefaultCipherSuites()[Ljava/lang/String;
.end method

.method private native n_getSupportedCipherSuites()[Ljava/lang/String;
.end method


# virtual methods
.method public createSocket()Ljava/net/Socket;
    .locals 1

    .line 92
    invoke-direct {p0}, Lxamarin/android/net/OldAndroidSSLSocketFactory;->n_createSocket()Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2}, Lxamarin/android/net/OldAndroidSSLSocketFactory;->n_createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2, p3, p4}, Lxamarin/android/net/OldAndroidSSLSocketFactory;->n_createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lxamarin/android/net/OldAndroidSSLSocketFactory;->n_createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Lxamarin/android/net/OldAndroidSSLSocketFactory;->n_createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 0

    .line 84
    invoke-direct {p0, p1, p2, p3, p4}, Lxamarin/android/net/OldAndroidSSLSocketFactory;->n_createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 36
    invoke-direct {p0}, Lxamarin/android/net/OldAndroidSSLSocketFactory;->n_getDefaultCipherSuites()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 44
    invoke-direct {p0}, Lxamarin/android/net/OldAndroidSSLSocketFactory;->n_getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 100
    iget-object v0, p0, Lxamarin/android/net/OldAndroidSSLSocketFactory;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxamarin/android/net/OldAndroidSSLSocketFactory;->refList:Ljava/util/ArrayList;

    .line 102
    :cond_0
    iget-object v0, p0, Lxamarin/android/net/OldAndroidSSLSocketFactory;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 107
    iget-object v0, p0, Lxamarin/android/net/OldAndroidSSLSocketFactory;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method
