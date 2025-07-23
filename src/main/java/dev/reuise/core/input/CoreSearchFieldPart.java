package dev.reuise.core.input;
import dev.reuise.core.ComponentPart;
public interface CoreSearchFieldPart extends CoreSearchFieldFeatures , ComponentPart , CoreTextFieldPart {
    CoreTextFieldPart getTextFieldPart();
}