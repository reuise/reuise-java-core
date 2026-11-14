package dev.reuise.core.chat;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreChatBox extends CoreChatBoxPart , CoreComponent , CoreContainer {
    CoreChatBox getComponent();
}
