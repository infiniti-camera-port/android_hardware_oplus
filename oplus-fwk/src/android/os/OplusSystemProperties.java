package android.os;

/**
 * Boot-classpath stub of the OEM class {@code android.os.OplusSystemProperties}.
 *
 * OEM extension of the AOSP android.os framework. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusSystemProperties {

    public static String get(String key) {
        return SystemProperties.get(key, "");
    }

    public static String get(String key, String def) {
        return SystemProperties.get(key, def);
    }

    public static int getInt(String key, int def) {
        return SystemProperties.getInt(key, def);
    }

    public static boolean getBoolean(String key, boolean def) {
        return SystemProperties.getBoolean(key, def);
    }

    public static long getLong(String key, long def) {
        return SystemProperties.getLong(key, def);
    }
}
