package dev.reuise.core.media;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreMediaPlayerPartOptions {
    boolean isAutoplay();

    ComponentOption<Boolean> getAutoplayOption();

    CoreMediaPlayerPartOptions setAutoplay(Boolean autoplay);

    boolean isControls();

    ComponentOption<Boolean> getControlsOption();

    CoreMediaPlayerPartOptions setControls(Boolean controls);

    boolean isLoop();

    ComponentOption<Boolean> getLoopOption();

    CoreMediaPlayerPartOptions setLoop(Boolean loop);

    boolean isMuted();

    ComponentOption<Boolean> getMutedOption();

    CoreMediaPlayerPartOptions setMuted(Boolean muted);

    String getUrl();

    ComponentOption<String> getUrlOption();

    CoreMediaPlayerPartOptions setUrl(String url);

    List<CoreTextTrack> getTextTracks();

    ComponentOption<List<CoreTextTrack>> getTextTracksOption();

    CoreMediaPlayerPartOptions setTextTracks(List<CoreTextTrack> textTracks);

    CoreMediaPlayerPartOptions addTextTrack(CoreTextTrack textTrack);

    CoreMediaPlayerPartOptions removeTextTrack(CoreTextTrack textTrack);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreMediaPlayer getComponent();
}