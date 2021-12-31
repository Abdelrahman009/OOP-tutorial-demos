package com.university.oop.demo.fifth.behavioral.templatemethod.bad;

import com.university.oop.demo.fifth.behavioral.templatemethod.SerializableClass;
import org.json.simple.JSONObject;

import java.util.Date;

public class TransportationUnit implements SerializableClass {
    private final String name;
    private final Date productionDate;
    private final String description;
    private final int passengersCount;

    public TransportationUnit
        (String name, Date productionDate, String description, int passengersCount) {

        this.name = name;
        this.productionDate = productionDate;
        this.description = description;
        this.passengersCount = passengersCount;
    }

    @Override
    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", name);
        jsonObject.put("Production date", productionDate);
        jsonObject.put("Description", description);
        jsonObject.put("Passenger count", passengersCount);
        return jsonObject;
    }
}
