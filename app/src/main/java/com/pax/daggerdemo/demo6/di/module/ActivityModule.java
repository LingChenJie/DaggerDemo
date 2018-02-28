package com.pax.daggerdemo.demo6.di.module;

import android.app.Activity;
import android.content.Context;

import com.pax.daggerdemo.demo6.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/27.
 */
@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}
