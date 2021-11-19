package com.university.oop.demo.fourth.structural.bridge.shooter.bad;

import com.university.oop.demo.fourth.structural.bridge.shooter.Shooter;
import com.university.oop.demo.fourth.structural.bridge.weapon.Pistol;

public class AlienWithPistol implements Shooter {
    Pistol pistol = new Pistol();

    @Override
    public void shoot() {
        System.out.println
                ("Alien is firing " + pistol.getWeaponName());
        pistol.shoot();
    }
}
