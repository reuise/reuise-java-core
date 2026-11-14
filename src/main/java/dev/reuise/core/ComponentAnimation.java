package dev.reuise.core;

import java.util.Objects;

/**
 * Immutable configuration for a component entrance animation.
 *
 * <p>Viewport entry is the default trigger. Render and manual triggers can be
 * selected independently of the effect. Time values are in milliseconds.
 * Configure an opted-in container, heading, paragraph or image with
 * {@code options.setAnimation(...)} or {@code component.setAnimation(...)};
 * call {@code startAnimation()} for a
 * manual trigger and {@code cancelAnimation()} to stop it. A null animation
 * removes the configuration.
 *
 * <p>Server rendering leaves content visible and emits no animation state.
 * Supply the configuration again during hydration. Animations are progressive
 * enhancement, so content also stays visible before viewport entry and when
 * reduced motion is requested or browser APIs are unavailable. Automatic
 * triggers run once on Reuise attachment, or when configured on an already
 * connected element; after removal, explicitly start or reconfigure to replay.
 * While waiting or animating, removal observed in the document cancels the
 * controller. Mutations wholly inside a shadow root are not observed by the
 * document observer; cancel explicitly when managing such DOM externally.
 */
public final class ComponentAnimation {
    public enum Effect { FADE, SLIDE, BLUR }
    public enum Direction { TOP, RIGHT, BOTTOM, LEFT }
    public enum Trigger { VIEWPORT, RENDER, MANUAL }
    public enum Easing { LINEAR, EASE, EASE_IN, EASE_OUT, EASE_IN_OUT }

    private final Effect effect;
    private final Direction direction;
    private final Trigger trigger;
    private final Easing easing;
    private final int durationMillis;
    private final int delayMillis;
    private final int distancePixels;
    private final int blurPixels;

    private ComponentAnimation(Effect effect, Direction direction, Trigger trigger, Easing easing,
            int durationMillis, int delayMillis, int distancePixels, int blurPixels) {
        this.effect = Objects.requireNonNull(effect, "effect");
        this.direction = Objects.requireNonNull(direction, "direction");
        this.trigger = Objects.requireNonNull(trigger, "trigger");
        this.easing = Objects.requireNonNull(easing, "easing");
        this.durationMillis = nonNegative(durationMillis, "durationMillis");
        this.delayMillis = nonNegative(delayMillis, "delayMillis");
        this.distancePixels = nonNegative(distancePixels, "distancePixels");
        this.blurPixels = nonNegative(blurPixels, "blurPixels");
    }

    private static int nonNegative(int value, String name) {
        if (value < 0) throw new IllegalArgumentException(name + " must be non-negative");
        return value;
    }

    public static ComponentAnimation fadeIn() {
        return defaults(Effect.FADE);
    }

    public static ComponentAnimation slideIn(Direction direction) {
        return defaults(Effect.SLIDE).withDirection(direction);
    }

    /** Fades in while transitioning from blurred to the element's normal filter. */
    public static ComponentAnimation blurIn() {
        return defaults(Effect.BLUR);
    }

    private static ComponentAnimation defaults(Effect effect) {
        return new ComponentAnimation(effect, Direction.BOTTOM, Trigger.VIEWPORT, Easing.EASE_OUT,
                600, 0, 24, 8);
    }

    public Effect getEffect() { return effect; }
    public Direction getDirection() { return direction; }
    public Trigger getTrigger() { return trigger; }
    public Easing getEasing() { return easing; }
    public int getDurationMillis() { return durationMillis; }
    public int getDelayMillis() { return delayMillis; }
    public int getDistancePixels() { return distancePixels; }
    public int getBlurPixels() { return blurPixels; }

    public ComponentAnimation withDirection(Direction value) {
        return new ComponentAnimation(effect, value, trigger, easing, durationMillis, delayMillis, distancePixels, blurPixels);
    }

    public ComponentAnimation withTrigger(Trigger value) {
        return new ComponentAnimation(effect, direction, value, easing, durationMillis, delayMillis, distancePixels, blurPixels);
    }

    public ComponentAnimation withEasing(Easing value) {
        return new ComponentAnimation(effect, direction, trigger, value, durationMillis, delayMillis, distancePixels, blurPixels);
    }

    public ComponentAnimation withDurationMillis(int value) {
        return new ComponentAnimation(effect, direction, trigger, easing, value, delayMillis, distancePixels, blurPixels);
    }

    public ComponentAnimation withDelayMillis(int value) {
        return new ComponentAnimation(effect, direction, trigger, easing, durationMillis, value, distancePixels, blurPixels);
    }

    public ComponentAnimation withDistancePixels(int value) {
        return new ComponentAnimation(effect, direction, trigger, easing, durationMillis, delayMillis, value, blurPixels);
    }

    public ComponentAnimation withBlurPixels(int value) {
        return new ComponentAnimation(effect, direction, trigger, easing, durationMillis, delayMillis, distancePixels, value);
    }
}
