package dev.reuise.core.chat;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.floating.CoreFloatingPanel;
import dev.reuise.core.input.CoreBasicInputField;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
import dev.reuise.core.text.CoreParagraph;
public interface CoreChatBoxPart extends ComponentPart , CoreContainerPart , CoreChatBoxFeatures {
    CoreFloatingPanel getFloatingPanel();

    CoreContainer getChatContent();

    CoreContainer getMessages();

    CoreParagraph getLoadingIndicator();

    CoreParagraph getErrorDisplay();

    CoreButton getRetryButton();

    CoreParagraph getHandoffDisplay();

    CoreButton getRequestHumanButton();

    CoreContainer getComposerArea();

    CoreBasicInputField getComposer();

    CoreButton getSendButton();

    CoreButton getStopButton();

    CoreContainerPart getContainerPart();
}
