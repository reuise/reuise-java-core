package dev.reuise.core.progressindicator;
public interface CoreProgressIndicatorFeatures {
    ProgressIndicatorLayout getLayout();

    CoreProgressIndicatorFeatures setLayout(ProgressIndicatorLayout layout);

    ProgressIndicatorTiming getTiming();

    CoreProgressIndicatorFeatures setTiming(ProgressIndicatorTiming timing);

    Integer getProgress();

    CoreProgressIndicatorFeatures setProgress(Integer progress);

    boolean isStarted();

    CoreProgressIndicatorFeatures setStarted(Boolean started);

    ProgressIndicatorVisibilityBehaviour getVisibilityBehaviour();

    CoreProgressIndicatorFeatures setVisibilityBehaviour(ProgressIndicatorVisibilityBehaviour visibilityBehaviour);
}