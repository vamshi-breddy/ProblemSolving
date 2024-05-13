package com.designPatterns.ObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;

    private float humidity;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData =weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Temperature: "+ temperature);
        System.out.println("Humidity: "+ humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
          this.temperature = temp;
          this.humidity = humidity;
          display();
    }
}
