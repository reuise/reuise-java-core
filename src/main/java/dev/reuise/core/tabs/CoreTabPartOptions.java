package dev.reuise.core.tabs;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.badge.CoreBadge;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineText;
import dev.reuise.core.text.CoreInlineTextOptions;
public interface CoreTabPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreTabPartOptions setLabel(String label);

    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreTabPartOptions setUrl(String url);

    boolean isBadgeVisible();

    ComponentOption<Boolean> getBadgeVisibleOption();

    CoreTabPartOptions setBadgeVisible(Boolean badgeVisible);

    String getBadgeLabel();

    ComponentOption<String> getBadgeLabelOption();

    CoreTabPartOptions setBadgeLabel(String badgeLabel);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreLinkOptions getLinkOptions();

    CoreLinkOptions getOrCreateLinkOptions();

    CoreTabPartOptions setLinkOptions(CoreLinkOptions linkOptions);

    boolean hasLinkOptions();

    ComponentCreator<? extends CoreLink, ? extends CoreLinkOptions> getLinkCreator();

    CoreBadgeOptions getBadgeOptions();

    CoreTabPartOptions setBadgeOptions(CoreBadgeOptions badgeOptions);

    boolean hasBadgeOptions();

    ComponentCreator<? extends CoreBadge, ? extends CoreBadgeOptions> getBadgeCreator();

    CoreIconOptions getIconOptions();

    CoreTabPartOptions setIconOptions(CoreIconOptions iconOptions);

    boolean hasIconOptions();

    ComponentCreator<? extends CoreIcon, ? extends CoreIconOptions> getIconCreator();

    CoreInlineTextOptions getLabelContainerOptions();

    CoreTabPartOptions setLabelContainerOptions(CoreInlineTextOptions labelContainerOptions);

    boolean hasLabelContainerOptions();

    ComponentCreator<? extends CoreInlineText, ? extends CoreInlineTextOptions> getLabelContainerCreator();

    CoreComponentFactory getComponentFactory();

    CoreTab getComponent();
}