package com.pax.daggerdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pax.daggerdemo.demo5.DemoApplication;

public class DemoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

//        Car car = new Car();
//        car.getEngineA().run();
//        car.getEngineB().run();

//        Car car = new Car();
//        System.out.println(car.engineA.hashCode());
//        System.out.println(car.engineB.hashCode());

        DemoApplication application = DemoApplication.getInstance().getApplicationComponent().getApplication();
        Context context = DemoApplication.getInstance().getApplicationComponent().getContext();
        System.out.print("======" + application);
        System.out.print("======" + context);
    }
}
