package com.university.oop.demo.fifth.behavioral.templatemethod.bad.levels;

import com.university.oop.demo.fifth.behavioral.templatemethod.SerializableClass;
import org.json.simple.JSONObject;

import java.util.Date;

public class LevelOne implements SerializableClass {
    @Override
    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("levelOne", new Date());
        return object;
    }
}
