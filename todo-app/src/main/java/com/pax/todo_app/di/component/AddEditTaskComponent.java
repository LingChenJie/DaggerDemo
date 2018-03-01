package com.pax.todo_app.di.component;

import android.support.annotation.Nullable;

import com.pax.todo_app.addedittask.AddEditTaskActivity;
import com.pax.todo_app.addedittask.AddEditTaskContract;
import com.pax.todo_app.di.ActivityScope;
import com.pax.todo_app.di.module.AddEditTaskPresenterModule;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/2/28.
 */
@ActivityScope
@Subcomponent(modules = AddEditTaskPresenterModule.class)
public interface AddEditTaskComponent {

    void inject(AddEditTaskActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder taskId(String taskId);

        @BindsInstance
        Builder view(AddEditTaskContract.View view);

        @BindsInstance
        Builder dataMissing(boolean isDataMissing);

        AddEditTaskComponent build();
    }
}
