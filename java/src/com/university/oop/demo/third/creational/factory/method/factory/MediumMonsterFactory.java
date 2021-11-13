package com.university.oop.demo.third.creational.factory.method.factory;

import com.university.oop.demo.third.creational.factory.method.monsters.HarmlessBunny;
import com.university.oop.demo.third.creational.factory.method.monsters.Monster;
import com.university.oop.demo.third.creational.factory.method.monsters.NormalMonster;

public class MediumMonsterFactory implements MonsterFactory {
    private static int counter;

    @Override
    public Monster createMonster() {
        counter++;
        if (counter % 2 == 0)
            return new HarmlessBunny();
        else
            return new NormalMonster();
    }
}
