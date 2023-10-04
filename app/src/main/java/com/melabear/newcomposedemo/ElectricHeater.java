package com.melabear.newcomposedemo;

import javax.inject.Inject;

public class ElectricHeater implements Heater {
    private final CoffeeLogger logger;
    private boolean heating;

    @Inject
    public ElectricHeater(CoffeeLogger logger) {
        this.logger = logger;
        logger.log("+ + + electric heater + + +");
        //CoffeeApp.print("+ + + electric heater + + +", true);
    }

    @Override
    public void on() {
        this.heating = true;
        logger.log("~ ~ ~  heating ~ ~ ~");
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
