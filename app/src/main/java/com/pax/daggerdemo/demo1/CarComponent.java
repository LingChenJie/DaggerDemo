package com.pax.daggerdemo.demo1;

import dagger.Component;

/**
 * 3.需要创建一个用@Component标注的接口CarComponent
 * CarComponent其实就是一个注入器，这里用来将Engine注入到Car中。
 */
@Component
public interface CarComponent {

    void inject(Car car);
}
