package dev.reuise.core.consent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.dialog.CoreDialogOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.layout.FlexDirection;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreParagraphOptions;
public abstract class AbstractCoreConsentBannerOptions<S extends AbstractCoreConsentBannerOptions<S>> implements CoreConsentBannerOptions , CoreComponentOptions {
    protected dev.reuise.core.text.CoreParagraphOptions messageParagraphOptions;

    protected dev.reuise.core.layout.CoreFlexContainerOptions actionsOptions;

    protected dev.reuise.core.button.CoreButtonOptions acceptButtonOptions;

    protected dev.reuise.core.button.CoreButtonOptions rejectButtonOptions;

    protected dev.reuise.core.button.CoreButtonOptions preferencesButtonOptions;

    protected dev.reuise.core.dialog.CoreDialogOptions preferencesDialogOptions;

    protected AbstractCoreConsentBannerOptions() {
        messageParagraphOptions = createDefaultMessageParagraphOptions();
        actionsOptions = createDefaultActionsOptions();
        acceptButtonOptions = createDefaultAcceptButtonOptions();
        rejectButtonOptions = createDefaultRejectButtonOptions();
        preferencesButtonOptions = createDefaultPreferencesButtonOptions();
        preferencesDialogOptions = createDefaultPreferencesDialogOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultAcceptLabel("Accept all");
        setDefaultRejectLabel("Reject optional");
        setDefaultPreferencesLabel("Preferences");
        setDefaultPreferencesTitle("Privacy preferences");
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getMessage() {
        return ((String) (getOptionValue("message")));
    }

    @Override
    public ComponentOption<String> getMessageOption() {
        return ((ComponentOption<String>) (getOption("message")));
    }

    @Override
    public S setMessage(String message) {
        setOption("message", message);
        setLayoutChildrenMessage(message);
        return self();
    }

    protected void setLayoutChildrenMessage(String message) {
        if (messageParagraphOptions == null)
            messageParagraphOptions = createDefaultMessageParagraphOptions();

        messageParagraphOptions.setText(message);
    }

    private void setDefaultMessage(String message) {
        setDefaultOption("message", message);
        setLayoutChildrenMessage(message);
    }

    @Override
    public String getAcceptLabel() {
        return ((String) (getOptionValue("acceptLabel")));
    }

    @Override
    public ComponentOption<String> getAcceptLabelOption() {
        return ((ComponentOption<String>) (getOption("acceptLabel")));
    }

    @Override
    public S setAcceptLabel(String acceptLabel) {
        setOption("acceptLabel", acceptLabel);
        setLayoutChildrenAcceptLabel(acceptLabel);
        return self();
    }

    protected void setLayoutChildrenAcceptLabel(String acceptLabel) {
        if (acceptButtonOptions == null)
            acceptButtonOptions = createDefaultAcceptButtonOptions();

        acceptButtonOptions.setLabel(acceptLabel);
    }

    private void setDefaultAcceptLabel(String acceptLabel) {
        setDefaultOption("acceptLabel", acceptLabel);
        setLayoutChildrenAcceptLabel(acceptLabel);
    }

    @Override
    public String getRejectLabel() {
        return ((String) (getOptionValue("rejectLabel")));
    }

    @Override
    public ComponentOption<String> getRejectLabelOption() {
        return ((ComponentOption<String>) (getOption("rejectLabel")));
    }

    @Override
    public S setRejectLabel(String rejectLabel) {
        setOption("rejectLabel", rejectLabel);
        setLayoutChildrenRejectLabel(rejectLabel);
        return self();
    }

    protected void setLayoutChildrenRejectLabel(String rejectLabel) {
        if (rejectButtonOptions == null)
            rejectButtonOptions = createDefaultRejectButtonOptions();

        rejectButtonOptions.setLabel(rejectLabel);
    }

    private void setDefaultRejectLabel(String rejectLabel) {
        setDefaultOption("rejectLabel", rejectLabel);
        setLayoutChildrenRejectLabel(rejectLabel);
    }

    @Override
    public String getPreferencesLabel() {
        return ((String) (getOptionValue("preferencesLabel")));
    }

    @Override
    public ComponentOption<String> getPreferencesLabelOption() {
        return ((ComponentOption<String>) (getOption("preferencesLabel")));
    }

    @Override
    public S setPreferencesLabel(String preferencesLabel) {
        setOption("preferencesLabel", preferencesLabel);
        setLayoutChildrenPreferencesLabel(preferencesLabel);
        return self();
    }

    protected void setLayoutChildrenPreferencesLabel(String preferencesLabel) {
        if (preferencesButtonOptions == null)
            preferencesButtonOptions = createDefaultPreferencesButtonOptions();

        preferencesButtonOptions.setLabel(preferencesLabel);
    }

    private void setDefaultPreferencesLabel(String preferencesLabel) {
        setDefaultOption("preferencesLabel", preferencesLabel);
        setLayoutChildrenPreferencesLabel(preferencesLabel);
    }

    @Override
    public String getPreferencesTitle() {
        return ((String) (getOptionValue("preferencesTitle")));
    }

    @Override
    public ComponentOption<String> getPreferencesTitleOption() {
        return ((ComponentOption<String>) (getOption("preferencesTitle")));
    }

    @Override
    public S setPreferencesTitle(String preferencesTitle) {
        setOption("preferencesTitle", preferencesTitle);
        setLayoutChildrenPreferencesTitle(preferencesTitle);
        return self();
    }

    protected void setLayoutChildrenPreferencesTitle(String preferencesTitle) {
        if (preferencesDialogOptions == null)
            preferencesDialogOptions = createDefaultPreferencesDialogOptions();

        preferencesDialogOptions.setTitle(preferencesTitle);
    }

    private void setDefaultPreferencesTitle(String preferencesTitle) {
        setDefaultOption("preferencesTitle", preferencesTitle);
        setLayoutChildrenPreferencesTitle(preferencesTitle);
    }

    @Override
    public dev.reuise.core.text.CoreParagraphOptions getMessageParagraphOptions() {
        return messageParagraphOptions;
    }

    @Override
    public boolean hasMessageParagraphOptions() {
        return messageParagraphOptions != null;
    }

    @Override
    public S setMessageParagraphOptions(dev.reuise.core.text.CoreParagraphOptions messageParagraphOptions) {
        if (!hasMessageParagraphOptions())
            this.messageParagraphOptions = createDefaultMessageParagraphOptions();

        // Merge with default options
        this.messageParagraphOptions.merge(messageParagraphOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreFlexContainerOptions getActionsOptions() {
        return actionsOptions;
    }

    @Override
    public boolean hasActionsOptions() {
        return actionsOptions != null;
    }

    @Override
    public S setActionsOptions(dev.reuise.core.layout.CoreFlexContainerOptions actionsOptions) {
        if (!hasActionsOptions())
            this.actionsOptions = createDefaultActionsOptions();

        // Merge with default options
        this.actionsOptions.merge(actionsOptions);
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
    public dev.reuise.core.button.CoreButtonOptions getRejectButtonOptions() {
        return rejectButtonOptions;
    }

    @Override
    public boolean hasRejectButtonOptions() {
        return rejectButtonOptions != null;
    }

    @Override
    public S setRejectButtonOptions(dev.reuise.core.button.CoreButtonOptions rejectButtonOptions) {
        if (!hasRejectButtonOptions())
            this.rejectButtonOptions = createDefaultRejectButtonOptions();

        // Merge with default options
        this.rejectButtonOptions.merge(rejectButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getPreferencesButtonOptions() {
        return preferencesButtonOptions;
    }

    @Override
    public boolean hasPreferencesButtonOptions() {
        return preferencesButtonOptions != null;
    }

    @Override
    public S setPreferencesButtonOptions(dev.reuise.core.button.CoreButtonOptions preferencesButtonOptions) {
        if (!hasPreferencesButtonOptions())
            this.preferencesButtonOptions = createDefaultPreferencesButtonOptions();

        // Merge with default options
        this.preferencesButtonOptions.merge(preferencesButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.dialog.CoreDialogOptions getPreferencesDialogOptions() {
        return preferencesDialogOptions;
    }

    @Override
    public boolean hasPreferencesDialogOptions() {
        return preferencesDialogOptions != null;
    }

    @Override
    public S setPreferencesDialogOptions(dev.reuise.core.dialog.CoreDialogOptions preferencesDialogOptions) {
        if (!hasPreferencesDialogOptions())
            this.preferencesDialogOptions = createDefaultPreferencesDialogOptions();

        // Merge with default options
        this.preferencesDialogOptions.merge(preferencesDialogOptions);
        return self();
    }

    protected CoreParagraphOptions createDefaultMessageParagraphOptions() {
        CoreParagraphOptions options = getComponentFactory().createParagraphOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreFlexContainerOptions createDefaultActionsOptions() {
        CoreFlexContainerOptions options = getComponentFactory().createFlexContainerOptions();
        options.setDirection(FlexDirection.ROW);
        options.setGap(8);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultAcceptButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultRejectButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultPreferencesButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreDialogOptions createDefaultPreferencesDialogOptions() {
        CoreDialogOptions options = getComponentFactory().createDialogOptions();
        options.setRemoveOnClose(false);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
