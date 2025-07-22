package dev.reuise.core;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum Interaction implements State {
    NORMAL, ACTIVE, HOVER, FOCUS, DISABLED;

    @Override
    public String getStateKey() {
        return "interaction_" + name().toLowerCase();
    }

    public String getSelector(String baseSelector) {
        if (this == NORMAL) {
            return baseSelector;
        }

        String pseudo = ":" + name().toLowerCase();

        return Arrays.stream(baseSelector.split(","))
                .map(String::trim)
                .map(sel -> sel + pseudo)
                .collect(Collectors.joining(","));
    }
}
