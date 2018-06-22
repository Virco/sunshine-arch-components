package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListWeatherEntry;

import java.util.List;

class MainActivityViewModel extends ViewModel {

    private final LiveData<List<ListWeatherEntry>> mForecast;

    public MainActivityViewModel(SunshineRepository repository) {
        mForecast = repository.getCurrentWeatherForecasts();
    }

    public LiveData<List<ListWeatherEntry>> getForecast() {
        return mForecast;
    }
}
