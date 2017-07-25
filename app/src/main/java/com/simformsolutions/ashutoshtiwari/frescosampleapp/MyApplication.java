package com.simformsolutions.ashutoshtiwari.frescosampleapp;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Ashutosh.tiwari on 25/07/17.
 * Default Application Class
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
