package dev.reuise.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreViewOptions<S extends AbstractCoreViewOptions<S>> implements CoreViewOptions , CoreComponentOptions {
    protected AbstractCoreViewOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getTitle() {
        return ((String) (getOptionValue("title")));
    }

    @Override
    public ComponentOption<String> getTitleOption() {
        return ((ComponentOption<String>) (getOption("title")));
    }

    @Override
    public S setTitle(String title) {
        setOption("title", title);
        return self();
    }

    private void setDefaultTitle(String title) {
        setDefaultOption("title", title);
    }

    protected abstract S self();
}