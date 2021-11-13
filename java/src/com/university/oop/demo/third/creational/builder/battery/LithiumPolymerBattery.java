package com.university.oop.demo.third.creational.builder.battery;

public class LithiumPolymerBattery implements Battery {
    @Override
    public String getBatteryReport() {
        return "Lithium polymer Battery is charged 87%";
    }
}
