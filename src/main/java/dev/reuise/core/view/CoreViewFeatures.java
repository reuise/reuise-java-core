package dev.reuise.core.view;
public interface CoreViewFeatures {
    String getTitle();

    CoreViewFeatures setTitle(String title);

    boolean isRevealed();

    CoreViewFeatures setRevealed(Boolean revealed);
}