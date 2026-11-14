package dev.reuise.core.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreNavigationLinkOptions<S extends AbstractCoreNavigationLinkOptions<S>> implements CoreNavigationLinkOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreIconPartOptions startIconOptions;

    // Indirect layout child
    private CoreIconPartOptions endIconOptions;

    protected AbstractCoreNavigationLinkOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        startIconOptions = getStartIconOptions();
        endIconOptions = getEndIconOptions();
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isActive() {
        return Boolean.TRUE.equals(getOptionValue("active"));
    }

    @Override
    public ComponentOption<Boolean> getActiveOption() {
        return ((ComponentOption<Boolean>) (getOption("active")));
    }

    @Override
    public S setActive(Boolean active) {
        setOption("active", active);
        return self();
    }

    private void setDefaultActive(Boolean active) {
        setDefaultOption("active", active);
    }

    protected abstract S self();
}
