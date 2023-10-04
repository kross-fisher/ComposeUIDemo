package com.melabear.newcomposedemo;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Component;

public class CoffeeApp {
    private static final String TAG = "CoffeeApp";

    public static void legacyMakeCoffee() {
        CoffeeLogger logger = new CoffeeLogger();
        CoffeeShop shop = DaggerCoffeeShop.create();
        Heater heater = shop.myHeater();
        Pump pump = shop.providePump();
        CoffeeMaker maker = new CoffeeMaker(logger, heater, pump);

        maker.brew();
        logger.logs().forEach(log -> Log.d(TAG, log));
    }

    static void print(String msg) {
        Log.d(TAG, "[feixy -- Logcat] ==> " + msg, new Exception());
    }
}

@Component(modules = {
        HeaterModule.class, PumpModule.class
}) //@Singleton
interface CoffeeShop {
    Pump providePump();
    Heater myHeater();
}