package com.pax.todo_app.di.module;

import android.support.annotation.NonNull;

import com.pax.todo_app.data.source.TasksRepository;
import com.pax.todo_app.di.ActivityScope;
import com.pax.todo_app.statistics.StatisticsContract;
import com.pax.todo_app.statistics.StatisticsPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/28.
 */
@Module
public class StatisticsPresenterModule {

    @Provides
    @ActivityScope
    StatisticsPresenter provideStatistics(TasksRepository tasksRepository,
                                          StatisticsContract.View statisticsView) {
        return new StatisticsPresenter(tasksRepository, statisticsView);
    }
}
