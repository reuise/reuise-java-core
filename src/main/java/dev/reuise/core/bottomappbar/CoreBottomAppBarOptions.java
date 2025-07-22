package dev.reuise.core.bottomappbar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreBottomAppBarOptions extends CoreBaseComponentOptions , CoreBottomAppBarPartOptions , CoreBaseComponentPartOptions , CoreComponentOptions {
    CoreBaseComponentPartOptions getBaseComponentPart();
}