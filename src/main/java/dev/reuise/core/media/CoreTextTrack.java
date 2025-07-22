package dev.reuise.core.media;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTextTrack extends CoreComponent , CoreParentComponent , CoreTextTrackPart {
    CoreTextTrack getComponent();
}