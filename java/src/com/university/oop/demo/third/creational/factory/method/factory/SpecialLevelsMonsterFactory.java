package com.university.oop.demo.third.creational.factory.method.factory;

import com.university.oop.demo.third.creational.factory.method.monsters.FireBreathingDragon;
import com.university.oop.demo.third.creational.factory.method.monsters.Monster;
import com.university.oop.demo.third.creational.factory.method.monsters.NormalMonster;

public class SpecialLevelsMonsterFactory implements MonsterFactory {
    @Override
    public Monster createMonster() {
        if (Math.random() < 0.3)
            return new FireBreathingDragon();
        else
            return new NormalMonster();
    }
}
