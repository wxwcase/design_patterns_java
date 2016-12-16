package com.wxwcase.strategy_pattern.the_duck_simulator;

/**
 * Created by wwang on 12/16/2016.
 */
public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
