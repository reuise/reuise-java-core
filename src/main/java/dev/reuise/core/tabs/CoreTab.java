package dev.reuise.core.tabs;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTab extends CoreComponent , CoreParentComponent , CoreTabPart {
    CoreTab getComponent();
}