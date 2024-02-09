package androidx.mediarouter.media;

import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: androidx.mediarouter.media.-$$Lambda$m2oCDzqe8KyFLTTNaWD7t3RtNl4  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class $$Lambda$m2oCDzqe8KyFLTTNaWD7t3RtNl4 implements Predicate {
    public static final /* synthetic */ $$Lambda$m2oCDzqe8KyFLTTNaWD7t3RtNl4 INSTANCE = new $$Lambda$m2oCDzqe8KyFLTTNaWD7t3RtNl4();

    private /* synthetic */ $$Lambda$m2oCDzqe8KyFLTTNaWD7t3RtNl4() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Objects.nonNull((MediaRouteDescriptor) obj);
    }
}
