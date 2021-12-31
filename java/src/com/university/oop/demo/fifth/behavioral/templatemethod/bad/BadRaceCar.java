package com.university.oop.demo.fifth.behavioral.templatemethod.bad;

import org.json.simple.JSONObject;

import java.util.Date;

public class BadRaceCar extends Car {
    private final String windowNetColor;

    public BadRaceCar
        (String name, Date productionDate, String description, int passengersCount,
         String tyresType, String carNumber, boolean is4x4, String windowNetColor) {
        super(name, productionDate, description, passengersCount, tyresType, carNumber, is4x4);

        this.windowNetColor = windowNetColor;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject jsonObject = super.toJSON();
        jsonObject.put("Window net color", windowNetColor);
        return jsonObject;
    }
}
