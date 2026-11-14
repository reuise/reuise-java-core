package dev.reuise.core.floating;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.layout.CoreContainer;
public interface CoreFloatingPanel extends CoreComponent , CoreContainer , CoreFloatingPanelPart {
    CoreFloatingPanel getComponent();
}
