package com.oplus.multiuser;

import android.os.UserHandle;

/**
 * Boot-classpath stub of the OEM {@code com.oplus.multiuser.OplusMultiUserManager}.
 *
 * OEM helper that classifies user IDs/handles for OnePlus multi-system-user (the second "system
 * user" space). Hard-loaded by the AI Unit apks and other OEM apps; absent it is a
 * NoClassDefFoundError. isMultiSystemUserId/isMultiSystemUserHandle return false — this port has
 * no multi-system-user space, so callers take the ordinary single-user path. (The AIUnit closure
 * originally introduced a second isMultiSystemUserId stub; it was merged here to avoid a duplicate.)
 */
public class OplusMultiUserManager {

    private static OplusMultiUserManager instance;

    private OplusMultiUserManager() {}

    public static OplusMultiUserManager getInstance() {
        if (instance == null) {
            instance = new OplusMultiUserManager();
        }
        return instance;
    }

    public boolean isMultiSystemUserHandle(UserHandle userHandle) {
        return false;
    }

    public boolean isMultiSystemUserId(int userId) {
        return false;
    }
}
