package dev.reuise.core.image;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreImageOptions extends CoreImagePartOptions , CoreBaseComponentOptions , CoreBaseComponentPartOptions , CoreComponentOptions {
    CoreBaseComponentPartOptions getBaseComponentPart();
}
