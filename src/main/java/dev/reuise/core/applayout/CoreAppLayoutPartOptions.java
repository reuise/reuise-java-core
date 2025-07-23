package dev.reuise.core.applayout;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.bottomappbar.CoreBottomAppBar;
import dev.reuise.core.drawer.CoreDrawer;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.splitcontainer.CoreSplitContainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerOptions;
import dev.reuise.core.topappbar.CoreTopAppBar;
public interface CoreAppLayoutPartOptions {
    CoreTopAppBar getTopAppBar();

    ComponentOption<CoreTopAppBar> getTopAppBarOption();

    CoreAppLayoutPartOptions setTopAppBar(CoreTopAppBar topAppBar);

    CoreBottomAppBar getBottomAppBar();

    ComponentOption<CoreBottomAppBar> getBottomAppBarOption();

    CoreAppLayoutPartOptions setBottomAppBar(CoreBottomAppBar bottomAppBar);

    CoreDrawer getDrawer();

    ComponentOption<CoreDrawer> getDrawerOption();

    CoreAppLayoutPartOptions setDrawer(CoreDrawer drawer);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getDrawerScrimOptions();

    CoreAppLayoutPartOptions setDrawerScrimOptions(CoreContainerOptions drawerScrimOptions);

    boolean hasDrawerScrimOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getDrawerScrimCreator();

    CoreSplitContainerOptions getDrawerSplitOptions();

    CoreAppLayoutPartOptions setDrawerSplitOptions(CoreSplitContainerOptions drawerSplitOptions);

    boolean hasDrawerSplitOptions();

    ComponentCreator<? extends CoreSplitContainer, ? extends CoreSplitContainerOptions> getDrawerSplitCreator();

    CoreSplitContainerOptions getTopAppBarSplitOptions();

    CoreAppLayoutPartOptions setTopAppBarSplitOptions(CoreSplitContainerOptions topAppBarSplitOptions);

    boolean hasTopAppBarSplitOptions();

    ComponentCreator<? extends CoreSplitContainer, ? extends CoreSplitContainerOptions> getTopAppBarSplitCreator();

    CoreAppLayoutBodyOptions getBodyOptions();

    CoreAppLayoutPartOptions setBodyOptions(CoreAppLayoutBodyOptions bodyOptions);

    boolean hasBodyOptions();

    ComponentCreator<? extends CoreAppLayoutBody, ? extends CoreAppLayoutBodyOptions> getBodyCreator();

    CoreComponentFactory getComponentFactory();

    CoreAppLayout getComponent();
}