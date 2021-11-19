package com.university.oop.demo.fourth.structural.bridge.shooter.good;

import com.university.oop.demo.fourth.structural.bridge.shooter.Shooter;
import com.university.oop.demo.fourth.structural.bridge.weapon.Weapon;

public abstract class AbstractShooter implements Shooter {

    private Weapon weapon;

    protected AbstractShooter(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void shoot() {
        System.out.println
            (getShooterName() + " is firing " + weapon.getWeaponName());
        weapon.shoot();
    }

    protected abstract String getShooterName();
}
