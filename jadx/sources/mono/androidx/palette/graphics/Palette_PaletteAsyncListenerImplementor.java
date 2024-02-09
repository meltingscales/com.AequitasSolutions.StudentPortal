package mono.androidx.palette.graphics;

import androidx.palette.graphics.Palette;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Palette_PaletteAsyncListenerImplementor implements IGCUserPeer, Palette.PaletteAsyncListener {
    public static final String __md_methods = "n_onGenerated:(Landroidx/palette/graphics/Palette;)V:GetOnGenerated_Landroidx_palette_graphics_Palette_Handler:AndroidX.Palette.Graphics.Palette/IPaletteAsyncListenerInvoker, Xamarin.AndroidX.Palette\n";
    private ArrayList refList;

    private native void n_onGenerated(Palette palette);

    static {
        Runtime.register("AndroidX.Palette.Graphics.Palette+IPaletteAsyncListenerImplementor, Xamarin.AndroidX.Palette", Palette_PaletteAsyncListenerImplementor.class, __md_methods);
    }

    public Palette_PaletteAsyncListenerImplementor() {
        if (getClass() == Palette_PaletteAsyncListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Palette.Graphics.Palette+IPaletteAsyncListenerImplementor, Xamarin.AndroidX.Palette", "", this, new Object[0]);
        }
    }

    @Override // androidx.palette.graphics.Palette.PaletteAsyncListener
    public void onGenerated(Palette palette) {
        n_onGenerated(palette);
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
