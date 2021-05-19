package com.example.sandr0_shanshiashvili_davaleba_1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Weather {
    private DirectionType windDirection;
    private int windSpeed;
    private String cityName;
    private int pressure;
    private int temperature;
    private int humidity;

    public Weather(){}

    public Weather(DirectionType windDirection, int windSpeed, String cityName, int pressure, int temperature, int humidity) {
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.cityName = cityName;
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public DirectionType getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(DirectionType windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "{" +
                "windDirection=" + windDirection +
                ", windSpeed=" + windSpeed +
                ", cityName='" + cityName + '\'' +
                ", pressure=" + pressure +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
