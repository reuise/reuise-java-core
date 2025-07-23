package dev.reuise.core.parentcomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.basecomponent.CoreBaseComponent;
public interface CoreParentComponent extends CoreComponent , CoreBaseComponent , CoreParentComponentPart {
    CoreParentComponent getComponent();
}