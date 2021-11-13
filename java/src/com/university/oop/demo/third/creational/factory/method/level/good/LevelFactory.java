package com.university.oop.demo.third.creational.factory.method.level.good;

import com.university.oop.demo.third.creational.factory.method.factory.EasyMonsterFactory;
import com.university.oop.demo.third.creational.factory.method.factory.HardMonsterFactory;
import com.university.oop.demo.third.creational.factory.method.factory.MediumMonsterFactory;
import com.university.oop.demo.third.creational.factory.method.factory.SpecialLevelsMonsterFactory;
import com.university.oop.demo.third.creational.factory.method.level.Level;


/**
 * This is a SIMPLE factory.
 */
public class LevelFactory {
    public Level createLevel(int level) {
        if (level == 1)
            return new LevelImpl
                (new EasyMonsterFactory(),
                 "level 1", "Small maze");
        else if (level == 2)
            return new LevelImpl
                (new MediumMonsterFactory(),
                "level 2", "Small maze");
        else if (level == 3)
            return new LevelImpl
                (new MediumMonsterFactory(),
                "level 3", "Large maze");
        else if (level == 4)
            return new LevelImpl
                (new HardMonsterFactory(),
                "level 4", "Small maze");
        else
            return new LevelImpl
                (new SpecialLevelsMonsterFactory(),
                "bonus level", "Small maze");
    }

}
