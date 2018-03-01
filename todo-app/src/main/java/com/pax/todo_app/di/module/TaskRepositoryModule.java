package com.pax.todo_app.di.module;

import android.content.Context;

import com.pax.todo_app.data.source.TasksDataSource;
import com.pax.todo_app.data.source.local.TasksLocalDataSource;
import com.pax.todo_app.data.source.remote.TasksRemoteDataSource;
import com.pax.todo_app.di.Local;
import com.pax.todo_app.di.Remote;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/28.
 */
@Module
public class TaskRepositoryModule {

    @Provides
    @Local
    @Singleton
    TasksDataSource provideTaskLocalDataSource(Context context) {
        return new TasksLocalDataSource(context);
    }

    @Provides
    @Remote
    @Singleton
    TasksDataSource provideTaskRemoteDataSource() {
        return new TasksRemoteDataSource();
    }
}
