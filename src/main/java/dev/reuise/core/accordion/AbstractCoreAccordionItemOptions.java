package dev.reuise.core.accordion;
import dev.reuise.core.CoreComponentOptions;
public abstract class AbstractCoreAccordionItemOptions<S extends AbstractCoreAccordionItemOptions<S>> implements CoreAccordionItemOptions , CoreComponentOptions {
    protected AbstractCoreAccordionItemOptions() {
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
