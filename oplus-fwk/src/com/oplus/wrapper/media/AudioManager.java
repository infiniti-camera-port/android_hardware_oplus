package com.oplus.wrapper.media;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.media.AudioManager}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class AudioManager {
    public static final int STREAM_SYSTEM_ENFORCED = 7;
}
