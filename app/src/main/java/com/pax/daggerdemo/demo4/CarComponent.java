package com.pax.daggerdemo.demo4;

import dagger.Component;

/**
 * 3.同时还需要使用@Scope去标注注入器Compoent
 */
@CarScope
@Component(modules = {MakeCarModule.class})
public interface CarComponent {
    void inject(Car car);
}
