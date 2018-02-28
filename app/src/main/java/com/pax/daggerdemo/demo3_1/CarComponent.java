package com.pax.daggerdemo.demo3_1;

import dagger.Component;

/**
 * Created by Administrator on 2018/2/27.
 * 加上modules = {MarkCarModule.class}
 * 用来告诉Dagger2提供依赖的是MarkCarModule这个类。
 */
@Component(modules = {MakeCarModule.class})
public interface CarComponent {
    void inject(Car car);
}
