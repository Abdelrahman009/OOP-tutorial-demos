package com.university.oop.demo.fifth.behavioral.templatemethod.bad;

import org.json.simple.JSONObject;

import java.util.Date;

public class Motorcycle extends TwoWheeler {
    private final String motorType;

    public Motorcycle(String name, Date productionDate, String description,
                      int passengersCount, float seatHeight, String motorType) {

        super(name, productionDate, description, passengersCount, seatHeight);
        this.motorType = motorType;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject object = super.toJSON();
        object.put("Motor type", motorType);
        return object;
    }
}
