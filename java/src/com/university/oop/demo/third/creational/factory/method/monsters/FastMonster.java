package com.university.oop.demo.third.creational.factory.method.monsters;

public class FastMonster implements Monster {
    @Override
    public void attack() {
        System.out.println("I can hit you so fast but my hits"
                           + " are weak, it is the fast monster!");
    }
}
