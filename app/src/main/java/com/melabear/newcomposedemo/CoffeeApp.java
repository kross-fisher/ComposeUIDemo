package com.melabear.newcomposedemo;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Component;

public class CoffeeApp {
    private static final String TAG = "CoffeeApp";
    private static CoffeeShop shop;
    public static void makeCoffee() {
        shop = DaggerCoffeeShop.create();
        shop.maker().brew();
        //shop.logger().logs().forEach(log -> Log.d(TAG, log));
    }
    public static CoffeeLogger getLogger() {
        return shop != null ? shop.logger() : null;
    }

    static void print(String msg) { print(msg, false); }
    static void print(String msg, boolean dumpTrace) {
        if (dumpTrace) {
            Log.d(TAG, "[feixy -- Logcat] ==> " + msg, new Exception());
        } else {
            Log.d(TAG, "[feixy -- Logcat] ==> " + msg);
        }
    }
}

@Singleton
@Component(modules = {
        HeaterModule.class, PumpModule.class
})
interface CoffeeShop {
    Pump providePump();
    Heater createHeater();
    CoffeeLogger logger();
    CoffeeMaker maker();
}