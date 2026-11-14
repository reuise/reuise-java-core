package dev.reuise.core.chat;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.floating.CoreFloatingPanel;
import dev.reuise.core.floating.CoreFloatingPanelOptions;
import dev.reuise.core.input.CoreBasicInputField;
import dev.reuise.core.input.CoreBasicInputFieldOptions;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreParagraph;
import dev.reuise.core.text.CoreParagraphOptions;
public interface CoreChatBoxPartOptions {
    boolean isLoading();

    ComponentOption<Boolean> getLoadingOption();

    CoreChatBoxPartOptions setLoading(Boolean loading);

    String getErrorMessage();

    ComponentOption<String> getErrorMessageOption();

    CoreChatBoxPartOptions setErrorMessage(String errorMessage);

    String getHandoffStatus();

    ComponentOption<String> getHandoffStatusOption();

    CoreChatBoxPartOptions setHandoffStatus(String handoffStatus);

    String getHandoffMessage();

    ComponentOption<String> getHandoffMessageOption();

    CoreChatBoxPartOptions setHandoffMessage(String handoffMessage);

    String getHandoffRequestedLabel();

    ComponentOption<String> getHandoffRequestedLabelOption();

    CoreChatBoxPartOptions setHandoffRequestedLabel(String handoffRequestedLabel);

    String getHandoffConnectedLabel();

    ComponentOption<String> getHandoffConnectedLabelOption();

    CoreChatBoxPartOptions setHandoffConnectedLabel(String handoffConnectedLabel);

    String getHandoffUnavailableLabel();

    ComponentOption<String> getHandoffUnavailableLabelOption();

    CoreChatBoxPartOptions setHandoffUnavailableLabel(String handoffUnavailableLabel);

    String getMessagesLabel();

    ComponentOption<String> getMessagesLabelOption();

    CoreChatBoxPartOptions setMessagesLabel(String messagesLabel);

    String getComposerLabel();

    ComponentOption<String> getComposerLabelOption();

    CoreChatBoxPartOptions setComposerLabel(String composerLabel);

    String getComposerPlaceholder();

    ComponentOption<String> getComposerPlaceholderOption();

    CoreChatBoxPartOptions setComposerPlaceholder(String composerPlaceholder);

    String getSendLabel();

    ComponentOption<String> getSendLabelOption();

    CoreChatBoxPartOptions setSendLabel(String sendLabel);

    String getStopLabel();

    ComponentOption<String> getStopLabelOption();

    CoreChatBoxPartOptions setStopLabel(String stopLabel);

    String getRetryLabel();

    ComponentOption<String> getRetryLabelOption();

    CoreChatBoxPartOptions setRetryLabel(String retryLabel);

    String getRequestHumanLabel();

    ComponentOption<String> getRequestHumanLabelOption();

    CoreChatBoxPartOptions setRequestHumanLabel(String requestHumanLabel);

    String getLoadingLabel();

    ComponentOption<String> getLoadingLabelOption();

    CoreChatBoxPartOptions setLoadingLabel(String loadingLabel);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreFloatingPanelOptions getFloatingPanelOptions();

    CoreChatBoxPartOptions setFloatingPanelOptions(CoreFloatingPanelOptions floatingPanelOptions);

    boolean hasFloatingPanelOptions();

    ComponentCreator<? extends CoreFloatingPanel, ? extends CoreFloatingPanelOptions> getFloatingPanelCreator();

    CoreContainerOptions getChatContentOptions();

    CoreChatBoxPartOptions setChatContentOptions(CoreContainerOptions chatContentOptions);

    boolean hasChatContentOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getChatContentCreator();

    CoreContainerOptions getMessagesOptions();

    CoreChatBoxPartOptions setMessagesOptions(CoreContainerOptions messagesOptions);

    boolean hasMessagesOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getMessagesCreator();

    CoreParagraphOptions getLoadingIndicatorOptions();

    CoreChatBoxPartOptions setLoadingIndicatorOptions(CoreParagraphOptions loadingIndicatorOptions);

    boolean hasLoadingIndicatorOptions();

    ComponentCreator<? extends CoreParagraph, ? extends CoreParagraphOptions> getLoadingIndicatorCreator();

    CoreParagraphOptions getErrorDisplayOptions();

    CoreChatBoxPartOptions setErrorDisplayOptions(CoreParagraphOptions errorDisplayOptions);

    boolean hasErrorDisplayOptions();

    ComponentCreator<? extends CoreParagraph, ? extends CoreParagraphOptions> getErrorDisplayCreator();

    CoreButtonOptions getRetryButtonOptions();

    CoreChatBoxPartOptions setRetryButtonOptions(CoreButtonOptions retryButtonOptions);

    boolean hasRetryButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getRetryButtonCreator();

    CoreParagraphOptions getHandoffDisplayOptions();

    CoreChatBoxPartOptions setHandoffDisplayOptions(CoreParagraphOptions handoffDisplayOptions);

    boolean hasHandoffDisplayOptions();

    ComponentCreator<? extends CoreParagraph, ? extends CoreParagraphOptions> getHandoffDisplayCreator();

    CoreButtonOptions getRequestHumanButtonOptions();

    CoreChatBoxPartOptions setRequestHumanButtonOptions(CoreButtonOptions requestHumanButtonOptions);

    boolean hasRequestHumanButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getRequestHumanButtonCreator();

    CoreContainerOptions getComposerAreaOptions();

    CoreChatBoxPartOptions setComposerAreaOptions(CoreContainerOptions composerAreaOptions);

    boolean hasComposerAreaOptions();

    ComponentCreator<? extends CoreContainer, ? extends CoreContainerOptions> getComposerAreaCreator();

    CoreBasicInputFieldOptions getComposerOptions();

    CoreChatBoxPartOptions setComposerOptions(CoreBasicInputFieldOptions composerOptions);

    boolean hasComposerOptions();

    ComponentCreator<? extends CoreBasicInputField, ? extends CoreBasicInputFieldOptions> getComposerCreator();

    CoreButtonOptions getSendButtonOptions();

    CoreChatBoxPartOptions setSendButtonOptions(CoreButtonOptions sendButtonOptions);

    boolean hasSendButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getSendButtonCreator();

    CoreButtonOptions getStopButtonOptions();

    CoreChatBoxPartOptions setStopButtonOptions(CoreButtonOptions stopButtonOptions);

    boolean hasStopButtonOptions();

    ComponentCreator<? extends CoreButton, ? extends CoreButtonOptions> getStopButtonCreator();

    CoreComponentFactory getComponentFactory();

    CoreChatBox getComponent();
}
