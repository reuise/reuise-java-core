package dev.reuise.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiState implements State {
    private List<State> states;

    public MultiState(List<State> states) {
        this.states = states;
    }
    
    public MultiState(State[] states) {
        this(Arrays.asList(states));
    }
    
    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    @Override
    public String getStateKey() {
        if(states == null || states.isEmpty()) return null;
        return states.stream().map(s -> s.getStateKey()).collect(Collectors.joining());
    }
}
