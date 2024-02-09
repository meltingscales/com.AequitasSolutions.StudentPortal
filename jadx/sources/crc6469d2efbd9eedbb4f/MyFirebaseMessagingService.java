package crc6469d2efbd9eedbb4f;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService implements IGCUserPeer {
    public static final String __md_methods = "n_onMessageReceived:(Lcom/google/firebase/messaging/RemoteMessage;)V:GetOnMessageReceived_Lcom_google_firebase_messaging_RemoteMessage_Handler\nn_onNewToken:(Ljava/lang/String;)V:GetOnNewToken_Ljava_lang_String_Handler\n";
    private ArrayList refList;

    private native void n_onMessageReceived(RemoteMessage remoteMessage);

    private native void n_onNewToken(String str);

    static {
        Runtime.register("Gastropod.Droid.MyFirebaseMessagingService, Gastropod.Android", MyFirebaseMessagingService.class, __md_methods);
    }

    public MyFirebaseMessagingService() {
        if (getClass() == MyFirebaseMessagingService.class) {
            TypeManager.Activate("Gastropod.Droid.MyFirebaseMessagingService, Gastropod.Android", "", this, new Object[0]);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        n_onMessageReceived(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        n_onNewToken(str);
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
