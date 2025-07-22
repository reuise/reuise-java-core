package dev.reuise.core.basecomponent;
import dev.reuise.core.CoreComponent;
public interface CoreBaseComponent extends CoreComponent , CoreBaseComponentPart {
    CoreBaseComponent getComponent();
}