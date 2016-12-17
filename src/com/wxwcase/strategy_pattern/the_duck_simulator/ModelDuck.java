package com.wxwcase.strategy_pattern.the_duck_simulator;

/**
 * Created by wxwcase on 12/17/16.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {

        flyBehavior = new FlyNoWay();

        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a model duck");
    }
}
