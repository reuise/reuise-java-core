package dev.reuise.core.theme;

public class Color {
    private final int r;
    private final int g;
    private final int b;
    private final int a; // Alpha (0–255)

    public Color(int r, int g, int b) {
        this(r, g, b, 255);
    }

    public Color(int r, int g, int b, int a) {
        this.r = clamp(r);
        this.g = clamp(g);
        this.b = clamp(b);
        this.a = clamp(a);
    }

    public Color(String hex) {
        if (hex.startsWith("#"))
            hex = hex.substring(1);
        if (hex.length() == 6 || hex.length() == 8) {
            this.r = Integer.parseInt(hex.substring(0, 2), 16);
            this.g = Integer.parseInt(hex.substring(2, 4), 16);
            this.b = Integer.parseInt(hex.substring(4, 6), 16);
            this.a = (hex.length() == 8)
                    ? Integer.parseInt(hex.substring(6, 8), 16)
                    : 255;
        } else {
            throw new IllegalArgumentException("Hex color must be 6 or 8 digits");
        }
    }

    private int clamp(int value) {
        return Math.max(0, Math.min(255, value));
    }

    public String toHex() {
        return "#" + toHexComponent(r) + toHexComponent(g) + toHexComponent(b);
    }

    public String toHexWithAlpha() {
        return "#" + toHexComponent(r) + toHexComponent(g) + toHexComponent(b) + toHexComponent(a);
    }

    private String toHexComponent(int value) {
        String hex = Integer.toHexString(value & 0xFF).toUpperCase();
        return hex.length() == 1 ? "0" + hex : hex;
    }

    public Color darken(double amount) {
        return new Color(
                (int) (r * (1.0 - amount)),
                (int) (g * (1.0 - amount)),
                (int) (b * (1.0 - amount)),
                a);
    }

    public Color lighten(double amount) {
        return new Color(
                (int) (r + (255 - r) * amount),
                (int) (g + (255 - g) * amount),
                (int) (b + (255 - b) * amount),
                a);
    }

    public Color withAlpha(int alpha) {
        return new Color(r, g, b, alpha);
    }

    public Color blendWith(Color other, double ratio) {
        double inv = 1.0 - ratio;
        return new Color(
                (int) (r * inv + other.r * ratio),
                (int) (g * inv + other.g * ratio),
                (int) (b * inv + other.b * ratio),
                (int) (a * inv + other.a * ratio));
    }

    public int getRed() {
        return r;
    }

    public int getGreen() {
        return g;
    }

    public int getBlue() {
        return b;
    }

    public int getAlpha() {
        return a;
    }
}
