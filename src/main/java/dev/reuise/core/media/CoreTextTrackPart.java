package dev.reuise.core.media;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreTextTrackPart extends ComponentPart , CoreParentComponentPart , CoreTextTrackFeatures {
    CoreTextTrackPart clearCues();

    CoreParentComponentPart getParentComponentPart();
}