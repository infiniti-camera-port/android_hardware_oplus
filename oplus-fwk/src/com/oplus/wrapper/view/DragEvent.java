package com.oplus.wrapper.view;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.view.DragEvent}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class DragEvent {
    private final android.view.DragEvent mDragEvent;

    public DragEvent(android.view.DragEvent dragEvent) {
        this.mDragEvent = dragEvent;
    }

    public android.view.SurfaceControl getDragSurface() {
        return null;
    }
}
