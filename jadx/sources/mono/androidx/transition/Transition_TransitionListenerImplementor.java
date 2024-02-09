package mono.androidx.transition;

import androidx.transition.Transition;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class Transition_TransitionListenerImplementor implements IGCUserPeer, Transition.TransitionListener {
    public static final String __md_methods = "n_onTransitionCancel:(Landroidx/transition/Transition;)V:GetOnTransitionCancel_Landroidx_transition_Transition_Handler:AndroidX.Transitions.Transition/ITransitionListenerInvoker, Xamarin.AndroidX.Transition\nn_onTransitionEnd:(Landroidx/transition/Transition;)V:GetOnTransitionEnd_Landroidx_transition_Transition_Handler:AndroidX.Transitions.Transition/ITransitionListenerInvoker, Xamarin.AndroidX.Transition\nn_onTransitionPause:(Landroidx/transition/Transition;)V:GetOnTransitionPause_Landroidx_transition_Transition_Handler:AndroidX.Transitions.Transition/ITransitionListenerInvoker, Xamarin.AndroidX.Transition\nn_onTransitionResume:(Landroidx/transition/Transition;)V:GetOnTransitionResume_Landroidx_transition_Transition_Handler:AndroidX.Transitions.Transition/ITransitionListenerInvoker, Xamarin.AndroidX.Transition\nn_onTransitionStart:(Landroidx/transition/Transition;)V:GetOnTransitionStart_Landroidx_transition_Transition_Handler:AndroidX.Transitions.Transition/ITransitionListenerInvoker, Xamarin.AndroidX.Transition\n";
    private ArrayList refList;

    private native void n_onTransitionCancel(Transition transition);

    private native void n_onTransitionEnd(Transition transition);

    private native void n_onTransitionPause(Transition transition);

    private native void n_onTransitionResume(Transition transition);

    private native void n_onTransitionStart(Transition transition);

    static {
        Runtime.register("AndroidX.Transitions.Transition+ITransitionListenerImplementor, Xamarin.AndroidX.Transition", Transition_TransitionListenerImplementor.class, __md_methods);
    }

    public Transition_TransitionListenerImplementor() {
        if (getClass() == Transition_TransitionListenerImplementor.class) {
            TypeManager.Activate("AndroidX.Transitions.Transition+ITransitionListenerImplementor, Xamarin.AndroidX.Transition", "", this, new Object[0]);
        }
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        n_onTransitionCancel(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        n_onTransitionEnd(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        n_onTransitionPause(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        n_onTransitionResume(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        n_onTransitionStart(transition);
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
