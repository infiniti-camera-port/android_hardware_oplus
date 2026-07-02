package com.oplus.app;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.app.OplusAppEnterInfo}.
 *
 * OEM app-management framework surface. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusAppEnterInfo {

    public OplusAppEnterInfo() {}

    public android.os.Bundle extension;
    public boolean firstStart;
    public android.content.Intent intent;
    public String launchedFromPackage;
    public boolean multiApp;
    public String targetName;
    public int windowMode;

    @Override
    public String toString() {
        return "OplusAppEnterInfo{targetName=" + targetName
                + ", launchedFromPackage=" + launchedFromPackage
                + ", windowMode=" + windowMode
                + ", firstStart=" + firstStart
                + ", multiApp=" + multiApp + "}";
    }
}
