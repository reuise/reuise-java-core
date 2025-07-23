package dev.reuise.core.parentcomponent;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import java.util.List;
public interface CoreParentComponentPart extends ComponentPart , CoreBaseComponentPart , CoreParentComponentFeatures {
    CoreParentComponentPart add(CoreComponent child);

    void insertBefore(CoreComponent child, CoreComponent beforeChild);

    CoreParentComponentPart addText(String text);

    void remove(CoreComponent child);

    void removeAll();

    List<CoreComponent> getChildren();

    CoreBaseComponentPart getBaseComponentPart();
}