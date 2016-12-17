package com.wxwcase.strategy_pattern.the_duck_simulator;

/**
 * Created by wxwcase on 12/17/16.
 */
public class MiniDucksSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();
        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuck.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
