package dev.reuise.core.event;
public interface Event {
    public static final EventType DOUBLE_CLICK = new EventType("dblclick");

    public static final EventType CLICK = new EventType("click");

    public static final EventType SCROLL = new EventType("scroll");

    public static final EventType FOCUS_OUT = new EventType("focusout");

    public static final EventType TOUCH_CANCEL = new EventType("touchcancel");

    public static final EventType TOUCH_START = new EventType("touchstart");

    public static final EventType FOCUS = new EventType("focus");

    public static final EventType TOUCH_END = new EventType("touchend");

    public static final EventType FOCUS_IN = new EventType("focusin");

    public static final EventType TOUCH_MOVE = new EventType("touchmove");
}