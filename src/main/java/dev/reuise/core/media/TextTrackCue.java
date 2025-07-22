package dev.reuise.core.media;

public abstract class TextTrackCue {
    private String id;
    private double startTime;
    private double endTime;
    private boolean pauseOnExit;

    public TextTrackCue() {
    }

    public TextTrackCue(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public boolean isPauseOnExit() {
        return pauseOnExit;
    }

    public void setPauseOnExit(boolean pauseOnExit) {
        this.pauseOnExit = pauseOnExit;
    }
}
