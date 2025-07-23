package dev.reuise.core.checkbox;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
public interface CoreBasicCheckboxPart extends ComponentPart , CoreBasicCheckboxFeatures , CoreBaseComponentPart {
    void toggle();

    CoreBaseComponentPart getBaseComponentPart();
}