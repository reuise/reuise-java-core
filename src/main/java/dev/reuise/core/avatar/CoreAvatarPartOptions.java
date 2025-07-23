package dev.reuise.core.avatar;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.badge.CoreBadge;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public interface CoreAvatarPartOptions {
    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreAvatarPartOptions setUrl(String url);

    String getDisplayName();

    ComponentOption<String> getDisplayNameOption();

    CoreAvatarPartOptions setDisplayName(String displayName);

    AvatarSize getSize();

    ComponentOption<AvatarSize> getSizeOption();

    CoreAvatarPartOptions setSize(AvatarSize size);

    CoreAvatarPartOptions setSize(AvatarSize size, State state);

    CoreAvatarPartOptions setSizeAllStates(AvatarSize size);

    CoreAvatarPartOptions setSize(ScreenSizeValues<AvatarSize> size);

    AvatarSize getSize(State state);

    ComponentOption<AvatarSize> getSizeOption(State state);

    Collection<State> getSizeStates();

    AvatarShape getShape();

    ComponentOption<AvatarShape> getShapeOption();

    CoreAvatarPartOptions setShape(AvatarShape shape);

    boolean isBadgeVisible();

    ComponentOption<Boolean> getBadgeVisibleOption();

    CoreAvatarPartOptions setBadgeVisible(Boolean badgeVisible);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreImageOptions getImageOptions();

    CoreAvatarPartOptions setImageOptions(CoreImageOptions imageOptions);

    boolean hasImageOptions();

    ComponentCreator<? extends CoreImage, ? extends CoreImageOptions> getImageCreator();

    CoreBadgeOptions getBadgeOptions();

    CoreAvatarPartOptions setBadgeOptions(CoreBadgeOptions badgeOptions);

    boolean hasBadgeOptions();

    ComponentCreator<? extends CoreBadge, ? extends CoreBadgeOptions> getBadgeCreator();

    CoreComponentFactory getComponentFactory();

    CoreAvatar getComponent();
}