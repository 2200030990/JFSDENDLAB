package com.klef.jfsd.exam.inheritance_mapping;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
    private int maxSpeed;
    private String color;
    private int numberOfDoors;

    // Getters and Setters
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
