package com.designPatterns.strategyPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();

        model.setFlyBehavior(new FlyWings());

        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());

        model.performFly();
        model.performQuack();

        model.performQuack();
        model.setQuackBehavior(new MuteQuack());
        model.performQuack();
    }
}
