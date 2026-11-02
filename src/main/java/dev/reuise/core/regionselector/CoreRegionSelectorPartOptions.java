package dev.reuise.core.regionselector;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import java.util.List;
public interface CoreRegionSelectorPartOptions {
    List<String> getRegions();

    ComponentOption<List<String>> getRegionsOption();

    CoreRegionSelectorPartOptions setRegions(List<String> regions);

    CoreRegionSelectorPartOptions addRegion(String region);

    CoreRegionSelectorPartOptions setRegion(String region);

    CoreRegionSelectorPartOptions removeRegion(String region);

    CoreRegionSelectorPartOptions clearRegions();

    boolean isDefaultFromBrowser();

    ComponentOption<Boolean> getDefaultFromBrowserOption();

    CoreRegionSelectorPartOptions setDefaultFromBrowser(Boolean defaultFromBrowser);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreRegionSelector getComponent();
}
