package mono.android.media;

import android.media.JetPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class JetPlayer_OnJetEventListenerImplementor implements IGCUserPeer, JetPlayer.OnJetEventListener {
    public static final String __md_methods = "n_onJetEvent:(Landroid/media/JetPlayer;SBBBB)V:GetOnJetEvent_Landroid_media_JetPlayer_SBBBBHandler:Android.Media.JetPlayer/IOnJetEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onJetNumQueuedSegmentUpdate:(Landroid/media/JetPlayer;I)V:GetOnJetNumQueuedSegmentUpdate_Landroid_media_JetPlayer_IHandler:Android.Media.JetPlayer/IOnJetEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onJetPauseUpdate:(Landroid/media/JetPlayer;I)V:GetOnJetPauseUpdate_Landroid_media_JetPlayer_IHandler:Android.Media.JetPlayer/IOnJetEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onJetUserIdUpdate:(Landroid/media/JetPlayer;II)V:GetOnJetUserIdUpdate_Landroid_media_JetPlayer_IIHandler:Android.Media.JetPlayer/IOnJetEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onJetEvent(JetPlayer jetPlayer, short s, byte b, byte b2, byte b3, byte b4);

    private native void n_onJetNumQueuedSegmentUpdate(JetPlayer jetPlayer, int i);

    private native void n_onJetPauseUpdate(JetPlayer jetPlayer, int i);

    private native void n_onJetUserIdUpdate(JetPlayer jetPlayer, int i, int i2);

    static {
        Runtime.register("Android.Media.JetPlayer+IOnJetEventListenerImplementor, Mono.Android", JetPlayer_OnJetEventListenerImplementor.class, __md_methods);
    }

    public JetPlayer_OnJetEventListenerImplementor() {
        if (getClass() == JetPlayer_OnJetEventListenerImplementor.class) {
            TypeManager.Activate("Android.Media.JetPlayer+IOnJetEventListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.JetPlayer.OnJetEventListener
    public void onJetEvent(JetPlayer jetPlayer, short s, byte b, byte b2, byte b3, byte b4) {
        n_onJetEvent(jetPlayer, s, b, b2, b3, b4);
    }

    @Override // android.media.JetPlayer.OnJetEventListener
    public void onJetNumQueuedSegmentUpdate(JetPlayer jetPlayer, int i) {
        n_onJetNumQueuedSegmentUpdate(jetPlayer, i);
    }

    @Override // android.media.JetPlayer.OnJetEventListener
    public void onJetPauseUpdate(JetPlayer jetPlayer, int i) {
        n_onJetPauseUpdate(jetPlayer, i);
    }

    @Override // android.media.JetPlayer.OnJetEventListener
    public void onJetUserIdUpdate(JetPlayer jetPlayer, int i, int i2) {
        n_onJetUserIdUpdate(jetPlayer, i, i2);
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
