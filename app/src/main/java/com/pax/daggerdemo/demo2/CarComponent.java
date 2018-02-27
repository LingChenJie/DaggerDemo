package com.pax.daggerdemo.demo2;

import dagger.Component;

/**
 * 4.Component需要加上modules = {MarkCarModule.class}
 * 用来告诉Dagger2提供依赖的是MarkCarModule这个类
 */
@Component(modules = {MakeCarModule.class})
public interface CarComponent {
    void inject(Car car);
}
