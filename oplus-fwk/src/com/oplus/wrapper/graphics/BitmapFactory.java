package com.oplus.wrapper.graphics;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.graphics.BitmapFactory}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by the shipped OppoGallery2 / OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class BitmapFactory {
    public static class Options {
        private final android.graphics.BitmapFactory.Options mOptions;

        public Options(android.graphics.BitmapFactory.Options options) {
            this.mOptions = options;
        }

        public void setInPostProc(boolean inPostProc) {
        }
    }
}
