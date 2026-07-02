/*
 * Copyright (C) 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.multiuser;

/*
 * Stub — the OOS "multi system user" (system clone / second system space) oracle.
 * LineageOS has no OOS system-clone users, so no user id is ever a multi-system
 * user; returning false matches stock behavior on a device without a clone space.
 *
 * Descriptors mirrored from the OOS 16.0.8 consumers (AIUnit 16.1.25 smali):
 *   getInstance()Lcom/oplus/multiuser/OplusMultiUserManager;
 *   isMultiSystemUserId(I)Z
 */
public class OplusMultiUserManager {
    private static final OplusMultiUserManager INSTANCE = new OplusMultiUserManager();

    private OplusMultiUserManager() {
    }

    public static OplusMultiUserManager getInstance() {
        return INSTANCE;
    }

    public boolean isMultiSystemUserId(int userId) {
        return false;
    }
}
