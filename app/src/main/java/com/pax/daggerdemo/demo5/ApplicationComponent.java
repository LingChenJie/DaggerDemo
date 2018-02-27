package com.pax.daggerdemo.demo5;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/2/27.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    DemoApplication getApplication();

    Context getContext();
}
