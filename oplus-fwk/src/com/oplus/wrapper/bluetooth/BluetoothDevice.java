package com.oplus.wrapper.bluetooth;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.bluetooth.BluetoothDevice}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class BluetoothDevice {
    private final android.bluetooth.BluetoothDevice mBluetoothDevice;

    public BluetoothDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.mBluetoothDevice = bluetoothDevice;
    }

    public boolean isConnected() {
        return false;
    }
}
