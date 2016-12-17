package com.wxwcase.strategy_pattern.the_duck_simulator;

/**
 * Created by wxwcase on 12/17/16.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {

        setFlyBehavior(new FlyNoWay());

        setQuackBehavior(new MuteQuack());
    }

    void display() {
        System.out.println("I'm a duck Decoy");
    }
}
