package com.pax.todo_app.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2018/2/28.
 */
@Documented
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Local {
}
