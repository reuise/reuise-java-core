package dev.reuise.core.basecomponent;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.RootComponent;
import dev.reuise.core.theme.Theme;
public interface CoreBaseComponentPart extends ComponentPart , CoreBaseComponentFeatures {
    void onInitializeComponentType(RootComponent rootComponent);

    void addPart(ComponentPart.Type type, ComponentPart part);

    <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options);

    CoreBaseComponent getComponent();

    boolean hasWrapper();

    boolean isInitialized();

    void log(Object obj);

    void removeFromParent();

    RootComponent getRootComponent();

    void setRootComponent(RootComponent rootComponent);

    CoreBaseComponentPart setTheme(Theme theme);

    CoreComponentFactory getComponentFactory();
}