package com.wxwcase.observer_pattern.weather_observable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wwang on 12/19/2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
