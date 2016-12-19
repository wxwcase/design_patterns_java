package com.wxwcase.observer_pattern.weather_station;

/**
 * Created by wwang on 12/19/2016.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
