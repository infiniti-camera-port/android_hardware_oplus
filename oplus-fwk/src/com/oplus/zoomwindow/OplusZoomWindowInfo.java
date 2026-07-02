package com.oplus.zoomwindow;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.zoomwindow.OplusZoomWindowInfo}.
 *
 * OEM multi-window (zoom / flexible / mirage) feature surface. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusZoomWindowInfo implements Parcelable {

    public static final Parcelable.Creator<OplusZoomWindowInfo> CREATOR =
            new Parcelable.Creator<OplusZoomWindowInfo>() {

        @Override
        public OplusZoomWindowInfo createFromParcel(Parcel source) {
            return new OplusZoomWindowInfo(source);
        }

        @Override
        public OplusZoomWindowInfo[] newArray(int size) {
            return new OplusZoomWindowInfo[size];
        }
    };

    public OplusZoomWindowInfo() {}

    public OplusZoomWindowInfo(Parcel in) {}

    public OplusZoomWindowInfo(OplusZoomWindowInfo in) {}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {}

    public void readFromParcel(Parcel in) {}

    public String cpnName;
    public android.os.Bundle extension;
    public int inputMethodType;
    public boolean inputShow;
    public int lastExitMethod;
    public String lockPkg;
    public int lockUserId;
    public int rotation;
    public boolean windowShown;
    public String zoomPkg;
    public android.graphics.Rect zoomRect;
    public int zoomUserId;
}
