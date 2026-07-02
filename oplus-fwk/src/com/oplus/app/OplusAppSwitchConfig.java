package com.oplus.app;

import java.util.List;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.app.OplusAppSwitchConfig}.
 *
 * OEM app-management framework surface. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusAppSwitchConfig {

    public void addAppConfig(int type, List<String> list) {}

    public java.util.HashSet<String> mActivitySet = new java.util.HashSet<>();
    public int observerFingerPrint;

    public List<String> getConfigs(int type) {
        return new java.util.ArrayList<>();
    }

    public void removeAppConfig(int type) {
    }

    @Override
    public String toString() {
        return "OplusAppSwitchConfig{observerFingerPrint=" + observerFingerPrint
                + ", mActivitySet=" + mActivitySet + "}";
    }
}
