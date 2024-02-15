package org.example;

import org.example.library.Library;
import org.example.library.LibraryFactory;

public class Main {
    public static void main(String[] args) {
        Library l1 = LibraryFactory.createLibrary("academic", "Ottawa Public Library", "300 Ottawa St");
        Library l2 = LibraryFactory.createLibrary("academic", "Algonquin Academic library", "1385 Woodroffe Ave");

        System.out.println(l1.toString());
        System.out.println(l2.toString());

    }
}