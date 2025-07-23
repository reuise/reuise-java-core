package dev.reuise.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreTableColumnOptions<S extends AbstractCoreTableColumnOptions<S>> implements CoreComponentOptions , CoreTableColumnOptions {
    protected AbstractCoreTableColumnOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getLabel() {
        return ((String) (getOptionValue("label")));
    }

    @Override
    public ComponentOption<String> getLabelOption() {
        return ((ComponentOption<String>) (getOption("label")));
    }

    @Override
    public S setLabel(String label) {
        setOption("label", label);
        return self();
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
    }

    @Override
    public CoreMenuOptions getMenuOptions() {
        return ((CoreMenuOptions) (getOptionValue("menuOptions")));
    }

    @Override
    public ComponentOption<CoreMenuOptions> getMenuOptionsOption() {
        return ((ComponentOption<CoreMenuOptions>) (getOption("menuOptions")));
    }

    @Override
    public S setMenuOptions(CoreMenuOptions menuOptions) {
        setOption("menuOptions", menuOptions);
        return self();
    }

    private void setDefaultMenuOptions(CoreMenuOptions menuOptions) {
        setDefaultOption("menuOptions", menuOptions);
    }

    @Override
    public boolean isHasMenuButton() {
        return Boolean.TRUE.equals(getOptionValue("hasMenuButton"));
    }

    @Override
    public ComponentOption<Boolean> getHasMenuButtonOption() {
        return ((ComponentOption<Boolean>) (getOption("hasMenuButton")));
    }

    @Override
    public S setHasMenuButton(Boolean hasMenuButton) {
        setOption("hasMenuButton", hasMenuButton);
        return self();
    }

    private void setDefaultHasMenuButton(Boolean hasMenuButton) {
        setDefaultOption("hasMenuButton", hasMenuButton);
    }

    @Override
    public CoreIconButtonOptions getMenuButtonOptions() {
        return ((CoreIconButtonOptions) (getOptionValue("menuButtonOptions")));
    }

    @Override
    public ComponentOption<CoreIconButtonOptions> getMenuButtonOptionsOption() {
        return ((ComponentOption<CoreIconButtonOptions>) (getOption("menuButtonOptions")));
    }

    @Override
    public S setMenuButtonOptions(CoreIconButtonOptions menuButtonOptions) {
        setOption("menuButtonOptions", menuButtonOptions);
        return self();
    }

    private void setDefaultMenuButtonOptions(CoreIconButtonOptions menuButtonOptions) {
        setDefaultOption("menuButtonOptions", menuButtonOptions);
    }

    protected abstract S self();
}