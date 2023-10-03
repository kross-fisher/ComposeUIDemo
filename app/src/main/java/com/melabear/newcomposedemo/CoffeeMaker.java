package com.melabear.newcomposedemo;

public class CoffeeMaker {
    private final CoffeeLogger logger;
    private final Heater heater;
    private final Pump pump;

    public CoffeeMaker(CoffeeLogger logger, Heater heater, Pump pump) {
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
