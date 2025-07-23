package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreSplitContainerDivider extends CoreSplitContainerDividerPart , CoreComponent , CoreContainer {
    CoreSplitContainerDivider getComponent();
}