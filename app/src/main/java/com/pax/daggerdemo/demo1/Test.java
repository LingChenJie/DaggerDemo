package com.pax.daggerdemo.demo1;

/**
 * Created by Administrator on 2018/2/
 * 调用无参的Engine
 *
 * 测试到 --> androidTest下进行测试
 */

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.getEngine().run();
    }
}
