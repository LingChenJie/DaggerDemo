package com.pax.daggerdemo.demo2;

import javax.inject.Inject;

/**
 * 1.同样我们需要在Car类的成员变量Engine上加上@Inject表示自己需要Dagger2为自己提供依赖
 */

public class Car {

    @Inject
    Engine engine;

    public Car() {
        /**
         * 5.Car类的构造函数我们也需要修改，相比之前多了个markCarModule(new MarkCarModule())方法，
         * 这就相当于告诉了注入器DaggerCarComponent把MarkCarModule提供的依赖注入到了Car类中。
         */
        DaggerCarComponent.builder().makeCarModule(new MakeCarModule())
                .build().inject(this);
    }

    public Engine getEngine() {
        return this.engine;
    }
}
