package com.newAds2021.adsmodels;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {

    private static <T> T builder(Class<T> endpoint) {

        return new Retrofit.Builder()
                .baseUrl("https://script.google.com/macros/s/AKfycbzxzG1Dx28OS3_UDhoQ9N0dooEVFy84C60xIgnfxnj8atB7mZ5_Yr9T8b2zV-4BjTFGXw/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(endpoint);


    }

    public static ApiInterface apiInterface() {
        return builder(ApiInterface.class);
    }

}
