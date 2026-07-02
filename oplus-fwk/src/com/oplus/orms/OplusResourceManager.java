package com.oplus.orms;

import com.oplus.orms.info.OrmsSaParam;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.orms.OplusResourceManager}.
 *
 * OEM com.oplus.orms framework surface. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusResourceManager {

    private static OplusResourceManager sOplusResourceManager = null;

    public static OplusResourceManager getInstance(Class clazz) {
        if (sOplusResourceManager == null) {
            sOplusResourceManager = new OplusResourceManager();
        }
        return sOplusResourceManager;
    }

    public long ormsSetSceneAction(OrmsSaParam ormsSaParam) {
        return -1L;
    }

    public void ormsClrSceneAction(long handle) {
    }
}
