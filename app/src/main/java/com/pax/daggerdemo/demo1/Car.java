package com.pax.daggerdemo.demo1;

import javax.inject.Inject;

/**
 * 1.Car类是需求依赖方，依赖了Engine类；
 * 因此我们需要在类变量Engine上添加@Inject来告诉Dagger2来为自己提供依赖。
 */
public class Car {

    @Inject
    Engine engine;

    public Car() {
        /**
         * 4.调用Dagger2生成的DaggerCarComponent来实现注入
         */
        DaggerCarComponent.builder().build().inject(this);
        //adafs
    }

    public Engine getEngine() {
        return this.engine;
    }
}
