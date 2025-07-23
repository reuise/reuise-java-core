package dev.reuise.core.topappbar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public abstract class AbstractCoreTopAppBarOptions<S extends AbstractCoreTopAppBarOptions<S>> implements CoreTopAppBarOptions , CoreComponentOptions {
    protected dev.reuise.core.layout.CoreContainerOptions containerOptions;

    protected dev.reuise.core.button.CoreIconButtonOptions navigationButtonOptions;

    protected dev.reuise.core.layout.CoreContainerOptions titleContainerOptions;

    protected dev.reuise.core.layout.CoreContainerOptions actionsContainerOptions;

    protected AbstractCoreTopAppBarOptions() {
        containerOptions = createDefaultContainerOptions();
        titleContainerOptions = createDefaultTitleContainerOptions();
        actionsContainerOptions = createDefaultActionsContainerOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultHasNavigationButton(true);
        setActions(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public boolean isFixed() {
        return Boolean.TRUE.equals(getOptionValue("fixed"));
    }

    @Override
    public ComponentOption<Boolean> getFixedOption() {
        return ((ComponentOption<Boolean>) (getOption("fixed")));
    }

    @Override
    public S setFixed(Boolean fixed) {
        setOption("fixed", fixed);
        setLayoutChildrenFixed(fixed);
        return self();
    }

    @Override
    public S setFixed(Boolean fixed, State state) {
        setOption("fixed", fixed, state);
        setLayoutChildrenFixed(fixed, state);
        return self();
    }

    @Override
    public S setFixedAllStates(Boolean fixed) {
        // HIMADDIE!!
        clearOptionStates("fixed");
        setFixed(fixed);
        setLayoutChildrenFixed(fixed);
        return self();
    }

    @Override
    public S setFixed(ScreenSizeValues<Boolean> screenValues) {
        clearOption("fixed", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setFixed(v, s));
        setLayoutChildrenFixed(screenValues);
        return self();
    }

    @Override
    public boolean isFixed(State state) {
        return Boolean.TRUE.equals(getOptionValue("fixed", state));
    }

    @Override
    public Collection<State> getFixedStates() {
        return getOptionStates("fixed");
    }

    @Override
    public ComponentOption<Boolean> getFixedOption(State state) {
        return ((ComponentOption<Boolean>) (getOption("fixed", state)));
    }

    @Override
    public boolean isFixedAnyState() {
        Collection<ComponentOption<?>> values = getOptionValues("fixed");
        if ((values == null) || values.isEmpty())
            return false;

        return values.stream().anyMatch(e -> ((boolean) (e.getValue())));
    }

    protected void setLayoutChildrenFixed(Boolean fixed) {
    }

    protected void setLayoutChildrenFixed(Boolean fixed, State state) {
    }

    protected void setLayoutChildrenFixed(ScreenSizeValues<Boolean> fixed) {
    }

    private void setDefaultFixed(Boolean fixed) {
        setDefaultOption("fixed", fixed);
        setLayoutChildrenFixed(fixed);
    }

    private void setDefaultFixed(Boolean fixed, State state) {
        setDefaultOption("fixed", fixed, state);
        setLayoutChildrenFixed(fixed, state);
    }

    private void setDefaultFixedAllStates(Boolean fixed) {
        // HIMADDIE!!
        clearOptionStates("fixed");
        setFixed(fixed);
        setLayoutChildrenFixed(fixed);
    }

    @Override
    public boolean isHasNavigationButton() {
        return Boolean.TRUE.equals(getOptionValue("hasNavigationButton"));
    }

    @Override
    public ComponentOption<Boolean> getHasNavigationButtonOption() {
        return ((ComponentOption<Boolean>) (getOption("hasNavigationButton")));
    }

    @Override
    public S setHasNavigationButton(Boolean hasNavigationButton) {
        setOption("hasNavigationButton", hasNavigationButton);
        setLayoutChildrenHasNavigationButton(hasNavigationButton);
        return self();
    }

    @Override
    public S setHasNavigationButton(Boolean hasNavigationButton, State state) {
        setOption("hasNavigationButton", hasNavigationButton, state);
        setLayoutChildrenHasNavigationButton(hasNavigationButton, state);
        return self();
    }

    @Override
    public S setHasNavigationButtonAllStates(Boolean hasNavigationButton) {
        // HIMADDIE!!
        clearOptionStates("hasNavigationButton");
        setHasNavigationButton(hasNavigationButton);
        setLayoutChildrenHasNavigationButton(hasNavigationButton);
        return self();
    }

    @Override
    public S setHasNavigationButton(ScreenSizeValues<Boolean> screenValues) {
        clearOption("hasNavigationButton", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Boolean v) -> setHasNavigationButton(v, s));
        setLayoutChildrenHasNavigationButton(screenValues);
        return self();
    }

    @Override
    public boolean isHasNavigationButton(State state) {
        return Boolean.TRUE.equals(getOptionValue("hasNavigationButton", state));
    }

    @Override
    public Collection<State> getHasNavigationButtonStates() {
        return getOptionStates("hasNavigationButton");
    }

    @Override
    public ComponentOption<Boolean> getHasNavigationButtonOption(State state) {
        return ((ComponentOption<Boolean>) (getOption("hasNavigationButton", state)));
    }

    @Override
    public boolean isHasNavigationButtonAnyState() {
        Collection<ComponentOption<?>> values = getOptionValues("hasNavigationButton");
        if ((values == null) || values.isEmpty())
            return false;

        return values.stream().anyMatch(e -> ((boolean) (e.getValue())));
    }

    protected void setLayoutChildrenHasNavigationButton(Boolean hasNavigationButton) {
        if (navigationButtonOptions == null)
            navigationButtonOptions = createDefaultNavigationButtonOptions();

        navigationButtonOptions.setVisible(hasNavigationButton);
    }

    protected void setLayoutChildrenHasNavigationButton(Boolean hasNavigationButton, State state) {
        if (navigationButtonOptions == null)
            navigationButtonOptions = createDefaultNavigationButtonOptions();

        navigationButtonOptions.setVisible(hasNavigationButton, state);
    }

    protected void setLayoutChildrenHasNavigationButton(ScreenSizeValues<Boolean> hasNavigationButton) {
        if (navigationButtonOptions == null)
            navigationButtonOptions = createDefaultNavigationButtonOptions();

        navigationButtonOptions.setVisible(hasNavigationButton);
    }

    private void setDefaultHasNavigationButton(Boolean hasNavigationButton) {
        setDefaultOption("hasNavigationButton", hasNavigationButton);
        setLayoutChildrenHasNavigationButton(hasNavigationButton);
    }

    private void setDefaultHasNavigationButton(Boolean hasNavigationButton, State state) {
        setDefaultOption("hasNavigationButton", hasNavigationButton, state);
        setLayoutChildrenHasNavigationButton(hasNavigationButton, state);
    }

    private void setDefaultHasNavigationButtonAllStates(Boolean hasNavigationButton) {
        // HIMADDIE!!
        clearOptionStates("hasNavigationButton");
        setHasNavigationButton(hasNavigationButton);
        setLayoutChildrenHasNavigationButton(hasNavigationButton);
    }

    @Override
    public List<CoreButton> getActions() {
        return ((List<CoreButton>) (getOptionValue("actions")));
    }

    @Override
    public ComponentOption<List<CoreButton>> getActionsOption() {
        return ((ComponentOption<List<CoreButton>>) (getOption("actions")));
    }

    @Override
    public S setActions(List<CoreButton> actions) {
        setOption("actions", actions, true);
        return self();
    }

    @Override
    public S addAction(CoreButton action) {
        List<CoreButton> list = getActions();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setActions(list);
        }
        list.add(action);
        return self();
    }

    @Override
    public S removeAction(CoreButton action) {
        List<CoreButton> list = getActions();
        if (list == null) {
            return self();
        }
        list.remove(action);
        return self();
    }

    private void setDefaultActions(List<CoreButton> actions) {
        setDefaultOption("actions", actions, true);
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getContainerOptions() {
        return containerOptions;
    }

    @Override
    public boolean hasContainerOptions() {
        return containerOptions != null;
    }

    @Override
    public S setContainerOptions(dev.reuise.core.layout.CoreContainerOptions containerOptions) {
        if (!hasContainerOptions())
            this.containerOptions = createDefaultContainerOptions();

        // Merge with default options
        this.containerOptions.merge(containerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.button.CoreIconButtonOptions getNavigationButtonOptions() {
        return navigationButtonOptions;
    }

    @Override
    public boolean hasNavigationButtonOptions() {
        return navigationButtonOptions != null;
    }

    @Override
    public dev.reuise.core.button.CoreIconButtonOptions getOrCreateNavigationButtonOptions() {
        if (!hasNavigationButtonOptions())
            navigationButtonOptions = createDefaultNavigationButtonOptions();

        return navigationButtonOptions;
    }

    @Override
    public S setNavigationButtonOptions(dev.reuise.core.button.CoreIconButtonOptions navigationButtonOptions) {
        if (!hasNavigationButtonOptions())
            this.navigationButtonOptions = createDefaultNavigationButtonOptions();

        // Merge with default options
        this.navigationButtonOptions.merge(navigationButtonOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getTitleContainerOptions() {
        return titleContainerOptions;
    }

    @Override
    public boolean hasTitleContainerOptions() {
        return titleContainerOptions != null;
    }

    @Override
    public S setTitleContainerOptions(dev.reuise.core.layout.CoreContainerOptions titleContainerOptions) {
        if (!hasTitleContainerOptions())
            this.titleContainerOptions = createDefaultTitleContainerOptions();

        // Merge with default options
        this.titleContainerOptions.merge(titleContainerOptions);
        return self();
    }

    @Override
    public dev.reuise.core.layout.CoreContainerOptions getActionsContainerOptions() {
        return actionsContainerOptions;
    }

    @Override
    public boolean hasActionsContainerOptions() {
        return actionsContainerOptions != null;
    }

    @Override
    public S setActionsContainerOptions(dev.reuise.core.layout.CoreContainerOptions actionsContainerOptions) {
        if (!hasActionsContainerOptions())
            this.actionsContainerOptions = createDefaultActionsContainerOptions();

        // Merge with default options
        this.actionsContainerOptions.merge(actionsContainerOptions);
        return self();
    }

    protected CoreContainerOptions createDefaultContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreIconButtonOptions createDefaultNavigationButtonOptions() {
        CoreIconButtonOptions options = getComponentFactory().createIconButtonOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreContainerOptions createDefaultTitleContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreContainerOptions createDefaultActionsContainerOptions() {
        CoreContainerOptions options = getComponentFactory().createContainerOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}