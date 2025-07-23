package dev.reuise.core.progressindicator;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreProgressIndicatorPart extends ComponentPart , CoreParentComponentPart , CoreProgressIndicatorFeatures {
    void start();

    void stop();

    CoreContainer getTrack();

    CoreParentComponentPart getParentComponentPart();
}