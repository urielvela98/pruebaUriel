package com.example.weatherapp;

import java.util.List;

public class WeatherResponse {
    String Coord;
    List<String> Weather;
    String base;
    String Main;
    int visibility;
    String Wind;
    String Clouds;
    int dt;
    String Sys;
    int id;
    String name;
    String cod;

    public String getCoord() {
        return Coord;
    }

    public void setCoord(String coord) {
        Coord = coord;
    }

    public List<String> getWeather() {
        return Weather;
    }

    public void setWeather(List<String> weather) {
        Weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getMain() {
        return Main;
    }

    public void setMain(String main) {
        Main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getWind() {
        return Wind;
    }

    public void setWind(String wind) {
        Wind = wind;
    }

    public String getClouds() {
        return Clouds;
    }

    public void setClouds(String clouds) {
        Clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public String getSys() {
        return Sys;
    }

    public void setSys(String sys) {
        Sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}
