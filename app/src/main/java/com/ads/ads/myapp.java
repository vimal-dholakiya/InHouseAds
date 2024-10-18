package com.ads.ads;

import android.app.Application;

import com.newAds2021.adsmodels.ConstantAds;


public class myapp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        ConstantAds.setAdsURL("1QU26d5OsAf-F-wg6gon89T0psGIHThxLDCJvGZFyTmM");
    }
}
