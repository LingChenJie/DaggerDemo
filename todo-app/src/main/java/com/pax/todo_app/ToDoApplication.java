package com.pax.todo_app;


import android.app.Application;

import com.pax.todo_app.di.component.AppComponent;
import com.pax.todo_app.di.component.DaggerAppComponent;
import com.pax.todo_app.di.module.AppModule;
import com.pax.todo_app.di.module.TaskRepositoryModule;

/**
 * Created by johnny on 2017/6/8.
 */

public class ToDoApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .taskRepositoryModule(new TaskRepositoryModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
