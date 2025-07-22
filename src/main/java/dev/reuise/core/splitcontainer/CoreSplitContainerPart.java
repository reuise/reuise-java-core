package dev.reuise.core.splitcontainer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreSplitContainerPart extends ComponentPart , CoreContainerPart , CoreSplitContainerFeatures {
    CoreContainer getContainer();

    CoreSplitContainerPanel getStartPanel();

    CoreSplitContainerDivider getDivider();

    CoreSplitContainerPanel getEndPanel();

    CoreContainerPart getContainerPart();
}