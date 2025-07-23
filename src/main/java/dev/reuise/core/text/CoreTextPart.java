package dev.reuise.core.text;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTextPart extends ComponentPart , CoreTextFeatures , CoreParentComponentPart {
    boolean containsText(String text);

    CoreParentComponentPart getParentComponentPart();
}