package dev.reuise.core.input;
import dev.reuise.core.ComponentPart;
public interface CorePasswordFieldPart extends ComponentPart , CoreTextFieldPart , CorePasswordFieldFeatures {
    CoreTextFieldPart getTextFieldPart();
}