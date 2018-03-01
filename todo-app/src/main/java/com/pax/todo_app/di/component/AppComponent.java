package com.pax.todo_app.di.component;

import com.pax.todo_app.data.source.TasksRepository;
import com.pax.todo_app.di.module.AppModule;
import com.pax.todo_app.di.module.TaskRepositoryModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/2/28.
 */
@Singleton
@Component(modules = {AppModule.class, TaskRepositoryModule.class})
public interface AppComponent {

    TasksRepository taskRespository();

    AddEditTaskComponent.Builder addEditTaskComponent();

    StatisticsComponent.Builder statisticsComponent();

    TaskDetailComponent.Builder taskDetailComponent();

    TasksComponent.Builder tasksComponent();
}
