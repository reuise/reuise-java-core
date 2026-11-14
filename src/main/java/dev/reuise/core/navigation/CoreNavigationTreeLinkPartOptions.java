package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.list.CoreListItem;
import dev.reuise.core.list.CoreListItemOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreNavigationTreeLinkPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreNavigationTreeLinkPartOptions setLabel(String label);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreListItemOptions getItemOptions();

    CoreNavigationTreeLinkPartOptions setItemOptions(CoreListItemOptions itemOptions);

    boolean hasItemOptions();

    ComponentCreator<? extends CoreListItem, ? extends CoreListItemOptions> getItemCreator();

    CoreComponentFactory getComponentFactory();

    CoreNavigationTreeLink getComponent();
}
