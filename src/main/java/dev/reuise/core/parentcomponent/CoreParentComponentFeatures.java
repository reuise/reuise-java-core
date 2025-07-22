package dev.reuise.core.parentcomponent;
import dev.reuise.core.CoreComponent;
import java.util.List;
public interface CoreParentComponentFeatures {
    List<CoreComponent> getChildren();

    CoreParentComponentFeatures setChildren(List<CoreComponent> children);

    CoreParentComponentFeatures setChild(CoreComponent child);

    CoreParentComponentFeatures removeChild(CoreComponent child);
}