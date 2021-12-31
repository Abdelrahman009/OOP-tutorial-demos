package com.university.oop.demo.fifth.behavioral.templatemethod.bad.levels;

import org.json.simple.JSONObject;

import java.util.Date;

public class LevelThree extends LevelTwo {
    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("levelThree", new Date());
        return object;
    }
}
