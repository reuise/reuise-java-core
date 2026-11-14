package dev.reuise.core;

public enum TextDirection {
    LTR("ltr"),
    RTL("rtl"),
    AUTO("auto");

    private final String attributeValue;

    TextDirection(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getAttributeValue() {
        return attributeValue;
    }
}
