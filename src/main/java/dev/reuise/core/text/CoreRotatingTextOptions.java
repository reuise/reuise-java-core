package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface CoreRotatingTextOptions extends CoreBaseComponentOptions , CoreBaseComponentPartOptions , CoreRotatingTextPartOptions , CoreComponentOptions {
    CoreBaseComponentPartOptions getBaseComponentPart();
}
