package org.example.event;

public class PublicEventFactory implements EventFactory{

    @Override
    public Event makeEvent(EventType eventName) {
        switch (eventName){
            case EventType.MOVIE_NIGHT:
                return new Event() {
                }
        }
    }
}
