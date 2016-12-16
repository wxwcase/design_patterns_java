package com.wxwcase.strategy_pattern.the_duck_simulator;

/**
 * Created by wwang on 12/16/2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();

        flyBehavior = new FlyWithWings();

    }

    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
