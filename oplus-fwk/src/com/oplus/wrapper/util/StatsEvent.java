package com.oplus.wrapper.util;

/**
 * Boot-classpath stub of the OEM class {@code com.oplus.wrapper.util.StatsEvent}.
 *
 * OEM hidden-API wrapper that re-exposes a hidden AOSP framework API to the unbundled OEM apps. Hard-loaded by OplusCamera (type / const-class reference); absent from our
 * LOS oplus-fwk it raises NoClassDefFoundError — an uncaught java.lang.Error — crashing the app on launch / disabling the feature. Stubbed to close the
 * linkage; members return safe defaults (false / 0 / null / empty / no-op) as only the type
 * surface is consumed here.
 */
public class StatsEvent {
    private StatsEvent() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Builder() {
        }

        public Builder setAtomId(int atomId) {
            return this;
        }

        public Builder writeInt(int value) {
            return this;
        }

        public Builder writeLong(long value) {
            return this;
        }

        public Builder writeBoolean(boolean value) {
            return this;
        }

        public Builder writeFloat(float value) {
            return this;
        }

        public Builder writeString(String value) {
            return this;
        }

        public Builder usePooledBuffer() {
            return this;
        }

        public StatsEvent build() {
            return new StatsEvent();
        }
    }
}
