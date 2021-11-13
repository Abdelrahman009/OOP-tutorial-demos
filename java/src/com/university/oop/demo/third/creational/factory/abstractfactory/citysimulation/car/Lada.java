package com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car;

import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.Driver;

public class Lada extends Car {

    public Lada(Driver driver) {
        super(driver);
    }

    @Override
    public String toString() {
        return "A Lada with " + driver;
    }
}
