package dev.reuise.core.option;

import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;

public interface ComponentCreator<C extends CoreComponent, O extends CoreComponentOptions> {
    C create(O options);
}
