package com.pax.daggerdemo.demo4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 1.@Scope是如何限定作用域，实现局部单例的。
 * 首先我们需要通过@Scope定义一个CarScope注解
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CarScope {
}
