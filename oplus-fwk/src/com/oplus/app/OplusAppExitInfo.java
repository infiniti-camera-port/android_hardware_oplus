package com.oplus.app;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.app.OplusAppExitInfo}.
 *
 * OEM app-management framework surface. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusAppExitInfo {

    public OplusAppExitInfo() {}

    public android.os.Bundle extension;
    public boolean hasResumingActivity;
    public boolean isResumingFirstStart;
    public boolean isResumingMultiApp;
    public String resumingActivityName;
    public String resumingPackageName;
    public int resumingWindowMode;
    public String targetName;

    @Override
    public String toString() {
        return "OplusAppExitInfo{targetName=" + targetName
                + ", resumingPackageName=" + resumingPackageName
                + ", resumingActivityName=" + resumingActivityName
                + ", resumingWindowMode=" + resumingWindowMode
                + ", hasResumingActivity=" + hasResumingActivity
                + ", isResumingFirstStart=" + isResumingFirstStart
                + ", isResumingMultiApp=" + isResumingMultiApp + "}";
    }
}
