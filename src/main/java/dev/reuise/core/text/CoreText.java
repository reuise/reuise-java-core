package dev.reuise.core.text;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreText extends CoreComponent , CoreTextPart , CoreParentComponent {
    CoreText getComponent();
}