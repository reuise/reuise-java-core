package dev.reuise.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
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

    protected abstract S self();
}