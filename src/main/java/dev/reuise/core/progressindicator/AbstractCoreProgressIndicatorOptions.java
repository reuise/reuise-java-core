package dev.reuise.core.progressindicator;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreProgressIndicatorOptions<S extends AbstractCoreProgressIndicatorOptions<S>> implements CoreProgressIndicatorOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions trackOptions;

    protected AbstractCoreProgressIndicatorOptions() {
        trackOptions = createDefaultTrackOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultLayout(ProgressIndicatorLayout.CIRCULAR);
        setDefaultTiming(ProgressIndicatorTiming.DETERMINATE);
        setDefaultProgress(0);
        setDefaultStarted(false);
        setDefaultVisibilityBehaviour(ProgressIndicatorVisibilityBehaviour.STARTED);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public ProgressIndicatorLayout getLayout() {
        return ((ProgressIndicatorLayout) (getOptionValue("layout")));
    }

    @Override
    public ComponentOption<ProgressIndicatorLayout> getLayoutOption() {
        return ((ComponentOption<ProgressIndicatorLayout>) (getOption("layout")));
    }

    @Override
    public S setLayout(ProgressIndicatorLayout layout) {
        setOption("layout", layout);
        setLayoutChildrenLayout(layout);
        return self();
    }

    protected void setLayoutChildrenLayout(ProgressIndicatorLayout layout) {
    }

    private void setDefaultLayout(ProgressIndicatorLayout layout) {
        setDefaultOption("layout", layout);
        setLayoutChildrenLayout(layout);
    }

    @Override
    public ProgressIndicatorTiming getTiming() {
        return ((ProgressIndicatorTiming) (getOptionValue("timing")));
    }

    @Override
    public ComponentOption<ProgressIndicatorTiming> getTimingOption() {
        return ((ComponentOption<ProgressIndicatorTiming>) (getOption("timing")));
    }

    @Override
    public S setTiming(ProgressIndicatorTiming timing) {
        setOption("timing", timing);
        setLayoutChildrenTiming(timing);
        return self();
    }

    protected void setLayoutChildrenTiming(ProgressIndicatorTiming timing) {
    }

    private void setDefaultTiming(ProgressIndicatorTiming timing) {
        setDefaultOption("timing", timing);
        setLayoutChildrenTiming(timing);
    }

    @Override
    public Integer getProgress() {
        return ((Integer) (getOptionValue("progress")));
    }

    @Override
    public ComponentOption<Integer> getProgressOption() {
        return ((ComponentOption<Integer>) (getOption("progress")));
    }

    @Override
    public S setProgress(Integer progress) {
        setOption("progress", progress);
        setLayoutChildrenProgress(progress);
        return self();
    }

    protected void setLayoutChildrenProgress(Integer progress) {
    }

    private void setDefaultProgress(Integer progress) {
        setDefaultOption("progress", progress);
        setLayoutChildrenProgress(progress);
    }

    @Override
    public boolean isStarted() {
        return Boolean.TRUE.equals(getOptionValue("started"));
    }

    @Override
    public ComponentOption<Boolean> getStartedOption() {
        return ((ComponentOption<Boolean>) (getOption("started")));
    }

    @Override
    public S setStarted(Boolean started) {
        setOption("started", started);
        setLayoutChildrenStarted(started);
        return self();
    }

    protected void setLayoutChildrenStarted(Boolean started) {
    }

    private void setDefaultStarted(Boolean started) {
        setDefaultOption("started", started);
        setLayoutChildrenStarted(started);
    }

    @Override
    public ProgressIndicatorVisibilityBehaviour getVisibilityBehaviour() {
        return ((ProgressIndicatorVisibilityBehaviour) (getOptionValue("visibilityBehaviour")));
    }

    @Override
    public ComponentOption<ProgressIndicatorVisibilityBehaviour> getVisibilityBehaviourOption() {
        return ((ComponentOption<ProgressIndicatorVisibilityBehaviour>) (getOption("visibilityBehaviour")));
    }

    @Override
    public S setVisibilityBehaviour(ProgressIndicatorVisibilityBehaviour visibilityBehaviour) {
        setOption("visibilityBehaviour", visibilityBehaviour);
        setLayoutChildrenVisibilityBehaviour(visibilityBehaviour);
        return self();
    }

    protected void setLayoutChildrenVisibilityBehaviour(ProgressIndicatorVisibilityBehaviour visibilityBehaviour) {
    }

    private void setDefaultVisibilityBehaviour(ProgressIndicatorVisibilityBehaviour visibilityBehaviour) {
        setDefaultOption("visibilityBehaviour", visibilityBehaviour);
        setLayoutChildrenVisibilityBehaviour(visibilityBehaviour);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getTrackOptions() {
        return trackOptions;
    }

    @Override
    public boolean hasTrackOptions() {
        return trackOptions != null;
    }

    @Override
    public S setTrackOptions(dev.reuise.core.layout.CoreContainerOptions trackOptions) {
        if (!hasTrackOptions())
            this.trackOptions = createDefaultTrackOptions();

        // Merge with default options
        this.trackOptions.merge(trackOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultTrackOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}