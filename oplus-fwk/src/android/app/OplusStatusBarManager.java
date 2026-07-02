package android.app;

/**
 * Boot-classpath stub of the OEM class {@code android.app.OplusStatusBarManager}.
 *
 * OEM extension of the AOSP android.app framework. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusStatusBarManager {
    private static final String TAG = "OplusStatusBarManager";

    public OplusStatusBarManager() {
    }

    public boolean getTopIsFullscreen() {
        return false;
    }

    public void topIsFullscreen(boolean topActivityIsFullscreen) {
    }
}
