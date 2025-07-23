package dev.reuise.core.dropzone;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
public interface CoreDropZonePart extends ComponentPart , CoreParentComponentPart , CoreDropZoneFeatures {
    CoreParentComponentPart getParentComponentPart();
}