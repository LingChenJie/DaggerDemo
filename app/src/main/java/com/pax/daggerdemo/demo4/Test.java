package com.pax.daggerdemo.demo4;

/**
 * 接下来我们看看@Scope是如何限定作用域，实现局部单例的。
 */

public class Test {

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.engineA.hashCode());
        System.out.println(car.engineB.hashCode());
    }
}
