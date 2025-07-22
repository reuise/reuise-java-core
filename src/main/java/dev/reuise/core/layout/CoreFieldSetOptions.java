package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreFieldSetOptions extends CoreFieldSetPartOptions , CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreContainerOptions , CoreParentComponentPartOptions , CoreComponentOptions {
    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}