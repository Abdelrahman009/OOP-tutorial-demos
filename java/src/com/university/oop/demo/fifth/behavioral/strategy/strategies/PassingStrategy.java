package com.university.oop.demo.fifth.behavioral.strategy.strategies;

public class PassingStrategy implements BallPossessionStrategy {
    @Override
    public void handleReceiveBall() {
        System.out.println("Attempting to pass the ball around.");
    }
}
