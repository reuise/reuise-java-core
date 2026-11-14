package dev.reuise.core.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.button.CoreButtonPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreFloatingActionButtonOptions extends CoreButtonPartOptions , CoreBaseComponentPartOptions , CoreParentComponentPartOptions , CoreButtonOptions , CoreComponentOptions , CoreFloatingActionButtonPartOptions {
    CoreButtonPartOptions getButtonPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
