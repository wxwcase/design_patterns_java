package com.wxwcase.decorator_pattern.starbuzz;

/**
 * Created by wwang on 12/22/2016.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
