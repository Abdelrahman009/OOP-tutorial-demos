package com.university.oop.demo.third.creational.factory.method.monsters;

public class HarmlessBunny implements Monster {
    @Override
    public void attack() {
        System.out.println("No damage is done, It is just a harmless bunny");
    }
}
