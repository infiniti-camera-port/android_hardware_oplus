package com.oplus.wrapper.view;

/**
 * Boot-classpath stub of the OEM interface {@code com.oplus.wrapper.view.ViewTreeObserver}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoSuchMethodError/NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class ViewTreeObserver {
    private final android.view.ViewTreeObserver mViewTreeObserver;

    public ViewTreeObserver(android.view.ViewTreeObserver viewTreeObserver) {
        this.mViewTreeObserver = viewTreeObserver;
    }

    public void addOnComputeInternalInsetsListener(OnComputeInternalInsetsListener listener) {
    }

    public void removeOnComputeInternalInsetsListener(OnComputeInternalInsetsListener listener) {
    }

    public static final class InternalInsetsInfo {
        public static final int TOUCHABLE_INSETS_REGION = 3;

        public InternalInsetsInfo() {
        }

        public android.graphics.Region getTouchableRegion() {
            return new android.graphics.Region();
        }

        public void setTouchableInsets(int val) {
        }
    }

    public interface OnComputeInternalInsetsListener {
        void onComputeInternalInsets(InternalInsetsInfo info);
    }
}
