package org.example.library;

import org.example.event.Event;

import java.util.ArrayList;

public abstract class Library {
    protected String name;
    protected String address;
    protected ArrayList<Event> events;
    public Library() {};
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addEvent(Event event) {
        events.add(event);
    }


    public String toString() {
        return "Library: [ name: " + name + ", address: " + address + " ]";
    }
}
