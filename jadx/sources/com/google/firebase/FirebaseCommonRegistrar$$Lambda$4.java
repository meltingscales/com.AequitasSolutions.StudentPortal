package com.google.firebase;

import android.content.Context;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* loaded from: classes.dex */
final /* synthetic */ class FirebaseCommonRegistrar$$Lambda$4 implements LibraryVersionComponent.VersionExtractor {
    private static final FirebaseCommonRegistrar$$Lambda$4 instance = new FirebaseCommonRegistrar$$Lambda$4();

    private FirebaseCommonRegistrar$$Lambda$4() {
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$1((Context) obj);
    }
}
