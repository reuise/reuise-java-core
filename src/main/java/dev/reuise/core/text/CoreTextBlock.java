package dev.reuise.core.text;
import dev.reuise.core.CoreComponent;
public interface CoreTextBlock extends CoreComponent , CoreText , CoreTextBlockPart {
    CoreTextBlock getComponent();
}