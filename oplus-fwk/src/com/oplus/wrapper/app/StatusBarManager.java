package com.oplus.wrapper.app;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.app.StatusBarManager}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class StatusBarManager {
    private final android.app.StatusBarManager mStatusBarManager;

    public StatusBarManager(android.app.StatusBarManager statusBarManager) {
        this.mStatusBarManager = statusBarManager;
    }

    public void collapsePanels() {
    }

    public void expandNotificationsPanel() {
    }
}
