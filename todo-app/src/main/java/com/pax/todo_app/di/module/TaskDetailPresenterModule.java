package com.pax.todo_app.di.module;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.pax.todo_app.data.source.TasksRepository;
import com.pax.todo_app.di.ActivityScope;
import com.pax.todo_app.taskdetail.TaskDetailContract;
import com.pax.todo_app.taskdetail.TaskDetailPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/28.
 */
@Module
public class TaskDetailPresenterModule {

    @Provides
    @ActivityScope
    TaskDetailPresenter provideTaskDetail(String taskId,
                                          TasksRepository tasksRepository,
                                          TaskDetailContract.View view) {
        return new TaskDetailPresenter(taskId, tasksRepository, view);
    }
}
