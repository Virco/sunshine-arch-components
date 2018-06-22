package com.example.android.sunshine.data.database;

import java.util.Date;

/**
 * Simplified {@link WeatherEntry} which only contains the details needed for the weather list
 * in the {@link com.example.android.sunshine.ui.list.ForecastAdapter}
 */
public class ListWeatherEntry {
    private final int id;
    private final int weatherIconId;
    private final Date date;
    private final double min;
    private final double max;

    public ListWeatherEntry(int id, int weatherIconId, Date date, double min, double max) {
        this.id = id;
        this.weatherIconId = weatherIconId;
        this.date = date;
        this.min = min;
        this.max = max;
    }

    public int getId() {
        return id;
    }

    public int getWeatherIconId() {
        return weatherIconId;
    }

    public Date getDate() {
        return date;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}
