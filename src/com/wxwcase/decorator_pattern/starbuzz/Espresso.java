package com.wxwcase.decorator_pattern.starbuzz;

/**
 * Created by wwang on 12/22/2016.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
