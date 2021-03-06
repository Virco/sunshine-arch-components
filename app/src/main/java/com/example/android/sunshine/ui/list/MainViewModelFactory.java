package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.android.sunshine.data.SunshineRepository;

public class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final SunshineRepository repository;

    public MainViewModelFactory(SunshineRepository repository) {
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        // noinspection unchecked
        return (T) new MainActivityViewModel(repository);
    }
}
