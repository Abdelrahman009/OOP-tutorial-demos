package com.university.oop.demo.third.creational.factory.method.level.bad;

import com.university.oop.demo.third.creational.factory.method.level.Level;
import com.university.oop.demo.third.creational.factory.method.monsters.FastMonster;
import com.university.oop.demo.third.creational.factory.method.monsters.HarmlessBunny;
import com.university.oop.demo.third.creational.factory.method.monsters.Monster;
import com.university.oop.demo.third.creational.factory.method.monsters.NormalMonster;

public class LevelTwo implements Level {

    @Override
    public void play() {
        System.out.println("======= LEVEL 2 =======");
        System.out.println("Created a small maze");
        for (int i = 0; i < 5; i++) {
            Monster monster;
            if (i % 2 == 0)
                monster = new FastMonster();
            else
                monster = new NormalMonster();
            monster.attack();

            /*
             * actual level playing code.
             */
        }
    }
}
