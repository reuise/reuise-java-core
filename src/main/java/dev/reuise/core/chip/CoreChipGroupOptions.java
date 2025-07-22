package dev.reuise.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.layout.CoreFieldSetOptions;
import dev.reuise.core.layout.CoreFieldSetPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreChipGroupOptions extends CoreFieldSetOptions , CoreFieldSetPartOptions , CoreBaseComponentPartOptions , CoreContainerPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreChipGroupPartOptions {
    CoreFieldSetPartOptions getFieldSetPart();

    CoreContainerPartOptions getContainerPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}