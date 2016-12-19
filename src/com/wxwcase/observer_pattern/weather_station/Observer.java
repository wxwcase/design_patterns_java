package com.wxwcase.observer_pattern.weather_station;

/**
 * Created by wwang on 12/19/2016.
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
