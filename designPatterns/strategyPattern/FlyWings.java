package com.designPatterns.strategyPattern;

public class FlyWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
