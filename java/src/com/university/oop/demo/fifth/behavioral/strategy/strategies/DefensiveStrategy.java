package com.university.oop.demo.fifth.behavioral.strategy.strategies;

public class DefensiveStrategy implements BallPossessionStrategy {
    @Override
    public void handleReceiveBall() {
        System.out.println("Attempting to keep the ball and shoot away from my goal.");
    }
}
