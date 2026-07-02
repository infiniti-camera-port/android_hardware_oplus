package android.widget;

/**
 * Boot-classpath stub of the OEM {@code android.widget.OplusSuperTextHelper} (OnePlus "SuperText"
 * selection helper). OplusCamera loads it REFLECTIVELY and UNGUARDED — Class.forName plus
 * getMethod("startInsertionActionMode", TextView) with no try/catch — so BOTH the class and this
 * exact method signature must resolve or the camera crashes. Provided as a no-op with the verbatim
 * signature; this port has no SuperText action mode to start.
 */
public class OplusSuperTextHelper {
    public static void startInsertionActionMode(android.widget.TextView textView) {
    }
}
