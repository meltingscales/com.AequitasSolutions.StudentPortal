package mono.androidx.core.view.inputmethod;

import android.os.Bundle;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class InputConnectionCompat_OnCommitContentListenerImplementor implements IGCUserPeer, InputConnectionCompat.OnCommitContentListener {
    public static final String __md_methods = "n_onCommitContent:(Landroidx/core/view/inputmethod/InputContentInfoCompat;ILandroid/os/Bundle;)Z:GetOnCommitContent_Landroidx_core_view_inputmethod_InputContentInfoCompat_ILandroid_os_Bundle_Handler:AndroidX.Core.View.InputMethod.InputConnectionCompat/IOnCommitContentListenerInvoker, Xamarin.AndroidX.Core\n";
    private ArrayList refList;

    private native boolean n_onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle);

    static {
        Runtime.register("AndroidX.Core.View.InputMethod.InputConnectionCompat+IOnCommitContentListenerImplementor, Xamarin.AndroidX.Core", InputConnectionCompat_OnCommitContentListenerImplementor.class, __md_methods);
    }

    public InputConnectionCompat_OnCommitContentListenerImplementor() {
        if (getClass() == InputConnectionCompat_OnCommitContentListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Core.View.InputMethod.InputConnectionCompat+IOnCommitContentListenerImplementor, Xamarin.AndroidX.Core", "", this, new Object[0]);
        }
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return n_onCommitContent(inputContentInfoCompat, i, bundle);
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
