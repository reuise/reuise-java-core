package dev.reuise.core.text;
import dev.reuise.core.ComponentPart;
public interface CoreLabelPart extends ComponentPart , CoreLabelFeatures , CoreInlineTextPart {
    CoreInlineTextPart getInlineTextPart();
}