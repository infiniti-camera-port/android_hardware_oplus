package com.oplus.wrapper.hardware.camera2;

import com.oplus.wrapper.hardware.camera2.impl.CameraMetadataNative;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.hardware.camera2.CameraCharacteristics}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by the shipped OppoGallery2 / OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class CameraCharacteristics {
    private final android.hardware.camera2.CameraCharacteristics mCameraCharacteristics;

    public CameraCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
    }

    public CameraMetadataNative getNativeMetadata() {
        android.hardware.camera2.impl.CameraMetadataNative metadataNative =
                this.mCameraCharacteristics.getNativeMetadata();
        if (metadataNative == null) {
            return null;
        }
        return new CameraMetadataNative(metadataNative);
    }
}
