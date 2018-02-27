package com.pax.daggerdemo.demo3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 2.那么如果一台汽车有两个引擎（也就是说Car类中有两个Engine变量）怎么办呢？
 * 没关系，我们还有@Qulifier！首先我们需要使用Qulifier定义两个注解：
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface QualifierB {
}
