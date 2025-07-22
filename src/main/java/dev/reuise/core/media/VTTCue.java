package dev.reuise.core.media;

public class VTTCue extends TextTrackCue {
    private String text;

    public VTTCue() {
    }

    public VTTCue(double startTime, double endTime, String text) {
        super(startTime, endTime);
        this.text = text;
    }

    public static VTTCue create() {
        return new VTTCue();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
