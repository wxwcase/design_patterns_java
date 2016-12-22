package com.wxwcase.decorator_pattern.starbuzz;

/**
 * Created by wwang on 12/22/2016.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
