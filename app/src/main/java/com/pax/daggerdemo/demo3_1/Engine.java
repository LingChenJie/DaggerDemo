package com.pax.daggerdemo.demo3_1;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/27.
 */

public class Engine {

    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public void run() {
        Log.d("Engine", name + "引擎转起来了");
    }
}
