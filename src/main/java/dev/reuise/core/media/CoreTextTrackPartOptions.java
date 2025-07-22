package dev.reuise.core.media;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreTextTrackPartOptions {
    String getLabel();

    ComponentOption<String> getLabelOption();

    CoreTextTrackPartOptions setLabel(String label);

    TextTrackKind getKind();

    ComponentOption<TextTrackKind> getKindOption();

    CoreTextTrackPartOptions setKind(TextTrackKind kind);

    String getLanguage();

    ComponentOption<String> getLanguageOption();

    CoreTextTrackPartOptions setLanguage(String language);

    TextTrackMode getMode();

    ComponentOption<TextTrackMode> getModeOption();

    CoreTextTrackPartOptions setMode(TextTrackMode mode);

    List<TextTrackCue> getCues();

    ComponentOption<List<TextTrackCue>> getCuesOption();

    CoreTextTrackPartOptions setCues(List<TextTrackCue> cues);

    CoreTextTrackPartOptions addCue(TextTrackCue cue);

    CoreTextTrackPartOptions removeCue(TextTrackCue cue);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreTextTrackPartOptions addCue(double startTime, double endTime, String text);

    CoreComponentFactory getComponentFactory();

    CoreTextTrack getComponent();
}