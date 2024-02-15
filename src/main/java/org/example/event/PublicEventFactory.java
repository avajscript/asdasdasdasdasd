package org.example.event;

import org.example.constants.Constants;

public class PublicEventFactory implements EventFactory{

    @Override
    public Event makeEvent(EventType eventName) {
        Event event;
        switch (eventName){
            case EventType.MOVIE_NIGHT:
                event = new PublicEvent();
                event.setEventName((String) "" + EventType.MOVIE_NIGHT);
                event.calculateAdmissionFee(Constants.MOVIE_NIGHT_DURATION, Constants.MOVIE_NIGHT_RATE);
                return event;
            case EventType.KIDS_STORY:
                event = new PublicEvent();
                event.setEventName((String) "" + EventType.KIDS_STORY);
                event.calculateAdmissionFee(Constants.KIDS_STORYTIME_DURATION, Constants.KIDS_STORYTIME_RATE);
                return event;
            default:
                throw new IllegalArgumentException("Invalid event type: " + eventName);
        }
    }
}
