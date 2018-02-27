package com.pax.daggerdemo.demo4;


import javax.inject.Inject;

/**
 * 4.为了便于测试我们对Car和Engine类做了一些改造
 */

public class Car {

    @Inject
    Engine engineA;

    @Inject
    Engine engineB;

    public Car() {
        DaggerCarComponent.builder().makeCarModule(new MakeCarModule())
                .build().inject(this);
    }

    public Engine getEngineA() {
        return this.engineA;
    }

    public Engine getEngineB() {
        return this.engineB;
    }
}
