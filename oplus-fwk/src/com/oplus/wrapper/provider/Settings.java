package com.oplus.wrapper.provider;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.provider.Settings}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by the shipped OppoGallery2 / OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class Settings {
    public static class Secure {
        public static int getIntForUser(android.content.ContentResolver cr, String name, int userHandle) {
            return 0;
        }
    }
}
