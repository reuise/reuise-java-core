package dev.reuise.core.theme;

import java.util.Objects;
import dev.reuise.core.Interaction;

/** A reusable transformation of a solid color or each stop of a gradient. */
public final class ColorVariation {
    private enum Kind { DARKEN, LIGHTEN, OPACITY, MIX, MULTIPLY, SCREEN, OVERLAY }

    private final Kind kind;
    private final double amount;
    private final Color blend;

    private ColorVariation(Kind kind, double amount, Color blend) {
        if (!Double.isFinite(amount) || amount < 0 || amount > 1)
            throw new IllegalArgumentException("Variation amount must be between 0 and 1");
        this.kind = kind;
        this.amount = amount;
        this.blend = blend;
    }

    public static ColorVariation darken(double amount) {
        return new ColorVariation(Kind.DARKEN, amount, null);
    }

    public static ColorVariation lighten(double amount) {
        return new ColorVariation(Kind.LIGHTEN, amount, null);
    }

    /** Multiplies the original alpha by the supplied opacity. */
    public static ColorVariation opacity(double amount) {
        return new ColorVariation(Kind.OPACITY, amount, null);
    }

    static ColorVariation defaultFor(Interaction interaction) {
        switch (interaction) {
            case HOVER: return darken(.2);
            case ACTIVE:
            case FOCUS: return darken(.3);
            case DISABLED: return opacity(.5);
            default: throw new IllegalArgumentException("No variation for normal state");
        }
    }

    public static ColorVariation mix(Color color, double amount) {
        return new ColorVariation(Kind.MIX, amount, Objects.requireNonNull(color, "color"));
    }

    public static ColorVariation multiply(Color color, double amount) {
        return new ColorVariation(Kind.MULTIPLY, amount, Objects.requireNonNull(color, "color"));
    }

    public static ColorVariation screen(Color color, double amount) {
        return new ColorVariation(Kind.SCREEN, amount, Objects.requireNonNull(color, "color"));
    }

    public static ColorVariation overlay(Color color, double amount) {
        return new ColorVariation(Kind.OVERLAY, amount, Objects.requireNonNull(color, "color"));
    }

    public Color apply(Color base) {
        Objects.requireNonNull(base, "base");
        if (kind == Kind.DARKEN) return base.darken(amount);
        if (kind == Kind.LIGHTEN) return base.lighten(amount);
        if (kind == Kind.OPACITY) return base.withAlpha((int) Math.round(base.getAlpha() * amount));
        if (kind == Kind.MIX) return base.blendWith(blend, amount);
        Color result = new Color(channel(base.getRed(), blend.getRed()),
                channel(base.getGreen(), blend.getGreen()),
                channel(base.getBlue(), blend.getBlue()), base.getAlpha());
        return base.blendWith(result, amount);
    }

    private int channel(int base, int other) {
        if (kind == Kind.MULTIPLY) return base * other / 255;
        if (kind == Kind.SCREEN) return 255 - (255 - base) * (255 - other) / 255;
        return base < 128 ? 2 * base * other / 255
                : 255 - 2 * (255 - base) * (255 - other) / 255;
    }
}
