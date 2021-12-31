package com.university.oop.demo.fifth.behavioral.templatemethod.good;

import org.json.simple.JSONObject;

import java.util.Date;

public abstract class AbstractFourWheeler extends AbstractTransportationUnit {
    private final String tyresType;

    public AbstractFourWheeler
        (String name, Date productionDate, String description, int passengersCount,
         String tyresType) {

        super(name, productionDate, description, passengersCount);
        this.tyresType = tyresType;
    }

    @Override
    protected final void addTransportationUnitPropertiesToJson(JSONObject object) {
        object.put("Tyres type", tyresType);
        addFourWheelerPropertiesToJson(object);
    }

    protected abstract void addFourWheelerPropertiesToJson(JSONObject object);
}
