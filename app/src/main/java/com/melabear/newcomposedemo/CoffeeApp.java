package com.melabear.newcomposedemo;

import android.util.Log;

public class CoffeeApp {
    private static final String TAG = "CoffeeApp";

    public static void legacyMakeCoffee() {
        CoffeeLogger logger = new CoffeeLogger();
        Heater heater = new ElectricHeater(logger);
        Pump pump = new Thermosiphon(logger, heater);
        CoffeeMaker maker = new CoffeeMaker(logger, heater, pump);

        maker.brew();
        logger.logs().forEach(log -> Log.d(TAG, log));
    }
}
