package dev.reuise.core.media;
import java.util.List;
public interface CoreTextTrackFeatures {
    String getLabel();

    CoreTextTrackFeatures setLabel(String label);

    TextTrackKind getKind();

    CoreTextTrackFeatures setKind(TextTrackKind kind);

    String getLanguage();

    CoreTextTrackFeatures setLanguage(String language);

    TextTrackMode getMode();

    CoreTextTrackFeatures setMode(TextTrackMode mode);

    List<TextTrackCue> getCues();

    CoreTextTrackFeatures setCues(List<TextTrackCue> cues);

    CoreTextTrackFeatures addCue(TextTrackCue cue);

    CoreTextTrackFeatures removeCue(TextTrackCue cue);

    CoreTextTrackFeatures addCue(double startTime, double endTime, String text);
}