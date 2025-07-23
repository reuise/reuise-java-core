package dev.reuise.core.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.ButtonType;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.layout.FlexDirection;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreHeadingOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public abstract class AbstractCoreDialogOptions<S extends AbstractCoreDialogOptions<S>> implements CoreDialogOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions containerOptions;

    protected dev.reuise.core.layout.CoreContainerOptions headerOptions;

    protected dev.reuise.core.text.CoreHeadingOptions titleHeadingOptions;

    protected dev.reuise.core.layout.CoreFlexContainerOptions bodyOptions;

    protected dev.reuise.core.layout.CoreFlexContainerOptions footerOptions;

    protected dev.reuise.core.layout.CoreContainerOptions scrimOptions;

    protected dev.reuise.core.button.CoreButtonOptions acceptButtonOptions;

    protected dev.reuise.core.button.CoreButtonOptions cancelButtonOptions;

    protected AbstractCoreDialogOptions() {
        containerOptions = createDefaultContainerOptions();
        headerOptions = createDefaultHeaderOptions();
        titleHeadingOptions = createDefaultTitleHeadingOptions();
        bodyOptions = createDefaultBodyOptions();
        footerOptions = createDefaultFooterOptions();
        scrimOptions = createDefaultScrimOptions();
        acceptButtonOptions = createDefaultAcceptButtonOptions();
        cancelButtonOptions = createDefaultCancelButtonOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultRemoveOnClose(true);
        setDefaultModal(false);
        setDefaultActions(new ArrayList<>());
        setDefaultHasAcceptButton(true);
        setDefaultHasCancelButton(true);
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
        setLayoutChildrenTitle(title);
        return self();
    }

    protected void setLayoutChildrenTitle(String title) {
        if (titleHeadingOptions == null)
            titleHeadingOptions = createDefaultTitleHeadingOptions();

        titleHeadingOptions.setText(title);
    }

    private void setDefaultTitle(String title) {
        setDefaultOption("title", title);
        setLayoutChildrenTitle(title);
    }

    @Override
    public boolean isOpen() {
        return Boolean.TRUE.equals(getOptionValue("open"));
    }

    @Override
    public ComponentOption<Boolean> getOpenOption() {
        return ((ComponentOption<Boolean>) (getOption("open")));
    }

    @Override
    public S setOpen(Boolean open) {
        setOption("open", open);
        setLayoutChildrenOpen(open);
        return self();
    }

    protected void setLayoutChildrenOpen(Boolean open) {
    }

    private void setDefaultOpen(Boolean open) {
        setDefaultOption("open", open);
        setLayoutChildrenOpen(open);
    }

    @Override
    public DialogSize getSize() {
        return ((DialogSize) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<DialogSize> getSizeOption() {
        return ((ComponentOption<DialogSize>) (getOption("size")));
    }

    @Override
    public S setSize(DialogSize size) {
        setOption("size", size);
        setLayoutChildrenSize(size);
        return self();
    }

    @Override
    public S setSize(DialogSize size, State state) {
        setOption("size", size, state);
        setLayoutChildrenSize(size, state);
        return self();
    }

    @Override
    public S setSizeAllStates(DialogSize size) {
        // HIMADDIE!!
        clearOptionStates("size");
        setSize(size);
        setLayoutChildrenSize(size);
        return self();
    }

    @Override
    public S setSize(ScreenSizeValues<DialogSize> screenValues) {
        clearOption("size", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,DialogSize v) -> setSize(v, s));
        setLayoutChildrenSize(screenValues);
        return self();
    }

    @Override
    public DialogSize getSize(State state) {
        return ((DialogSize) (getOptionValue("size", state)));
    }

    @Override
    public Collection<State> getSizeStates() {
        return getOptionStates("size");
    }

    @Override
    public ComponentOption<DialogSize> getSizeOption(State state) {
        return ((ComponentOption<DialogSize>) (getOption("size", state)));
    }

    protected void setLayoutChildrenSize(DialogSize size) {
    }

    protected void setLayoutChildrenSize(DialogSize size, State state) {
    }

    protected void setLayoutChildrenSize(ScreenSizeValues<DialogSize> size) {
    }

    private void setDefaultSize(DialogSize size) {
        setDefaultOption("size", size);
        setLayoutChildrenSize(size);
    }

    private void setDefaultSize(DialogSize size, State state) {
        setDefaultOption("size", size, state);
        setLayoutChildrenSize(size, state);
    }

    private void setDefaultSizeAllStates(DialogSize size) {
        // HIMADDIE!!
        clearOptionStates("size");
        setSize(size);
        setLayoutChildrenSize(size);
    }

    @Override
    public boolean isRemoveOnClose() {
        return Boolean.TRUE.equals(getOptionValue("removeOnClose"));
    }

    @Override
    public ComponentOption<Boolean> getRemoveOnCloseOption() {
        return ((ComponentOption<Boolean>) (getOption("removeOnClose")));
    }

    @Override
    public S setRemoveOnClose(Boolean removeOnClose) {
        setOption("removeOnClose", removeOnClose);
        setLayoutChildrenRemoveOnClose(removeOnClose);
        return self();
    }

    protected void setLayoutChildrenRemoveOnClose(Boolean removeOnClose) {
    }

    private void setDefaultRemoveOnClose(Boolean removeOnClose) {
        setDefaultOption("removeOnClose", removeOnClose);
        setLayoutChildrenRemoveOnClose(removeOnClose);
    }

    @Override
    public boolean isModal() {
        return Boolean.TRUE.equals(getOptionValue("modal"));
    }

    @Override
    public ComponentOption<Boolean> getModalOption() {
        return ((ComponentOption<Boolean>) (getOption("modal")));
    }

    @Override
    public S setModal(Boolean modal) {
        setOption("modal", modal);
        setLayoutChildrenModal(modal);
        return self();
    }

    protected void setLayoutChildrenModal(Boolean modal) {
    }

    private void setDefaultModal(Boolean modal) {
        setDefaultOption("modal", modal);
        setLayoutChildrenModal(modal);
    }

    @Override
    public List<CoreButton> getActions() {
        return ((List<CoreButton>) (getOptionValue("actions")));
    }

    @Override
    public ComponentOption<List<CoreButton>> getActionsOption() {
        return ((ComponentOption<List<CoreButton>>) (getOption("actions")));
    }

    @Override
    public S setActions(List<CoreButton> actions) {
        setOption("actions", actions);
        return self();
    }

    @Override
    public S addAction(CoreButton action) {
        List<CoreButton> list = getActions();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setActions(list);
        }
        list.add(action);
        return self();
    }

    @Override
    public S setAction(CoreButton action) {
        setActions(new ArrayList<CoreButton>(Arrays.asList(action)));
        return self();
    }

    @Override
    public S removeAction(CoreButton action) {
        List<CoreButton> list = getActions();
        if (list == null) {
            return self();
        }
        list.remove(action);
        return self();
    }

    private void setDefaultActions(List<CoreButton> actions) {
        setDefaultOption("actions", actions);
    }

    @Override
    public boolean isHasAcceptButton() {
        return Boolean.TRUE.equals(getOptionValue("hasAcceptButton"));
    }

    @Override
    public ComponentOption<Boolean> getHasAcceptButtonOption() {
        return ((ComponentOption<Boolean>) (getOption("hasAcceptButton")));
    }

    @Override
    public S setHasAcceptButton(Boolean hasAcceptButton) {
        setOption("hasAcceptButton", hasAcceptButton, true);
        setLayoutChildrenHasAcceptButton(hasAcceptButton);
        return self();
    }

    protected void setLayoutChildrenHasAcceptButton(Boolean hasAcceptButton) {
    }

    private void setDefaultHasAcceptButton(Boolean hasAcceptButton) {
        setDefaultOption("hasAcceptButton", hasAcceptButton, true);
        setLayoutChildrenHasAcceptButton(hasAcceptButton);
    }

    @Override
    public boolean isHasCancelButton() {
        return Boolean.TRUE.equals(getOptionValue("hasCancelButton"));
    }

    @Override
    public ComponentOption<Boolean> getHasCancelButtonOption() {
        return ((ComponentOption<Boolean>) (getOption("hasCancelButton")));
    }

    @Override
    public S setHasCancelButton(Boolean hasCancelButton) {
        setOption("hasCancelButton", hasCancelButton, true);
        setLayoutChildrenHasCancelButton(hasCancelButton);
        return self();
    }

    protected void setLayoutChildrenHasCancelButton(Boolean hasCancelButton) {
    }

    private void setDefaultHasCancelButton(Boolean hasCancelButton) {
        setDefaultOption("hasCancelButton", hasCancelButton, true);
        setLayoutChildrenHasCancelButton(hasCancelButton);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getContainerOptions() {
        return containerOptions;
    }

    @Override
    public boolean hasContainerOptions() {
        return containerOptions != null;
    }

    @Override
    public S setContainerOptions(dev.reuise.core.layout.CoreContainerOptions containerOptions) {
        if (!hasContainerOptions())
            this.containerOptions = createDefaultContainerOptions();

        // Merge with default options
        this.containerOptions.merge(containerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getHeaderOptions() {
        return headerOptions;
    }

    @Override
    public boolean hasHeaderOptions() {
        return headerOptions != null;
    }

    @Override
    public S setHeaderOptions(dev.reuise.core.layout.CoreContainerOptions headerOptions) {
        if (!hasHeaderOptions())
            this.headerOptions = createDefaultHeaderOptions();

        // Merge with default options
        this.headerOptions.merge(headerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreHeadingOptions getTitleHeadingOptions() {
        return titleHeadingOptions;
    }

    @Override
    public boolean hasTitleHeadingOptions() {
        return titleHeadingOptions != null;
    }

    @Override
    public S setTitleHeadingOptions(dev.reuise.core.text.CoreHeadingOptions titleHeadingOptions) {
        if (!hasTitleHeadingOptions())
            this.titleHeadingOptions = createDefaultTitleHeadingOptions();

        // Merge with default options
        this.titleHeadingOptions.merge(titleHeadingOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getBodyOptions() {
        return bodyOptions;
    }

    @Override
    public boolean hasBodyOptions() {
        return bodyOptions != null;
    }

    @Override
    public S setBodyOptions(dev.reuise.core.layout.CoreFlexContainerOptions bodyOptions) {
        if (!hasBodyOptions())
            this.bodyOptions = createDefaultBodyOptions();

        // Merge with default options
        this.bodyOptions.merge(bodyOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getFooterOptions() {
        return footerOptions;
    }

    @Override
    public boolean hasFooterOptions() {
        return footerOptions != null;
    }

    @Override
    public S setFooterOptions(dev.reuise.core.layout.CoreFlexContainerOptions footerOptions) {
        if (!hasFooterOptions())
            this.footerOptions = createDefaultFooterOptions();

        // Merge with default options
        this.footerOptions.merge(footerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getScrimOptions() {
        return scrimOptions;
    }

    @Override
    public boolean hasScrimOptions() {
        return scrimOptions != null;
    }

    @Override
    public S setScrimOptions(dev.reuise.core.layout.CoreContainerOptions scrimOptions) {
        if (!hasScrimOptions())
            this.scrimOptions = createDefaultScrimOptions();

        // Merge with default options
        this.scrimOptions.merge(scrimOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getAcceptButtonOptions() {
        return acceptButtonOptions;
    }

    @Override
    public boolean hasAcceptButtonOptions() {
        return acceptButtonOptions != null;
    }

    @Override
    public S setAcceptButtonOptions(dev.reuise.core.button.CoreButtonOptions acceptButtonOptions) {
        if (!hasAcceptButtonOptions())
            this.acceptButtonOptions = createDefaultAcceptButtonOptions();

        // Merge with default options
        this.acceptButtonOptions.merge(acceptButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getCancelButtonOptions() {
        return cancelButtonOptions;
    }

    @Override
    public boolean hasCancelButtonOptions() {
        return cancelButtonOptions != null;
    }

    @Override
    public S setCancelButtonOptions(dev.reuise.core.button.CoreButtonOptions cancelButtonOptions) {
        if (!hasCancelButtonOptions())
            this.cancelButtonOptions = createDefaultCancelButtonOptions();

        // Merge with default options
        this.cancelButtonOptions.merge(cancelButtonOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultHeaderOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreHeadingOptions createDefaultTitleHeadingOptions() {
        CoreHeadingOptions options = getComponentFactory().createHeadingOptions();
        options.setLevel(2);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreFlexContainerOptions createDefaultBodyOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setDirection(FlexDirection.COLUMN);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreFlexContainerOptions createDefaultFooterOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setDirection(FlexDirection.ROW);
        options.setGap(16);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultScrimOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultAcceptButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setLabel("Accept");
        options.setType(ButtonType.PRIMARY);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultCancelButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setLabel("Cancel");
        options.setType(ButtonType.SECONDARY);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}