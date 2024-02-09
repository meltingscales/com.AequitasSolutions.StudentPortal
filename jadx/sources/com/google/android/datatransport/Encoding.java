package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Encoding {
    private final String name;

    public static Encoding of(@NonNull String str) {
        return new Encoding(str);
    }

    public String getName() {
        return this.name;
    }

    private Encoding(@NonNull String str) {
        Objects.requireNonNull(str, "name is null");
        this.name = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.name.equals(((Encoding) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.name + "\"}";
    }
}
