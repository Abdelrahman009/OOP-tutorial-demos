package com.university.oop.demo.third.creational.factory.method.level.good;

import com.university.oop.demo.third.creational.factory.method.factory.MonsterFactory;
import com.university.oop.demo.third.creational.factory.method.level.Level;
import com.university.oop.demo.third.creational.factory.method.monsters.Monster;

public class LevelImpl implements Level {

    private final MonsterFactory monsterFactory;
    private final String levelName;
    private final String mazeType;

    public LevelImpl
        (MonsterFactory factory, String levelName, String mazeType) {

        this.monsterFactory = factory;
        this.levelName = levelName;
        this.mazeType = mazeType;
    }

    @Override
    public void play() {
        System.out.println("======= " + levelName + " =======");
        System.out.println("Created a " + mazeType);
        for (int i = 0; i < 5; i++) {
            Monster monster = monsterFactory.createMonster();
            monster.attack();
        }
    }
}
