package dev.reuise.core.divider;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreInlineText;
public interface CoreDividerPart extends ComponentPart , CoreParentComponentPart , CoreDividerFeatures {
    CoreContainer getStartLine();

    CoreInlineText getLabelContainer();

    CoreContainer getEndLine();

    CoreParentComponentPart getParentComponentPart();
}