package dev.reuise.core.progressindicator;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
public interface CoreProgressIndicatorPartOptions {
    ProgressIndicatorLayout getLayout();

    ComponentOption<ProgressIndicatorLayout> getLayoutOption();

    CoreProgressIndicatorPartOptions setLayout(ProgressIndicatorLayout layout);

    ProgressIndicatorTiming getTiming();

    ComponentOption<ProgressIndicatorTiming> getTimingOption();

    CoreProgressIndicatorPartOptions setTiming(ProgressIndicatorTiming timing);

    Integer getProgress();

    ComponentOption<Integer> getProgressOption();

    CoreProgressIndicatorPartOptions setProgress(Integer progress);

    boolean isStarted();

    ComponentOption<Boolean> getStartedOption();

    CoreProgressIndicatorPartOptions setStarted(Boolean started);

    ProgressIndicatorVisibilityBehaviour getVisibilityBehaviour();

    ComponentOption<ProgressIndicatorVisibilityBehaviour> getVisibilityBehaviourOption();

    CoreProgressIndicatorPartOptions setVisibilityBehaviour(ProgressIndicatorVisibilityBehaviour visibilityBehaviour);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreContainerOptions getTrackOptions();

    CoreProgressIndicatorPartOptions setTrackOptions(CoreContainerOptions trackOptions);

    boolean hasTrackOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getTrackCreator();

    CoreComponentFactory getComponentFactory();

    CoreProgressIndicator getComponent();
}