package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
@KeepForSdk
/* loaded from: classes.dex */
public interface LifecycleFragment {
    @KeepForSdk
    void addCallback(@RecentlyNonNull String str, @RecentlyNonNull LifecycleCallback lifecycleCallback);

    @RecentlyNullable
    @KeepForSdk
    <T extends LifecycleCallback> T getCallbackOrNull(@RecentlyNonNull String str, @RecentlyNonNull Class<T> cls);

    @RecentlyNonNull
    @KeepForSdk
    Activity getLifecycleActivity();

    @KeepForSdk
    boolean isCreated();

    @KeepForSdk
    boolean isStarted();

    @KeepForSdk
    void startActivityForResult(@RecentlyNonNull Intent intent, int i);
}
