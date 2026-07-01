package com.oplus.flexiblewindow;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.res.Configuration;
import android.os.Bundle;

/**
 * Minimal stub for the OEM com.oplus.flexiblewindow.FlexibleWindowManager.
 *
 * The shipped OppoGallery2 / OplusCamera apks hard-reference this class
 * (invoke-static getInstance + invoke-virtual on the returned instance). A
 * missing class => NoClassDefFoundError (a java.lang.Error, NOT caught by the
 * apps' catch(Exception)) => hard crash. This stub closes that linkage.
 *
 * Class kind (public class extends Object) and method modifiers (which are
 * static vs instance) are taken verbatim from the OOS16 oplus-framework.jar.
 *
 * FlexibleWindow is OnePlus' floating / embedded-window feature. On this port
 * the device is never in a flexible window, so every query returns the OEM's
 * own "not-flexible / default" answer and the mutators are no-ops.
 */
public class FlexibleWindowManager {

    // Verbatim from the OEM: the state code meaning "default / not in a flexible window".
    // (0 is KEY_STATE_TO_ALL_ORIGIN, an actual flexible sub-state, so -1 is the safe default.)
    public static final int KEY_STATE_DEFAULT = -1;

    private static volatile FlexibleWindowManager sInstance;

    public static FlexibleWindowManager getInstance() {
        if (sInstance == null) {
            synchronized (FlexibleWindowManager.class) {
                if (sInstance == null) {
                    sInstance = new FlexibleWindowManager();
                }
            }
        }
        return sInstance;
    }

    public static boolean isFlexibleActivity(Configuration configuration) {
        return false;
    }

    public static boolean isFlexibleActivitySuitable(Configuration configuration) {
        return false;
    }

    public int getFlexibleWindowState(Activity activity) {
        // OEM returns KEY_STATE_DEFAULT for the null / non-flexible case.
        return KEY_STATE_DEFAULT;
    }

    public void removeEmbeddedContainerTask(int taskId, int rootTaskId) {
        // no-op: no embedded container tasks exist on this port.
    }

    public Bundle setExtraBundle(ActivityOptions options, Bundle bundle) {
        // No flexible-window extras to inject; hand the caller's bundle back unchanged.
        return bundle;
    }
}
