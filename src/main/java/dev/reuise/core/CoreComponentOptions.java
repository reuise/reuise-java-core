package dev.reuise.core;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
public interface CoreComponentOptions extends CoreBaseComponentPartOptions {
    boolean onPreInitialize();

    void onInitialize();
}