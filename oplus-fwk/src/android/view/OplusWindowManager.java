package android.view;

/**
 * Boot-classpath stub of the OEM class {@code android.view.OplusWindowManager}.
 *
 * OEM graphics / view rendering extension. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusWindowManager {

    public OplusWindowManager() {}

    public void requestKeyguard(String command) {}
    public boolean setPreferredDisplayMode(int mode) { return false; }

    public void getFocusedWindowFrame(android.graphics.Rect outRect) {
    }

    public int getLongshotSurfaceLayerByType(int type) {
        return -1;
    }

    public com.oplus.app.OplusScreenShotResult getScreenshot(com.oplus.app.OplusScreenShotOptions options) {
        return null;
    }

    public java.util.List<android.graphics.Rect> getSplitAreaRegion() {
        return new java.util.ArrayList<>();
    }

    public boolean isInputShow() {
        return false;
    }

    public void registerOplusWindowStateObserver(android.view.IOplusWindowStateObserver observer) {
    }

    public void unregisterOplusWindowStateObserver(android.view.IOplusWindowStateObserver observer) {
    }
}
