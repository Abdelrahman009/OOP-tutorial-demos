package com.university.oop.demo.fourth.structural.bridge.weapon;

public class Rpg implements Weapon {

    @Override
    public void shoot() {
        System.out.println("Shooting using an RPG");
    }

    @Override
    public String getWeaponName() {
        return "an RPG";
    }
}
