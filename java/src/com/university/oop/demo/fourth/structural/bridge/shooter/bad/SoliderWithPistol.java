package com.university.oop.demo.fourth.structural.bridge.shooter.bad;

import com.university.oop.demo.fourth.structural.bridge.shooter.Shooter;
import com.university.oop.demo.fourth.structural.bridge.weapon.Pistol;

public class SoliderWithPistol implements Shooter {
    Pistol pistol = new Pistol();

    @Override
    public void shoot() {
        System.out.println
            ("Solider is firing " + pistol.getWeaponName());
        pistol.shoot();
    }
}
