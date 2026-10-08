package dev.reuise.core.media;
import java.util.List;
import java.util.function.Function;
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

    <T> CoreMediaPlayerFeatures setTextTracks(List<T> data, Function<T, CoreTextTrack> mapper);

    CoreMediaPlayerFeatures addTextTrack(CoreTextTrack textTrack);

    CoreMediaPlayerFeatures removeTextTrack(CoreTextTrack textTrack);

    CoreMediaPlayerFeatures clearTextTracks();

    List<Object> getTextTrackData();

    Function<Object, CoreTextTrack> getTextTrackDataMapper();
}
