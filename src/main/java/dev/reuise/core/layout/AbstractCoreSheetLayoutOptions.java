package dev.reuise.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerPartOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelPartOptions;
public abstract class AbstractCoreSheetLayoutOptions<S extends AbstractCoreSheetLayoutOptions<S>> implements CoreSheetLayoutOptions , CoreComponentOptions {
    // Indirect layout child
    private CoreContainerPartOptions containerOptions;

    // Indirect layout child
    private CoreSplitContainerPanelPartOptions startPanelOptions;

    // Indirect layout child
    private CoreSplitContainerDividerPartOptions dividerOptions;

    // Indirect layout child
    private CoreSplitContainerPanelPartOptions endPanelOptions;

    protected AbstractCoreSheetLayoutOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        containerOptions = getContainerOptions();
        startPanelOptions = getStartPanelOptions();
        dividerOptions = getDividerOptions();
        endPanelOptions = getEndPanelOptions();
        return true;
    }

    public void onInitialize() {
    }

    protected abstract S self();
}