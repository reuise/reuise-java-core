package dev.reuise.core.text;
import dev.reuise.core.ComponentPart;
public interface CoreHeadingPart extends ComponentPart , CoreTextPart , CoreHeadingFeatures {
    CoreTextPart getTextPart();
}