package com.pax.todo_app.di.component;

import com.pax.todo_app.di.ActivityScope;
import com.pax.todo_app.di.module.StatisticsPresenterModule;
import com.pax.todo_app.statistics.StatisticsActivity;
import com.pax.todo_app.statistics.StatisticsContract;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/2/28.
 */
@ActivityScope
@Subcomponent(modules = StatisticsPresenterModule.class)
public interface StatisticsComponent {

    void inject(StatisticsActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder view(StatisticsContract.View view);

        StatisticsComponent build();
    }
}
