package com.university.oop.demo.fifth.behavioral.strategy;

import com.university.oop.demo.fifth.behavioral.strategy.strategies.BallPossessionStrategy;

public class FootballPlayer {
    private final String name;
    private final int jerseyNumber;
    private BallPossessionStrategy strategy;

    public FootballPlayer(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setStrategy(BallPossessionStrategy strategy) {
        this.strategy = strategy;
    }

    public void takeActionOnPossessingBall() {
        strategy.handleReceiveBall();
    }
}
