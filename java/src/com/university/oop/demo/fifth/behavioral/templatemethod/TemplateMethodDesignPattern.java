package com.university.oop.demo.fifth.behavioral.templatemethod;

import com.university.oop.demo.fifth.behavioral.templatemethod.bad.BadRaceCar;
import com.university.oop.demo.fifth.behavioral.templatemethod.bad.DefaultCar;
import com.university.oop.demo.fifth.behavioral.templatemethod.bad.Motorcycle;
import com.university.oop.demo.fifth.behavioral.templatemethod.bad.TransportationUnit;
import com.university.oop.demo.fifth.behavioral.templatemethod.bad.levels.LevelFour;
import com.university.oop.demo.fifth.behavioral.templatemethod.bad.levels.LevelOne;
import com.university.oop.demo.fifth.behavioral.templatemethod.bad.levels.LevelThree;
import com.university.oop.demo.fifth.behavioral.templatemethod.bad.levels.LevelTwo;
import com.university.oop.demo.fifth.behavioral.templatemethod.good.AbstractTransportationUnit;
import com.university.oop.demo.fifth.behavioral.templatemethod.good.GoodRaceCar;
import org.json.simple.JSONObject;

import java.util.Date;
import java.util.Random;

/**
 * A demo to illustrate the behavioral pattern "Template method"
 *
 * "The Template Method design pattern defines the skeleton of
 *  an algorithm in an operation, deferring some steps to subclasses.
 *  This pattern lets subclasses redefine certain steps of an algorithm
 *  without changing the algorithm‘s structure."
 *
 * In our scenario let's assume that we have a class representing
 * a race car.
 *
 * This class comes from a long hierarchy of classes "Has many ancestors"
 *
 * it finally implements the {@link SerializableClass} interface
 * that allows the transformation of an object to JSON.
 *
 * We will discuss 3 different problems.
 */
public class TemplateMethodDesignPattern {

    public static void main(String[] args) {
        /**
         * The first approach is to override the parent's
         * toJSON method.
         */

        /**
         * what if we are treating every class extending
         * the class "Car" to have the properties of Car in
         * the JSON object.
         *
         * you would expect no errors right?
         */
        TransportationUnit carOne = new BadRaceCar
            ("Ferrari", new Date(), "A quick car", 1, "Wide",
             "223", false, "black");
        JSONObject carOneJson = carOne.toJSON();

        try {
            System.out.println(carOneJson.get("Production date").toString());
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        /**
         * First problem
         *
         * why is it throwing?
         * shouldn't each car have a production date?
         */
        TransportationUnit carTwo = new DefaultCar();
        JSONObject carTwoJson = carTwo.toJSON();

        try {
            System.out.println(carTwoJson.get("Production date").toString());
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        /**
         * Second problem
         *
         * why is it throwing?
         * same as above but for different reasons.
         */
        TransportationUnit motorcycle = new Motorcycle
                ("BMW", new Date(), "A quick Motorcycle", 1, 1.1F,
                 "electric");
        JSONObject motorcycleJson = motorcycle.toJSON();

        try {
            System.out.println(motorcycleJson.get("Production date").toString());
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }


        /**
         * The first problem happens because the default car override the
         * parent's toJSON method and intentionally leaving out the
         * production date property.
         *
         * The second problem takes place because accidentally we forgot
         * to call super.toJSON() while overriding.
         */

        /**
         * Using the template method we avoid those problems
         */
        AbstractTransportationUnit goodCar = new GoodRaceCar
            ("Ferrari", new Date(), "A quick car", 1, "Wide",
             "223", false, "black");
        JSONObject goodCarJson = goodCar.toJSON();
        try {
            System.out.println(goodCarJson.get("Production date").toString());
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }


        /**
         * The third problem arises when the parent's method is overridden so many
         * times.
         *
         * imagine having classes that extends each other in a tree
         * like structure as we go down the tree the level increase
         * at the root we have levelOne class and the child is levelTwo
         * and so on....
         * levelOne
         *     <- levelTwo
         *           <- levelThree
         *                 <- levelFour
         *
         * they are all serializable.
         */

        /**
         * One should expect that any LevelOne class would have the
         * "levelOne" property.
         *
         * but actually you don't know what the property will be
         * is it levelOne? levelTwo? who knows...
         */
        LevelOne object = getObjectAtRandom();
        try {
            System.out.println(object.toJSON().get("levelOne").toString());
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }

    private static LevelOne getObjectAtRandom() {
        float rand = new Random().nextFloat();
        if (rand < 0.25)
            return new LevelOne();
        else if (rand < 0.5)
            return new LevelTwo();
        else if (rand < 0.75)
            return new LevelThree();
        else
            return new LevelFour();
    }
}
