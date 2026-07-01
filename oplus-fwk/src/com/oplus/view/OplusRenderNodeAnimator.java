package com.oplus.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* Closure stub. Only the static factory/helper methods referenced by
 * OppoGallery2 are provided. Factories return an inert (no-op) ValueAnimator
 * rather than null so consumers that immediately drive the returned Animator
 * do not NPE; getFrameNumber returns 0. */
public class OplusRenderNodeAnimator {

    private OplusRenderNodeAnimator() {
    }

    public static void animateToFinalPosition(Animator animator, float value) {
    }

    public static Animator createRenderValueAnimator(Animator animator, View view) {
        return ValueAnimator.ofFloat(0f, 1f);
    }

    public static Animator createRtAnimator(IRtAnimationTarget target, View view) {
        return ValueAnimator.ofFloat(0f, 1f);
    }

    public static long getFrameNumber(Animator animator) {
        return 0L;
    }
}
