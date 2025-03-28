package com.ads.ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.newAds2021.adsmodels.ConstantAds;
import com.newAds2021.adutils.BaseAdsClass;

import java.util.concurrent.Callable;

public class MainActivity extends BaseAdsClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        withDelay(5000, new Callable<Void>() {
            @Override
            public Void call() throws Exception {

                Toast.makeText(MainActivity.this, adsPrefernce.extrapara3(), Toast.LENGTH_SHORT).show();


                return null;

            }
        });

    }
}