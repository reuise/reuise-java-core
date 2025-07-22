package dev.reuise.core.tabs;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreInlineTextOptions;
public abstract class AbstractCoreTabOptions<S extends AbstractCoreTabOptions<S>> implements CoreTabOptions , CoreComponentOptions {
    protected dev.reuise.core.link.CoreLinkOptions linkOptions;

    protected dev.reuise.core.badge.CoreBadgeOptions badgeOptions;

    protected dev.reuise.core.icon.CoreIconOptions iconOptions;

    protected dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions;

    protected AbstractCoreTabOptions() {
        labelContainerOptions = createDefaultLabelContainerOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultBadgeVisible(false);
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
        setLayoutChildrenLabel(label);
        return self();
    }

    protected void setLayoutChildrenLabel(String label) {
        if (labelContainerOptions == null)
            labelContainerOptions = createDefaultLabelContainerOptions();

        labelContainerOptions.setText(label);
    }

    private void setDefaultLabel(String label) {
        setDefaultOption("label", label);
        setLayoutChildrenLabel(label);
    }

    @Override
    public String getUrl() {
        return ((String) (getOptionValue("url")));
    }

    @Override
    public ComponentOption<String> getUrlOption() {
        return ((ComponentOption<String>) (getOption("url")));
    }

    @Override
    public S setUrl(String url) {
        setOption("url", url);
        setLayoutChildrenUrl(url);
        return self();
    }

    protected void setLayoutChildrenUrl(String url) {
        if (linkOptions == null)
            linkOptions = createDefaultLinkOptions();

        linkOptions.setUrl(url);
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
        setLayoutChildrenUrl(url);
    }

    @Override
    public boolean isBadgeVisible() {
        return Boolean.TRUE.equals(getOptionValue("badgeVisible"));
    }

    @Override
    public ComponentOption<Boolean> getBadgeVisibleOption() {
        return ((ComponentOption<Boolean>) (getOption("badgeVisible")));
    }

    @Override
    public S setBadgeVisible(Boolean badgeVisible) {
        setOption("badgeVisible", badgeVisible);
        setLayoutChildrenBadgeVisible(badgeVisible);
        return self();
    }

    protected void setLayoutChildrenBadgeVisible(Boolean badgeVisible) {
        if (badgeOptions == null)
            badgeOptions = createDefaultBadgeOptions();

        badgeOptions.setVisible(badgeVisible);
    }

    private void setDefaultBadgeVisible(Boolean badgeVisible) {
        setDefaultOption("badgeVisible", badgeVisible);
        setLayoutChildrenBadgeVisible(badgeVisible);
    }

    @Override
    public String getBadgeLabel() {
        return ((String) (getOptionValue("badgeLabel")));
    }

    @Override
    public ComponentOption<String> getBadgeLabelOption() {
        return ((ComponentOption<String>) (getOption("badgeLabel")));
    }

    @Override
    public S setBadgeLabel(String badgeLabel) {
        setOption("badgeLabel", badgeLabel);
        setLayoutChildrenBadgeLabel(badgeLabel);
        return self();
    }

    protected void setLayoutChildrenBadgeLabel(String badgeLabel) {
        if (badgeOptions == null)
            badgeOptions = createDefaultBadgeOptions();

        badgeOptions.setLabel(badgeLabel);
    }

    private void setDefaultBadgeLabel(String badgeLabel) {
        setDefaultOption("badgeLabel", badgeLabel);
        setLayoutChildrenBadgeLabel(badgeLabel);
    }

    @Override
    public dev.reuise.core.link.CoreLinkOptions getLinkOptions() {
        return linkOptions;
    }

    @Override
    public boolean hasLinkOptions() {
        return linkOptions != null;
    }

    @Override
    public dev.reuise.core.link.CoreLinkOptions getOrCreateLinkOptions() {
        if (!hasLinkOptions())
            linkOptions = createDefaultLinkOptions();

        return linkOptions;
    }

    @Override
    public S setLinkOptions(dev.reuise.core.link.CoreLinkOptions linkOptions) {
        if (!hasLinkOptions())
            this.linkOptions = createDefaultLinkOptions();

        // Merge with default options
        this.linkOptions.merge(linkOptions);
        return self();
    }

    @Override
    public dev.reuise.core.badge.CoreBadgeOptions getBadgeOptions() {
        return badgeOptions;
    }

    @Override
    public boolean hasBadgeOptions() {
        return badgeOptions != null;
    }

    @Override
    public S setBadgeOptions(dev.reuise.core.badge.CoreBadgeOptions badgeOptions) {
        if (!hasBadgeOptions())
            this.badgeOptions = createDefaultBadgeOptions();

        // Merge with default options
        this.badgeOptions.merge(badgeOptions);
        return self();
    }

    @Override
    public dev.reuise.core.icon.CoreIconOptions getIconOptions() {
        return iconOptions;
    }

    @Override
    public boolean hasIconOptions() {
        return iconOptions != null;
    }

    @Override
    public S setIconOptions(dev.reuise.core.icon.CoreIconOptions iconOptions) {
        if (!hasIconOptions())
            this.iconOptions = createDefaultIconOptions();

        // Merge with default options
        this.iconOptions.merge(iconOptions);
        return self();
    }

    @Override
    public dev.reuise.core.text.CoreInlineTextOptions getLabelContainerOptions() {
        return labelContainerOptions;
    }

    @Override
    public boolean hasLabelContainerOptions() {
        return labelContainerOptions != null;
    }

    @Override
    public S setLabelContainerOptions(dev.reuise.core.text.CoreInlineTextOptions labelContainerOptions) {
        if (!hasLabelContainerOptions())
            this.labelContainerOptions = createDefaultLabelContainerOptions();

        // Merge with default options
        this.labelContainerOptions.merge(labelContainerOptions);
        return self();
    }

    protected CoreLinkOptions createDefaultLinkOptions() {
        CoreLinkOptions options = getComponentFactory().createLinkOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreBadgeOptions createDefaultBadgeOptions() {
        CoreBadgeOptions options = getComponentFactory().createBadgeOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreIconOptions createDefaultIconOptions() {
        CoreIconOptions options = getComponentFactory().createIconOptions();
        options.setRequiredLayoutComponent(false);
        return options;
    }

    protected CoreInlineTextOptions createDefaultLabelContainerOptions() {
        CoreInlineTextOptions options = getComponentFactory().createInlineTextOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}