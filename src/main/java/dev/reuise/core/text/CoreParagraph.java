package dev.reuise.core.text;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreParagraph extends CoreComponent , CoreParentComponent , CoreParagraphPart {
    CoreParagraph getComponent();
}