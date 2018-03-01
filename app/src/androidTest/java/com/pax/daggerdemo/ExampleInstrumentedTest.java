package com.pax.daggerdemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.pax.daggerdemo.demo3_1.Car;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.pax.daggerdemo", appContext.getPackageName());
    }

    @Test
    public void testDemo1() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        com.pax.daggerdemo.demo1.Car car = new com.pax.daggerdemo.demo1.Car();
        car.getEngine().run();

        assertEquals("com.pax.daggerdemo", appContext.getPackageName());
    }

    @Test
    public void testDemo2() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        com.pax.daggerdemo.demo2.Car car = new com.pax.daggerdemo.demo2.Car();
        car.getEngine().run();

        assertEquals("com.pax.daggerdemo", appContext.getPackageName());
    }

    @Test
    public void testDemo3() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        com.pax.daggerdemo.demo3.Car car = new com.pax.daggerdemo.demo3.Car();
        car.getEngineA().run();
        car.getEngineB().run();

        assertEquals("com.pax.daggerdemo", appContext.getPackageName());
    }

    @Test
    public void testDemo3_1() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        Car car = new Car();
        car.getEngineA().run();
        car.getEngineB().run();

        assertEquals("com.pax.daggerdemo", appContext.getPackageName());
    }

    @Test
    public void testDemo4() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        com.pax.daggerdemo.demo4.Car car = new com.pax.daggerdemo.demo4.Car();

        System.out.println(car.engineA.hashCode());
        System.out.println(car.engineB.hashCode());

        assertEquals("com.pax.daggerdemo", appContext.getPackageName());
    }

}
