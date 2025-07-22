package dev.reuise.core.icon;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreIcon extends CoreComponent , CoreParentComponent , CoreIconPart {
    CoreIcon getComponent();
}