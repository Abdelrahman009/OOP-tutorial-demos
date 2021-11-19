package com.university.oop.demo.fourth.structural.bridge.weapon;

public class MachineGun implements Weapon {
    @Override
    public void shoot() {
        System.out.println("Shooting using a machine gun");
    }

    @Override
    public String getWeaponName() {
        return "a machine gun";
    }
}
