.class public Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;
.super Ljava/lang/Object;
.source "AndroidAccountStore_SecretAccount.java"

# interfaces
.implements Lmono/android/IGCUserPeer;
.implements Ljavax/crypto/SecretKey;
.implements Ljava/security/Key;
.implements Ljava/io/Serializable;


# static fields
.field public static final __md_methods:Ljava/lang/String; = "n_getAlgorithm:()Ljava/lang/String;:GetGetAlgorithmHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_getFormat:()Ljava/lang/String;:GetGetFormatHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_getEncoded:()[B:GetGetEncodedHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n"


# instance fields
.field private refList:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 20
    const-class v0, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;

    const-string v1, "Xamarin.Auth.AndroidAccountStore+SecretAccount, Xamarin.Auth"

    const-string v2, "n_getAlgorithm:()Ljava/lang/String;:GetGetAlgorithmHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_getFormat:()Ljava/lang/String;:GetGetFormatHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_getEncoded:()[B:GetGetEncodedHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n"

    invoke-static {v1, v0, v2}, Lmono/android/Runtime;->register(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Xamarin.Auth.AndroidAccountStore+SecretAccount, Xamarin.Auth"

    const-string v2, ""

    .line 28
    invoke-static {v1, v2, p0, v0}, Lmono/android/TypeManager;->Activate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private native n_getAlgorithm()Ljava/lang/String;
.end method

.method private native n_getEncoded()[B
.end method

.method private native n_getFormat()Ljava/lang/String;
.end method


# virtual methods
.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    .line 34
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;->n_getAlgorithm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEncoded()[B
    .locals 1

    .line 50
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;->n_getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .line 42
    invoke-direct {p0}, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;->n_getFormat()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public monodroidAddReference(Ljava/lang/Object;)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;->refList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;->refList:Ljava/util/ArrayList;

    .line 60
    :cond_0
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;->refList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public monodroidClearReferences()V
    .locals 1

    .line 65
    iget-object v0, p0, Lcrc64f98dd38067c0c88b/AndroidAccountStore_SecretAccount;->refList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method
