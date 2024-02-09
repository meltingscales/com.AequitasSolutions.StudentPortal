package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class ServiceStarter {
    public static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    private static ServiceStarter instance;
    private Boolean hasWakeLockPermission = null;
    private Boolean hasAccessNetworkStatePermission = null;

    private ServiceStarter() {
    }

    @KeepForSdk
    public static synchronized ServiceStarter getInstance() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (instance == null) {
                instance = new ServiceStarter();
            }
            serviceStarter = instance;
        }
        return serviceStarter;
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasAccessNetworkStatePermission(Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasWakeLockPermission(Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasWakeLockPermission.booleanValue();
    }
}
