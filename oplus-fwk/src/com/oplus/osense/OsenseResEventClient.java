package com.oplus.osense;

import android.content.Context;
import android.os.Bundle;
import com.oplus.osense.eventinfo.EventConfig;
import com.oplus.osense.eventinfo.OsenseEventCallback;
import com.oplus.osense.task.BgRunningCallback;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.osense.OsenseResEventClient}.
 *
 * OEM Osense resource-scheduling client surface. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OsenseResEventClient {

    private static OsenseResEventClient sInstance;

    public static OsenseResEventClient getInstance() {
        if (sInstance == null) {
            sInstance = new OsenseResEventClient();
        }
        return sInstance;
    }

    public int registerEventCallback(OsenseEventCallback callback, EventConfig eventConfig) {
        return 0;
    }

    public int unregisterEventCallback(OsenseEventCallback callback, EventConfig eventConfig) {
        return 0;
    }

    public int unregisterEventCallback(OsenseEventCallback callback) {
        return 0;
    }

    public void requestSceneAction(Bundle bundle) {
    }

    public void startBackgroundRunning(Context context, int type, BgRunningCallback callback) {
    }

    public boolean stopBackgroundRunning(Context context, int type) {
        return false;
    }

    public int requestInstantCpuLoad() {
        return 0;
    }
    public void startBackgroundRunning(Context context, int bgMode, OsenseEventCallback callback) {
        return;
    }
}
