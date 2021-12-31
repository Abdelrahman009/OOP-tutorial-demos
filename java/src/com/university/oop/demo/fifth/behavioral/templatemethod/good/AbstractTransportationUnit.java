package com.university.oop.demo.fifth.behavioral.templatemethod.good;

import com.university.oop.demo.fifth.behavioral.templatemethod.SerializableClass;
import org.json.simple.JSONObject;

import java.util.Date;

public abstract class AbstractTransportationUnit
    implements SerializableClass {

    private final String name;
    private final Date productionDate;
    private final String description;
    private final int passengersCount;

    public AbstractTransportationUnit
        (String name, Date productionDate, String description, int passengersCount) {

        this.name = name;
        this.productionDate = productionDate;
        this.description = description;
        this.passengersCount = passengersCount;
    }

    @Override
    public final JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", name);
        jsonObject.put("Production date", productionDate);
        jsonObject.put("Description", description);
        jsonObject.put("Passenger count", passengersCount);

        /**
         * This is a template for child classes to implement.
         */
        addTransportationUnitPropertiesToJson(jsonObject);

        return jsonObject;
    }

    protected abstract void addTransportationUnitPropertiesToJson
         (JSONObject object);
}
