package com.example.weatherapp;

import com.example.weatherapp.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherApi {
    @GET("data/2.5/weather?q=London,uk&appid={id}")
    public Call<WeatherResponse> find (@Path("id") String id);
}
