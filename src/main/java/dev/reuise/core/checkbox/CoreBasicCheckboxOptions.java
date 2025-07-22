package dev.reuise.core.checkbox;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreBasicCheckboxOptions extends CoreBaseComponentOptions , CoreBaseComponentPartOptions , CoreBasicCheckboxPartOptions , CoreComponentOptions {
    CoreBaseComponentPartOptions getBaseComponentPart();
}