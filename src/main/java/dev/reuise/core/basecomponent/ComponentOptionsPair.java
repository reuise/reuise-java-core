package dev.reuise.core.basecomponent;

import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;

public class ComponentOptionsPair {
    private CoreComponent component;
    private CoreComponentOptions options;

    protected ComponentOptionsPair(CoreComponent component, CoreComponentOptions options) {
        this.component = component;
        this.options = options;
    }

    public static ComponentOptionsPair of(CoreComponent component, CoreComponentOptions options) {
        return new ComponentOptionsPair(component, options);
    }

    public CoreComponent getComponent() {
        return component;
    }

    public void setComponent(CoreComponent component) {
        this.component = component;
    }

    public CoreComponentOptions getOptions() {
        return options;
    }

    public void setOptions(CoreComponentOptions options) {
        this.options = options;
    }
}
