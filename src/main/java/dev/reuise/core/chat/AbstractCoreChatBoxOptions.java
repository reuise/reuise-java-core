package dev.reuise.core.chat;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.floating.CoreFloatingPanelOptions;
import dev.reuise.core.input.CoreBasicInputFieldOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreParagraphOptions;
public abstract class AbstractCoreChatBoxOptions<S extends AbstractCoreChatBoxOptions<S>> implements CoreChatBoxOptions , CoreComponentOptions {
    protected dev.reuise.core.floating.CoreFloatingPanelOptions floatingPanelOptions;

    protected dev.reuise.core.layout.CoreContainerOptions chatContentOptions;

    protected dev.reuise.core.layout.CoreContainerOptions messagesOptions;

    protected dev.reuise.core.text.CoreParagraphOptions loadingIndicatorOptions;

    protected dev.reuise.core.text.CoreParagraphOptions errorDisplayOptions;

    protected dev.reuise.core.button.CoreButtonOptions retryButtonOptions;

    protected dev.reuise.core.text.CoreParagraphOptions handoffDisplayOptions;

    protected dev.reuise.core.button.CoreButtonOptions requestHumanButtonOptions;

    protected dev.reuise.core.layout.CoreContainerOptions composerAreaOptions;

    protected dev.reuise.core.input.CoreBasicInputFieldOptions composerOptions;

    protected dev.reuise.core.button.CoreButtonOptions sendButtonOptions;

    protected dev.reuise.core.button.CoreButtonOptions stopButtonOptions;

    protected AbstractCoreChatBoxOptions() {
        floatingPanelOptions = createDefaultFloatingPanelOptions();
        chatContentOptions = createDefaultChatContentOptions();
        messagesOptions = createDefaultMessagesOptions();
        loadingIndicatorOptions = createDefaultLoadingIndicatorOptions();
        errorDisplayOptions = createDefaultErrorDisplayOptions();
        retryButtonOptions = createDefaultRetryButtonOptions();
        handoffDisplayOptions = createDefaultHandoffDisplayOptions();
        requestHumanButtonOptions = createDefaultRequestHumanButtonOptions();
        composerAreaOptions = createDefaultComposerAreaOptions();
        composerOptions = createDefaultComposerOptions();
        sendButtonOptions = createDefaultSendButtonOptions();
        stopButtonOptions = createDefaultStopButtonOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultLoading(false);
        setDefaultErrorMessage("");
        setDefaultHandoffStatus("available");
        setDefaultHandoffMessage("");
        setDefaultHandoffRequestedLabel("Connecting to a person...");
        setDefaultHandoffConnectedLabel("Connected to a person");
        setDefaultHandoffUnavailableLabel("Human support unavailable");
        setDefaultMessagesLabel("Conversation");
        setDefaultComposerLabel("Message");
        setDefaultComposerPlaceholder("Type a message");
        setDefaultSendLabel("Send");
        setDefaultStopLabel("Stop");
        setDefaultRetryLabel("Retry");
        setDefaultRequestHumanLabel("Talk to a person");
        setDefaultLoadingLabel("Responding...");
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isLoading() {
        return Boolean.TRUE.equals(getOptionValue("loading"));
    }

    @Override
    public ComponentOption<Boolean> getLoadingOption() {
        return ((ComponentOption<Boolean>) (getOption("loading")));
    }

    @Override
    public S setLoading(Boolean loading) {
        setOption("loading", loading, true);
        setLayoutChildrenLoading(loading);
        return self();
    }

    protected void setLayoutChildrenLoading(Boolean loading) {
    }

    private void setDefaultLoading(Boolean loading) {
        setDefaultOption("loading", loading, true);
        setLayoutChildrenLoading(loading);
    }

    @Override
    public String getErrorMessage() {
        return ((String) (getOptionValue("errorMessage")));
    }

    @Override
    public ComponentOption<String> getErrorMessageOption() {
        return ((ComponentOption<String>) (getOption("errorMessage")));
    }

    @Override
    public S setErrorMessage(String errorMessage) {
        setOption("errorMessage", errorMessage, true);
        setLayoutChildrenErrorMessage(errorMessage);
        return self();
    }

    protected void setLayoutChildrenErrorMessage(String errorMessage) {
    }

    private void setDefaultErrorMessage(String errorMessage) {
        setDefaultOption("errorMessage", errorMessage, true);
        setLayoutChildrenErrorMessage(errorMessage);
    }

    @Override
    public String getHandoffStatus() {
        return ((String) (getOptionValue("handoffStatus")));
    }

    @Override
    public ComponentOption<String> getHandoffStatusOption() {
        return ((ComponentOption<String>) (getOption("handoffStatus")));
    }

    @Override
    public S setHandoffStatus(String handoffStatus) {
        setOption("handoffStatus", handoffStatus, true);
        setLayoutChildrenHandoffStatus(handoffStatus);
        return self();
    }

    protected void setLayoutChildrenHandoffStatus(String handoffStatus) {
    }

    private void setDefaultHandoffStatus(String handoffStatus) {
        setDefaultOption("handoffStatus", handoffStatus, true);
        setLayoutChildrenHandoffStatus(handoffStatus);
    }

    @Override
    public String getHandoffMessage() {
        return ((String) (getOptionValue("handoffMessage")));
    }

    @Override
    public ComponentOption<String> getHandoffMessageOption() {
        return ((ComponentOption<String>) (getOption("handoffMessage")));
    }

    @Override
    public S setHandoffMessage(String handoffMessage) {
        setOption("handoffMessage", handoffMessage, true);
        setLayoutChildrenHandoffMessage(handoffMessage);
        return self();
    }

    protected void setLayoutChildrenHandoffMessage(String handoffMessage) {
    }

    private void setDefaultHandoffMessage(String handoffMessage) {
        setDefaultOption("handoffMessage", handoffMessage, true);
        setLayoutChildrenHandoffMessage(handoffMessage);
    }

    @Override
    public String getHandoffRequestedLabel() {
        return ((String) (getOptionValue("handoffRequestedLabel")));
    }

    @Override
    public ComponentOption<String> getHandoffRequestedLabelOption() {
        return ((ComponentOption<String>) (getOption("handoffRequestedLabel")));
    }

    @Override
    public S setHandoffRequestedLabel(String handoffRequestedLabel) {
        setOption("handoffRequestedLabel", handoffRequestedLabel, true);
        setLayoutChildrenHandoffRequestedLabel(handoffRequestedLabel);
        return self();
    }

    protected void setLayoutChildrenHandoffRequestedLabel(String handoffRequestedLabel) {
    }

    private void setDefaultHandoffRequestedLabel(String handoffRequestedLabel) {
        setDefaultOption("handoffRequestedLabel", handoffRequestedLabel, true);
        setLayoutChildrenHandoffRequestedLabel(handoffRequestedLabel);
    }

    @Override
    public String getHandoffConnectedLabel() {
        return ((String) (getOptionValue("handoffConnectedLabel")));
    }

    @Override
    public ComponentOption<String> getHandoffConnectedLabelOption() {
        return ((ComponentOption<String>) (getOption("handoffConnectedLabel")));
    }

    @Override
    public S setHandoffConnectedLabel(String handoffConnectedLabel) {
        setOption("handoffConnectedLabel", handoffConnectedLabel, true);
        setLayoutChildrenHandoffConnectedLabel(handoffConnectedLabel);
        return self();
    }

    protected void setLayoutChildrenHandoffConnectedLabel(String handoffConnectedLabel) {
    }

    private void setDefaultHandoffConnectedLabel(String handoffConnectedLabel) {
        setDefaultOption("handoffConnectedLabel", handoffConnectedLabel, true);
        setLayoutChildrenHandoffConnectedLabel(handoffConnectedLabel);
    }

    @Override
    public String getHandoffUnavailableLabel() {
        return ((String) (getOptionValue("handoffUnavailableLabel")));
    }

    @Override
    public ComponentOption<String> getHandoffUnavailableLabelOption() {
        return ((ComponentOption<String>) (getOption("handoffUnavailableLabel")));
    }

    @Override
    public S setHandoffUnavailableLabel(String handoffUnavailableLabel) {
        setOption("handoffUnavailableLabel", handoffUnavailableLabel, true);
        setLayoutChildrenHandoffUnavailableLabel(handoffUnavailableLabel);
        return self();
    }

    protected void setLayoutChildrenHandoffUnavailableLabel(String handoffUnavailableLabel) {
    }

    private void setDefaultHandoffUnavailableLabel(String handoffUnavailableLabel) {
        setDefaultOption("handoffUnavailableLabel", handoffUnavailableLabel, true);
        setLayoutChildrenHandoffUnavailableLabel(handoffUnavailableLabel);
    }

    @Override
    public String getMessagesLabel() {
        return ((String) (getOptionValue("messagesLabel")));
    }

    @Override
    public ComponentOption<String> getMessagesLabelOption() {
        return ((ComponentOption<String>) (getOption("messagesLabel")));
    }

    @Override
    public S setMessagesLabel(String messagesLabel) {
        setOption("messagesLabel", messagesLabel, true);
        setLayoutChildrenMessagesLabel(messagesLabel);
        return self();
    }

    protected void setLayoutChildrenMessagesLabel(String messagesLabel) {
    }

    private void setDefaultMessagesLabel(String messagesLabel) {
        setDefaultOption("messagesLabel", messagesLabel, true);
        setLayoutChildrenMessagesLabel(messagesLabel);
    }

    @Override
    public String getComposerLabel() {
        return ((String) (getOptionValue("composerLabel")));
    }

    @Override
    public ComponentOption<String> getComposerLabelOption() {
        return ((ComponentOption<String>) (getOption("composerLabel")));
    }

    @Override
    public S setComposerLabel(String composerLabel) {
        setOption("composerLabel", composerLabel, true);
        setLayoutChildrenComposerLabel(composerLabel);
        return self();
    }

    protected void setLayoutChildrenComposerLabel(String composerLabel) {
    }

    private void setDefaultComposerLabel(String composerLabel) {
        setDefaultOption("composerLabel", composerLabel, true);
        setLayoutChildrenComposerLabel(composerLabel);
    }

    @Override
    public String getComposerPlaceholder() {
        return ((String) (getOptionValue("composerPlaceholder")));
    }

    @Override
    public ComponentOption<String> getComposerPlaceholderOption() {
        return ((ComponentOption<String>) (getOption("composerPlaceholder")));
    }

    @Override
    public S setComposerPlaceholder(String composerPlaceholder) {
        setOption("composerPlaceholder", composerPlaceholder, true);
        setLayoutChildrenComposerPlaceholder(composerPlaceholder);
        return self();
    }

    protected void setLayoutChildrenComposerPlaceholder(String composerPlaceholder) {
        if (composerOptions == null)
            composerOptions = createDefaultComposerOptions();

        if (getOption("composerPlaceholder", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (composerOptions.getOption("placeholder", null) == null || composerOptions.getOption("placeholder", null) instanceof dev.reuise.core.option.DefaultComponentOption) composerOptions.setDefaultOption("placeholder", composerPlaceholder, null, getOption("composerPlaceholder", null).isForce()); } else { composerOptions.setPlaceholder(composerPlaceholder); };
    }

    private void setDefaultComposerPlaceholder(String composerPlaceholder) {
        setDefaultOption("composerPlaceholder", composerPlaceholder, true);
        setLayoutChildrenComposerPlaceholder(composerPlaceholder);
    }

    @Override
    public String getSendLabel() {
        return ((String) (getOptionValue("sendLabel")));
    }

    @Override
    public ComponentOption<String> getSendLabelOption() {
        return ((ComponentOption<String>) (getOption("sendLabel")));
    }

    @Override
    public S setSendLabel(String sendLabel) {
        setOption("sendLabel", sendLabel, true);
        setLayoutChildrenSendLabel(sendLabel);
        return self();
    }

    protected void setLayoutChildrenSendLabel(String sendLabel) {
        if (sendButtonOptions == null)
            sendButtonOptions = createDefaultSendButtonOptions();

        if (getOption("sendLabel", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (sendButtonOptions.getOption("label", null) == null || sendButtonOptions.getOption("label", null) instanceof dev.reuise.core.option.DefaultComponentOption) sendButtonOptions.setDefaultOption("label", sendLabel, null, getOption("sendLabel", null).isForce()); } else { sendButtonOptions.setLabel(sendLabel); };
    }

    private void setDefaultSendLabel(String sendLabel) {
        setDefaultOption("sendLabel", sendLabel, true);
        setLayoutChildrenSendLabel(sendLabel);
    }

    @Override
    public String getStopLabel() {
        return ((String) (getOptionValue("stopLabel")));
    }

    @Override
    public ComponentOption<String> getStopLabelOption() {
        return ((ComponentOption<String>) (getOption("stopLabel")));
    }

    @Override
    public S setStopLabel(String stopLabel) {
        setOption("stopLabel", stopLabel, true);
        setLayoutChildrenStopLabel(stopLabel);
        return self();
    }

    protected void setLayoutChildrenStopLabel(String stopLabel) {
        if (stopButtonOptions == null)
            stopButtonOptions = createDefaultStopButtonOptions();

        if (getOption("stopLabel", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (stopButtonOptions.getOption("label", null) == null || stopButtonOptions.getOption("label", null) instanceof dev.reuise.core.option.DefaultComponentOption) stopButtonOptions.setDefaultOption("label", stopLabel, null, getOption("stopLabel", null).isForce()); } else { stopButtonOptions.setLabel(stopLabel); };
    }

    private void setDefaultStopLabel(String stopLabel) {
        setDefaultOption("stopLabel", stopLabel, true);
        setLayoutChildrenStopLabel(stopLabel);
    }

    @Override
    public String getRetryLabel() {
        return ((String) (getOptionValue("retryLabel")));
    }

    @Override
    public ComponentOption<String> getRetryLabelOption() {
        return ((ComponentOption<String>) (getOption("retryLabel")));
    }

    @Override
    public S setRetryLabel(String retryLabel) {
        setOption("retryLabel", retryLabel, true);
        setLayoutChildrenRetryLabel(retryLabel);
        return self();
    }

    protected void setLayoutChildrenRetryLabel(String retryLabel) {
        if (retryButtonOptions == null)
            retryButtonOptions = createDefaultRetryButtonOptions();

        if (getOption("retryLabel", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (retryButtonOptions.getOption("label", null) == null || retryButtonOptions.getOption("label", null) instanceof dev.reuise.core.option.DefaultComponentOption) retryButtonOptions.setDefaultOption("label", retryLabel, null, getOption("retryLabel", null).isForce()); } else { retryButtonOptions.setLabel(retryLabel); };
    }

    private void setDefaultRetryLabel(String retryLabel) {
        setDefaultOption("retryLabel", retryLabel, true);
        setLayoutChildrenRetryLabel(retryLabel);
    }

    @Override
    public String getRequestHumanLabel() {
        return ((String) (getOptionValue("requestHumanLabel")));
    }

    @Override
    public ComponentOption<String> getRequestHumanLabelOption() {
        return ((ComponentOption<String>) (getOption("requestHumanLabel")));
    }

    @Override
    public S setRequestHumanLabel(String requestHumanLabel) {
        setOption("requestHumanLabel", requestHumanLabel, true);
        setLayoutChildrenRequestHumanLabel(requestHumanLabel);
        return self();
    }

    protected void setLayoutChildrenRequestHumanLabel(String requestHumanLabel) {
        if (requestHumanButtonOptions == null)
            requestHumanButtonOptions = createDefaultRequestHumanButtonOptions();

        if (getOption("requestHumanLabel", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (requestHumanButtonOptions.getOption("label", null) == null || requestHumanButtonOptions.getOption("label", null) instanceof dev.reuise.core.option.DefaultComponentOption) requestHumanButtonOptions.setDefaultOption("label", requestHumanLabel, null, getOption("requestHumanLabel", null).isForce()); } else { requestHumanButtonOptions.setLabel(requestHumanLabel); };
    }

    private void setDefaultRequestHumanLabel(String requestHumanLabel) {
        setDefaultOption("requestHumanLabel", requestHumanLabel, true);
        setLayoutChildrenRequestHumanLabel(requestHumanLabel);
    }

    @Override
    public String getLoadingLabel() {
        return ((String) (getOptionValue("loadingLabel")));
    }

    @Override
    public ComponentOption<String> getLoadingLabelOption() {
        return ((ComponentOption<String>) (getOption("loadingLabel")));
    }

    @Override
    public S setLoadingLabel(String loadingLabel) {
        setOption("loadingLabel", loadingLabel, true);
        setLayoutChildrenLoadingLabel(loadingLabel);
        return self();
    }

    protected void setLayoutChildrenLoadingLabel(String loadingLabel) {
        if (loadingIndicatorOptions == null)
            loadingIndicatorOptions = createDefaultLoadingIndicatorOptions();

        if (getOption("loadingLabel", null) instanceof dev.reuise.core.option.DefaultComponentOption) { if (loadingIndicatorOptions.getOption("text", null) == null || loadingIndicatorOptions.getOption("text", null) instanceof dev.reuise.core.option.DefaultComponentOption) loadingIndicatorOptions.setDefaultOption("text", loadingLabel, null, getOption("loadingLabel", null).isForce()); } else { loadingIndicatorOptions.setText(loadingLabel); };
    }

    private void setDefaultLoadingLabel(String loadingLabel) {
        setDefaultOption("loadingLabel", loadingLabel, true);
        setLayoutChildrenLoadingLabel(loadingLabel);
    }

    @Override
    public dev.reuise.core.floating.CoreFloatingPanelOptions getFloatingPanelOptions() {
        return floatingPanelOptions;
    }

    @Override
    public boolean hasFloatingPanelOptions() {
        return floatingPanelOptions != null;
    }

    @Override
    public S setFloatingPanelOptions(dev.reuise.core.floating.CoreFloatingPanelOptions floatingPanelOptions) {
        if (!hasFloatingPanelOptions())
            this.floatingPanelOptions = createDefaultFloatingPanelOptions();

        // Merge with default options
        this.floatingPanelOptions.merge(floatingPanelOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getChatContentOptions() {
        return chatContentOptions;
    }

    @Override
    public boolean hasChatContentOptions() {
        return chatContentOptions != null;
    }

    @Override
    public S setChatContentOptions(dev.reuise.core.layout.CoreContainerOptions chatContentOptions) {
        if (!hasChatContentOptions())
            this.chatContentOptions = createDefaultChatContentOptions();

        // Merge with default options
        this.chatContentOptions.merge(chatContentOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getMessagesOptions() {
        return messagesOptions;
    }

    @Override
    public boolean hasMessagesOptions() {
        return messagesOptions != null;
    }

    @Override
    public S setMessagesOptions(dev.reuise.core.layout.CoreContainerOptions messagesOptions) {
        if (!hasMessagesOptions())
            this.messagesOptions = createDefaultMessagesOptions();

        // Merge with default options
        this.messagesOptions.merge(messagesOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreParagraphOptions getLoadingIndicatorOptions() {
        return loadingIndicatorOptions;
    }

    @Override
    public boolean hasLoadingIndicatorOptions() {
        return loadingIndicatorOptions != null;
    }

    @Override
    public S setLoadingIndicatorOptions(dev.reuise.core.text.CoreParagraphOptions loadingIndicatorOptions) {
        if (!hasLoadingIndicatorOptions())
            this.loadingIndicatorOptions = createDefaultLoadingIndicatorOptions();

        // Merge with default options
        this.loadingIndicatorOptions.merge(loadingIndicatorOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreParagraphOptions getErrorDisplayOptions() {
        return errorDisplayOptions;
    }

    @Override
    public boolean hasErrorDisplayOptions() {
        return errorDisplayOptions != null;
    }

    @Override
    public S setErrorDisplayOptions(dev.reuise.core.text.CoreParagraphOptions errorDisplayOptions) {
        if (!hasErrorDisplayOptions())
            this.errorDisplayOptions = createDefaultErrorDisplayOptions();

        // Merge with default options
        this.errorDisplayOptions.merge(errorDisplayOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getRetryButtonOptions() {
        return retryButtonOptions;
    }

    @Override
    public boolean hasRetryButtonOptions() {
        return retryButtonOptions != null;
    }

    @Override
    public S setRetryButtonOptions(dev.reuise.core.button.CoreButtonOptions retryButtonOptions) {
        if (!hasRetryButtonOptions())
            this.retryButtonOptions = createDefaultRetryButtonOptions();

        // Merge with default options
        this.retryButtonOptions.merge(retryButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreParagraphOptions getHandoffDisplayOptions() {
        return handoffDisplayOptions;
    }

    @Override
    public boolean hasHandoffDisplayOptions() {
        return handoffDisplayOptions != null;
    }

    @Override
    public S setHandoffDisplayOptions(dev.reuise.core.text.CoreParagraphOptions handoffDisplayOptions) {
        if (!hasHandoffDisplayOptions())
            this.handoffDisplayOptions = createDefaultHandoffDisplayOptions();

        // Merge with default options
        this.handoffDisplayOptions.merge(handoffDisplayOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getRequestHumanButtonOptions() {
        return requestHumanButtonOptions;
    }

    @Override
    public boolean hasRequestHumanButtonOptions() {
        return requestHumanButtonOptions != null;
    }

    @Override
    public S setRequestHumanButtonOptions(dev.reuise.core.button.CoreButtonOptions requestHumanButtonOptions) {
        if (!hasRequestHumanButtonOptions())
            this.requestHumanButtonOptions = createDefaultRequestHumanButtonOptions();

        // Merge with default options
        this.requestHumanButtonOptions.merge(requestHumanButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getComposerAreaOptions() {
        return composerAreaOptions;
    }

    @Override
    public boolean hasComposerAreaOptions() {
        return composerAreaOptions != null;
    }

    @Override
    public S setComposerAreaOptions(dev.reuise.core.layout.CoreContainerOptions composerAreaOptions) {
        if (!hasComposerAreaOptions())
            this.composerAreaOptions = createDefaultComposerAreaOptions();

        // Merge with default options
        this.composerAreaOptions.merge(composerAreaOptions);
        return self();
    }

    @Override
    public dev.reuise.core.input.CoreBasicInputFieldOptions getComposerOptions() {
        return composerOptions;
    }

    @Override
    public boolean hasComposerOptions() {
        return composerOptions != null;
    }

    @Override
    public S setComposerOptions(dev.reuise.core.input.CoreBasicInputFieldOptions composerOptions) {
        if (!hasComposerOptions())
            this.composerOptions = createDefaultComposerOptions();

        // Merge with default options
        this.composerOptions.merge(composerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getSendButtonOptions() {
        return sendButtonOptions;
    }

    @Override
    public boolean hasSendButtonOptions() {
        return sendButtonOptions != null;
    }

    @Override
    public S setSendButtonOptions(dev.reuise.core.button.CoreButtonOptions sendButtonOptions) {
        if (!hasSendButtonOptions())
            this.sendButtonOptions = createDefaultSendButtonOptions();

        // Merge with default options
        this.sendButtonOptions.merge(sendButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreButtonOptions getStopButtonOptions() {
        return stopButtonOptions;
    }

    @Override
    public boolean hasStopButtonOptions() {
        return stopButtonOptions != null;
    }

    @Override
    public S setStopButtonOptions(dev.reuise.core.button.CoreButtonOptions stopButtonOptions) {
        if (!hasStopButtonOptions())
            this.stopButtonOptions = createDefaultStopButtonOptions();

        // Merge with default options
        this.stopButtonOptions.merge(stopButtonOptions);
        return self();
    }

    protected CoreFloatingPanelOptions createDefaultFloatingPanelOptions() {
        CoreFloatingPanelOptions options = getComponentFactory().createFloatingPanelOptions();
        options.setTitle("Chat");
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultChatContentOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultMessagesOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreParagraphOptions createDefaultLoadingIndicatorOptions() {
        CoreParagraphOptions options = getComponentFactory().createParagraphOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreParagraphOptions createDefaultErrorDisplayOptions() {
        CoreParagraphOptions options = getComponentFactory().createParagraphOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultRetryButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreParagraphOptions createDefaultHandoffDisplayOptions() {
        CoreParagraphOptions options = getComponentFactory().createParagraphOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultRequestHumanButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultComposerAreaOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreBasicInputFieldOptions createDefaultComposerOptions() {
        CoreBasicInputFieldOptions options = getComponentFactory().createBasicInputFieldOptions();
        options.setMultiline(true);
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultSendButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreButtonOptions createDefaultStopButtonOptions() {
        CoreButtonOptions options = getComponentFactory().createButtonOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
