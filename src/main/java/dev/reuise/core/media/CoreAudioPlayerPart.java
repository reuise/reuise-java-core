package dev.reuise.core.media;
import dev.reuise.core.ComponentPart;
public interface CoreAudioPlayerPart extends ComponentPart , CoreAudioPlayerFeatures , CoreMediaPlayerPart {
    CoreMediaPlayerPart getMediaPlayerPart();
}