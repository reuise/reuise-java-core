package dev.reuise.core;

public interface State {
    public static MultiState of(State... states) {
        return new MultiState(states);
    }

    String getStateKey();
}
