package dev.reuise.core;

/**
 * The document's color mode: an explicit light/dark override, or following
 * the device/OS preference (via {@code prefers-color-scheme}).
 */
public enum ColorMode {
    LIGHT,
    DARK,
    DEVICE;

    /**
     * The value written to the body's {@code data-reuise-color-scheme}
     * attribute, or {@code null} for {@link #DEVICE}, where the attribute is
     * omitted entirely so CSS can fall back to {@code prefers-color-scheme}.
     */
    public String getAttributeValue() {
        switch (this) {
            case LIGHT:
                return "light";
            case DARK:
                return "dark";
            default:
                return null;
        }
    }
}
