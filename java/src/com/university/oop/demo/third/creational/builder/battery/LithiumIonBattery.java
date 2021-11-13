package com.university.oop.demo.third.creational.builder.battery;

public class LithiumIonBattery implements Battery {
    @Override
    public String getBatteryReport() {
        return "Lithium Ion Battery is charged 50%";
    }
}
