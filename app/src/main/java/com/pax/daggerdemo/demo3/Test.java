package com.pax.daggerdemo.demo3;

/**
 * 那么如果一台汽车有两个引擎（也就是说Car类中有两个Engine变量）怎么办呢？
 * 没关系，我们还有@Qulifier！首先我们需要使用Qulifier定义两个注解：
 */

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.getEngineA().run();
        car.getEngineB().run();
    }
}
