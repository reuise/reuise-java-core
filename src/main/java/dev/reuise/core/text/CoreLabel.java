package dev.reuise.core.text;
import dev.reuise.core.CoreComponent;
public interface CoreLabel extends CoreComponent , CoreLabelPart , CoreInlineText {
    CoreLabel getComponent();
}