package com.university.oop.demo.third.creational.builder;

import com.university.oop.demo.third.creational.builder.smarthub.SmartHomeHub;

/**
 * Encapsulates all the logic of building a composite
 * smart house hub class.
 */
public interface SmartHomeHubBuilder {
    SmartHomeHubBuilder buildSpeakers();
    SmartHomeHubBuilder buildDisplay();
    SmartHomeHubBuilder buildBattery();
    SmartHomeHub getSmartHub();
}
