package com.university.oop.demo.fifth.behavioral.templatemethod.bad;

import org.json.simple.JSONObject;

import java.util.Date;

public class Car extends FourWheeler {
    private final String carNumber;
    private final boolean is4x4;

    public Car
        (String name, Date productionDate, String description, int passengersCount,
         String tyresType, String carNumber, boolean is4x4) {
        super(name, productionDate, description, passengersCount, tyresType);

        this.carNumber = carNumber;
        this.is4x4 = is4x4;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject jsonObject = super.toJSON();
        jsonObject.put("Car number", carNumber);
        jsonObject.put("Is 4x4", is4x4);
        return jsonObject;
    }
}
