package dev.reuise.core.input;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreRowLayout;
public interface CoreSegmentedTextField extends CoreComponent , CoreRowLayout , CoreSegmentedTextFieldPart {
    CoreSegmentedTextField getComponent();
}