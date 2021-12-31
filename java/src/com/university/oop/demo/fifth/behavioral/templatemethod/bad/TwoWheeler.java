package com.university.oop.demo.fifth.behavioral.templatemethod.bad;

import org.json.simple.JSONObject;

import java.util.Date;

public class TwoWheeler extends TransportationUnit {
    private final float seatHeight;

    public TwoWheeler
        (String name, Date productionDate, String description, int passengersCount,
         float seatHeight) {

        super(name, productionDate, description, passengersCount);
        this.seatHeight = seatHeight;
    }

    @Override
    public JSONObject toJSON() {
        /**
         * Oops I forgot to call super.toJSON()
         */
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Seat Height", seatHeight);
        return jsonObject;
    }
}
