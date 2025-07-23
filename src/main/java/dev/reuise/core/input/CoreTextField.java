package dev.reuise.core.input;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTextField extends CoreComponent , CoreTextFieldPart , CoreParentComponent {
    CoreTextField getComponent();
}