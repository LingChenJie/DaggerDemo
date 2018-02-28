package com.pax.daggerdemo.demo3_1;


import javax.inject.Inject;

/**
 * 3.接下来依赖需求方Car类同样需要修改
 */

public class Car {

    @Named("engineA")
    @Inject
    Engine engineA;

    @Named("engineB")
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
