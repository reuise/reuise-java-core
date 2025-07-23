package dev.reuise.core.applayout;
import dev.reuise.core.bottomappbar.CoreBottomAppBar;
import dev.reuise.core.drawer.CoreDrawer;
import dev.reuise.core.topappbar.CoreTopAppBar;
public interface CoreAppLayoutFeatures {
    CoreTopAppBar getTopAppBar();

    CoreAppLayoutFeatures setTopAppBar(CoreTopAppBar topAppBar);

    CoreBottomAppBar getBottomAppBar();

    CoreAppLayoutFeatures setBottomAppBar(CoreBottomAppBar bottomAppBar);

    CoreDrawer getDrawer();

    CoreAppLayoutFeatures setDrawer(CoreDrawer drawer);
}