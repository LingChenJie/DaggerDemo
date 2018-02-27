package com.pax.daggerdemo.demo5;

import android.app.Application;

/**
 * Created by Administrator on 2018/2/27.
 */

public class DemoApplication extends Application {

    private ApplicationComponent applicationComponent;
    private static DemoApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public static DemoApplication getInstance() {
        return sInstance;
    }
}
