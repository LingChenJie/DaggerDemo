package com.pax.daggerdemo.demo2;

import dagger.Module;
import dagger.Provides;

/**
 * 3.接着我们需要一个Module类来生成依赖对象。
 *
 * @Module就是用来标准这个类的
 * @Provide则是用来标注具体提供依赖对象的方法 这里有个不成文的规定，被@Provide标注的方法命名我们一般以provide开头，这并不是强制的但有益于提升代码的可读性
 */

@Module
public class MakeCarModule {

    public MakeCarModule() {
    }

    @Provides
    Engine provideEngine() {
        return new Engine("gear -> ");
    }
}
