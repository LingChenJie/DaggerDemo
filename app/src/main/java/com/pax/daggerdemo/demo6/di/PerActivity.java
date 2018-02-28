package com.pax.daggerdemo.demo6.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Administrator on 2018/2/27.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}