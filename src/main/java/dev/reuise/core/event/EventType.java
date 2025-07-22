package dev.reuise.core.event;

public class EventType {
    private final String typeName;

    public EventType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public static EventType of(String typeName) {
        return new EventType(typeName);
    }
}