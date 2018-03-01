package com.pax.todo_app.di.module;

import android.support.annotation.NonNull;

import com.pax.todo_app.data.source.TasksRepository;
import com.pax.todo_app.di.ActivityScope;
import com.pax.todo_app.tasks.TasksContract;
import com.pax.todo_app.tasks.TasksPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/28.
 */
@Module
public class TasksPresenterModule {

    @Provides
    @ActivityScope
    TasksPresenter tasks(TasksRepository tasksRepository, TasksContract.View tasksView) {
        return new TasksPresenter(tasksRepository, tasksView);
    }
}
