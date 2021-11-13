package com.university.oop.demo.third.creational.builder;

import com.university.oop.demo.third.creational.builder.smarthub.SmartHomeHub;

/**
 * The Engineer/Director is the class that knows the
 * exact steps you need to build the object you want.
 */
public class SmartHomeHubEngineer {

    private final SmartHomeHubBuilder builder;

    public SmartHomeHubEngineer(SmartHomeHubBuilder builder) {
        this.builder = builder;
    }

    public SmartHomeHub buildSmartHomeHub() {
        builder.buildBattery()
               .buildDisplay()
               .buildSpeakers();
        return builder.getSmartHub();
    }
}
