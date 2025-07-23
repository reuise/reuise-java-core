package dev.reuise.core.input;
import dev.reuise.core.ComponentPart;
public interface CoreMultiEmailAddressFieldPart extends ComponentPart , CoreMultiEmailAddressFieldFeatures , CoreChipFieldPart {
    CoreChipFieldPart getChipFieldPart();
}