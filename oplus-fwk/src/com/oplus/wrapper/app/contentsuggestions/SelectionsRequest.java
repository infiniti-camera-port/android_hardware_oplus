package com.oplus.wrapper.app.contentsuggestions;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.app.contentsuggestions.SelectionsRequest}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public final class SelectionsRequest {
    SelectionsRequest() {
    }

    public static final class Builder {
        public Builder(int taskId) {
        }

        public Builder setExtras(android.os.Bundle extras) {
            return this;
        }

        public SelectionsRequest build() {
            return new SelectionsRequest();
        }
    }
}
