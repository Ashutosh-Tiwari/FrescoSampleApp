package com.simformsolutions.ashutoshtiwari.frescosampleapp.view;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.simformsolutions.ashutoshtiwari.frescosampleapp.R;
import com.simformsolutions.ashutoshtiwari.frescosampleapp.databinding.ActivityMainBinding;
import com.simformsolutions.ashutoshtiwari.frescosampleapp.model.Image;
import com.simformsolutions.ashutoshtiwari.frescosampleapp.viewmodel.MyViewModel;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MyViewModel myViewModel = new MyViewModel(new Image("http://lorempixel.com/400/200"));
        mainBinding.setMyViewModel(myViewModel);

        RoundingParams roundingParams = RoundingParams.fromCornersRadius(16f);
        mainBinding.myImageViewRoundedCorners.setHierarchy(
                new GenericDraweeHierarchyBuilder(getResources())
                        .setRoundingParams(roundingParams)
                        .build());
    }

    @BindingAdapter({"imageUri"})
    public static void setImage(ImageView imageView, String imageUri) {
        imageView.setImageURI(Uri.parse(imageUri));
    }
}
