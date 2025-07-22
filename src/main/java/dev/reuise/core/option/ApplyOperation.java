package dev.reuise.core.option;

@FunctionalInterface
public interface ApplyOperation<T> {
    void apply(T value) throws ApplyOperationException;
}
