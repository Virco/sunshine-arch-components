package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private final LiveData<List<WeatherEntry>> mForecast;

    public MainActivityViewModel(SunshineRepository repository) {
        mForecast = repository.getCurrentWeatherForecasts();
    }

    public LiveData<List<WeatherEntry>> getForecast() {
        return mForecast;
    }
}