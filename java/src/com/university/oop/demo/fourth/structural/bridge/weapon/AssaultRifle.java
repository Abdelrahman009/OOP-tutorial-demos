package com.university.oop.demo.fourth.structural.bridge.weapon;

public class AssaultRifle implements Weapon {
    @Override
    public void shoot() {
        System.out.println("Shooting using an assault rifle");
    }

    @Override
    public String getWeaponName() {
        return "an assault rifle";
    }
}
