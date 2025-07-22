package dev.reuise.core.option;

public class DefaultComponentOption<T> extends ComponentOption<T> {
    public DefaultComponentOption(String name, T value, int index) {
        super(name, value, index);
    }

    public DefaultComponentOption(String name, T value, int index, boolean force) {
        super(name, value, index, force);
    }
}
