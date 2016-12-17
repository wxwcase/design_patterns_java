package com.wxwcase.strategy_pattern.the_duck_simulator;

/**
 * Created by wxwcase on 12/17/16.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {

        flyBehavior = new FlyNoWay();

        quackBehavior = new Squeak();
    }

    void display() {

        System.out.println("I'm a rubber duck");
    }
}

