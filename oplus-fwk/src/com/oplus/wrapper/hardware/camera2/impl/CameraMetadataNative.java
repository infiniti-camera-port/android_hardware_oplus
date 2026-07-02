package com.oplus.wrapper.hardware.camera2.impl;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.hardware.camera2.impl.CameraMetadataNative}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by the shipped OppoGallery2 / OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class CameraMetadataNative {
    private final android.hardware.camera2.impl.CameraMetadataNative mCameraMetadataNative;

    public CameraMetadataNative(android.hardware.camera2.impl.CameraMetadataNative cameraMetadataNative) {
        this.mCameraMetadataNative = cameraMetadataNative;
    }

    public long getMetadataPtr() {
        return this.mCameraMetadataNative.getMetadataPtr();
    }

    public static int getTag(String key, long vendorId) {
        return android.hardware.camera2.impl.CameraMetadataNative.getTag(key, vendorId);
    }
}
