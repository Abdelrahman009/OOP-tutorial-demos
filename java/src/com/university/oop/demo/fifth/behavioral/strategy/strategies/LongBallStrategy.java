package com.university.oop.demo.fifth.behavioral.strategy.strategies;

public class LongBallStrategy implements BallPossessionStrategy {
    @Override
    public void handleReceiveBall() {
        System.out.println("Attempting a long pass.");
    }
}
