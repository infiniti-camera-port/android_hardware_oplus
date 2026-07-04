package com.oplus.app;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.os.UserHandle;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Client for the Oplus access-control (App-Lock / hide) surface.
 *
 * This was previously a disconnected local stub that always returned fail-safe defaults, so the
 * OEM Gallery's App-Lock / hidden-album state never reflected reality. crDroid ships a real
 * system_server backend (OplusAccessControlManagerService, registered as "oplus_accesscontrol",
 * persisting to Settings.Secure). Route to it here; fall back to the previous local defaults when
 * the service is absent so nothing can lock the user out on a partial build.
 */
public class OPlusAccessControlManager {
    private static final String TAG = "OPlusAccessControlManager";
    private static final String SERVICE_NAME = "oplus_accesscontrol";

    // Access-control types the OEM Gallery uses (com.heytap.addon.app shim).
    public static final String TYPE_ENCRYPT = "type_encrypt";
    public static final String TYPE_HIDE = "type_hide";

    private static volatile OPlusAccessControlManager sInstance = null;
    public static final int USER_CURRENT = UserHandle.myUserId();

    private OPlusAccessControlManager() {
    }

    public static OPlusAccessControlManager getInstance() {
        if (sInstance == null) {
            synchronized (OPlusAccessControlManager.class) {
                if (sInstance == null) {
                    sInstance = new OPlusAccessControlManager();
                }
            }
        }
        return sInstance;
    }

    private static IOplusAccessControlManager getService() {
        IBinder binder = ServiceManager.getService(SERVICE_NAME);
        if (binder == null) {
            return null;
        }
        return IOplusAccessControlManager.Stub.asInterface(binder);
    }

    public boolean isEncryptPass(String packageName, int userId) {
        IOplusAccessControlManager svc = getService();
        if (svc == null) {
            return true; // fail-safe: treat the auth gate as passed when the service is absent
        }
        try {
            return svc.isEncryptPass(packageName, userId);
        } catch (RemoteException e) {
            Log.w(TAG, "isEncryptPass failed", e);
            return true;
        }
    }

    public boolean isEncryptedPackage(String packageName, int userId) {
        IOplusAccessControlManager svc = getService();
        if (svc == null) {
            return false;
        }
        try {
            return svc.isEncryptedPackage(packageName, userId);
        } catch (RemoteException e) {
            Log.w(TAG, "isEncryptedPackage failed", e);
            return false;
        }
    }

    public Map getAccessControlAppsInfo(String type, int userId) {
        IOplusAccessControlManager svc = getService();
        if (svc == null) {
            return new HashMap();
        }
        try {
            Map info = svc.getAccessControlAppsInfo(type, userId);
            return info != null ? info : new HashMap();
        } catch (RemoteException e) {
            Log.w(TAG, "getAccessControlAppsInfo failed", e);
            return new HashMap();
        }
    }

    public boolean getAccessControlEnabled(String type, int userId) {
        IOplusAccessControlManager svc = getService();
        if (svc == null) {
            return false;
        }
        try {
            return svc.getAccessControlEnabled(type, userId);
        } catch (RemoteException e) {
            Log.w(TAG, "getAccessControlEnabled failed", e);
            return false;
        }
    }

    // Not in the service AIDL: an app is access-controlled if it is in the hide or encrypt set.
    public boolean getApplicationAccessControlEnabledAsUser(String packageName, int userId) {
        Map hide = getAccessControlAppsInfo(TYPE_HIDE, userId);
        if (hide != null && hide.containsKey(packageName)) {
            return true;
        }
        Map encrypt = getAccessControlAppsInfo(TYPE_ENCRYPT, userId);
        return encrypt != null && encrypt.containsKey(packageName);
    }

    // Not in the service AIDL: privacy (hidden) apps map onto the TYPE_HIDE access-control set.
    public Map getPrivacyAppInfo(int userId) {
        return getAccessControlAppsInfo(TYPE_HIDE, userId);
    }

    public boolean registerAccessControlObserver(String type, IOplusAccessControlObserver observer) {
        IOplusAccessControlManager svc = getService();
        if (svc == null) {
            return false;
        }
        try {
            return svc.registerAccessControlObserver(type, observer);
        } catch (RemoteException e) {
            Log.w(TAG, "registerAccessControlObserver failed", e);
            return false;
        }
    }

    public boolean unregisterAccessControlObserver(String type, IOplusAccessControlObserver observer) {
        IOplusAccessControlManager svc = getService();
        if (svc == null) {
            return false;
        }
        try {
            return svc.unregisterAccessControlObserver(type, observer);
        } catch (RemoteException e) {
            Log.w(TAG, "unregisterAccessControlObserver failed", e);
            return false;
        }
    }
}
