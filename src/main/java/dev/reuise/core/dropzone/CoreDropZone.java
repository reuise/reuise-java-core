package dev.reuise.core.dropzone;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreDropZone extends CoreComponent , CoreParentComponent , CoreDropZonePart {
    CoreDropZone getComponent();
}