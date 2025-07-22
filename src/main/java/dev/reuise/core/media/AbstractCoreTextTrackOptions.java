package dev.reuise.core.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractCoreTextTrackOptions<S extends AbstractCoreTextTrackOptions<S>> implements CoreTextTrackOptions , CoreComponentOptions {
    @Override
    public S addCue(double startTime, double endTime, String text) {
        addCue(new VTTCue(startTime, endTime, text));
        return self();
    }

    protected AbstractCoreTextTrackOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultMode(TextTrackMode.DISABLED);
        setDefaultCues(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getLabel() {
        return ((String) (getOptionValue("label")));
    }

    @Override
    public ComponentOption<String> getLabelOption() {
        return ((ComponentOption<String>) (getOption("label")));
    }

    @Override
    public S setLabel(String label) {
        setOption("label", label);
        return self();
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
    }

    @Override
    public TextTrackKind getKind() {
        return ((TextTrackKind) (getOptionValue("kind")));
    }

    @Override
    public ComponentOption<TextTrackKind> getKindOption() {
        return ((ComponentOption<TextTrackKind>) (getOption("kind")));
    }

    @Override
    public S setKind(TextTrackKind kind) {
        setOption("kind", kind);
        return self();
    }

    private void setDefaultKind(TextTrackKind kind) {
        setDefaultOption("kind", kind);
    }

    @Override
    public String getLanguage() {
        return ((String) (getOptionValue("language")));
    }

    @Override
    public ComponentOption<String> getLanguageOption() {
        return ((ComponentOption<String>) (getOption("language")));
    }

    @Override
    public S setLanguage(String language) {
        setOption("language", language);
        return self();
    }

    private void setDefaultLanguage(String language) {
        setDefaultOption("language", language);
    }

    @Override
    public TextTrackMode getMode() {
        return ((TextTrackMode) (getOptionValue("mode")));
    }

    @Override
    public ComponentOption<TextTrackMode> getModeOption() {
        return ((ComponentOption<TextTrackMode>) (getOption("mode")));
    }

    @Override
    public S setMode(TextTrackMode mode) {
        setOption("mode", mode);
        return self();
    }

    private void setDefaultMode(TextTrackMode mode) {
        setDefaultOption("mode", mode);
    }

    @Override
    public List<TextTrackCue> getCues() {
        return ((List<TextTrackCue>) (getOptionValue("cues")));
    }

    @Override
    public ComponentOption<List<TextTrackCue>> getCuesOption() {
        return ((ComponentOption<List<TextTrackCue>>) (getOption("cues")));
    }

    @Override
    public S setCues(List<TextTrackCue> cues) {
        setOption("cues", cues);
        return self();
    }

    @Override
    public S addCue(TextTrackCue cue) {
        List<TextTrackCue> list = getCues();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setCues(list);
        }
        list.add(cue);
        return self();
    }

    @Override
    public S removeCue(TextTrackCue cue) {
        List<TextTrackCue> list = getCues();
        if (list == null) {
            return self();
        }
        list.remove(cue);
        return self();
    }

    private void setDefaultCues(List<TextTrackCue> cues) {
        setDefaultOption("cues", cues);
    }

    protected abstract S self();
}