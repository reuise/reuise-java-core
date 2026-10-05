package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
public abstract class AbstractCoreHeadingOptions<S extends AbstractCoreHeadingOptions<S>> implements CoreHeadingOptions , CoreComponentOptions {
    protected AbstractCoreHeadingOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultLevel(1);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Integer getLevel() {
        return ((Integer) (getOptionValue("level")));
    }

    @Override
    public ComponentOption<Integer> getLevelOption() {
        return ((ComponentOption<Integer>) (getOption("level")));
    }

    @Override
    public S setLevel(Integer level) {
        setOption("level", level);
        return self();
    }

    private void setDefaultLevel(Integer level) {
        setDefaultOption("level", level);
    }

    @Override
    public boolean isLoading() {
        return Boolean.TRUE.equals(getOptionValue("loading"));
    }

    @Override
    public ComponentOption<Boolean> getLoadingOption() {
        return ((ComponentOption<Boolean>) (getOption("loading")));
    }

    @Override
    public S setLoading(Boolean loading) {
        setOption("loading", loading);
        return self();
    }

    private void setDefaultLoading(Boolean loading) {
        setDefaultOption("loading", loading);
    }

    @Override
    public CoreSkeletonOptions getSkeletonOptions() {
        return ((CoreSkeletonOptions) (getOptionValue("skeletonOptions")));
    }

    @Override
    public ComponentOption<CoreSkeletonOptions> getSkeletonOptionsOption() {
        return ((ComponentOption<CoreSkeletonOptions>) (getOption("skeletonOptions")));
    }

    @Override
    public S setSkeletonOptions(CoreSkeletonOptions skeletonOptions) {
        setOption("skeletonOptions", skeletonOptions);
        return self();
    }

    private void setDefaultSkeletonOptions(CoreSkeletonOptions skeletonOptions) {
        setDefaultOption("skeletonOptions", skeletonOptions);
    }

    protected abstract S self();
}