package com.deepakshankar.cartracker.entity;

/**
 * This is an enum that defines the different types of alerts for a vehicle
 *
 * @author Deepak Shankar
 */
public enum AlertType {

    HIGH("HIGH", 1), MEDIUM("MEDIUM", 2), LOW("LOW", 3);
    private String name;
    private int id;

    AlertType(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
