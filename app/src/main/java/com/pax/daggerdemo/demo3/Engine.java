package com.pax.daggerdemo.demo3;

/**
 * Created by Administrator on 2018/2/27.
 */

public class Engine {

    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + "引擎转起来了");
    }
}
