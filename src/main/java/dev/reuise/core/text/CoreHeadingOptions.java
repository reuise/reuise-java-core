package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreHeadingOptions extends CoreTextOptions , CoreBaseComponentPartOptions , CoreTextPartOptions , CoreHeadingPartOptions , CoreParentComponentPartOptions , CoreComponentOptions {
    CoreTextPartOptions getTextPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}