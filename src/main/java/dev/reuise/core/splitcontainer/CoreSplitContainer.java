package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreSplitContainer extends CoreComponent , CoreContainer , CoreSplitContainerPart {
    CoreSplitContainer getComponent();
}