package com.university.oop.demo.fourth.structural.bridge.shooter.good;

import com.university.oop.demo.fourth.structural.bridge.weapon.Weapon;

public class UnmannedAircraft extends AbstractShooter {

    public UnmannedAircraft(Weapon weapon) {
        super(weapon);
    }

    @Override
    protected String getShooterName() {
        return "Unmanned aircraft";
    }
}
