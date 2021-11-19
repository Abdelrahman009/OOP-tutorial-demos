package com.university.oop.demo.fourth.structural.bridge.shooter.bad;

import com.university.oop.demo.fourth.structural.bridge.shooter.Shooter;
import com.university.oop.demo.fourth.structural.bridge.weapon.AssaultRifle;

public class AlienWithAR implements Shooter {
    AssaultRifle ar = new AssaultRifle();

    @Override
    public void shoot() {
        System.out.println
            ("Alien is firing " + ar.getWeaponName());
        ar.shoot();
    }
}
