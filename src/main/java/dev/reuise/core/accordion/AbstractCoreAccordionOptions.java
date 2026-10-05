package dev.reuise.core.accordion;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreAccordionOptions<S extends AbstractCoreAccordionOptions<S>> implements CoreAccordionOptions , CoreComponentOptions {
    protected AbstractCoreAccordionOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    protected abstract S self();
}