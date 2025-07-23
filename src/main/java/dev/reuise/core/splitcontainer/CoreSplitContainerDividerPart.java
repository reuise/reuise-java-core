package dev.reuise.core.splitcontainer;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreSplitContainerDividerPart extends ComponentPart , CoreContainerPart , CoreSplitContainerDividerFeatures {
    CoreContainerPart getContainerPart();
}