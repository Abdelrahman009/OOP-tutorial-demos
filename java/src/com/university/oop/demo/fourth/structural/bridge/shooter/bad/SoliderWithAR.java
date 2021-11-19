package com.university.oop.demo.fourth.structural.bridge.shooter.bad;

import com.university.oop.demo.fourth.structural.bridge.shooter.Shooter;
import com.university.oop.demo.fourth.structural.bridge.weapon.AssaultRifle;

public class SoliderWithAR implements Shooter {
    AssaultRifle ar = new AssaultRifle();

    @Override
    public void shoot() {
        System.out.println
            ("Solider is firing " + ar.getWeaponName());
        ar.shoot();
    }
}
