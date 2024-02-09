package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirelogAnalyticsEvent;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes.dex */
public class MessagingAnalytics {
    private static final DataEncoder dataEncoder = new JsonDataEncoderBuilder().registerEncoder(FirelogAnalyticsEvent.FirelogAnalyticsEventWrapper.class, (ObjectEncoder) new FirelogAnalyticsEvent.FirelogAnalyticsEventWrapperEncoder()).registerEncoder(FirelogAnalyticsEvent.class, (ObjectEncoder) new FirelogAnalyticsEvent.FirelogAnalyticsEventEncoder()).build();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean deliveryMetricsExportToBigQueryEnabled() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.getInstance();
            Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i(Constants.TAG, "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String getCollapseKey(Intent intent) {
        return intent.getStringExtra(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @Nullable
    static String getComposerId(Intent intent) {
        return intent.getStringExtra(Constants.AnalyticsKeys.COMPOSER_ID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String getComposerLabel(Intent intent) {
        return intent.getStringExtra(Constants.AnalyticsKeys.COMPOSER_LABEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static String getInstanceId(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.TO);
        if (TextUtils.isEmpty(stringExtra)) {
            try {
                return (String) Tasks.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        return stringExtra;
    }

    @Nullable
    static String getMessageChannel(Intent intent) {
        return intent.getStringExtra(Constants.AnalyticsKeys.MESSAGE_CHANNEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        return stringExtra == null ? intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER) : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String getMessageLabel(Intent intent) {
        return intent.getStringExtra(Constants.AnalyticsKeys.MESSAGE_LABEL);
    }

    @NonNull
    private static int getMessagePriority(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @Nullable
    static String getMessageTime(Intent intent) {
        return intent.getStringExtra(Constants.AnalyticsKeys.MESSAGE_TIMESTAMP);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    @Constants.FirelogAnalytics.MessageType
    public static String getMessageTypeForFirelog(Intent intent) {
        return (intent.getExtras() == null || !NotificationParams.isNotification(intent.getExtras())) ? Constants.FirelogAnalytics.MessageType.DATA_MESSAGE : Constants.FirelogAnalytics.MessageType.DISPLAY_NOTIFICATION;
    }

    @NonNull
    static String getMessageTypeForScion(Intent intent) {
        return (intent.getExtras() == null || !NotificationParams.isNotification(intent.getExtras())) ? Constants.ScionAnalytics.MessageType.DATA_MESSAGE : Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static String getPackageName() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static int getPriority(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return getMessagePriority(stringExtra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String getProjectNumber(Intent intent) {
        if (intent.hasExtra(Constants.MessagePayloadKeys.SENDER_ID)) {
            return intent.getStringExtra(Constants.MessagePayloadKeys.SENDER_ID);
        }
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (applicationId.startsWith("1:")) {
            String[] split = applicationId.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return applicationId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String getTopic(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.FROM);
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static int getTtl(Intent intent) {
        Object obj = intent.getExtras().get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                sb.append("Invalid TTL: ");
                sb.append(valueOf);
                Log.w(Constants.TAG, sb.toString());
                return 0;
            }
        }
        return 0;
    }

    @Nullable
    static String getUseDeviceTime(Intent intent) {
        if (intent.hasExtra(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME)) {
            return intent.getStringExtra(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME);
        }
        return null;
    }

    private static boolean isDirectBootMessage(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void logNotificationDismiss(Intent intent) {
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, intent);
    }

    public static void logNotificationForeground(Intent intent) {
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, intent);
    }

    public static void logNotificationOpen(Intent intent) {
        setUserPropertyIfRequired(intent);
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, intent);
    }

    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, intent);
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            TransportFactory transportFactory = FirebaseMessaging.getTransportFactory();
            if (transportFactory != null) {
                logToFirelog(Constants.FirelogAnalytics.EventType.MESSAGE_DELIVERED, intent, transportFactory.getTransport(Constants.FirelogAnalytics.FCM_LOG_SOURCE, String.class, Encoding.of("json"), MessagingAnalytics$$Lambda$0.$instance));
            } else {
                Log.e(Constants.TAG, "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            }
        }
    }

    private static void logToFirelog(@Constants.FirelogAnalytics.EventType String str, Intent intent, Transport<String> transport) {
        try {
            transport.send(Event.ofTelemetry(dataEncoder.encode(new FirelogAnalyticsEvent.FirelogAnalyticsEventWrapper(new FirelogAnalyticsEvent(Constants.FirelogAnalytics.EventType.MESSAGE_DELIVERED, intent)))));
        } catch (EncodingException unused) {
            Log.d(Constants.TAG, "Failed to encode big query analytics payload. Skip sending");
        }
    }

    @VisibleForTesting
    static void logToScion(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String composerId = getComposerId(intent);
        if (composerId != null) {
            bundle.putString("_nmid", composerId);
        }
        String composerLabel = getComposerLabel(intent);
        if (composerLabel != null) {
            bundle.putString(Constants.ScionAnalytics.PARAM_MESSAGE_NAME, composerLabel);
        }
        String messageLabel = getMessageLabel(intent);
        if (!TextUtils.isEmpty(messageLabel)) {
            bundle.putString(Constants.ScionAnalytics.PARAM_LABEL, messageLabel);
        }
        String messageChannel = getMessageChannel(intent);
        if (!TextUtils.isEmpty(messageChannel)) {
            bundle.putString(Constants.ScionAnalytics.PARAM_MESSAGE_CHANNEL, messageChannel);
        }
        String topic = getTopic(intent);
        if (topic != null) {
            bundle.putString(Constants.ScionAnalytics.PARAM_TOPIC, topic);
        }
        String messageTime = getMessageTime(intent);
        if (messageTime != null) {
            try {
                bundle.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_TIME, Integer.parseInt(messageTime));
            } catch (NumberFormatException e) {
                Log.w(Constants.TAG, "Error while parsing timestamp in GCM event", e);
            }
        }
        String useDeviceTime = getUseDeviceTime(intent);
        if (useDeviceTime != null) {
            try {
                bundle.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, Integer.parseInt(useDeviceTime));
            } catch (NumberFormatException e2) {
                Log.w(Constants.TAG, "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String messageTypeForScion = getMessageTypeForScion(intent);
        if (Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE.equals(str) || Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND.equals(str)) {
            bundle.putString(Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, messageTypeForScion);
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(str.length() + 37 + String.valueOf(valueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            Log.d(Constants.TAG, sb.toString());
        }
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
        if (analyticsConnector != null) {
            analyticsConnector.logEvent(Constants.ScionAnalytics.ORIGIN_FCM, str, bundle);
        } else {
            Log.w(Constants.TAG, "Unable to log event: analytics library is missing");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setDeliveryMetricsExportToBigQuery(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    private static void setUserPropertyIfRequired(Intent intent) {
        if (intent == null) {
            return;
        }
        if ("1".equals(intent.getStringExtra(Constants.AnalyticsKeys.TRACK_CONVERSIONS))) {
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (analyticsConnector != null) {
                String stringExtra = intent.getStringExtra(Constants.AnalyticsKeys.COMPOSER_ID);
                analyticsConnector.setUserProperty(Constants.ScionAnalytics.ORIGIN_FCM, Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, stringExtra);
                Bundle bundle = new Bundle();
                bundle.putString(Constants.ScionAnalytics.PARAM_SOURCE, "Firebase");
                bundle.putString(Constants.ScionAnalytics.PARAM_MEDIUM, "notification");
                bundle.putString(Constants.ScionAnalytics.PARAM_CAMPAIGN, stringExtra);
                analyticsConnector.logEvent(Constants.ScionAnalytics.ORIGIN_FCM, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                return;
            }
            Log.w(Constants.TAG, "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Received event with track-conversion=false. Do not set user property");
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return deliveryMetricsExportToBigQueryEnabled();
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra(Constants.AnalyticsKeys.ENABLED));
    }
}
