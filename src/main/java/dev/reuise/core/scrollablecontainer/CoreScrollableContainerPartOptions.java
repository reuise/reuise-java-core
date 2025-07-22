package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreScrollableContainerPartOptions {
    ScrollDirection getScrollDirection();

    ComponentOption<ScrollDirection> getScrollDirectionOption();

    CoreScrollableContainerPartOptions setScrollDirection(ScrollDirection scrollDirection);

    boolean isShowScrollBars();

    ComponentOption<Boolean> getShowScrollBarsOption();

    CoreScrollableContainerPartOptions setShowScrollBars(Boolean showScrollBars);

    ScrollableContainerFadeOptions getScrollAreaFadeOptions();

    ComponentOption<ScrollableContainerFadeOptions> getScrollAreaFadeOptionsOption();

    CoreScrollableContainerPartOptions setScrollAreaFadeOptions(ScrollableContainerFadeOptions scrollAreaFadeOptions);

    Integer getScrollAreaBorderRadius();

    ComponentOption<Integer> getScrollAreaBorderRadiusOption();

    CoreScrollableContainerPartOptions setScrollAreaBorderRadius(Integer scrollAreaBorderRadius);

    String getScrollAreaFillColor();

    ComponentOption<String> getScrollAreaFillColorOption();

    CoreScrollableContainerPartOptions setScrollAreaFillColor(String scrollAreaFillColor);

    ScrollableContainerScrollButtonOptions getScrollButtonOptions();

    ComponentOption<ScrollableContainerScrollButtonOptions> getScrollButtonOptionsOption();

    CoreScrollableContainerPartOptions setScrollButtonOptions(ScrollableContainerScrollButtonOptions scrollButtonOptions);

    ScrollableContainerScrollBehavior getScrollBehavior();

    ComponentOption<ScrollableContainerScrollBehavior> getScrollBehaviorOption();

    CoreScrollableContainerPartOptions setScrollBehavior(ScrollableContainerScrollBehavior scrollBehavior);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getScrollAreaBeforeOptions();

    CoreScrollableContainerPartOptions setScrollAreaBeforeOptions(CoreContainerOptions scrollAreaBeforeOptions);

    boolean hasScrollAreaBeforeOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrollAreaBeforeCreator();

    CoreScrollableContainerScrollAreaOptions getScrollAreaOptions();

    CoreScrollableContainerPartOptions setScrollAreaOptions(CoreScrollableContainerScrollAreaOptions scrollAreaOptions);

    boolean hasScrollAreaOptions();

    ComponentCreator<? extends CoreScrollableContainerScrollArea, ? extends CoreScrollableContainerScrollAreaOptions> getScrollAreaCreator();

    CoreContainerOptions getScrollAreaAfterOptions();

    CoreScrollableContainerPartOptions setScrollAreaAfterOptions(CoreContainerOptions scrollAreaAfterOptions);

    boolean hasScrollAreaAfterOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrollAreaAfterCreator();

    CoreComponentFactory getComponentFactory();

    CoreScrollableContainer getComponent();
}