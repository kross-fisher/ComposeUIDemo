package com.melabear.newcomposedemo;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CoffeeLogger {
    private final List<String> logs = new ArrayList<>();

    @Inject
    public CoffeeLogger() {
        CoffeeApp.print("Creating CoffeeLogger: " + this/*, true*/);
    }

    public void log(String msg) {
        logs.add(msg);
    }

    public List<String> logs() {
        return new ArrayList<>(logs);
    }
}