package com.wxwcase.strategy_pattern.the_duck_simulator;

/**
 * Created by wxwcase on 12/17/16.
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Slience >>");
    }
}
