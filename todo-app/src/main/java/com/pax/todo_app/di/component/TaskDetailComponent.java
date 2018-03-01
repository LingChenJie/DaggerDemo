package com.pax.todo_app.di.component;

import com.pax.todo_app.di.ActivityScope;
import com.pax.todo_app.di.module.TaskDetailPresenterModule;
import com.pax.todo_app.taskdetail.TaskDetailActivity;
import com.pax.todo_app.taskdetail.TaskDetailContract;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/2/28.
 */
@ActivityScope
@Subcomponent(modules = TaskDetailPresenterModule.class)
public interface TaskDetailComponent {

    void inject(TaskDetailActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder taskId(String taskId);

        @BindsInstance
        Builder view(TaskDetailContract.View view);

        TaskDetailComponent build();
    }
}
