package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreSplitContainerPanel extends CoreComponent , CoreContainer , CoreSplitContainerPanelPart {
    CoreSplitContainerPanel getComponent();
}