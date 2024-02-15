package org.example.event;

public interface EventFactory {
    public Event makeEvent(EventType eventName);
}
