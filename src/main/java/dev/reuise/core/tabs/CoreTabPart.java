package dev.reuise.core.tabs;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.badge.CoreBadge;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.core.text.CoreInlineText;
public interface CoreTabPart extends ComponentPart , CoreTabFeatures , CoreParentComponentPart {
    CoreLink getLink();

    CoreBadge getBadge();

    CoreIcon getIcon();

    CoreInlineText getLabelContainer();

    CoreParentComponentPart getParentComponentPart();
}