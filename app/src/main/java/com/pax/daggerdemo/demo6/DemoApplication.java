package com.pax.daggerdemo.demo6;

import android.app.Application;
import android.content.Context;

import com.pax.daggerdemo.demo6.data.DataManager;
import com.pax.daggerdemo.demo6.di.component.ApplicationComponent;
import com.pax.daggerdemo.demo6.di.component.DaggerApplicationComponent;
import com.pax.daggerdemo.demo6.di.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/2/27.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}