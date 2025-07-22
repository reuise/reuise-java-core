package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreSheetLayoutOptions extends CoreSplitContainerPartOptions , CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreParentComponentPartOptions , CoreSheetLayoutPartOptions , CoreComponentOptions , CoreSplitContainerOptions {
    CoreSplitContainerPartOptions getSplitContainerPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}