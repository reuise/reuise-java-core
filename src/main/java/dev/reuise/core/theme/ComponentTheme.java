package dev.reuise.core.theme;

import dev.reuise.core.Interaction;
import java.util.EnumMap;

public class ComponentTheme {
    private String name;
    private boolean dark;
    private String fontFamily;
    private int fontSize;
    private int cornerRadius;

    private final EnumMap<ThemeColorRole, ThemeColorSet> colorRoles = new EnumMap<>(ThemeColorRole.class);

    public ComponentTheme() {
        this.name = "Unnamed Component Theme";
        this.dark = false;
        this.fontFamily = "Poppins, sans-serif";
        this.fontSize = 14;
        this.cornerRadius = 6;

        colorRoles.put(ThemeColorRole.PRIMARY, new ThemeColorSet(new Color("#0066ff")));
        colorRoles.put(ThemeColorRole.SECONDARY, new ThemeColorSet(new Color("#e0e0e0")));
        colorRoles.put(ThemeColorRole.BACKGROUND, new ThemeColorSet(new Color("#ffffff")));
        colorRoles.put(ThemeColorRole.SURFACE, new ThemeColorSet(new Color("#ffffff")));
        colorRoles.put(ThemeColorRole.TEXT, new ThemeColorSet(new Color("#000000")));
        colorRoles.put(ThemeColorRole.ACCENT, new ThemeColorSet(new Color("#0066ff")));
    }

    public static ComponentTheme create() {
        return new ComponentTheme();
    }

    public String getName() {
        return name;
    }

    public boolean isDark() {
        return dark;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public ThemeColorSet getColorSet(ThemeColorRole role) {
        return colorRoles.get(role);
    }

    public Color getColor(ThemeColorRole role, Interaction interaction) {
        ThemeColorSet set = colorRoles.get(role);
        if (set == null) throw new IllegalArgumentException("No color set defined for role: " + role);
        return set.getColor(interaction);
    }

    public ComponentTheme setColor(ThemeColorRole role, ThemeColorSet set) {
        colorRoles.put(role, set);
        return this;
    }

    public ComponentTheme setColor(ThemeColorRole role, Color base) {
        return setColor(role, new ThemeColorSet(base));
    }

    public ComponentTheme setColor(ThemeColorRole role, String hex) {
        return setColor(role, new Color(hex));
    }

    public ThemeColorSet getPrimaryColor() { return getColorSet(ThemeColorRole.PRIMARY); }
    public ThemeColorSet getSecondaryColor() { return getColorSet(ThemeColorRole.SECONDARY); }
    public ThemeColorSet getBackgroundColor() { return getColorSet(ThemeColorRole.BACKGROUND); }
    public ThemeColorSet getSurfaceColor() { return getColorSet(ThemeColorRole.SURFACE); }
    public ThemeColorSet getTextColor() { return getColorSet(ThemeColorRole.TEXT); }
    public ThemeColorSet getAccentColor() { return getColorSet(ThemeColorRole.ACCENT); }

    public ComponentTheme setPrimaryColor(ThemeColorSet set) { return setColor(ThemeColorRole.PRIMARY, set); }
    public ComponentTheme setPrimaryColor(Color base) { return setColor(ThemeColorRole.PRIMARY, base); }
    public ComponentTheme setPrimaryColor(String hex) { return setColor(ThemeColorRole.PRIMARY, hex); }

    public ComponentTheme setSecondaryColor(ThemeColorSet set) { return setColor(ThemeColorRole.SECONDARY, set); }
    public ComponentTheme setSecondaryColor(Color base) { return setColor(ThemeColorRole.SECONDARY, base); }
    public ComponentTheme setSecondaryColor(String hex) { return setColor(ThemeColorRole.SECONDARY, hex); }

    public ComponentTheme setBackgroundColor(ThemeColorSet set) { return setColor(ThemeColorRole.BACKGROUND, set); }
    public ComponentTheme setBackgroundColor(Color base) { return setColor(ThemeColorRole.BACKGROUND, base); }
    public ComponentTheme setBackgroundColor(String hex) { return setColor(ThemeColorRole.BACKGROUND, hex); }

    public ComponentTheme setSurfaceColor(ThemeColorSet set) { return setColor(ThemeColorRole.SURFACE, set); }
    public ComponentTheme setSurfaceColor(Color base) { return setColor(ThemeColorRole.SURFACE, base); }
    public ComponentTheme setSurfaceColor(String hex) { return setColor(ThemeColorRole.SURFACE, hex); }

    public ComponentTheme setTextColor(ThemeColorSet set) { return setColor(ThemeColorRole.TEXT, set); }
    public ComponentTheme setTextColor(Color base) { return setColor(ThemeColorRole.TEXT, base); }
    public ComponentTheme setTextColor(String hex) { return setColor(ThemeColorRole.TEXT, hex); }

    public ComponentTheme setAccentColor(ThemeColorSet set) { return setColor(ThemeColorRole.ACCENT, set); }
    public ComponentTheme setAccentColor(Color base) { return setColor(ThemeColorRole.ACCENT, base); }
    public ComponentTheme setAccentColor(String hex) { return setColor(ThemeColorRole.ACCENT, hex); }

    public ComponentTheme setName(String name) {
        this.name = name;
        return this;
    }

    public ComponentTheme setDark(boolean dark) {
        this.dark = dark;
        return this;
    }

    public ComponentTheme setFont(String fontFamily, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        return this;
    }

    public ComponentTheme setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    @Override
    public String toString() {
        return "ComponentTheme{" +
                "name='" + name + '\'' +
                ", dark=" + dark +
                ", font='" + fontFamily + "', size=" + fontSize +
                ", cornerRadius=" + cornerRadius +
                '}';
    }
}
