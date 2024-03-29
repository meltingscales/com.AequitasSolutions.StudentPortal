package mono.android.inputmethodservice;

import android.inputmethodservice.KeyboardView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class KeyboardView_OnKeyboardActionListenerImplementor implements IGCUserPeer, KeyboardView.OnKeyboardActionListener {
    public static final String __md_methods = "n_onKey:(I[I)V:GetOnKey_IarrayIHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPress:(I)V:GetOnPress_IHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRelease:(I)V:GetOnRelease_IHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onText:(Ljava/lang/CharSequence;)V:GetOnText_Ljava_lang_CharSequence_Handler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_swipeDown:()V:GetSwipeDownHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_swipeLeft:()V:GetSwipeLeftHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_swipeRight:()V:GetSwipeRightHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_swipeUp:()V:GetSwipeUpHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onKey(int i, int[] iArr);

    private native void n_onPress(int i);

    private native void n_onRelease(int i);

    private native void n_onText(CharSequence charSequence);

    private native void n_swipeDown();

    private native void n_swipeLeft();

    private native void n_swipeRight();

    private native void n_swipeUp();

    static {
        Runtime.register("Android.InputMethodServices.KeyboardView+IOnKeyboardActionListenerImplementor, Mono.Android", KeyboardView_OnKeyboardActionListenerImplementor.class, __md_methods);
    }

    public KeyboardView_OnKeyboardActionListenerImplementor() {
        if (getClass() == KeyboardView_OnKeyboardActionListenerImplementor.class) {
            TypeManager.Activate("Android.InputMethodServices.KeyboardView+IOnKeyboardActionListenerImplementor, Mono.Android", "", this, new Object[0]);
        }
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onKey(int i, int[] iArr) {
        n_onKey(i, iArr);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onPress(int i) {
        n_onPress(i);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onRelease(int i) {
        n_onRelease(i);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onText(CharSequence charSequence) {
        n_onText(charSequence);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeDown() {
        n_swipeDown();
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeLeft() {
        n_swipeLeft();
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeRight() {
        n_swipeRight();
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeUp() {
        n_swipeUp();
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
