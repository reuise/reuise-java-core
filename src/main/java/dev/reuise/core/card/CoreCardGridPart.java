package dev.reuise.core.card;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.core.layout.CoreContainerPart;
public interface CoreCardGridPart extends ComponentPart , CoreContainerPart , CoreCardGridFeatures {
    void showScrim(Boolean show);

    CoreContainer getScrim();

    CoreContainer getCardContainer();

    CoreContainerPart getContainerPart();
}