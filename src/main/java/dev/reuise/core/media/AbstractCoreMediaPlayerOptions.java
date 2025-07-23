package dev.reuise.core.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractCoreMediaPlayerOptions<S extends AbstractCoreMediaPlayerOptions<S>> implements CoreMediaPlayerOptions , CoreComponentOptions {
    protected AbstractCoreMediaPlayerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setTextTracks(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isAutoplay() {
        return Boolean.TRUE.equals(getOptionValue("autoplay"));
    }

    @Override
    public ComponentOption<Boolean> getAutoplayOption() {
        return ((ComponentOption<Boolean>) (getOption("autoplay")));
    }

    @Override
    public S setAutoplay(Boolean autoplay) {
        setOption("autoplay", autoplay);
        return self();
    }

    private void setDefaultAutoplay(Boolean autoplay) {
        setDefaultOption("autoplay", autoplay);
    }

    @Override
    public boolean isControls() {
        return Boolean.TRUE.equals(getOptionValue("controls"));
    }

    @Override
    public ComponentOption<Boolean> getControlsOption() {
        return ((ComponentOption<Boolean>) (getOption("controls")));
    }

    @Override
    public S setControls(Boolean controls) {
        setOption("controls", controls);
        return self();
    }

    private void setDefaultControls(Boolean controls) {
        setDefaultOption("controls", controls);
    }

    @Override
    public boolean isLoop() {
        return Boolean.TRUE.equals(getOptionValue("loop"));
    }

    @Override
    public ComponentOption<Boolean> getLoopOption() {
        return ((ComponentOption<Boolean>) (getOption("loop")));
    }

    @Override
    public S setLoop(Boolean loop) {
        setOption("loop", loop);
        return self();
    }

    private void setDefaultLoop(Boolean loop) {
        setDefaultOption("loop", loop);
    }

    @Override
    public boolean isMuted() {
        return Boolean.TRUE.equals(getOptionValue("muted"));
    }

    @Override
    public ComponentOption<Boolean> getMutedOption() {
        return ((ComponentOption<Boolean>) (getOption("muted")));
    }

    @Override
    public S setMuted(Boolean muted) {
        setOption("muted", muted);
        return self();
    }

    private void setDefaultMuted(Boolean muted) {
        setDefaultOption("muted", muted);
    }

    @Override
    public String getUrl() {
        return ((String) (getOptionValue("url")));
    }

    @Override
    public ComponentOption<String> getUrlOption() {
        return ((ComponentOption<String>) (getOption("url")));
    }

    @Override
    public S setUrl(String url) {
        setOption("url", url);
        return self();
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
    }

    @Override
    public List<CoreTextTrack> getTextTracks() {
        return ((List<CoreTextTrack>) (getOptionValue("textTracks")));
    }

    @Override
    public ComponentOption<List<CoreTextTrack>> getTextTracksOption() {
        return ((ComponentOption<List<CoreTextTrack>>) (getOption("textTracks")));
    }

    @Override
    public S setTextTracks(List<CoreTextTrack> textTracks) {
        setOption("textTracks", textTracks, true);
        return self();
    }

    @Override
    public S addTextTrack(CoreTextTrack textTrack) {
        List<CoreTextTrack> list = getTextTracks();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setTextTracks(list);
        }
        list.add(textTrack);
        return self();
    }

    @Override
    public S removeTextTrack(CoreTextTrack textTrack) {
        List<CoreTextTrack> list = getTextTracks();
        if (list == null) {
            return self();
        }
        list.remove(textTrack);
        return self();
    }

    private void setDefaultTextTracks(List<CoreTextTrack> textTracks) {
        setDefaultOption("textTracks", textTracks, true);
    }

    protected abstract S self();
}