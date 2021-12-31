package com.university.oop.demo.fifth.behavioral.templatemethod.good;

import org.json.simple.JSONObject;

import java.util.Date;

public class GoodRaceCar extends AbstractCar {
    private final String windowNetColor;

    public GoodRaceCar
            (String name, Date productionDate, String description, int passengersCount,
             String tyresType,  String carNumber, boolean is4x4, String windowNetColor) {

        super(name, productionDate, description, passengersCount, tyresType, carNumber, is4x4);
        this.windowNetColor = windowNetColor;
    }

    @Override
    protected final void addCarPropertiesToJson(JSONObject object) {
        object.put("Window net color", windowNetColor);
    }
}
