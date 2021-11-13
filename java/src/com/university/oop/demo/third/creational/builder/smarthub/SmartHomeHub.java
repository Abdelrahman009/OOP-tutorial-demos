package com.university.oop.demo.third.creational.builder.smarthub;

import com.university.oop.demo.third.creational.builder.battery.Battery;
import com.university.oop.demo.third.creational.builder.display.Display;
import com.university.oop.demo.third.creational.builder.speaker.Speaker;

public interface SmartHomeHub {
    void reportStatus();
    void setSpeaker(Speaker speaker);
    void setDisplay(Display display);
    void setBattery(Battery battery);
    void plugDevice();
    void unplugDevice();
    void activate();
}
