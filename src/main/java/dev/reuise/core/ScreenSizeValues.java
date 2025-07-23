package dev.reuise.core;

import java.util.EnumMap;
import java.util.Map;

public class ScreenSizeValues<T> {
    private Map<ScreenSize, T> values = new EnumMap<>(ScreenSize.class);

    public ScreenSizeValues(T smallValue, T largeValue) {
        this(smallValue, smallValue, largeValue, largeValue, largeValue);
    }

    public ScreenSizeValues(T smallValue,  T mediumValue, T largeValue) {
        this(smallValue, smallValue, mediumValue, largeValue, largeValue);
    }

    public ScreenSizeValues(T extraSmallValue, T smallValue, T mediumValue, T largeValue, T extraLargeValue) {
        values.put(ScreenSize.EXTRA_SMALL, extraSmallValue);
        values.put(ScreenSize.SMALL, smallValue);
        values.put(ScreenSize.MEDIUM, mediumValue);
        values.put(ScreenSize.LARGE, largeValue);
        values.put(ScreenSize.EXTRA_LARGE, extraLargeValue);
    }

    public static <T> ScreenSizeValues<T> of(T extraSmallValue, T smallValue, T mediumValue, T largeValue, T extraLargeValue) {
        return new ScreenSizeValues<T>(extraSmallValue, smallValue, mediumValue, largeValue, extraLargeValue);
    }

    public static <T> ScreenSizeValues<T> of(T smallValue, T mediumValue, T largeValue) {
        return new ScreenSizeValues<T>(smallValue, mediumValue, largeValue);
    }

    public static <T> ScreenSizeValues<T> of(T smallValue, T largeValue) {
        return new ScreenSizeValues<T>(smallValue, largeValue);
    }

    public Map<ScreenSize, T> getValues() {
        return values;
    }

    public T getValue(ScreenSize screenSize) {
        return values.get(screenSize);
    }

    public void iterate(ScreenSizeValuesIterateHandler<T> handler) {
        values.entrySet().stream().forEach(e -> handler.iterate(e.getKey(), e.getValue()));
    }

    public static interface ScreenSizeValuesIterateHandler<T> {
        public void iterate(ScreenSize screenSize, T value);
    }
}