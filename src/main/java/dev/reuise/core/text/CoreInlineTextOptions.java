package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreInlineTextOptions extends CoreTextOptions , CoreBaseComponentPartOptions , CoreTextPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreInlineTextPartOptions {
    CoreTextPartOptions getTextPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
