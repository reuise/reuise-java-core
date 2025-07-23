package dev.reuise.core.event;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Events {
    private Events() {
    }
    
    public static final Set<EventType> of(EventType... types) {
        Set<EventType> set = new HashSet<EventType>();
        Collections.addAll(set, types);
        return set;
    }
    
}
