package com.pax.daggerdemo.demo4;

/**
 * 5.为了便于测试我们对Car和Engine类做了一些改造
 */

public class Engine {

    private String name;

    public Engine(String name) {
        System.out.println("Create Engine");
        this.name = name;
    }

    public void run() {
        System.out.println(name + "引擎转起来了");
    }
}
