package com.pax.daggerdemo.demo1;

/**
 * Created by Administrator on 2018/2/
 * 调用无参的Engine
 */

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.getEngine().run();
    }
}
