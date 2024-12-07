package com.klef.jfsd.exam.inheritance_mapping;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private int payloadCapacity;

    // Getters and Setters
    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }
}
