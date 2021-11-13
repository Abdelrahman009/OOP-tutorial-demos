package com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.factory;

import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car.BMW;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car.Car;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car.Ferrari;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car.Lada;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.Driver;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.FancyDriver;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.NormalDriver;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.pedestrian.FancyPedestrian;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.pedestrian.NormalPedestrian;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.pedestrian.Pedestrian;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.train.BulletTrain;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.train.Train;

public class WealthyCityTrafficFactory implements CityTrafficFactory {
    @Override
    public Car createCar() {
        double value = Math.random();
        if (value < 0.1)
            return new Lada(new NormalDriver());
        else if (value < 0.4)
            return new BMW(new FancyDriver());
        else
            return new Ferrari(new FancyDriver());
    }

    @Override
    public Train createTrain() {
        return new BulletTrain();
    }

    @Override
    public Pedestrian createPedestrian() {
        if (Math.random() < 0.7)
            return new FancyPedestrian();
        else
            return new NormalPedestrian();
    }
}
