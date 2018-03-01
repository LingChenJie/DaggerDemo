package com.pax.todo_app.di.module;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.pax.todo_app.addedittask.AddEditTaskContract;
import com.pax.todo_app.addedittask.AddEditTaskPresenter;
import com.pax.todo_app.data.source.TasksRepository;
import com.pax.todo_app.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/28.
 */
@Module
public class AddEditTaskPresenterModule {

    @Provides
    @ActivityScope
    AddEditTaskPresenter provideAddEditTask(String taskId, TasksRepository tasksRepository,
                                            AddEditTaskContract.View view, boolean isDataMissing) {
        return new AddEditTaskPresenter(taskId, tasksRepository, view, isDataMissing);
    }
}
