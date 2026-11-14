package dev.reuise.core.theme;

import java.util.Objects;

/** An optional color or gradient layer blended over a themed background. */
public final class BackgroundOverlay {
    private final Color color;
    private final Gradient gradient;
    private final BackgroundBlendMode mode;

    private BackgroundOverlay(Color color, Gradient gradient, BackgroundBlendMode mode) {
        this.color = color;
        this.gradient = gradient;
        this.mode = Objects.requireNonNull(mode, "mode");
    }

    public static BackgroundOverlay color(Color color, BackgroundBlendMode mode) {
        return new BackgroundOverlay(Objects.requireNonNull(color, "color"), null, mode);
    }

    public static BackgroundOverlay gradient(Gradient gradient, BackgroundBlendMode mode) {
        return new BackgroundOverlay(null, Objects.requireNonNull(gradient, "gradient"), mode);
    }

    public String toCss() {
        return gradient != null ? gradient.toCss()
                : "linear-gradient(" + color.toCss() + ", " + color.toCss() + ")";
    }

    public BackgroundBlendMode getBlendMode() {
        return mode;
    }
}
