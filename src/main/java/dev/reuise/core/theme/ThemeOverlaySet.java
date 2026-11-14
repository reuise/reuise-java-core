package dev.reuise.core.theme;

import java.util.EnumMap;
import java.util.Objects;
import dev.reuise.core.Interaction;

/** Optional per-state background overlays; missing states use the normal overlay. */
public final class ThemeOverlaySet {
    private final EnumMap<Interaction, BackgroundOverlay> overlays = new EnumMap<>(Interaction.class);

    public ThemeOverlaySet setOverlay(Interaction interaction, BackgroundOverlay overlay) {
        overlays.put(Objects.requireNonNull(interaction, "interaction"), Objects.requireNonNull(overlay, "overlay"));
        return this;
    }

    public ThemeOverlaySet clearOverlay(Interaction interaction) {
        overlays.remove(Objects.requireNonNull(interaction, "interaction"));
        return this;
    }

    public BackgroundOverlay getOverlay(Interaction interaction) {
        Objects.requireNonNull(interaction, "interaction");
        BackgroundOverlay overlay = overlays.get(interaction);
        return overlay != null ? overlay : overlays.get(Interaction.NORMAL);
    }
}
