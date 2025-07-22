package dev.reuise.core.media;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreMediaPlayer extends CoreComponent , CoreParentComponent , CoreMediaPlayerPart {
    CoreMediaPlayer getComponent();
}