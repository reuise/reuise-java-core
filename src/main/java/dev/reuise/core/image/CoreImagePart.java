package dev.reuise.core.image;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import dev.reuise.core.link.CoreLink;
public interface CoreImagePart extends ComponentPart , CoreBaseComponentPart , CoreImageFeatures {
    CoreLink getLink();

    CoreBaseComponentPart getBaseComponentPart();
}