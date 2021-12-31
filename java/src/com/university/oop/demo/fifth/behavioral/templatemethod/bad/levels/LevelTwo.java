package com.university.oop.demo.fifth.behavioral.templatemethod.bad.levels;

import org.json.simple.JSONObject;

import java.util.Date;

public class LevelTwo extends LevelOne {
    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("levelTwo", new Date());
        return object;
    }
}
