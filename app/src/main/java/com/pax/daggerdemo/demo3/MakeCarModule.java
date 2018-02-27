package com.pax.daggerdemo.demo3;

import dagger.Module;
import dagger.Provides;

/**
 * 2.同时我们需要对依赖提供方做出修改
 */

@Module
public class MakeCarModule {

    public MakeCarModule() {
    }

    @QualifierA
    @Provides
    Engine provideEngineA() {
        return new Engine("gearA");
    }

    @QualifierB
    @Provides
    Engine provideEngineB() {
        return new Engine("gearB");
    }
}
