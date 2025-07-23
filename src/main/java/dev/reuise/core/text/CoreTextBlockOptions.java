package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreTextBlockOptions extends CoreTextBlockPartOptions , CoreTextOptions , CoreBaseComponentPartOptions , CoreTextPartOptions , CoreParentComponentPartOptions , CoreComponentOptions {
    CoreTextPartOptions getTextPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}