package com.designPatterns.strategyPattern;

public class MallardDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I'm Real Mallard Duck");
    }

    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWings();
    }
}
