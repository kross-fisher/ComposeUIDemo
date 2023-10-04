package com.melabear.newcomposedemo;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

public interface Heater {
    void on();
    void off();
    boolean isHot();
}

@Module interface HeaterModule {
    @Singleton
    @Binds Heater xbindHeater(ElectricHeater impl);
}