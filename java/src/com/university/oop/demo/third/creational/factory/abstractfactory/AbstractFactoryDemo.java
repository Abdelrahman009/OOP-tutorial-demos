package com.university.oop.demo.third.creational.factory.abstractfactory;

import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.factory.CityTrafficFactory;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.factory.WealthyCityTrafficFactory;
import com.university.oop.demo.third.creational.factory.abstractfactory.citysimulation.factory.PoorCityTrafficFactory;

/**
 * A demo that illustrates the abstract factory design pattern.
 *
 * "The Abstract Factory design pattern provides an interface for creating
 *  families of related or dependent objects without specifying
 *  their concrete classes."
 *
 *  Let's assume we are creating a game.
 *  In this game we are simulating a city's traffic.
 *  We have two cities: A wealthy and a poor city and we want to
 *  simulate the traffic for both cities by creating cars, drivers
 *  and trains.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        CityTrafficFactory wealthyCityTrafficFactory = new WealthyCityTrafficFactory();
        CityTrafficFactory poorCityTrafficFactory = new PoorCityTrafficFactory();

        /**
         * let's create cars, trains and pedestrians from both cities.
         */
        for (int i = 0; i < 20; i++) {
            System.out.println
                ("Created " + wealthyCityTrafficFactory.createCar() + " and "
                 + wealthyCityTrafficFactory.createTrain() + " and "
                 + wealthyCityTrafficFactory.createPedestrian() + " using the wealthy factory.");
            System.out.println
                ("Created " + poorCityTrafficFactory.createCar() + " and "
                 + poorCityTrafficFactory.createTrain() + " and "
                 + poorCityTrafficFactory.createPedestrian() + " using the poor factory.");
            System.out.println("=============================");
        }
    }
}
