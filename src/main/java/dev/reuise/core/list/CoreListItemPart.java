package dev.reuise.core.list;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.checkbox.CoreCheckbox;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.text.CoreInlineText;
public interface CoreListItemPart extends ComponentPart , CoreListItemFeatures , CoreBasicListItemPart {
    CoreCheckbox getCheckbox();

    CoreIcon getStartIcon();

    CoreContainer getTextContainer();

    CoreInlineText getLabelContainer();

    CoreInlineText getSecondaryLabelContainer();

    CoreIcon getEndIcon();

    CoreListItemPart setHighlightText(String text);

    boolean containsText(String text);

    CoreListItemPart setFilterText(String text);

    CoreBasicListItemPart getBasicListItemPart();
}