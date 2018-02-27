package com.pax.daggerdemo.demo1;

import javax.inject.Inject;

/**
 * 2.Engine类是依赖提供方，因此我们需要在它的构造函数上添加@Inject
 */

public class Engine {

    @Inject
    Engine() {
    }

    public void run() {
        System.out.println("引擎转起来了...");
    }
}
