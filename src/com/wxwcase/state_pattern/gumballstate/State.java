package com.wxwcase.state_pattern.gumballstate;

/**
 * Created by wwang on 12/23/2016.
 */
public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
