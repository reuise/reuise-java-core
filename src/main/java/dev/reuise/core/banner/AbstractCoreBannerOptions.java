package dev.reuise.core.banner;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.layout.FlexDirection;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreParagraphOptions;
public abstract class AbstractCoreBannerOptions<S extends AbstractCoreBannerOptions<S>> implements CoreComponentOptions , CoreBannerOptions {
    protected dev.reuise.core.icon.CoreIconOptions iconOptions;

    protected dev.reuise.core.layout.CoreContainerOptions contentOptions;

    protected dev.reuise.core.text.CoreParagraphOptions messageParagraphOptions;

    protected dev.reuise.core.layout.CoreFlexContainerOptions actionsOptions;

    protected dev.reuise.core.button.CoreButtonOptions dismissButtonOptions;

    protected AbstractCoreBannerOptions() {
        contentOptions = createDefaultContentOptions();
        messageParagraphOptions = createDefaultMessageParagraphOptions();
        actionsOptions = createDefaultActionsOptions();
        dismissButtonOptions = createDefaultDismissButtonOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultTone("neutral");
        setDefaultDismissLabel("Dismiss announcement");
        setDefaultDismissible(false);
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
        setOption("message", message, true);
        setLayoutChildrenMessage(message);
        return self();
    }

    protected void setLayoutChildrenMessage(String message) {
        if (messageParagraphOptions == null)
            messageParagraphOptions = createDefaultMessageParagraphOptions();

        messageParagraphOptions.setText(message);
    }

    private void setDefaultMessage(String message) {
        setDefaultOption("message", message, true);
        setLayoutChildrenMessage(message);
    }

    @Override
    public String getCampaignId() {
        return ((String) (getOptionValue("campaignId")));
    }

    @Override
    public ComponentOption<String> getCampaignIdOption() {
        return ((ComponentOption<String>) (getOption("campaignId")));
    }

    @Override
    public S setCampaignId(String campaignId) {
        setOption("campaignId", campaignId, true);
        setLayoutChildrenCampaignId(campaignId);
        return self();
    }

    protected void setLayoutChildrenCampaignId(String campaignId) {
    }

    private void setDefaultCampaignId(String campaignId) {
        setDefaultOption("campaignId", campaignId, true);
        setLayoutChildrenCampaignId(campaignId);
    }

    @Override
    public String getTone() {
        return ((String) (getOptionValue("tone")));
    }

    @Override
    public ComponentOption<String> getToneOption() {
        return ((ComponentOption<String>) (getOption("tone")));
    }

    @Override
    public S setTone(String tone) {
        setOption("tone", tone, true);
        setLayoutChildrenTone(tone);
        return self();
    }

    protected void setLayoutChildrenTone(String tone) {
    }

    private void setDefaultTone(String tone) {
        setDefaultOption("tone", tone, true);
        setLayoutChildrenTone(tone);
    }

    @Override
    public String getDismissLabel() {
        return ((String) (getOptionValue("dismissLabel")));
    }

    @Override
    public ComponentOption<String> getDismissLabelOption() {
        return ((ComponentOption<String>) (getOption("dismissLabel")));
    }

    @Override
    public S setDismissLabel(String dismissLabel) {
        setOption("dismissLabel", dismissLabel, true);
        setLayoutChildrenDismissLabel(dismissLabel);
        return self();
    }

    protected void setLayoutChildrenDismissLabel(String dismissLabel) {
        if (dismissButtonOptions == null)
            dismissButtonOptions = createDefaultDismissButtonOptions();

        dismissButtonOptions.setLabel(dismissLabel);
    }

    private void setDefaultDismissLabel(String dismissLabel) {
        setDefaultOption("dismissLabel", dismissLabel, true);
        setLayoutChildrenDismissLabel(dismissLabel);
    }

    @Override
    public boolean isDismissible() {
        return Boolean.TRUE.equals(getOptionValue("dismissible"));
    }

    @Override
    public ComponentOption<Boolean> getDismissibleOption() {
        return ((ComponentOption<Boolean>) (getOption("dismissible")));
    }

    @Override
    public S setDismissible(Boolean dismissible) {
        setOption("dismissible", dismissible, true);
        setLayoutChildrenDismissible(dismissible);
        return self();
    }

    protected void setLayoutChildrenDismissible(Boolean dismissible) {
    }

    private void setDefaultDismissible(Boolean dismissible) {
        setDefaultOption("dismissible", dismissible, true);
        setLayoutChildrenDismissible(dismissible);
    }

    @Override
    public BannerDismissHandler getDismissHandler() {
        return ((BannerDismissHandler) (getOptionValue("dismissHandler")));
    }

    @Override
    public ComponentOption<BannerDismissHandler> getDismissHandlerOption() {
        return ((ComponentOption<BannerDismissHandler>) (getOption("dismissHandler")));
    }

    @Override
    public S setDismissHandler(BannerDismissHandler dismissHandler) {
        setOption("dismissHandler", dismissHandler, true);
        setLayoutChildrenDismissHandler(dismissHandler);
        return self();
    }

    protected void setLayoutChildrenDismissHandler(BannerDismissHandler dismissHandler) {
    }

    private void setDefaultDismissHandler(BannerDismissHandler dismissHandler) {
        setDefaultOption("dismissHandler", dismissHandler, true);
        setLayoutChildrenDismissHandler(dismissHandler);
    }

    @Override
    public dev.reuise.core.icon.CoreIconOptions getIconOptions() {
        return iconOptions;
    }

    @Override
    public boolean hasIconOptions() {
        return iconOptions != null;
    }

    @Override
    public S setIconOptions(dev.reuise.core.icon.CoreIconOptions iconOptions) {
        if (!hasIconOptions())
            this.iconOptions = createDefaultIconOptions();

        // Merge with default options
        this.iconOptions.merge(iconOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getContentOptions() {
        return contentOptions;
    }

    @Override
    public boolean hasContentOptions() {
        return contentOptions != null;
    }

    @Override
    public S setContentOptions(dev.reuise.core.layout.CoreContainerOptions contentOptions) {
        if (!hasContentOptions())
            this.contentOptions = createDefaultContentOptions();

        // Merge with default options
        this.contentOptions.merge(contentOptions);
        return self();
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
    public dev.reuise.core.button.CoreButtonOptions getDismissButtonOptions() {
        return dismissButtonOptions;
    }

    @Override
    public boolean hasDismissButtonOptions() {
        return dismissButtonOptions != null;
    }

    @Override
    public S setDismissButtonOptions(dev.reuise.core.button.CoreButtonOptions dismissButtonOptions) {
        if (!hasDismissButtonOptions())
            this.dismissButtonOptions = createDefaultDismissButtonOptions();

        // Merge with default options
        this.dismissButtonOptions.merge(dismissButtonOptions);
        return self();
    }

    protected CoreIconOptions createDefaultIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreContainerOptions createDefaultContentOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
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

    protected CoreButtonOptions createDefaultDismissButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
