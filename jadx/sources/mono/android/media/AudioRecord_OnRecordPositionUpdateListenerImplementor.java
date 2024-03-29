package mono.android.media;

import android.media.AudioRecord;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class AudioRecord_OnRecordPositionUpdateListenerImplementor implements IGCUserPeer, AudioRecord.OnRecordPositionUpdateListener {
    public static final String __md_methods = "n_onMarkerReached:(Landroid/media/AudioRecord;)V:GetOnMarkerReached_Landroid_media_AudioRecord_Handler:Android.Media.AudioRecord/IOnRecordPositionUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPeriodicNotification:(Landroid/media/AudioRecord;)V:GetOnPeriodicNotification_Landroid_media_AudioRecord_Handler:Android.Media.AudioRecord/IOnRecordPositionUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onMarkerReached(AudioRecord audioRecord);

    private native void n_onPeriodicNotification(AudioRecord audioRecord);

    static {
        Runtime.register("Android.Media.AudioRecord+IOnRecordPositionUpdateListenerImplementor, Mono.Android", AudioRecord_OnRecordPositionUpdateListenerImplementor.class, __md_methods);
    }

    public AudioRecord_OnRecordPositionUpdateListenerImplementor() {
        if (getClass() == AudioRecord_OnRecordPositionUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.AudioRecord+IOnRecordPositionUpdateListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onMarkerReached(AudioRecord audioRecord) {
        n_onMarkerReached(audioRecord);
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onPeriodicNotification(AudioRecord audioRecord) {
        n_onPeriodicNotification(audioRecord);
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
