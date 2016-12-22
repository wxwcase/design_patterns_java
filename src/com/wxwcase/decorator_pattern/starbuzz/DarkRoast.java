package com.wxwcase.decorator_pattern.starbuzz;

/**
 * Created by wwang on 12/22/2016.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
