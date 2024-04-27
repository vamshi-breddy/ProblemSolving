package com.designPatterns.strategyPattern;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm Flying with Rocket");
    }
}
