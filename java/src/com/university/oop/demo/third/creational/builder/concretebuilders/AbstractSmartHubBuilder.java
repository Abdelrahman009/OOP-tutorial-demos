package com.university.oop.demo.third.creational.builder.concretebuilders;

import com.university.oop.demo.third.creational.builder.SmartHomeHubBuilder;
import com.university.oop.demo.third.creational.builder.smarthub.SmartHomeHub;
import com.university.oop.demo.third.creational.builder.smarthub.SmartHouseHubImpl;

public abstract class AbstractSmartHubBuilder implements SmartHomeHubBuilder {
    SmartHomeHub smartHomeHub;

    public AbstractSmartHubBuilder(String deviceName) {
        this.smartHomeHub = new SmartHouseHubImpl(deviceName);
    }

    @Override
    public SmartHomeHub getSmartHub() {
        return this.smartHomeHub;
    }
}
