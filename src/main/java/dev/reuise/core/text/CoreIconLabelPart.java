package dev.reuise.core.text;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreIconLabelPart extends ComponentPart , CoreIconLabelFeatures , CoreParentComponentPart {
    CoreLink getLink();

    CoreIcon getStartIcon();

    CoreInlineText getLabelContainer();

    CoreIcon getEndIcon();

    CoreIconLabelPart setHighlightText(String text);

    boolean containsText(String text);

    CoreIconLabelPart setFilterText(String text);

    CoreParentComponentPart getParentComponentPart();
}