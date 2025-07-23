package dev.reuise.core.option;

public abstract class AbstractComponentOptionOperation<T> {
    protected ComponentOption<T> option;

    protected AbstractComponentOptionOperation(ComponentOption<T> option) {
        this.option = option;
    }

    public T getOptionValue() {
        return option.getValue();
    }

    public int getOptionIndex() {
        return option.getIndex();
    }

    public boolean isOptionForce() {
        return option.isForce();
    }

    public ComponentOption<T> getOption() {
        return option;
    }

    public void setOption(ComponentOption<T> option) {
        this.option = option;
    }

    public abstract void apply() throws ApplyOperationException;
}
