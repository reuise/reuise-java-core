package dev.reuise.core.option;

import dev.reuise.core.State;

@FunctionalInterface
public interface ApplyOperationWithState<T> {
    void apply(T value, State state) throws ApplyOperationException;
}
