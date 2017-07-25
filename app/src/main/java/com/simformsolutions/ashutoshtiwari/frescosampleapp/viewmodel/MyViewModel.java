package com.simformsolutions.ashutoshtiwari.frescosampleapp.viewmodel;

import com.simformsolutions.ashutoshtiwari.frescosampleapp.model.Image;

/**
 * Created by Ashutosh.tiwari on 25/07/17.
 * Custom View Model class
 */

public class MyViewModel {

    private Image image;

    public MyViewModel(Image image) {
        this.image = image;
    }

    public String getUri() {
        return image.getUri();
    }

/*  The code is not required for this version of app but can be used in future upgrades.
    public void setUri(String uri) {
        image.setUri(uri);
    }
*/
}
