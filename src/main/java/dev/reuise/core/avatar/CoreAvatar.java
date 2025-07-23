package dev.reuise.core.avatar;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreAvatar extends CoreComponent , CoreParentComponent , CoreAvatarPart {
    CoreAvatar getComponent();
}