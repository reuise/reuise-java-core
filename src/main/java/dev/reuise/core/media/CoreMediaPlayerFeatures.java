package dev.reuise.core.media;
import java.util.List;
public interface CoreMediaPlayerFeatures {
    boolean isAutoplay();

    CoreMediaPlayerFeatures setAutoplay(Boolean autoplay);

    boolean isControls();

    CoreMediaPlayerFeatures setControls(Boolean controls);

    boolean isLoop();

    CoreMediaPlayerFeatures setLoop(Boolean loop);

    boolean isMuted();

    CoreMediaPlayerFeatures setMuted(Boolean muted);

    String getUrl();

    CoreMediaPlayerFeatures setUrl(String url);

    List<CoreTextTrack> getTextTracks();

    CoreMediaPlayerFeatures setTextTracks(List<CoreTextTrack> textTracks);

    CoreMediaPlayerFeatures addTextTrack(CoreTextTrack textTrack);

    CoreMediaPlayerFeatures removeTextTrack(CoreTextTrack textTrack);
}