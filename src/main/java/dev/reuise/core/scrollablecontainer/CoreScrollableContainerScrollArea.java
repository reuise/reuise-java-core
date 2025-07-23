package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreScrollableContainerScrollArea extends CoreComponent , CoreParentComponent , CoreScrollableContainerScrollAreaPart {
    CoreScrollableContainerScrollArea getComponent();
}