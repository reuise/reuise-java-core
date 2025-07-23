package dev.reuise.core.splitcontainer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreSplitContainerPanelPart extends CoreSplitContainerPanelFeatures , ComponentPart , CoreContainerPart {
    CoreContainerPart getContainerPart();
}