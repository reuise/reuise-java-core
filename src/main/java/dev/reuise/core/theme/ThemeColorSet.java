package dev.reuise.core.theme;

import dev.reuise.core.Interaction;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
public class ThemeColorSet {
    private final EnumMap<Interaction, Color> colors = new EnumMap<>(Interaction.class);
    private final EnumMap<Interaction, ColorVariation> variations = new EnumMap<>(Interaction.class);

    public ThemeColorSet() {
        for (Interaction interaction : Interaction.values())
            if (interaction != Interaction.NORMAL)
                variations.put(interaction, ColorVariation.defaultFor(interaction));
    }

    public ThemeColorSet(Color normal, Color hover, Color active, Color focus, Color disabled) {
        colors.put(Interaction.NORMAL, normal);
        colors.put(Interaction.HOVER, hover);
        colors.put(Interaction.ACTIVE, active);
        colors.put(Interaction.FOCUS, focus);
        colors.put(Interaction.DISABLED, disabled);
    }

    public ThemeColorSet(Color base) {
        this();
        colors.put(Interaction.NORMAL, base);
    }

    public ThemeColorSet(String hex) {
        this(new Color(hex));
    }

    public Color getColor(Interaction interaction) {
        Objects.requireNonNull(interaction, "interaction");
        ColorVariation variation = variations.get(interaction);
        Color base = colors.get(Interaction.NORMAL);
        if (variation != null) return base == null ? null : variation.apply(base);
        Color color = colors.get(interaction);
        return color == null ? base : color;
    }

    public Color getNormal() {
        return colors.get(Interaction.NORMAL);
    }

    public String toHex() {
        return getNormal().toHex();
    }

    public Color getHover() {
        return getColor(Interaction.HOVER);
    }

    public Color getActive() {
        return getColor(Interaction.ACTIVE);
    }

    public Color getFocus() {
        return getColor(Interaction.FOCUS);
    }

    public Color getDisabled() {
        return getColor(Interaction.DISABLED);
    }

    public Map<Interaction, Color> getAllColors() {
        for (Interaction interaction : variations.keySet())
            colors.put(interaction, getColor(interaction));
        return colors;
    }

    public ThemeColorSet setColor(Interaction interaction, Color color) {
        variations.remove(Objects.requireNonNull(interaction, "interaction"));
        colors.put(interaction, color);
        return this;
    }

    public ThemeColorSet setVariation(Interaction interaction, ColorVariation variation) {
        Objects.requireNonNull(interaction, "interaction");
        if (interaction == Interaction.NORMAL)
            throw new IllegalArgumentException("A variation needs a normal base color");
        variations.put(interaction, Objects.requireNonNull(variation, "variation"));
        return this;
    }

    public ThemeColorSet setNormal(Color color) {
        return setColor(Interaction.NORMAL, color);
    }

    public ThemeColorSet setHover(Color color) {
        return setColor(Interaction.HOVER, color);
    }

    public ThemeColorSet setActive(Color color) {
        return setColor(Interaction.ACTIVE, color);
    }

    public ThemeColorSet setFocus(Color color) {
        return setColor(Interaction.FOCUS, color);
    }

    public ThemeColorSet setDisabled(Color color) {
        return setColor(Interaction.DISABLED, color);
    }

    public static ThemeColorSet create(Color base) {
        return new ThemeColorSet(base);
    }

    public static ThemeColorSet create(String hex) {
        return new ThemeColorSet(hex);
    }

    public static ThemeColorSet create() {
        return new ThemeColorSet();
    }
}
