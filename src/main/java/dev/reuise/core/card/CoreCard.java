package dev.reuise.core.card;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreSurface;
public interface CoreCard extends CoreComponent , CoreSurface , CoreCardPart {
    CoreCard getComponent();
}