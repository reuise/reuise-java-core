package dev.reuise.core.theme;

public enum BackgroundBlendMode {
    NORMAL, MULTIPLY, SCREEN, OVERLAY, DARKEN, LIGHTEN;

    public String toCss() {
        return name().toLowerCase();
    }
}
