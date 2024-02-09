package mono.com.google.android.material.chip;

import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class ChipGroup_OnCheckedChangeListenerImplementor implements IGCUserPeer, ChipGroup.OnCheckedChangeListener {
    public static final String __md_methods = "n_onCheckedChanged:(Lcom/google/android/material/chip/ChipGroup;I)V:GetOnCheckedChanged_Lcom_google_android_material_chip_ChipGroup_IHandler:Google.Android.Material.Chip.ChipGroup/IOnCheckedChangeListenerInvoker, Xamarin.Google.Android.Material\n";
    private ArrayList refList;

    private native void n_onCheckedChanged(ChipGroup chipGroup, int i);

    static {
        Runtime.register("Google.Android.Material.Chip.ChipGroup+IOnCheckedChangeListenerImplementor, Xamarin.Google.Android.Material", ChipGroup_OnCheckedChangeListenerImplementor.class, __md_methods);
    }

    public ChipGroup_OnCheckedChangeListenerImplementor() {
        if (getClass() == ChipGroup_OnCheckedChangeListenerImplementor.class) {
            TypeManager.Activate("Google.Android.Material.Chip.ChipGroup+IOnCheckedChangeListenerImplementor, Xamarin.Google.Android.Material", "", this, new Object[0]);
        }
    }

    @Override // com.google.android.material.chip.ChipGroup.OnCheckedChangeListener
    public void onCheckedChanged(ChipGroup chipGroup, int i) {
        n_onCheckedChanged(chipGroup, i);
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
