package com.pax.daggerdemo.demo4;

import android.util.Log;

/**
 * 5.为了便于测试我们对Car和Engine类做了一些改造
 */

public class Engine {

    private String name;

    public Engine(String name) {
        Log.d("Engine", "Create Engine");
        System.out.println("Create Engine");
        this.name = name;
    }

    public void run() {
        Log.d("Engine", name + "引擎转起来了");
    }
}
