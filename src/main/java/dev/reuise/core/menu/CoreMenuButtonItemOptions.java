package dev.reuise.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.button.CoreButtonPartOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreMenuButtonItemOptions extends CoreButtonPartOptions , CoreBaseComponentPartOptions , CoreMenuButtonItemPartOptions , CoreParentComponentPartOptions , CoreButtonOptions , CoreComponentOptions {
    CoreButtonPartOptions getButtonPart();

    CoreParentComponentPartOptions getParentComponentPart();

    CoreBaseComponentPartOptions getBaseComponentPart();
}
