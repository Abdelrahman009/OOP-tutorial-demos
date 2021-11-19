package com.university.oop.demo.fourth.structural.bridge.shooter.bad;

import com.university.oop.demo.fourth.structural.bridge.shooter.Shooter;
import com.university.oop.demo.fourth.structural.bridge.weapon.Rpg;

public class AlienWithRpg implements Shooter {
    Rpg rpg = new Rpg();

    @Override
    public void shoot() {
        System.out.println
                ("Alien is firing " + rpg.getWeaponName());
        rpg.shoot();
    }
}
