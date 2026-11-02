package dev.reuise.core.regionselector;
import java.util.List;
public interface CoreRegionSelectorFeatures {
    List<String> getRegions();

    CoreRegionSelectorFeatures setRegions(List<String> regions);

    CoreRegionSelectorFeatures addRegion(String region);

    CoreRegionSelectorFeatures setRegion(String region);

    CoreRegionSelectorFeatures removeRegion(String region);

    CoreRegionSelectorFeatures clearRegions();

    boolean isDefaultFromBrowser();

    CoreRegionSelectorFeatures setDefaultFromBrowser(Boolean defaultFromBrowser);
}
