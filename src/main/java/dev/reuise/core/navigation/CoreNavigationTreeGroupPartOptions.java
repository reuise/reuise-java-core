package dev.reuise.core.navigation;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
public interface CoreNavigationTreeGroupPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreNavigationTreeLinkOptions getLinkOptions();

    CoreNavigationTreeGroupPartOptions setLinkOptions(CoreNavigationTreeLinkOptions linkOptions);

    boolean hasLinkOptions();

    ComponentCreator<? extends CoreNavigationTreeLink, ? extends CoreNavigationTreeLinkOptions> getLinkCreator();

    CoreNavigationTreeOptions getTreeOptions();

    CoreNavigationTreeGroupPartOptions setTreeOptions(CoreNavigationTreeOptions treeOptions);

    boolean hasTreeOptions();

    ComponentCreator<? extends CoreNavigationTree, ? extends CoreNavigationTreeOptions> getTreeCreator();

    CoreComponentFactory getComponentFactory();

    CoreNavigationTreeGroup getComponent();
}
