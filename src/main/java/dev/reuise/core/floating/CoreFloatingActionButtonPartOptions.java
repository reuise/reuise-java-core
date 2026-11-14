package dev.reuise.core.floating;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
public interface CoreFloatingActionButtonPartOptions {
    String getAccessibleLabel();

    ComponentOption<String> getAccessibleLabelOption();

    CoreFloatingActionButtonPartOptions setAccessibleLabel(String accessibleLabel);

    String getCorner();

    ComponentOption<String> getCornerOption();

    CoreFloatingActionButtonPartOptions setCorner(String corner);

    Integer getUnreadCount();

    ComponentOption<Integer> getUnreadCountOption();

    CoreFloatingActionButtonPartOptions setUnreadCount(Integer unreadCount);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreInlineTextOptions getBadgeOptions();

    CoreFloatingActionButtonPartOptions setBadgeOptions(CoreInlineTextOptions badgeOptions);

    boolean hasBadgeOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getBadgeCreator();

    CoreComponentFactory getComponentFactory();

    CoreFloatingActionButton getComponent();
}
