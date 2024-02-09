package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.DeferredApi;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-measurement-connector@@18.0.2 */
/* loaded from: classes.dex */
public interface AnalyticsConnector {

    /* compiled from: com.google.firebase:firebase-measurement-connector@@18.0.2 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface AnalyticsConnectorHandle {
        @KeepForSdk
        void registerEventNames(@NonNull Set<String> set);

        @KeepForSdk
        void unregister();

        @KeepForSdk
        void unregisterEventNames();
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@18.0.2 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface AnalyticsConnectorListener {
        @KeepForSdk
        void onMessageTriggered(int i, @Nullable Bundle bundle);
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@18.0.2 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        @KeepForSdk
        public boolean active;
        @KeepForSdk
        public long creationTimestamp;
        @NonNull
        @KeepForSdk
        public String expiredEventName;
        @NonNull
        @KeepForSdk
        public Bundle expiredEventParams;
        @NonNull
        @KeepForSdk
        public String name;
        @NonNull
        @KeepForSdk
        public String origin;
        @KeepForSdk
        public long timeToLive;
        @NonNull
        @KeepForSdk
        public String timedOutEventName;
        @NonNull
        @KeepForSdk
        public Bundle timedOutEventParams;
        @NonNull
        @KeepForSdk
        public String triggerEventName;
        @KeepForSdk
        public long triggerTimeout;
        @NonNull
        @KeepForSdk
        public String triggeredEventName;
        @NonNull
        @KeepForSdk
        public Bundle triggeredEventParams;
        @KeepForSdk
        public long triggeredTimestamp;
        @NonNull
        @KeepForSdk
        public Object value;
    }

    @KeepForSdk
    void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @Nullable String str2, @Nullable Bundle bundle);

    @NonNull
    @KeepForSdk
    @WorkerThread
    List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @Nullable @Size(max = 23, min = 1) String str2);

    @KeepForSdk
    @WorkerThread
    int getMaxUserProperties(@NonNull @Size(min = 1) String str);

    @NonNull
    @KeepForSdk
    @WorkerThread
    Map<String, Object> getUserProperties(boolean z);

    @KeepForSdk
    void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle);

    @NonNull
    @KeepForSdk
    @DeferredApi
    AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String str, @NonNull AnalyticsConnectorListener analyticsConnectorListener);

    @KeepForSdk
    void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty);

    @KeepForSdk
    void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj);
}
