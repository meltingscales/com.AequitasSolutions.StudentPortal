package crc643f46942d9dd1fff9;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class EntryEditText extends FormsEditText implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.EntryEditText, Xamarin.Forms.Platform.Android", EntryEditText.class, "");
    }

    public EntryEditText(Context context) {
        super(context);
        if (getClass() == EntryEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android", this, new Object[]{context});
        }
    }

    public EntryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == EntryEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new Object[]{context, attributeSet});
        }
    }

    public EntryEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == EntryEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    public EntryEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (getClass() == EntryEditText.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.EntryEditText, Xamarin.Forms.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    @Override // crc643f46942d9dd1fff9.FormsEditText, crc643f46942d9dd1fff9.FormsEditTextBase, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc643f46942d9dd1fff9.FormsEditText, crc643f46942d9dd1fff9.FormsEditTextBase, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}
