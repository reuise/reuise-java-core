package dev.reuise.core.skeleton;
import dev.reuise.core.CoreComponentFactory;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
public interface CoreSkeletonPartOptions {
    SkeletonShape getShape();

    ComponentOption<SkeletonShape> getShapeOption();

    CoreSkeletonPartOptions setShape(SkeletonShape shape);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    CoreComponentFactory getComponentFactory();

    CoreSkeleton getComponent();
}