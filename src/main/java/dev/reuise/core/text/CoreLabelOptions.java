package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreLabelOptions extends CoreInlineTextOptions , CoreBaseComponentPartOptions , CoreTextPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreLabelPartOptions , CoreInlineTextPartOptions {
    CoreInlineTextPartOptions getInlineTextPart();

    CoreTextPartOptions getTextPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}