package com.bookmyShow.model;

public abstract class User {
    private static int idCounter=0;
    protected int id;
    private String name;

    public User(String name) {
        idCounter += 1;
        this.id = idCounter;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}