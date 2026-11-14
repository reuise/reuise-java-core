package dev.reuise.core.theme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/** An immutable linear or radial gradient with optional percentage stop positions. */
public final class Gradient {
    public static final class Stop {
        private final Color color;
        private final Double position;

        private Stop(Color color, Double position) {
            this.color = Objects.requireNonNull(color, "color");
            if (position != null && !Double.isFinite(position))
                throw new IllegalArgumentException("Stop position must be finite");
            this.position = position;
        }

        public static Stop of(Color color) { return new Stop(color, null); }
        public static Stop at(Color color, double percent) { return new Stop(color, percent); }
        public Color getColor() { return color; }
        public Double getPosition() { return position; }
    }

    private final Double angle;
    private final String radialPosition;
    private final List<Stop> stops;

    private Gradient(Double angle, String radialPosition, Stop... stops) {
        if (angle != null && !Double.isFinite(angle))
            throw new IllegalArgumentException("Gradient angle must be finite");
        if (stops == null || stops.length < 2)
            throw new IllegalArgumentException("A gradient needs at least two stops");
        this.angle = angle;
        this.radialPosition = radialPosition;
        List<Stop> copy = new ArrayList<>();
        for (Stop stop : stops) copy.add(Objects.requireNonNull(stop, "stop"));
        this.stops = Collections.unmodifiableList(copy);
    }

    public static Gradient linear(double angleDegrees, Stop... stops) {
        return new Gradient(angleDegrees, null, stops);
    }

    public static Gradient radial(Stop... stops) {
        return new Gradient(null, null, stops);
    }

    public static Gradient radialAt(double xPercent, double yPercent, Stop... stops) {
        if (!Double.isFinite(xPercent) || !Double.isFinite(yPercent))
            throw new IllegalArgumentException("Gradient position must be finite");
        return new Gradient(null, xPercent + "% " + yPercent + "%", stops);
    }

    public List<Stop> getStops() { return stops; }

    public Gradient vary(ColorVariation variation) {
        Objects.requireNonNull(variation, "variation");
        Stop[] result = new Stop[stops.size()];
        for (int i = 0; i < result.length; i++) {
            Stop stop = stops.get(i);
            result[i] = new Stop(variation.apply(stop.color), stop.position);
        }
        return new Gradient(angle, radialPosition, result);
    }

    public String toCss() {
        StringBuilder css = new StringBuilder(angle == null ? "radial-gradient(" : "linear-gradient(");
        if (angle != null) css.append(angle).append("deg, ");
        else if (radialPosition != null) css.append("at ").append(radialPosition).append(", ");
        for (int i = 0; i < stops.size(); i++) {
            if (i != 0) css.append(", ");
            Stop stop = stops.get(i);
            css.append(stop.color.toCss());
            if (stop.position != null) css.append(' ').append(stop.position).append('%');
        }
        return css.append(')').toString();
    }
}
