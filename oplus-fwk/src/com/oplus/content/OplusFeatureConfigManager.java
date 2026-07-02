package com.oplus.content;

import android.os.SystemProperties;
import android.text.TextUtils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Boot-classpath stub of the OEM feature oracle {@code com.oplus.content.OplusFeatureConfigManager}.
 *
 * The OEM class answers device/app feature queries out of oplus-framework.jar. Hard-loaded early by
 * OplusAppPlatform (its ConfigManager$WorkHandler) as well as OppoGallery2/OplusCamera; a missing
 * class OR a missing method is an uncaught java.lang.Error -> system_server bootloop (this exact
 * gap, NoSuchMethodError isPermit, caused the v3.1/v3.2 bootloop once getCfgLevelList re-enabled the
 * config worker). Resolution: isPermit() returns true (OOS-faithful — the caller processes the
 * feature when permitted); hasFeature() returns false except the vibrator key kept for haptics.
 * Media/livephoto/DV keys ride the AppFeatureProvider XML scan, not this class.
 */
public class OplusFeatureConfigManager {

    public static OplusFeatureConfigManager sOplusFeatureConfigManager = null;

    public final List<OnFeatureActionObserver> observers = new CopyOnWriteArrayList<>();

    public static OplusFeatureConfigManager getInstance() {
        if (sOplusFeatureConfigManager == null) {
            sOplusFeatureConfigManager = new OplusFeatureConfigManager();
        }
        return sOplusFeatureConfigManager;
    }

    public boolean hasFeature(String name) {
        if ("oplus.software.vibrator_lmvibrator".equals(name)) {
            // OnePlus 7/8 series use old OnePlus base camera. Don't let this feature break haptic feedback.
            if (useOnePlusBaseCamera()) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean useOnePlusBaseCamera() {
        return !TextUtils.isEmpty(SystemProperties.get("ro.oplus.version.base"));
    }

    public boolean registerFeatureActionObserver(OnFeatureActionObserver observer) {
        if (observer != null) {
            observers.add(observer);
            return true;
        }
        return false;
    }

    public boolean unregisterFeatureActionObserver(OnFeatureActionObserver observer) {
        return observers.remove(observer);
    }

    public interface OnFeatureObserver {
        default void onFeatureUpdate(List<String> features) {}
    }

    public interface OnFeatureActionObserver {
        default void onFeaturesActionUpdate(String action, String actionValue, int featureID) {}
    }

    public interface OnFeatureMapObserver {
        default void onFeatureUpdate(List<String> list, int featureID) {}
    }

    public boolean isPermit(String feature) {
        return true;
    }
}
