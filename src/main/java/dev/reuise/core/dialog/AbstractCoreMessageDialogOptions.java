package dev.reuise.core.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonPartOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.layout.CoreFlexContainerPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreHeadingPartOptions;
public abstract class AbstractCoreMessageDialogOptions<S extends AbstractCoreMessageDialogOptions<S>> implements CoreComponentOptions , CoreMessageDialogOptions {
    // Indirect layout child
    private CoreContainerPartOptions containerOptions;

    // Indirect layout child
    private CoreContainerPartOptions headerOptions;

    // Indirect layout child
    private CoreHeadingPartOptions titleHeadingOptions;

    // Indirect layout child
    private CoreFlexContainerPartOptions bodyOptions;

    // Indirect layout child
    private CoreFlexContainerPartOptions footerOptions;

    // Indirect layout child
    private CoreContainerPartOptions scrimOptions;

    // Indirect layout child
    private CoreButtonPartOptions acceptButtonOptions;

    // Indirect layout child
    private CoreButtonPartOptions cancelButtonOptions;

    protected AbstractCoreMessageDialogOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        containerOptions = getContainerOptions();
        headerOptions = getHeaderOptions();
        titleHeadingOptions = getTitleHeadingOptions();
        bodyOptions = getBodyOptions();
        footerOptions = getFooterOptions();
        scrimOptions = getScrimOptions();
        acceptButtonOptions = getAcceptButtonOptions();
        cancelButtonOptions = getCancelButtonOptions();
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getText() {
        return ((String) (getOptionValue("text")));
    }

    @Override
    public ComponentOption<String> getTextOption() {
        return ((ComponentOption<String>) (getOption("text")));
    }

    @Override
    public S setText(String text) {
        setOption("text", text);
        return self();
    }

    private void setDefaultText(String text) {
        setDefaultOption("text", text);
    }

    protected abstract S self();
}