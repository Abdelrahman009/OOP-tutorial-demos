package com.university.oop.demo.fifth.behavioral.strategy.strategies;

public class ShootingStrategy implements BallPossessionStrategy {
    @Override
    public void handleReceiveBall() {
        System.out.println("Attempting to shoot at the goal.");
    }
}
