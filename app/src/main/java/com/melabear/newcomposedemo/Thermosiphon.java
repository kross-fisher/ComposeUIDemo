package com.melabear.newcomposedemo;

import javax.inject.Inject;

public class Thermosiphon implements Pump {
    private final CoffeeLogger logger;
    private final Heater heater;

    @Inject
    public Thermosiphon(CoffeeLogger logger, Heater heater) {
        this.logger = logger;
        this.heater = heater;
        logger.log("+ + + Thermosiphon pump init + + +");
        //CoffeeApp.print("+ + + Thermosiphon pump init + + +", true);
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            logger.log("=> => pumping => =>");
        }
    }
}
