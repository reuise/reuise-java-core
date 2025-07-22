package dev.reuise.core.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractCoreLinkOptions<S extends AbstractCoreLinkOptions<S>> implements CoreComponentOptions , CoreLinkOptions {
    protected AbstractCoreLinkOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getText() {
        return ((String) (getOptionValue("text")));
    }

    @Override
    public ComponentOption<String> getTextOption() {
        return ((ComponentOption<String>) (getOption("text")));
    }

    @Override
    public S setText(String text) {
        setOption("text", text);
        return self();
    }

    private void setDefaultText(String text) {
        setDefaultOption("text", text);
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
        return self();
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
    }

    @Override
    public String getTarget() {
        return ((String) (getOptionValue("target")));
    }

    @Override
    public ComponentOption<String> getTargetOption() {
        return ((ComponentOption<String>) (getOption("target")));
    }

    @Override
    public S setTarget(String target) {
        setOption("target", target);
        return self();
    }

    private void setDefaultTarget(String target) {
        setDefaultOption("target", target);
    }

    protected abstract S self();
}