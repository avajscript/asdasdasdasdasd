package org.example.library;

public abstract class Library {
    protected String name;
    protected String address;

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

    public String toString() {
        return "Library: [ name: " + name + ", address: " + address + " ]";
    }
}
