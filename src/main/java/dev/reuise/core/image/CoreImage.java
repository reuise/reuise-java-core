package dev.reuise.core.image;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.basecomponent.CoreBaseComponent;
public interface CoreImage extends CoreComponent , CoreImagePart , CoreBaseComponent {
    CoreImage getComponent();
}