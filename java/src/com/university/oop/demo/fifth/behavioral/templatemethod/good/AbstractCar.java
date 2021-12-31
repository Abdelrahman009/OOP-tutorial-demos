package com.university.oop.demo.fifth.behavioral.templatemethod.good;

import org.json.simple.JSONObject;

import java.util.Date;

public abstract class AbstractCar extends AbstractFourWheeler {
    private final String carNumber;
    private final boolean is4x4;

    public AbstractCar
        (String name, Date productionDate, String description, int passengersCount,
         String tyresType, String carNumber, boolean is4x4) {
        super(name, productionDate, description, passengersCount, tyresType);

        this.carNumber = carNumber;
        this.is4x4 = is4x4;
    }

    @Override
    protected final void addFourWheelerPropertiesToJson(JSONObject object) {
        object.put("Car number", carNumber);
        object.put("Is 4x4", is4x4);
        addCarPropertiesToJson(object);
    }

    protected abstract void addCarPropertiesToJson(JSONObject object);
}
