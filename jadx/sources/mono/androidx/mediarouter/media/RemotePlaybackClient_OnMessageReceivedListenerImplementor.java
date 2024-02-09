package mono.androidx.mediarouter.media;

import android.os.Bundle;
import androidx.mediarouter.media.RemotePlaybackClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RemotePlaybackClient_OnMessageReceivedListenerImplementor implements IGCUserPeer, RemotePlaybackClient.OnMessageReceivedListener {
    public static final String __md_methods = "n_onMessageReceived:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnMessageReceived_Ljava_lang_String_Landroid_os_Bundle_Handler:AndroidX.MediaRouter.Media.RemotePlaybackClient/IOnMessageReceivedListenerInvoker, Xamarin.AndroidX.MediaRouter\n";
    private ArrayList refList;

    private native void n_onMessageReceived(String str, Bundle bundle);

    static {
        Runtime.register("AndroidX.MediaRouter.Media.RemotePlaybackClient+IOnMessageReceivedListenerImplementor, Xamarin.AndroidX.MediaRouter", RemotePlaybackClient_OnMessageReceivedListenerImplementor.class, __md_methods);
    }

    public RemotePlaybackClient_OnMessageReceivedListenerImplementor() {
        if (getClass() == RemotePlaybackClient_OnMessageReceivedListenerImplementor.class) {
            TypeManager.Activate("AndroidX.MediaRouter.Media.RemotePlaybackClient+IOnMessageReceivedListenerImplementor, Xamarin.AndroidX.MediaRouter", "", this, new Object[0]);
        }
    }

    @Override // androidx.mediarouter.media.RemotePlaybackClient.OnMessageReceivedListener
    public void onMessageReceived(String str, Bundle bundle) {
        n_onMessageReceived(str, bundle);
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
