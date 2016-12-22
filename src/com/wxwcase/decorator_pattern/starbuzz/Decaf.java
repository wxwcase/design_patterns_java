package com.wxwcase.decorator_pattern.starbuzz;

/**
 * Created by wwang on 12/22/2016.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
