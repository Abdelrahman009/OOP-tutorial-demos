package com.university.oop.demo.third.creational.factory.method.factory;

import com.university.oop.demo.third.creational.factory.method.monsters.*;

public class HardMonsterFactory implements MonsterFactory {
    private static int counter;

    @Override
    public Monster createMonster() {
        counter++;
        if (counter % 5 == 0)
            return new FastMonster();
        else
            return new NormalMonster();
    }
}
