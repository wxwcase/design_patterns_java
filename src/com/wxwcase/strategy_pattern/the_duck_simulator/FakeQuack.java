package com.wxwcase.strategy_pattern.the_duck_simulator;

/**
 * Created by wwang on 12/16/2016.
 */
public class FakeQuack implements QuackBehavior {

    public void quack() {
        System.out.println("Qwak");
    }
}
