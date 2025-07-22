package dev.reuise.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface CoreBasicInputFieldOptions extends CoreBaseComponentOptions , CoreBaseComponentPartOptions , CoreBasicInputFieldPartOptions , CoreComponentOptions {
    CoreBaseComponentPartOptions getBaseComponentPart();
}