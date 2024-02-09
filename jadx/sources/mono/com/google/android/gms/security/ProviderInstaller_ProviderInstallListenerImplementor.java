package mono.com.google.android.gms.security;

import android.content.Intent;
import com.google.android.gms.security.ProviderInstaller;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ProviderInstaller_ProviderInstallListenerImplementor implements IGCUserPeer, ProviderInstaller.ProviderInstallListener {
    public static final String __md_methods = "n_onProviderInstallFailed:(ILandroid/content/Intent;)V:GetOnProviderInstallFailed_ILandroid_content_Intent_Handler:Android.Gms.Security.ProviderInstaller/IProviderInstallListenerInvoker, Xamarin.GooglePlayServices.Basement\nn_onProviderInstalled:()V:GetOnProviderInstalledHandler:Android.Gms.Security.ProviderInstaller/IProviderInstallListenerInvoker, Xamarin.GooglePlayServices.Basement\n";
    private ArrayList refList;

    private native void n_onProviderInstallFailed(int i, Intent intent);

    private native void n_onProviderInstalled();

    static {
        Runtime.register("Android.Gms.Security.ProviderInstaller+IProviderInstallListenerImplementor, Xamarin.GooglePlayServices.Basement", ProviderInstaller_ProviderInstallListenerImplementor.class, __md_methods);
    }

    public ProviderInstaller_ProviderInstallListenerImplementor() {
        if (getClass() == ProviderInstaller_ProviderInstallListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Security.ProviderInstaller+IProviderInstallListenerImplementor, Xamarin.GooglePlayServices.Basement", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstallFailed(int i, Intent intent) {
        n_onProviderInstallFailed(i, intent);
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstalled() {
        n_onProviderInstalled();
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
