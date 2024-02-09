package com.google.firebase.messaging;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@Keep
@KeepForSdk
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* loaded from: classes.dex */
    private static class DevNullTransport<T> implements Transport<T> {
        private DevNullTransport() {
        }

        @Override // com.google.android.datatransport.Transport
        public void schedule(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
            transportScheduleCallback.onSchedule(null);
        }

        @Override // com.google.android.datatransport.Transport
        public void send(Event<T> event) {
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    @VisibleForTesting
    /* loaded from: classes.dex */
    public static class DevNullTransportFactory implements TransportFactory {
        @Override // com.google.android.datatransport.TransportFactory
        public <T> Transport<T> getTransport(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
            return new DevNullTransport();
        }

        @Override // com.google.android.datatransport.TransportFactory
        public <T> Transport<T> getTransport(String str, Class<T> cls, Transformer<T, byte[]> transformer) {
            return new DevNullTransport();
        }
    }

    @VisibleForTesting
    static TransportFactory determineFactory(TransportFactory transportFactory) {
        if (transportFactory == null) {
            return new DevNullTransportFactory();
        }
        try {
            transportFactory.getTransport("test", String.class, Encoding.of("json"), FirebaseMessagingRegistrar$$Lambda$1.$instance);
            return transportFactory;
        } catch (IllegalArgumentException unused) {
            return new DevNullTransportFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstanceIdInternal) componentContainer.get(FirebaseInstanceIdInternal.class), componentContainer.getProvider(UserAgentPublisher.class), componentContainer.getProvider(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), determineFactory((TransportFactory) componentContainer.get(TransportFactory.class)), (Subscriber) componentContainer.get(Subscriber.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseMessaging.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.optional(FirebaseInstanceIdInternal.class)).add(Dependency.optionalProvider(UserAgentPublisher.class)).add(Dependency.optionalProvider(HeartBeatInfo.class)).add(Dependency.optional(TransportFactory.class)).add(Dependency.required(FirebaseInstallationsApi.class)).add(Dependency.required(Subscriber.class)).factory(FirebaseMessagingRegistrar$$Lambda$0.$instance).alwaysEager().build(), LibraryVersionComponent.create("fire-fcm", BuildConfig.VERSION_NAME));
    }
}
