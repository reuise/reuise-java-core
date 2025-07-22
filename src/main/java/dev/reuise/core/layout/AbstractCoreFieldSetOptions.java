package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreFieldSetOptions<S extends AbstractCoreFieldSetOptions<S>> implements CoreFieldSetOptions , CoreComponentOptions {
    protected AbstractCoreFieldSetOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getLabel() {
        return ((String) (getOptionValue("label")));
    }

    @Override
    public ComponentOption<String> getLabelOption() {
        return ((ComponentOption<String>) (getOption("label")));
    }

    @Override
    public S setLabel(String label) {
        setOption("label", label);
        return self();
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
    }

    protected abstract S self();
}