package dev.reuise.core.list;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreBasicListItemPart extends ComponentPart , CoreBasicListItemFeatures , CoreParentComponentPart {
    CoreLink getLink();

    CoreParentComponentPart getParentComponentPart();
}