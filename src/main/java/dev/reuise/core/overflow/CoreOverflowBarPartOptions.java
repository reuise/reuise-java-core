package dev.reuise.core.overflow;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.menu.CoreMenuButton;
import dev.reuise.core.menu.CoreMenuButtonOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreOverflowBarPartOptions {
    String getMoreLabel();

    ComponentOption<String> getMoreLabelOption();

    CoreOverflowBarPartOptions setMoreLabel(String moreLabel);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreFlexContainerOptions getItemsOptions();

    CoreOverflowBarPartOptions setItemsOptions(CoreFlexContainerOptions itemsOptions);

    boolean hasItemsOptions();

    ComponentCreator<? extends CoreFlexContainer, ? extends CoreFlexContainerOptions> getItemsCreator();

    CoreMenuButtonOptions getOverflowMenuOptions();

    CoreOverflowBarPartOptions setOverflowMenuOptions(CoreMenuButtonOptions overflowMenuOptions);

    boolean hasOverflowMenuOptions();

    ComponentCreator<? extends CoreMenuButton, ? extends CoreMenuButtonOptions> getOverflowMenuCreator();

    CoreComponentFactory getComponentFactory();

    CoreOverflowBar getComponent();
}
