package com.oplus.graphics;

import android.graphics.RenderEffect;

/*
 * Stub — OplusRenderEffect is an OEM (ColorOS/OOS) utility that builds a *gradient*
 * blur RenderEffect via a proprietary android.graphics.RenderEffect.createGradientBlurEffect(...)
 * extension that exists only in the OEM framework. That extension does NOT exist on
 * LineageOS, so we cannot construct the OEM gradient blur. Returning null is safe:
 * the shipped consumer (com.oplus.gallery2) hands the result to View.setRenderEffect(...),
 * and setRenderEffect(null) simply clears the effect (the gradient blur just does not
 * render). Restores the class so gallery no longer dies with NoClassDefFoundError —
 * same "accepted, silently not rendered" philosophy as OplusBlurParam.
 *
 * Surface referenced by com.oplus.gallery2 (RE'd from shipped dex):
 *   static createGradientBlurEffect(FFZFIII)Landroid/graphics/RenderEffect;
 * (sibling OOS overloads included for faithful closure; all degrade to null.)
 */
/**
 * Boot-classpath stub of the OEM class {@code com.oplus.graphics.OplusRenderEffect}.
 *
 * OEM graphics / view rendering extension. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusRenderEffect {
    private OplusRenderEffect() {
    }

    public static RenderEffect createGradientBlurEffect(float startRadius, float endRadius,
            boolean isVertical, float speed) {
        return null;
    }

    public static RenderEffect createGradientBlurEffect(float startRadius, float endRadius,
            boolean isVertical, float speed, int blendMode, int blendC, int mixC) {
        return null;
    }

    public static RenderEffect createGradientBlurEffect(float startRadius, float endRadius,
            boolean isVertical, float speed, int blendMode, int blendC, int mixC,
            RenderEffect inputEffect) {
        return null;
    }
}
