package com.oplus.wrapper.content.pm;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.content.pm.PackageManager}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class PackageManager {
    private final android.content.pm.PackageManager mPackageManager;

    public PackageManager(android.content.pm.PackageManager packageManager) {
        this.mPackageManager = packageManager;
    }

    public String getAppPredictionServicePackageName() {
        return null;
    }
}
