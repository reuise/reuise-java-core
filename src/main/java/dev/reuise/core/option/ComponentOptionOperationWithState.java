package dev.reuise.core.option;

import dev.reuise.core.State;

public class ComponentOptionOperationWithState<T> extends AbstractComponentOptionOperation<T> {
    private ApplyOperationWithState<T> operation;
    protected State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public ComponentOptionOperationWithState(ComponentOption<T> option, ApplyOperationWithState<T> operation, State state) {
        super(option);
        this.operation = operation;
        this.state = state;
    }

    @Override
    public void apply() throws ApplyOperationException {
        operation.apply(option.getValue(), state);
    }
}
