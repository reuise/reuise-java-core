package dev.reuise.core;
public interface RootComponent {
    boolean registerComponentType(CoreComponent component);

    boolean isComponentTypeRegistered(Class<? extends CoreComponent> componentType);
}