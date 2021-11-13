package com.university.oop.demo.third.creational.factory.method;

import com.university.oop.demo.third.creational.factory.method.factory.*;
import com.university.oop.demo.third.creational.factory.method.level.Level;
import com.university.oop.demo.third.creational.factory.method.level.bad.LevelOne;
import com.university.oop.demo.third.creational.factory.method.level.bad.LevelThree;
import com.university.oop.demo.third.creational.factory.method.level.bad.LevelTwo;
import com.university.oop.demo.third.creational.factory.method.level.good.LevelFactory;

/**
 * A demo to illustrate the factory method design pattern.
 *
 * "The Factory Method design pattern defines an interface
 *  for creating an object, but let subclasses decide which
 *  class to instantiate. This pattern lets a class defer
 *  instantiation to subclasses."
 */
public class FactoryMethodDemo {

    /**
     * Let's assume you are developing a game of more than
     * one level and there is a bonus level at the end.
     *
     * You want to create Monsters at each level that are
     * suitable to the level's difficulty.
     */
    public static void main(String[] args) {


        /**
         * If we ignored using factories we would have something like
         * the code below.
         */

        Level levelOne = new LevelOne();
        levelOne.play();

        Level levelTwo = new LevelTwo();
        levelTwo.play();

        Level levelThree = new LevelThree();
        levelThree.play();

        /**
         * Why is this bad?
         *
         * How to add a new Level?
         * What if I removed a level?
         * What If two levels have the same properties?
         */

        System.out.println("******==========================********");

        /**
         * Created an instance of {@link LevelFactory}
         * which somehow knows what Monsters to instantiate
         * depending on the level.
         */

        LevelFactory levelFactory = new LevelFactory();

        for (int i = 1; i < 5; i++) {
            Level level = levelFactory.createLevel(i);
            level.play();
        }

    }
}
