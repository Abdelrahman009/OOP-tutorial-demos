package com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car;

import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.Driver;

public abstract class Car {
    Driver driver;
    public Car(Driver driver) {
        this.driver = driver;
    }
}
