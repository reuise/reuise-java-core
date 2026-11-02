package dev.reuise.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreMultiEmailAddressFieldOptions extends CoreChipFieldPartOptions , CoreMultiEmailAddressFieldPartOptions , CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreComponentOptions , CoreTextFieldPartOptions , CoreChipFieldOptions {
    CoreChipFieldPartOptions getChipFieldPart();

    CoreTextFieldPartOptions getTextFieldPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
