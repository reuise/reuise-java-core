package dev.reuise.core.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreRowLayoutPart;
public interface CoreSegmentedTextFieldPart extends CoreRowLayoutPart , ComponentPart , CoreSegmentedTextFieldFeatures {
    void refreshFields();

    CoreRowLayoutPart getRowLayoutPart();
}
