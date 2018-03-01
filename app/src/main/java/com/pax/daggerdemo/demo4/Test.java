package com.pax.daggerdemo.demo4;

/**
 * 接下来我们看看@Scope是如何限定作用域，实现局部单例的。
 * <p>
 * Scope 作用域的本质：Component 间接持有依赖实例的引用，把实例的作用域与 Component 绑定，它们不是同年同月同日生，但是同年同月死。
 * <p>
 * 测试到 --> androidTest下进行测试
 */

public class Test {

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.engineA.hashCode());
        System.out.println(car.engineB.hashCode());
    }
}
