package dev.reuise.core.dropzone;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreDropZoneOptions extends CoreDropZonePartOptions , CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreParentComponentOptions {
    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}