package com.pax.daggerdemo.demo6.di.component;

import android.app.Application;
import android.content.Context;

import com.pax.daggerdemo.demo6.di.ApplicationContext;
import com.pax.daggerdemo.demo6.DemoApplication;
import com.pax.daggerdemo.demo6.data.DataManager;
import com.pax.daggerdemo.demo6.data.DbHelper;
import com.pax.daggerdemo.demo6.data.SharedPrefsHelper;
import com.pax.daggerdemo.demo6.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/2/27.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
