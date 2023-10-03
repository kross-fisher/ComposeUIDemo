package com.melabear.newcomposedemo;

import java.util.ArrayList;
import java.util.List;

//@Singleton
public class CoffeeLogger {
    private final List<String> logs = new ArrayList<>();

    public CoffeeLogger() {}

    public void log(String msg) {
        logs.add(msg);
    }

    public List<String> logs() {
        return new ArrayList<>(logs);
    }
}
