package com.pax.daggerdemo.demo4;

import dagger.Module;
import dagger.Provides;

/**
 * 2.接着我们需要用这个@CarScope去标记依赖提供方MarkCarModule。
 */

@Module
public class MakeCarModule {

    public MakeCarModule() {
    }

    @CarScope
    @Provides
    Engine provideEngine() {
        return new Engine("gear");
    }

}
