package org.example;

import org.example.event.Event;
import org.example.event.EventType;
import org.example.event.PublicEventFactory;
import org.example.library.Library;
import org.example.library.LibraryFactory;

public class Main {
    public static void main(String[] args) {

        // LIBRARY SECTION
        // create libraries
        Library l1 = LibraryFactory.createLibrary("academic", "Ottawa Public Library", "300 Ottawa St");
        Library l2 = LibraryFactory.createLibrary("academic", "Algonquin Academic library", "1385 Woodroffe Ave");

        // output libraries
        System.out.println(l1.toString());
        System.out.println(l2.toString());


        PublicEventFactory publicEventFactory = new PublicEventFactory();
        Event event = publicEventFactory.makeEvent(EventType.MOVIE_NIGHT);

        l1.addEvent(event);


    }
}