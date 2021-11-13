package com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car;

import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.Driver;

public class Ferrari extends Car {

    public Ferrari(Driver driver) {
        super(driver);
    }

    @Override
    public String toString() {
        return "A Ferrari with " + driver;
    }
}
