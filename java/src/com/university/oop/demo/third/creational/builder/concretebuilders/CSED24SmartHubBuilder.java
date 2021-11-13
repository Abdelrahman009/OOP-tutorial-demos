package com.university.oop.demo.third.creational.builder.concretebuilders;

import com.university.oop.demo.third.creational.builder.SmartHomeHubBuilder;
import com.university.oop.demo.third.creational.builder.battery.LithiumIonBattery;
import com.university.oop.demo.third.creational.builder.display.LCDDisplay;
import com.university.oop.demo.third.creational.builder.speaker.StereoSpeaker;

public class CSED24SmartHubBuilder extends AbstractSmartHubBuilder {

    public CSED24SmartHubBuilder() {
        super("CSED 24 Smart House Hub");
    }

    @Override
    public SmartHomeHubBuilder buildSpeakers() {
        this.smartHomeHub.setSpeaker(new StereoSpeaker());
        return this;
    }

    @Override
    public SmartHomeHubBuilder buildDisplay() {
        this.smartHomeHub.setDisplay(new LCDDisplay());
        return this;
    }

    @Override
    public SmartHomeHubBuilder buildBattery() {
        this.smartHomeHub.setBattery(new LithiumIonBattery());
        return this;
    }
}
