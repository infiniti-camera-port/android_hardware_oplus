package com.oplus.wrapper.app.contentsuggestions;

import java.util.concurrent.Executor;

/**
 * Boot-classpath stub of the OEM interface {@code com.oplus.wrapper.app.contentsuggestions.ContentSuggestionsManager}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OppoGallery2 (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoSuchMethodError/NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class ContentSuggestionsManager {
    public static final String EXTRA_BITMAP = "android.appprediction.extra.BITMAP";

    public ContentSuggestionsManager(android.content.Context context) {
    }

    public void classifyContentSelections(ClassificationsRequest request, Executor callbackExecutor, ClassificationsCallback callback) {
    }

    public void suggestContentSelections(SelectionsRequest request, Executor callbackExecutor, SelectionsCallback callback) {
    }

    public void notifyInteraction(String requestId, android.os.Bundle interaction) {
    }

    public void provideContextImage(int taskId, android.os.Bundle imageContextRequestExtras) {
    }

    public interface ClassificationsCallback {
        void onContentClassificationsAvailable(int statusCode, java.util.List classifications);
    }

    public interface SelectionsCallback {
        void onContentSelectionsAvailable(int statusCode, java.util.List selections);
    }
}
