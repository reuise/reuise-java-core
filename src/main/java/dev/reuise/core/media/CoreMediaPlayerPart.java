package dev.reuise.core.media;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreMediaPlayerPart extends ComponentPart , CoreParentComponentPart , CoreMediaPlayerFeatures {
    CoreParentComponentPart getParentComponentPart();
}