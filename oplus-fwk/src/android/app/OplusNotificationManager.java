package android.app;

/**
 * Boot-classpath stub of the OEM class {@code android.app.OplusNotificationManager}.
 *
 * OEM extension of the AOSP android.app framework. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusNotificationManager {
    private static final String TAG = "OplusNotificationManager";

    public OplusNotificationManager() {
    }

    public String[] getEnableNavigationApps(int userId) {
        return new String[0];
    }

    public String getStdid(String pkg, int userId, String type) {
        return null;
    }

    public boolean isDriveNavigationMode(String pkg, int userId) {
        return false;
    }

    public boolean isSuppressedByDriveMode(int userId) {
        return false;
    }

    public void setSuppressedByDriveMode(boolean suppressed, int userId) {
    }
}
