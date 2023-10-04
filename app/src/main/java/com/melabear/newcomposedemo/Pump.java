package com.melabear.newcomposedemo;

import dagger.Binds;
import dagger.Module;

public interface Pump {
    void pump();
}

@Module
abstract class PumpModule {
    @Binds abstract Pump thermoPump(Thermosiphon pump);
}