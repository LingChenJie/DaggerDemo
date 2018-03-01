package com.pax.todo_app.di.module;

import android.content.Context;

import com.pax.todo_app.di.component.AddEditTaskComponent;
import com.pax.todo_app.di.component.StatisticsComponent;
import com.pax.todo_app.di.component.TaskDetailComponent;
import com.pax.todo_app.di.component.TasksComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/28.
 */
@Module(subcomponents = {AddEditTaskComponent.class, StatisticsComponent.class,
        TaskDetailComponent.class, TasksComponent.class})
public class AppModule {

    private final Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }

}
