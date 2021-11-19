package com.university.oop.demo.fourth.structural.bridge.weapon;

public class Pistol implements Weapon {
    @Override
    public void shoot() {
        System.out.println("Shooting using a pistol");
    }

    @Override
    public String getWeaponName() {
        return "a pistol";
    }
}
