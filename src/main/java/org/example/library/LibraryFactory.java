package org.example.library;

/**
 * Returns a library based on the type given by user. Eg, Public or Academic
 */
public class LibraryFactory {
    public static Library createLibrary(String type, String name, String address) {
        switch (type) {
            case "public":
                return new PublicLibrary(name, address);
            case "academic":
                return new AcademicLibrary(name, address);
            default:
                throw new IllegalArgumentException("Invalid library type: " + type);
        }
    }
}
