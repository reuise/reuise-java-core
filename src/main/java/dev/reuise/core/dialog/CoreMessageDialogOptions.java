package dev.reuise.core.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreMessageDialogOptions extends CoreBaseComponentPartOptions , CoreDialogPartOptions , CoreMessageDialogPartOptions , CoreParentComponentPartOptions , CoreDialogOptions , CoreComponentOptions {
    CoreDialogPartOptions getDialogPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}