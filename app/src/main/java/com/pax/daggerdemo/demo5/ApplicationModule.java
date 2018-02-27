package com.pax.daggerdemo.demo5;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/27.
 */

@Module
public class ApplicationModule {

    private Context context;

    public ApplicationModule(Context context) {

        this.context = context;
    }

    @Provides
    @Singleton
    DemoApplication provideApplication() {

        return (DemoApplication) context.getApplicationContext();
    }

    @Provides
    @Singleton
    Context provideContext() {

        return context;
    }
}
