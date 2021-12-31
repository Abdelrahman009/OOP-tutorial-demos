package com.university.oop.demo.fifth.behavioral.templatemethod.bad;

import org.json.simple.JSONObject;

import java.util.Date;

public class FourWheeler extends TransportationUnit {
    private final String tyresType;

    public FourWheeler
        (String name, Date productionDate, String description, int passengersCount,
         String tyresType) {

        super(name, productionDate, description, passengersCount);
        this.tyresType = tyresType;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject jsonObject = super.toJSON();
        jsonObject.put("Tyres type", tyresType);
        return jsonObject;
    }
}
