package com.google.firebase.iid;

import androidx.annotation.NonNull;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@Deprecated
/* loaded from: classes.dex */
public interface InstanceIdResult {
    @NonNull
    String getId();

    @NonNull
    String getToken();
}
