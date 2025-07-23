package dev.reuise.core.media;
import dev.reuise.core.CoreComponent;
public interface CoreAudioPlayer extends CoreComponent , CoreAudioPlayerPart , CoreMediaPlayer {
    CoreAudioPlayer getComponent();
}