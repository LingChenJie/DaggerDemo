package com.pax.daggerdemo.demo6.di.component;

import com.pax.daggerdemo.demo6.MainActivity;
import com.pax.daggerdemo.demo6.di.PerActivity;
import com.pax.daggerdemo.demo6.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by Administrator on 2018/2/27.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
