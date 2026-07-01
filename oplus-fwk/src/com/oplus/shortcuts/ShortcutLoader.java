package com.oplus.shortcuts;

import android.content.Context;
import android.content.IntentFilter;
import android.os.UserHandle;

import com.oplus.shortcuts.chooser.DisplayResolveInfo;
import com.oplus.wrapper.app.prediction.AppPredictor;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Closure stub. The real loader asynchronously reports Result objects through
 * the callback; this no-op stub never reports, so its nested data holders are
 * never populated by us. Fields carry safe empty defaults for any read.
 */
public class ShortcutLoader {

    public ShortcutLoader(Context context, AppPredictor appPredictor, UserHandle userHandle,
            IntentFilter targetIntentFilter, Consumer callback) {
    }

    public void queryShortcuts(DisplayResolveInfo[] appTargets) {
        // no-op: never reports back through the callback
    }

    public static class Result {
        public boolean isFromAppPredictor = false;
        public DisplayResolveInfo[] appTargets = new DisplayResolveInfo[0];
        public ShortcutResultInfo[] shortcutsByApp = new ShortcutResultInfo[0];
        public Map directShareAppTargetCache = Collections.emptyMap();
        public Map directShareShortcutInfoCache = Collections.emptyMap();

        @Override
        public int hashCode() {
            return 0;
        }
    }

    public static class ShortcutResultInfo {
        public DisplayResolveInfo appTarget;
        public List shortcuts = Collections.emptyList();
    }
}
