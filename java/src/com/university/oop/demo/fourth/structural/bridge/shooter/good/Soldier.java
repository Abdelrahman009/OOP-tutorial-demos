package com.university.oop.demo.fourth.structural.bridge.shooter.good;

import com.university.oop.demo.fourth.structural.bridge.weapon.Weapon;

public class Soldier extends AbstractShooter {

    public Soldier(Weapon weapon) {
        super(weapon);
    }

    @Override
    protected String getShooterName() {
        return "Soldier";
    }
}
