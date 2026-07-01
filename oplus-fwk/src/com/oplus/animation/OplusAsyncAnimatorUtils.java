/*
 * SPDX-FileCopyrightText: 2025 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.animation;

import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.view.View;

/**
 * Stub for the OEM RenderThread-side async view mutator utility. Every method
 * reports failure (false) so consumers fall back to the ordinary View setters.
 */
public class OplusAsyncAnimatorUtils {

    private OplusAsyncAnimatorUtils() {
    }

    public static boolean offsetLeftAndRight(View view, int offset) {
        return false;
    }

    public static boolean offsetTopAndBottom(View view, int offset) {
        return false;
    }

    public static boolean setAlpha(RenderNode renderNode, float alpha) {
        return false;
    }

    public static boolean setAlpha(View view, float alpha) {
        return false;
    }

    public static boolean setBackgroundRenderEffect(View view, RenderEffect renderEffect) {
        return false;
    }

    public static boolean setClipRect(View view, Rect rect) {
        return false;
    }

    public static boolean setClipToBounds(View view, boolean clipToBounds) {
        return false;
    }

    public static boolean setElevation(View view, float elevation) {
        return false;
    }

    public static boolean setLeftTopRightBottom(View view, int left, int top, int right, int bottom) {
        return false;
    }

    public static boolean setOutlineNone(View view) {
        return false;
    }

    public static boolean setOutlineRoundRect(View view, Rect rect, float radius, float alpha) {
        return false;
    }

    public static boolean setOutlineSmoothRoundRect(View view, Rect rect, float radius, float weight, float alpha) {
        return false;
    }

    public static boolean setOutlineSpotShadowColor(View view, int color) {
        return false;
    }

    public static boolean setRenderEffect(View view, RenderEffect renderEffect) {
        return false;
    }

    public static boolean setRotation(View view, float rotation) {
        return false;
    }

    public static boolean setRotationX(View view, float rotationX) {
        return false;
    }

    public static boolean setRotationY(View view, float rotationY) {
        return false;
    }

    public static boolean setScaleX(View view, float scaleX) {
        return false;
    }

    public static boolean setScaleY(View view, float scaleY) {
        return false;
    }

    public static boolean setTranslationX(View view, float translationX) {
        return false;
    }

    public static boolean setTranslationY(View view, float translationY) {
        return false;
    }

    public static boolean setTranslationZ(View view, float translationZ) {
        return false;
    }
}
