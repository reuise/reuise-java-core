package dev.reuise.core.scrollablecontainer;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreScrollableContainerScrollAreaPartOptions {
    ScrollDirection getScrollDirection();

    ComponentOption<ScrollDirection> getScrollDirectionOption();

    CoreScrollableContainerScrollAreaPartOptions setScrollDirection(ScrollDirection scrollDirection);

    ScrollableContainerFadeOptions getFadeOptions();

    ComponentOption<ScrollableContainerFadeOptions> getFadeOptionsOption();

    CoreScrollableContainerScrollAreaPartOptions setFadeOptions(ScrollableContainerFadeOptions fadeOptions);

    Integer getBorderRadius();

    ComponentOption<Integer> getBorderRadiusOption();

    CoreScrollableContainerScrollAreaPartOptions setBorderRadius(Integer borderRadius);

    String getFillColor();

    ComponentOption<String> getFillColorOption();

    CoreScrollableContainerScrollAreaPartOptions setFillColor(String fillColor);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getScrollAreaTopFadeOptions();

    CoreScrollableContainerScrollAreaPartOptions setScrollAreaTopFadeOptions(CoreContainerOptions scrollAreaTopFadeOptions);

    boolean hasScrollAreaTopFadeOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrollAreaTopFadeCreator();

    CoreContainerOptions getScrollAreaLeftFadeOptions();

    CoreScrollableContainerScrollAreaPartOptions setScrollAreaLeftFadeOptions(CoreContainerOptions scrollAreaLeftFadeOptions);

    boolean hasScrollAreaLeftFadeOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrollAreaLeftFadeCreator();

    CoreContainerOptions getScrollAreaContentOptions();

    CoreScrollableContainerScrollAreaPartOptions setScrollAreaContentOptions(CoreContainerOptions scrollAreaContentOptions);

    boolean hasScrollAreaContentOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrollAreaContentCreator();

    CoreContainerOptions getScrollAreaBottomFadeOptions();

    CoreScrollableContainerScrollAreaPartOptions setScrollAreaBottomFadeOptions(CoreContainerOptions scrollAreaBottomFadeOptions);

    boolean hasScrollAreaBottomFadeOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrollAreaBottomFadeCreator();

    CoreContainerOptions getScrollAreaRightFadeOptions();

    CoreScrollableContainerScrollAreaPartOptions setScrollAreaRightFadeOptions(CoreContainerOptions scrollAreaRightFadeOptions);

    boolean hasScrollAreaRightFadeOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getScrollAreaRightFadeCreator();

    CoreComponentFactory getComponentFactory();

    CoreScrollableContainerScrollArea getComponent();
}