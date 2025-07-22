package dev.reuise.core.icon;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreIconPart extends ComponentPart , CoreParentComponentPart , CoreIconFeatures {
    CoreLink getLink();

    CoreImage getImage();

    CoreParentComponentPart getParentComponentPart();
}