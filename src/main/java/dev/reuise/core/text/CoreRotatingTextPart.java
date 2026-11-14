package dev.reuise.core.text;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
public interface CoreRotatingTextPart extends ComponentPart , CoreRotatingTextFeatures , CoreBaseComponentPart {
    CoreRotatingTextPart pause();

    CoreRotatingTextPart resume();

    CoreBaseComponentPart getBaseComponentPart();
}
