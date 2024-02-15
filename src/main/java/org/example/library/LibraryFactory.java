package org.example.library;

/**
 * Returns a library based on the type given by user. Eg, Public or Academic
 */
public class LibraryFactory {
    public static Library createLibrary(String type) {
        switch (type) {
            case "public":
                return new PublicLibrary();
            case "academic":
                return new AcademicLibrary();
            default:
                throw new IllegalArgumentException("Invalid library type: " + type);
        }
    }
}
