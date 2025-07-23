package dev.reuise.core.text;
import dev.reuise.core.ComponentPart;
public interface CoreTextBlockPart extends ComponentPart , CoreTextPart , CoreTextBlockFeatures {
    CoreTextPart getTextPart();
}