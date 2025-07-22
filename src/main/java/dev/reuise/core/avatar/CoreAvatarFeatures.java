package dev.reuise.core.avatar;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
public interface CoreAvatarFeatures {
    String getUrl();

    CoreAvatarFeatures setUrl(String url);

    String getDisplayName();

    CoreAvatarFeatures setDisplayName(String displayName);

    AvatarSize getSize();

    CoreAvatarFeatures setSize(AvatarSize size);

    CoreAvatarFeatures setSize(AvatarSize size, State state);

    CoreAvatarFeatures setSizeAllStates(AvatarSize size);

    CoreAvatarFeatures setSize(ScreenSizeValues<AvatarSize> size);

    AvatarSize getSize(State state);

    AvatarShape getShape();

    CoreAvatarFeatures setShape(AvatarShape shape);

    boolean isBadgeVisible();

    CoreAvatarFeatures setBadgeVisible(Boolean badgeVisible);
}