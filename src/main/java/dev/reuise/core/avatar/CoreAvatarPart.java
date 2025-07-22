package dev.reuise.core.avatar;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.badge.CoreBadge;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreAvatarPart extends CoreAvatarFeatures , ComponentPart , CoreParentComponentPart {
    CoreImage getImage();

    CoreBadge getBadge();

    CoreParentComponentPart getParentComponentPart();
}