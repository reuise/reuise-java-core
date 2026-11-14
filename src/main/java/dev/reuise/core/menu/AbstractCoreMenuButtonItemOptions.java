package dev.reuise.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.text.CoreInlineTextPartOptions;
public abstract class AbstractCoreMenuButtonItemOptions<S extends AbstractCoreMenuButtonItemOptions<S>> implements CoreMenuButtonItemOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreIconPartOptions startIconOptions;

    // Indirect layout child
    private CoreInlineTextPartOptions labelContainerOptions;

    // Indirect layout child
    private CoreIconPartOptions endIconOptions;

    protected AbstractCoreMenuButtonItemOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        startIconOptions = getStartIconOptions();
        labelContainerOptions = getLabelContainerOptions();
        endIconOptions = getEndIconOptions();
        return true;
    }

    public void onInitialize() {
    }

    protected abstract S self();
}
