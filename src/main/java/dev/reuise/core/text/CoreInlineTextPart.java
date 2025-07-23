package dev.reuise.core.text;
import dev.reuise.core.ComponentPart;
public interface CoreInlineTextPart extends ComponentPart , CoreTextPart , CoreInlineTextFeatures {
    CoreTextPart getTextPart();
}