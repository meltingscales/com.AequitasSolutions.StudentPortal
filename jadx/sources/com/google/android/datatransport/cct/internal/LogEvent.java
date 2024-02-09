package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class LogEvent {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        @NonNull
        public abstract LogEvent build();

        @NonNull
        public abstract Builder setEventCode(@Nullable Integer num);

        @NonNull
        public abstract Builder setEventTimeMs(long j);

        @NonNull
        public abstract Builder setEventUptimeMs(long j);

        @NonNull
        public abstract Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo);

        @NonNull
        abstract Builder setSourceExtension(@Nullable byte[] bArr);

        @NonNull
        abstract Builder setSourceExtensionJsonProto3(@Nullable String str);

        @NonNull
        public abstract Builder setTimezoneOffsetSeconds(long j);
    }

    @Nullable
    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @Nullable
    public abstract NetworkConnectionInfo getNetworkConnectionInfo();

    @Nullable
    public abstract byte[] getSourceExtension();

    @Nullable
    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();

    @NonNull
    public static Builder protoBuilder(@NonNull byte[] bArr) {
        return builder().setSourceExtension(bArr);
    }

    @NonNull
    public static Builder jsonBuilder(@NonNull String str) {
        return builder().setSourceExtensionJsonProto3(str);
    }

    private static Builder builder() {
        return new AutoValue_LogEvent.Builder();
    }
}
