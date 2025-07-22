package dev.reuise.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.checkbox.CoreCheckboxPartOptions;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.link.CoreLinkPartOptions;
import dev.reuise.core.text.CoreInlineTextPartOptions;
public abstract class AbstractCoreMenuDividerOptions<S extends AbstractCoreMenuDividerOptions<S>> implements CoreMenuDividerOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreLinkPartOptions linkOptions;

    // Indirect layout child
    private CoreCheckboxPartOptions checkboxOptions;

    // Indirect layout child
    private CoreIconPartOptions startIconOptions;

    // Indirect layout child
    private CoreContainerPartOptions textContainerOptions;

    // Indirect layout child
    private CoreInlineTextPartOptions labelContainerOptions;

    // Indirect layout child
    private CoreInlineTextPartOptions secondaryLabelContainerOptions;

    // Indirect layout child
    private CoreIconPartOptions endIconOptions;

    protected AbstractCoreMenuDividerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        linkOptions = getLinkOptions();
        checkboxOptions = getCheckboxOptions();
        startIconOptions = getStartIconOptions();
        textContainerOptions = getTextContainerOptions();
        labelContainerOptions = getLabelContainerOptions();
        secondaryLabelContainerOptions = getSecondaryLabelContainerOptions();
        endIconOptions = getEndIconOptions();
        return true;
    }

    public void onInitialize() {
    }

    protected abstract S self();
}