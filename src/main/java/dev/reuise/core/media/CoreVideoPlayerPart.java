package dev.reuise.core.media;
import dev.reuise.core.ComponentPart;
public interface CoreVideoPlayerPart extends ComponentPart , CoreVideoPlayerFeatures , CoreMediaPlayerPart {
    CoreMediaPlayerPart getMediaPlayerPart();
}