package androidx.mediarouter.media;

import android.media.MediaRoute2Info;
import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: androidx.mediarouter.media.-$$Lambda$nIHiiLCAnCUtoRKR-PHG5llkexw  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class $$Lambda$nIHiiLCAnCUtoRKRPHG5llkexw implements Predicate {
    public static final /* synthetic */ $$Lambda$nIHiiLCAnCUtoRKRPHG5llkexw INSTANCE = new $$Lambda$nIHiiLCAnCUtoRKRPHG5llkexw();

    private /* synthetic */ $$Lambda$nIHiiLCAnCUtoRKRPHG5llkexw() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Objects.nonNull((MediaRoute2Info) obj);
    }
}
