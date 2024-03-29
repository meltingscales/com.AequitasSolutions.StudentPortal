package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes.dex */
interface IMessengerCompat extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    void send(@NonNull Message message) throws RemoteException;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    /* loaded from: classes.dex */
    public static class Impl extends Binder implements IMessengerCompat {
        @Override // android.os.IInterface
        @NonNull
        public IBinder asBinder() {
            return this;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(@NonNull Message message) throws RemoteException {
            message.arg2 = Binder.getCallingUid();
            Handler handler = null;
            handler.dispatchMessage(message);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, @NonNull Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
            parcel.enforceInterface(getInterfaceDescriptor());
            if (i == 1) {
                send(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    /* loaded from: classes.dex */
    public static class Proxy implements IMessengerCompat {
        private final IBinder zza;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Proxy(@NonNull IBinder iBinder) {
            this.zza = iBinder;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(@NonNull Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(IMessengerCompat.DESCRIPTOR);
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.zza.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        @NonNull
        public IBinder asBinder() {
            return this.zza;
        }
    }
}
