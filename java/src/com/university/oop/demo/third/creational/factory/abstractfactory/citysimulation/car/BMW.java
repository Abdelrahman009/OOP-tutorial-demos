package com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car;

import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.Driver;

public class BMW extends Car {

    public BMW(Driver driver) {
        super(driver);
    }

    @Override
    public String toString() {
        return "A BMW with " + driver;
    }
}
