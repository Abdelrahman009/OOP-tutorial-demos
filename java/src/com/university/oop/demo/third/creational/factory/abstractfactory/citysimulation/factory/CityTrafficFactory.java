package com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.factory;

import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.car.Car;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.pedestrian.Pedestrian;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.train.Train;

public interface CityTrafficFactory {
    Car createCar();
    Train createTrain();
    Pedestrian createPedestrian();
}
