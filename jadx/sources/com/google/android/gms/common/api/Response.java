package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class Response<T extends Result> {
    private T zza;

    public Response() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Response(@RecentlyNonNull T t) {
        this.zza = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public T getResult() {
        return this.zza;
    }

    public void setResult(@RecentlyNonNull T t) {
        this.zza = t;
    }
}
