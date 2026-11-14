package dev.reuise.core.theme;

import java.util.EnumMap;
import java.util.Objects;
import dev.reuise.core.Interaction;

/** Gradient states either override or derive from the normal gradient. */
public final class ThemeGradientSet {
    private Gradient normal;
    private final EnumMap<Interaction, Gradient> overrides = new EnumMap<>(Interaction.class);
    private final EnumMap<Interaction, ColorVariation> variations = new EnumMap<>(Interaction.class);

    public ThemeGradientSet(Gradient normal) {
        setNormal(normal);
        for (Interaction interaction : Interaction.values())
            if (interaction != Interaction.NORMAL)
                variations.put(interaction, ColorVariation.defaultFor(interaction));
    }

    public static ThemeGradientSet create(Gradient normal) {
        return new ThemeGradientSet(normal);
    }

    public ThemeGradientSet setNormal(Gradient gradient) {
        normal = Objects.requireNonNull(gradient, "gradient");
        return this;
    }

    public ThemeGradientSet setGradient(Interaction interaction, Gradient gradient) {
        Objects.requireNonNull(interaction, "interaction");
        if (interaction == Interaction.NORMAL) return setNormal(gradient);
        overrides.put(interaction, Objects.requireNonNull(gradient, "gradient"));
        variations.remove(interaction);
        return this;
    }

    public ThemeGradientSet setVariation(Interaction interaction, ColorVariation variation) {
        Objects.requireNonNull(interaction, "interaction");
        if (interaction == Interaction.NORMAL)
            throw new IllegalArgumentException("A variation needs a normal gradient");
        variations.put(interaction, Objects.requireNonNull(variation, "variation"));
        overrides.remove(interaction);
        return this;
    }

    public Gradient getGradient(Interaction interaction) {
        Objects.requireNonNull(interaction, "interaction");
        Gradient override = overrides.get(interaction);
        if (override != null) return override;
        ColorVariation variation = variations.get(interaction);
        return variation == null ? normal : normal.vary(variation);
    }
}
