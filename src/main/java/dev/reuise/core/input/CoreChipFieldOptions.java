package dev.reuise.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreChipFieldOptions extends CoreChipFieldPartOptions , CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreTextFieldOptions , CoreTextFieldPartOptions {
    CoreTextFieldPartOptions getTextFieldPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}