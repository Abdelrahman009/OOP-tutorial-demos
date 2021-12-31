package com.university.oop.demo.fifth.behavioral.templatemethod.bad;

import org.json.simple.JSONObject;

import java.util.Date;

public class DefaultCar extends Car {
    public DefaultCar() {
        super("Default name", new Date(), "This is a default description",
                4, "Default tyres",
                "201313", false);
    }

    @Override
    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Default", "default car with default properties");
        return jsonObject;
    }
}
