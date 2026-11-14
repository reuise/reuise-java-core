package dev.reuise.core.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreInlineTextPartOptions;
public abstract class AbstractCoreFloatingActionButtonOptions<S extends AbstractCoreFloatingActionButtonOptions<S>> implements CoreComponentOptions , CoreFloatingActionButtonOptions {
    // Indirect layout child
    private CoreIconPartOptions startIconOptions;

    // Indirect layout child
    private CoreInlineTextPartOptions labelContainerOptions;

    // Indirect layout child
    private CoreIconPartOptions endIconOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions badgeOptions;

    protected AbstractCoreFloatingActionButtonOptions() {
        badgeOptions = createDefaultBadgeOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        startIconOptions = getStartIconOptions();
        labelContainerOptions = getLabelContainerOptions();
        endIconOptions = getEndIconOptions();
        setDefaultAccessibleLabel("Help");
        setDefaultCorner("bottom-right");
        setDefaultUnreadCount(0);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getAccessibleLabel() {
        return ((String) (getOptionValue("accessibleLabel")));
    }

    @Override
    public ComponentOption<String> getAccessibleLabelOption() {
        return ((ComponentOption<String>) (getOption("accessibleLabel")));
    }

    @Override
    public S setAccessibleLabel(String accessibleLabel) {
        setOption("accessibleLabel", accessibleLabel, true);
        setLayoutChildrenAccessibleLabel(accessibleLabel);
        return self();
    }

    protected void setLayoutChildrenAccessibleLabel(String accessibleLabel) {
    }

    private void setDefaultAccessibleLabel(String accessibleLabel) {
        setDefaultOption("accessibleLabel", accessibleLabel, true);
        setLayoutChildrenAccessibleLabel(accessibleLabel);
    }

    @Override
    public String getCorner() {
        return ((String) (getOptionValue("corner")));
    }

    @Override
    public ComponentOption<String> getCornerOption() {
        return ((ComponentOption<String>) (getOption("corner")));
    }

    @Override
    public S setCorner(String corner) {
        setOption("corner", corner, true);
        setLayoutChildrenCorner(corner);
        return self();
    }

    protected void setLayoutChildrenCorner(String corner) {
    }

    private void setDefaultCorner(String corner) {
        setDefaultOption("corner", corner, true);
        setLayoutChildrenCorner(corner);
    }

    @Override
    public Integer getUnreadCount() {
        return ((Integer) (getOptionValue("unreadCount")));
    }

    @Override
    public ComponentOption<Integer> getUnreadCountOption() {
        return ((ComponentOption<Integer>) (getOption("unreadCount")));
    }

    @Override
    public S setUnreadCount(Integer unreadCount) {
        setOption("unreadCount", unreadCount, true);
        setLayoutChildrenUnreadCount(unreadCount);
        return self();
    }

    protected void setLayoutChildrenUnreadCount(Integer unreadCount) {
    }

    private void setDefaultUnreadCount(Integer unreadCount) {
        setDefaultOption("unreadCount", unreadCount, true);
        setLayoutChildrenUnreadCount(unreadCount);
    }

    @Override
    public dev.reuise.core.text.CoreInlineTextOptions getBadgeOptions() {
        return badgeOptions;
    }

    @Override
    public boolean hasBadgeOptions() {
        return badgeOptions != null;
    }

    @Override
    public S setBadgeOptions(dev.reuise.core.text.CoreInlineTextOptions badgeOptions) {
        if (!hasBadgeOptions())
            this.badgeOptions = createDefaultBadgeOptions();

        // Merge with default options
        this.badgeOptions.merge(badgeOptions);
        return self();
    }

    protected CoreInlineTextOptions createDefaultBadgeOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}
