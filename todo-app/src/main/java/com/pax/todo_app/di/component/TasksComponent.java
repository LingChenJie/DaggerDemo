package com.pax.todo_app.di.component;

import com.pax.todo_app.di.ActivityScope;
import com.pax.todo_app.di.module.TasksPresenterModule;
import com.pax.todo_app.tasks.TasksActivity;
import com.pax.todo_app.tasks.TasksContract;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/2/28.
 */
@ActivityScope
@Subcomponent(modules = TasksPresenterModule.class)
public interface TasksComponent {

    void inject(TasksActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder view(TasksContract.View view);

        TasksComponent build();
    }
}
