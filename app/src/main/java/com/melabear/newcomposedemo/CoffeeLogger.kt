package com.melabear.newcomposedemo

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoffeeLogger @Inject constructor() {
    private val logs: MutableList<String> = ArrayList()

    init {
        CoffeeApp.print("Creating CoffeeLogger: $this" /*, true*/)
    }

    fun log(msg: String) {
        logs.add(msg)
    }

    fun logs(): List<String> {
        return ArrayList(logs)
    }
}