package com.university.oop.demo.third.creational.builder.concretebuilders;

import com.university.oop.demo.third.creational.builder.SmartHomeHubBuilder;
import com.university.oop.demo.third.creational.builder.battery.LithiumPolymerBattery;
import com.university.oop.demo.third.creational.builder.speaker.StandardSpeaker;

public class GoogleNestSmartHubBuilder extends AbstractSmartHubBuilder {

    public GoogleNestSmartHubBuilder() {
        super("Google Nest Smart House Hub");
    }

    @Override
    public SmartHomeHubBuilder buildSpeakers() {
        this.smartHomeHub.setSpeaker(new StandardSpeaker());
        return this;
    }

    @Override
    public SmartHomeHubBuilder buildDisplay() {
        // has no display!
        return this;
    }

    @Override
    public SmartHomeHubBuilder buildBattery() {
        this.smartHomeHub.setBattery(new LithiumPolymerBattery());
        return this;
    }
}
