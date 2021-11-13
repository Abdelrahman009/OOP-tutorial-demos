package com.university.oop.demo.third.creational.factory.method.monsters;

public class NormalMonster implements Monster {
    @Override
    public void attack() {
        System.out.println("I need to hit you several times to kill,"
                           + " it is a normal monster!");
    }
}
