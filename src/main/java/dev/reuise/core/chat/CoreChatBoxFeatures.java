package dev.reuise.core.chat;
public interface CoreChatBoxFeatures {
    boolean isLoading();

    CoreChatBoxFeatures setLoading(Boolean loading);

    String getErrorMessage();

    CoreChatBoxFeatures setErrorMessage(String errorMessage);

    String getHandoffStatus();

    CoreChatBoxFeatures setHandoffStatus(String handoffStatus);

    String getHandoffMessage();

    CoreChatBoxFeatures setHandoffMessage(String handoffMessage);

    String getHandoffRequestedLabel();

    CoreChatBoxFeatures setHandoffRequestedLabel(String handoffRequestedLabel);

    String getHandoffConnectedLabel();

    CoreChatBoxFeatures setHandoffConnectedLabel(String handoffConnectedLabel);

    String getHandoffUnavailableLabel();

    CoreChatBoxFeatures setHandoffUnavailableLabel(String handoffUnavailableLabel);

    String getMessagesLabel();

    CoreChatBoxFeatures setMessagesLabel(String messagesLabel);

    String getComposerLabel();

    CoreChatBoxFeatures setComposerLabel(String composerLabel);

    String getComposerPlaceholder();

    CoreChatBoxFeatures setComposerPlaceholder(String composerPlaceholder);

    String getSendLabel();

    CoreChatBoxFeatures setSendLabel(String sendLabel);

    String getStopLabel();

    CoreChatBoxFeatures setStopLabel(String stopLabel);

    String getRetryLabel();

    CoreChatBoxFeatures setRetryLabel(String retryLabel);

    String getRequestHumanLabel();

    CoreChatBoxFeatures setRequestHumanLabel(String requestHumanLabel);

    String getLoadingLabel();

    CoreChatBoxFeatures setLoadingLabel(String loadingLabel);
}
