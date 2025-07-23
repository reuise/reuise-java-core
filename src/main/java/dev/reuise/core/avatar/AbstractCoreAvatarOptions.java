package dev.reuise.core.avatar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.option.ComponentOption;
import java.util.Collection;
public abstract class AbstractCoreAvatarOptions<S extends AbstractCoreAvatarOptions<S>> implements CoreAvatarOptions , CoreComponentOptions {
    protected dev.reuise.core.image.CoreImageOptions imageOptions;

    protected dev.reuise.core.badge.CoreBadgeOptions badgeOptions;

    protected AbstractCoreAvatarOptions() {
        imageOptions = createDefaultImageOptions();
        badgeOptions = createDefaultBadgeOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultUrl("data:image/svg+xml;base64,PHN2ZyB2aWV3Qm94PSIwIDAgODAwIDgwMCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWw6c3BhY2U9InByZXNlcnZlIiBzdHlsZT0iZmlsbC1ydWxlOmV2ZW5vZGQ7Y2xpcC1ydWxlOmV2ZW5vZGQ7c3Ryb2tlLWxpbmVqb2luOnJvdW5kO3N0cm9rZS1taXRlcmxpbWl0OjIiPjxwYXRoIGQ9Ik04MC4xNjkgODAwLjM2M2MuODM4LTEzMy43NjkgODQuMzEyLTI1OC4wNTIgMjAxLjc3OC0zMDQuODc3YTE5MC41MiAxOTAuNTIgMCAwIDAgMTE3LjkzMiA0MS4wNTIgMTkwLjc4OCAxOTAuNzg4IDAgMCAwIDExNy45NzYtNDEuMDUyYzExNy40NDQgNDYuODI1IDIwMC44OTYgMTcxLjEwOCAyMDEuNzM0IDMwNC44NzdIODAuMTY5eiIgc3R5bGU9ImZpbGw6I2ZmZiIvPjxjaXJjbGUgY3g9IjM5OS44NzkiIGN5PSIzMjUuMDEzIiByPSIxNzAuNDczIiBzdHlsZT0iZmlsbDojZmZmIi8+PC9zdmc+");
        setDefaultSize(AvatarSize.MEDIUM);
        setDefaultShape(AvatarShape.CIRCLE);
        setDefaultBadgeVisible(false);
        return true;
    }

    public void onInitialize() {
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
        if (imageOptions == null)
            imageOptions = createDefaultImageOptions();

        imageOptions.setUrl(url);
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
        setLayoutChildrenUrl(url);
    }

    @Override
    public String getDisplayName() {
        return ((String) (getOptionValue("displayName")));
    }

    @Override
    public ComponentOption<String> getDisplayNameOption() {
        return ((ComponentOption<String>) (getOption("displayName")));
    }

    @Override
    public S setDisplayName(String displayName) {
        setOption("displayName", displayName);
        setLayoutChildrenDisplayName(displayName);
        return self();
    }

    protected void setLayoutChildrenDisplayName(String displayName) {
    }

    private void setDefaultDisplayName(String displayName) {
        setDefaultOption("displayName", displayName);
        setLayoutChildrenDisplayName(displayName);
    }

    @Override
    public AvatarSize getSize() {
        return ((AvatarSize) (getOptionValue("size")));
    }

    @Override
    public ComponentOption<AvatarSize> getSizeOption() {
        return ((ComponentOption<AvatarSize>) (getOption("size")));
    }

    @Override
    public S setSize(AvatarSize size) {
        setOption("size", size);
        setLayoutChildrenSize(size);
        return self();
    }

    @Override
    public S setSize(AvatarSize size, State state) {
        setOption("size", size, state);
        setLayoutChildrenSize(size, state);
        return self();
    }

    @Override
    public S setSizeAllStates(AvatarSize size) {
        // HIMADDIE!!
        clearOptionStates("size");
        setSize(size);
        setLayoutChildrenSize(size);
        return self();
    }

    @Override
    public S setSize(ScreenSizeValues<AvatarSize> screenValues) {
        clearOption("size", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,AvatarSize v) -> setSize(v, s));
        setLayoutChildrenSize(screenValues);
        return self();
    }

    @Override
    public AvatarSize getSize(State state) {
        return ((AvatarSize) (getOptionValue("size", state)));
    }

    @Override
    public Collection<State> getSizeStates() {
        return getOptionStates("size");
    }

    @Override
    public ComponentOption<AvatarSize> getSizeOption(State state) {
        return ((ComponentOption<AvatarSize>) (getOption("size", state)));
    }

    protected void setLayoutChildrenSize(AvatarSize size) {
    }

    protected void setLayoutChildrenSize(AvatarSize size, State state) {
    }

    protected void setLayoutChildrenSize(ScreenSizeValues<AvatarSize> size) {
    }

    private void setDefaultSize(AvatarSize size) {
        setDefaultOption("size", size);
        setLayoutChildrenSize(size);
    }

    private void setDefaultSize(AvatarSize size, State state) {
        setDefaultOption("size", size, state);
        setLayoutChildrenSize(size, state);
    }

    private void setDefaultSizeAllStates(AvatarSize size) {
        // HIMADDIE!!
        clearOptionStates("size");
        setSize(size);
        setLayoutChildrenSize(size);
    }

    @Override
    public AvatarShape getShape() {
        return ((AvatarShape) (getOptionValue("shape")));
    }

    @Override
    public ComponentOption<AvatarShape> getShapeOption() {
        return ((ComponentOption<AvatarShape>) (getOption("shape")));
    }

    @Override
    public S setShape(AvatarShape shape) {
        setOption("shape", shape);
        setLayoutChildrenShape(shape);
        return self();
    }

    protected void setLayoutChildrenShape(AvatarShape shape) {
    }

    private void setDefaultShape(AvatarShape shape) {
        setDefaultOption("shape", shape);
        setLayoutChildrenShape(shape);
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
    public dev.reuise.core.image.CoreImageOptions getImageOptions() {
        return imageOptions;
    }

    @Override
    public boolean hasImageOptions() {
        return imageOptions != null;
    }

    @Override
    public S setImageOptions(dev.reuise.core.image.CoreImageOptions imageOptions) {
        if (!hasImageOptions())
            this.imageOptions = createDefaultImageOptions();

        // Merge with default options
        this.imageOptions.merge(imageOptions);
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

    protected CoreImageOptions createDefaultImageOptions() {
        CoreImageOptions options = getComponentFactory().createImageOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected CoreBadgeOptions createDefaultBadgeOptions() {
        CoreBadgeOptions options = getComponentFactory().createBadgeOptions();
        options.setRequiredLayoutComponent(true);
        return options;
    }

    protected abstract S self();
}