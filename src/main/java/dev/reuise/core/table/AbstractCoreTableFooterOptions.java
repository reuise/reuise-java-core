package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreTableFooterOptions<S extends AbstractCoreTableFooterOptions<S>> implements CoreTableFooterOptions , CoreComponentOptions {
    protected AbstractCoreTableFooterOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultFixed(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isFixed() {
        return Boolean.TRUE.equals(getOptionValue("fixed"));
    }

    @Override
    public ComponentOption<Boolean> getFixedOption() {
        return ((ComponentOption<Boolean>) (getOption("fixed")));
    }

    @Override
    public S setFixed(Boolean fixed) {
        setOption("fixed", fixed);
        return self();
    }

    private void setDefaultFixed(Boolean fixed) {
        setDefaultOption("fixed", fixed);
    }

    protected abstract S self();
}