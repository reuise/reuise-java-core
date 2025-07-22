package dev.reuise.core.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreSplitContainerPanelOptions extends CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreContainerOptions , CoreParentComponentPartOptions , CoreSplitContainerPanelPartOptions , CoreComponentOptions {
    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}