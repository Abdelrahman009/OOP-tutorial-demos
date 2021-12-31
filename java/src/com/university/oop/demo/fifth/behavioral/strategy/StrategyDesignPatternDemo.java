package com.university.oop.demo.fifth.behavioral.strategy;

import com.university.oop.demo.fifth.behavioral.strategy.strategies.DefensiveStrategy;
import com.university.oop.demo.fifth.behavioral.strategy.strategies.LongBallStrategy;
import com.university.oop.demo.fifth.behavioral.strategy.strategies.PassingStrategy;
import com.university.oop.demo.fifth.behavioral.strategy.strategies.ShootingStrategy;

/**
 * A demo to illustrate the behavioral pattern "Strategy"
 *
 * "The Strategy design pattern defines a family of algorithms,
 *  encapsulate each one, and make them interchangeable.
 *  This pattern lets the algorithm vary independently from
 *  clients that use it."
 *
 *  Let's imagine that you are implementing a system where
 *  a coach is giving instructions to players through out
 *  a football game.
 *  defend, attack, shoot and so on.
 *
 *  We need to change the behavior of the player dynamically
 *  at runtime.
 */
public class StrategyDesignPatternDemo {
    public static void main(String[] args) {
        /**
         * Let's create our players.
         */
        FootballPlayer player1 = new FootballPlayer("player 1", 20);
        FootballPlayer player2 = new FootballPlayer("player 2", 30);


        /**
         * I want player 1 to shoot while player 2 passes around.
         */
        player1.setStrategy(new ShootingStrategy());
        player2.setStrategy(new PassingStrategy());

        /**
         * The ball reaches player 1
         */
        player1.takeActionOnPossessingBall();

        /**
         * The ball reaches player 2
         */
        player2.takeActionOnPossessingBall();

        /**
         * We scored a goal and want to protect the score.
         */
        player1.setStrategy(new DefensiveStrategy());
        player2.setStrategy(new DefensiveStrategy());

        /**
         * The ball reaches player 1
         */
        player1.takeActionOnPossessingBall();

        /**
         * The ball reaches player 2
         */
        player2.takeActionOnPossessingBall();

        /**
         * We conceded a goal and want to score one back.
         */
        player1.setStrategy(new LongBallStrategy());
        player2.setStrategy(new ShootingStrategy());


        /**
         * The ball reaches player 1
         */
        player1.takeActionOnPossessingBall();

        /**
         * The ball reaches player 2
         */
        player2.takeActionOnPossessingBall();

        /**
         * Congrats coach you scored and won the match!
         */
    }
}
