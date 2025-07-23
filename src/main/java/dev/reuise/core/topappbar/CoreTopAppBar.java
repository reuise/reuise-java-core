package dev.reuise.core.topappbar;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
public interface CoreTopAppBar extends CoreComponent , CoreParentComponent , CoreTopAppBarPart {
    CoreTopAppBar getComponent();
}