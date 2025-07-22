package dev.reuise.core.media;
import dev.reuise.core.CoreComponent;
public interface CoreVideoPlayer extends CoreVideoPlayerPart , CoreComponent , CoreMediaPlayer {
    CoreVideoPlayer getComponent();
}