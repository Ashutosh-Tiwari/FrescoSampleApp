package com.simformsolutions.ashutoshtiwari.frescosampleapp;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse("http://lorempixel.com/400/200");
        SimpleDraweeView draweeViewCircle = (SimpleDraweeView) findViewById(R.id.my_image_view_circle);
        SimpleDraweeView draweeViewRoundedCorners = (SimpleDraweeView) findViewById(R.id.my_image_view_rounded_corners);

        draweeViewCircle.setImageURI(uri);

        RoundingParams roundingParams = RoundingParams.fromCornersRadius(16f);
        draweeViewRoundedCorners.setHierarchy(
                new GenericDraweeHierarchyBuilder(getResources())
                        .setRoundingParams(roundingParams)
                        .build());

        draweeViewRoundedCorners.setImageURI(uri);

    }
}
