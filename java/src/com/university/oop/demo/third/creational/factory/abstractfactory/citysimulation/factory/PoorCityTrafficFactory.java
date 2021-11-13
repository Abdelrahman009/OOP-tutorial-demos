package com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.factory;

import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car.Car;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car.Lada;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.Driver;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.driver.NormalDriver;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.pedestrian.FancyPedestrian;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.pedestrian.NormalPedestrian;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.pedestrian.Pedestrian;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.pedestrian.PoorPedestrian;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.train.BulletTrain;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.train.OldTrain;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.train.Train;

public class PoorCityTrafficFactory implements CityTrafficFactory {
    @Override
    public Car createCar() {
        return new Lada(new NormalDriver());
    }

    @Override
    public Train createTrain() {
        return Math.random() < 0.1
            ? new BulletTrain() : new OldTrain();
    }

    @Override
    public Pedestrian createPedestrian() {
        if (Math.random() < 0.7)
            return new PoorPedestrian();
        else
            return new NormalPedestrian();
    }
}
