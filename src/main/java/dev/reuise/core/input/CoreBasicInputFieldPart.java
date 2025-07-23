package dev.reuise.core.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
public interface CoreBasicInputFieldPart extends ComponentPart , CoreBaseComponentPart , CoreBasicInputFieldFeatures {
    CoreBasicInputFieldPart addText(String text);

    void clear();

    boolean validate();

    boolean isAutocomplete();

    CoreBaseComponentPart getBaseComponentPart();
}