package com.melabear.newcomposedemo;

import javax.inject.Inject;

public class CoffeeMaker {
    private final CoffeeLogger logger;
    private final Heater heater;
    private final Pump pump;

    @Inject
    public CoffeeMaker(CoffeeLogger logger, Pump pump, Heater heater) {
        this.logger = logger;
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.on();
        pump.pump();
        logger.log(" [_]p coffee! [_]p ");
        heater.off();
    }
}
