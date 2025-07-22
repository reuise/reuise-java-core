package dev.reuise.core.slidecontainer;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreSlideContainerPartOptions {
    SlideDirection getSlideDirection();

    ComponentOption<SlideDirection> getSlideDirectionOption();

    CoreSlideContainerPartOptions setSlideDirection(SlideDirection slideDirection);

    boolean isShowSlideBars();

    ComponentOption<Boolean> getShowSlideBarsOption();

    CoreSlideContainerPartOptions setShowSlideBars(Boolean showSlideBars);

    SlideContainerSlideButtonOptions getSlideButtonOptions();

    ComponentOption<SlideContainerSlideButtonOptions> getSlideButtonOptionsOption();

    CoreSlideContainerPartOptions setSlideButtonOptions(SlideContainerSlideButtonOptions slideButtonOptions);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getSlideAreaBeforeOptions();

    CoreSlideContainerPartOptions setSlideAreaBeforeOptions(CoreContainerOptions slideAreaBeforeOptions);

    boolean hasSlideAreaBeforeOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getSlideAreaBeforeCreator();

    CoreContainerOptions getSlideAreaOptions();

    CoreSlideContainerPartOptions setSlideAreaOptions(CoreContainerOptions slideAreaOptions);

    boolean hasSlideAreaOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getSlideAreaCreator();

    CoreContainerOptions getSlideAreaAfterOptions();

    CoreSlideContainerPartOptions setSlideAreaAfterOptions(CoreContainerOptions slideAreaAfterOptions);

    boolean hasSlideAreaAfterOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getSlideAreaAfterCreator();

    CoreComponentFactory getComponentFactory();

    CoreSlideContainer getComponent();
}