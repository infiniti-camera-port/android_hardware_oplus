package android.bluetooth;

/**
 * Boot-classpath stub of the OEM class {@code android.bluetooth.OplusBluetoothAdapter}.
 *
 * OEM extension of the AOSP android.bluetooth framework. Hard-loaded by OppoGallery2 and OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class OplusBluetoothAdapter {

    private static OplusBluetoothAdapter sAdapter;
    
    public static OplusBluetoothAdapter getOplusBluetoothAdapter() {
        if (sAdapter == null) {
            sAdapter = new OplusBluetoothAdapter();
        }
        return sAdapter;
    }

    public int getBluetoothConnectionCount() {
        return 0;
    }
}
