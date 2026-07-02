package com.oplus.osense.eventinfo;

import java.util.HashSet;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.osense.eventinfo.EventConfig}.
 *
 * OEM Osense resource-scheduling client surface. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class EventConfig {

    public EventConfig(HashSet<Integer> events) {}

    public void setOsenseConfigSet(HashSet<String> hashSet) {}

    public EventConfig() {
    }

    public java.util.Set<Integer> getEventSet() {
        return new HashSet<>();
    }
}
