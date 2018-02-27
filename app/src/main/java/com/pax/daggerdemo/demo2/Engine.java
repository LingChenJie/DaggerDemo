package com.pax.daggerdemo.demo2;

/**
 * 2.Engine类的构造函数上的@Inject也需要去掉，现在不需要通过构造函数上的@Inject来提供依赖了
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
