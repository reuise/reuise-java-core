package dev.reuise.core.theme;

import dev.reuise.core.Interaction;

import java.util.EnumMap;
import java.util.Map;
public class ThemeColorSet {
    private final EnumMap<Interaction, Color> colors = new EnumMap<>(Interaction.class);

    public ThemeColorSet() {
    }

    public ThemeColorSet(Color normal, Color hover, Color active, Color focus, Color disabled) {
        colors.put(Interaction.NORMAL, normal);
        colors.put(Interaction.HOVER, hover);
        colors.put(Interaction.ACTIVE, active);
        colors.put(Interaction.FOCUS, focus);
        colors.put(Interaction.DISABLED, disabled);
    }

    public ThemeColorSet(Color base) {
        colors.put(Interaction.NORMAL, base);
        colors.put(Interaction.HOVER, base.darken(0.2));
        colors.put(Interaction.ACTIVE, base.darken(0.3));
        colors.put(Interaction.FOCUS, base.darken(0.3));
        colors.put(Interaction.DISABLED, base.withAlpha(128));
    }

    public ThemeColorSet(String hex) {
        this(new Color(hex));
    }

    public Color getColor(Interaction interaction) {
        return colors.get(interaction);
    }

    public Color getNormal() {
        return colors.get(Interaction.NORMAL);
    }

    public String toHex() {
        return getNormal().toHex();
    }

    public Color getHover() {
        return colors.get(Interaction.HOVER);
    }

    public Color getActive() {
        return colors.get(Interaction.ACTIVE);
    }

    public Color getFocus() {
        return colors.get(Interaction.FOCUS);
    }

    public Color getDisabled() {
        return colors.get(Interaction.DISABLED);
    }

    public Map<Interaction, Color> getAllColors() {
        return colors;
    }

    public ThemeColorSet setColor(Interaction interaction, Color color) {
        colors.put(interaction, color);
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
