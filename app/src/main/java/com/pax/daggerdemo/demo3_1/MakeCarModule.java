package com.pax.daggerdemo.demo3_1;

import com.pax.daggerdemo.demo3.QualifierA;

import dagger.Module;
import dagger.Provides;

/**
 * 2.同时我们需要对依赖提供方做出修改
 */

@Module
public class MakeCarModule {

    public MakeCarModule() {
    }

    @Named("engineA")
    @Provides
    Engine provideEngineA() {
        return new Engine("engineA -> ");
    }

    @Named("engineB")
    @Provides
    Engine provideEngineB() {
        return new Engine("engineB -> ");
    }
}
