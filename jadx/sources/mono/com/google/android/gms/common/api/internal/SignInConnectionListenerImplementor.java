package mono.com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class SignInConnectionListenerImplementor implements IGCUserPeer, SignInConnectionListener {
    public static final String __md_methods = "n_onComplete:()V:GetOnCompleteHandler:Android.Gms.Common.Api.Internal.ISignInConnectionListenerInvoker, Xamarin.GooglePlayServices.Base\n";
    private ArrayList refList;

    private native void n_onComplete();

    static {
        Runtime.register("Android.Gms.Common.Api.Internal.ISignInConnectionListenerImplementor, Xamarin.GooglePlayServices.Base", SignInConnectionListenerImplementor.class, __md_methods);
    }

    public SignInConnectionListenerImplementor() {
        if (getClass() == SignInConnectionListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Common.Api.Internal.ISignInConnectionListenerImplementor, Xamarin.GooglePlayServices.Base", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public void onComplete() {
        n_onComplete();
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}
