package dev.reuise.core.option;

public class ComponentOption<T> {
    private String name;

    private T value;
    private int index;
    private boolean force;

    public ComponentOption(String name, T value, int index) {
        this.name = name;
        this.value = value;
        this.index = index;
    }

    public ComponentOption(String name, T value, int index, boolean force) {
        this(name, value, index);
        this.force = force;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
