package dev.reuise.core.text;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreIconLabel extends CoreComponent , CoreParentComponent , CoreIconLabelPart {
    CoreIconLabel getComponent();
}