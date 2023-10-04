package com.melabear.newcomposedemo;

import dagger.Binds;
import dagger.Module;

public interface Heater {
    void on();
    void off();
    boolean isHot();
}

@Module interface HeaterModule {
    @Binds Heater bindHeater(ElectricHeater impl);
}