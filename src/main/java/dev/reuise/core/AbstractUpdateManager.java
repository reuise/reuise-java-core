package dev.reuise.core;

import java.util.function.BiConsumer;

public abstract class AbstractUpdateManager<T> {
    private T currentState;
    private BiConsumer<T, T> onUpdate;

    protected AbstractUpdateManager(T initialState) {
        this.currentState = initialState;
    }

    public void setOnUpdate(BiConsumer<T, T> onUpdate) {
        this.onUpdate = onUpdate;
    }

    public void update(BiConsumer<T, T> modifier) {
        try {
            T previousState = deepCopy(currentState);
            modifier.accept(previousState, currentState);

            if (onUpdate != null) {
                onUpdate.accept(previousState, currentState);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCurrentState(T currentState) {
        this.currentState = currentState;
    }

    public T getCurrentState() {
        return currentState;
    }

    protected abstract T deepCopy(T object) throws Exception;
}
