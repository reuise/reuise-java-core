package dev.reuise.core.text;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreParagraphPart extends ComponentPart , CoreParentComponentPart , CoreParagraphFeatures {
    CoreParentComponentPart getParentComponentPart();
}