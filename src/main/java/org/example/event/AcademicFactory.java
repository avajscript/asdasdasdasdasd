package org.example.event;

import org.example.constants.Constants;

public class AcademicFactory implements EventFactory {
    @Override
    public Event makeEvent(EventType eventName) {
        Event event;
        switch (eventName){
            case EventType.WORKSHOP:
                event = new PublicEvent();
                event.setEventName((String) "" + EventType.WORKSHOP);
                event.calculateAdmissionFee(Constants.WORKSHOP_DURATION, Constants.WORKSHOP_RATE);
                return event;
            default:
                throw new IllegalArgumentException("Invalid event type: " + eventName);
        }
    }
}
