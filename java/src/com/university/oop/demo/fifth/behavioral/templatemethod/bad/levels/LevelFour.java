package com.university.oop.demo.fifth.behavioral.templatemethod.bad.levels;

import org.json.simple.JSONObject;

import java.util.Date;

public class LevelFour extends LevelThree {
    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("levelFour", new Date());
        return object;
    }
}
