package com.oplus.app;

import android.hardware.HardwareBuffer;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.app.OplusScreenShotResult}.
 *
 * OEM app-management framework surface. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusScreenShotResult implements Parcelable {
    public static final Parcelable.Creator<OplusScreenShotResult> CREATOR = new Parcelable.Creator<OplusScreenShotResult>() { // from class: com.oplus.app.OplusScreenShotResult.1
        @Override // android.os.Parcelable.Creator
        public OplusScreenShotResult createFromParcel(Parcel source) {
            return new OplusScreenShotResult(source);
        }

        @Override // android.os.Parcelable.Creator
        public OplusScreenShotResult[] newArray(int size) {
            return new OplusScreenShotResult[size];
        }
    };
    public int mColorSpaceNamed;
    public boolean mContainsSecureLayers;
    public HardwareBuffer mHardwareBuffer;

    public OplusScreenShotResult() {
    }

    private OplusScreenShotResult(Parcel source) {
        int bufferFlag = source.readInt();
        if (bufferFlag > 0) {
            this.mHardwareBuffer = source.readTypedObject(HardwareBuffer.CREATOR);
        }
        this.mContainsSecureLayers = source.readBoolean();
        this.mColorSpaceNamed = source.readInt();
    }

    public OplusScreenShotResult(OplusScreenShotResult other) {
        if (other != null) {
            this.mHardwareBuffer = other.mHardwareBuffer;
            this.mContainsSecureLayers = other.mContainsSecureLayers;
            this.mColorSpaceNamed = other.mColorSpaceNamed;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        if (this.mHardwareBuffer != null) {
            dest.writeInt(1);
            dest.writeTypedObject(this.mHardwareBuffer, 0);
        } else {
            dest.writeInt(0);
        }
        dest.writeBoolean(this.mContainsSecureLayers);
        dest.writeInt(this.mColorSpaceNamed);
    }
}
