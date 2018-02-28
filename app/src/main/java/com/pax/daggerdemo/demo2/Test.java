package com.pax.daggerdemo.demo2;


/**
 * 如果创建Engine的构造函数是带参数的呢？比如说制造一台引擎是需要齿轮(Gear)的。
 * 或者Eggine类是我们无法修改的呢？这时候就需要@Module和@Provide上场了。
 * <p>
 * 测试到 --> androidTest下进行测试
 */

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.getEngine().run();
    }
}
