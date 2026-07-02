package com.oplus.zoomwindow;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.zoomwindow.OplusZoomWindowManager}.
 *
 * OEM multi-window (zoom / flexible / mirage) feature surface. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusZoomWindowManager {

    public static OplusZoomWindowManager sOplusZoomWindowManager = null;

    public static OplusZoomWindowManager getInstance() {
        if (sOplusZoomWindowManager == null) {
            sOplusZoomWindowManager = new OplusZoomWindowManager();
        }
        return sOplusZoomWindowManager;
    }

    public boolean registerZoomWindowObserver(IOplusZoomWindowObserver observer) {
        return false;
    }

    public boolean unregisterZoomWindowObserver(IOplusZoomWindowObserver observer) {
        return false;
    }

    public OplusZoomWindowInfo getCurrentZoomWindowState() {
        return new OplusZoomWindowInfo();
    }

    public boolean isSupportZoomMode(String pkg, int userId, String caller, android.os.Bundle extras) {
        return false;
    }

    public boolean isSupportZoomWindowMode() {
        return false;
    }

    public int startZoomWindow(android.content.Intent intent, android.os.Bundle options, int userId, String caller) {
        return 0;
    }
}
