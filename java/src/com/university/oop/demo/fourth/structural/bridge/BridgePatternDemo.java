package com.university.oop.demo.fourth.structural.bridge;

import com.university.oop.demo.fourth.structural.bridge.shooter.Shooter;
import com.university.oop.demo.fourth.structural.bridge.shooter.bad.*;
import com.university.oop.demo.fourth.structural.bridge.shooter.good.Alien;
import com.university.oop.demo.fourth.structural.bridge.shooter.good.Soldier;
import com.university.oop.demo.fourth.structural.bridge.shooter.good.UnmannedAircraft;
import com.university.oop.demo.fourth.structural.bridge.weapon.AssaultRifle;
import com.university.oop.demo.fourth.structural.bridge.weapon.Pistol;
import com.university.oop.demo.fourth.structural.bridge.weapon.Rpg;

import java.util.ArrayList;

/**
 * A demo to illustrate the structural pattern "Bridge"
 *
 * "decouple an abstraction from its implementation so
 *  that the two can vary independently"
 *
 *  Let's imagine we are developing a war game. the game
 *  has weapons that can be used to shoot bullets/rockets
 *  ...etc.
 *
 *  How would we go about designing the classes.
 *
 *  Let's say we have these types of shooters:
 *   - Soldier
 *   - Alien
 *   - Unmanned Aircraft
 *  And we have these types of weapons:
 *   - RPG
 *   - Pistol
 *   - Assault Rifle
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        ArrayList<Shooter> firstTroop = new ArrayList<>();

        /**
         * The first approach we take is to create a class for
         * each possible combination of the two types.
         *
         * This will result in a number of classes equal to
         * the cartesian product of the set of all weapons
         * and the shooters "3 weapons * 3 Shooters = 9 classes"
         */
        firstTroop.add(new SoliderWithPistol());
        firstTroop.add(new SoliderWithAR());
        firstTroop.add(new SoldierWithRpg());
        firstTroop.add(new AlienWithPistol());
        firstTroop.add(new AlienWithRpg());
        firstTroop.add(new AlienWithAR());

        for (Shooter shooter : firstTroop) {
            shooter.shoot();
        }

        /**
         * Clearly this creates redundancy and the code
         * becomes harder to extend.
         *
         * imagine adding a new weapon or a shooter type.
         */

        System.out.println();
        System.out.println("=====================");
        System.out.println();


        ArrayList<Shooter> secondTroop = new ArrayList<>();

        /**
         * Now we have an abstract class that depends on the
         * abstraction "Weapon" without specifying its type.
         *
         * Now we can add any type of shooters or weapon as
         * we want without changing already existing code.
         *
         * imagine now adding a new weapon or a shooter type,
         * it is easy isn't it?
         */
        secondTroop.add(new Soldier(new Pistol()));
        secondTroop.add(new Soldier(new AssaultRifle()));
        secondTroop.add(new Soldier(new Rpg()));
        secondTroop.add(new Alien(new Pistol()));
        secondTroop.add(new Alien(new Rpg()));
        secondTroop.add(new Alien(new AssaultRifle()));

        /**
         * It is this easy to add a new shooter.
         */
        secondTroop.add(new UnmannedAircraft(new AssaultRifle()));

        for (Shooter shooter : secondTroop) {
            shooter.shoot();
        }

        System.out.println();
        System.out.println("=====================");
        System.out.println();
    }
}
