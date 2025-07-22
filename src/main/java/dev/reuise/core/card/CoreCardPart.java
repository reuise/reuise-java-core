package dev.reuise.core.card;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.image.CoreImage;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.core.layout.CoreSurfacePart;
import dev.reuise.core.link.CoreLink;
import dev.reuise.core.text.CoreTextBlock;
public interface CoreCardPart extends ComponentPart , CoreCardFeatures , CoreSurfacePart {
    CoreLink getMediaLink();

    CoreFlexContainer getMediaContainer();

    CoreImage getImage();

    CoreFlexContainer getTextContent();

    CoreFlexContainer getHeadline();

    CoreLink getHeadingLink();

    CoreTextBlock getHeadingContainer();

    CoreTextBlock getSubHeadingContainer();

    CoreTextBlock getTextContainer();

    CoreFlexContainer getActionsContainer();

    CoreCardPart setHighlightText(String text);

    boolean containsText(String text);

    CoreCardPart setFilterText(String text);

    CoreSurfacePart getSurfacePart();
}