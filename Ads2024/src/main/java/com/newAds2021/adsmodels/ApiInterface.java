package com.newAds2021.adsmodels;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("exec?")
    Call<AdsDetails> getAds(@Query("id") String id);

    @GET("exec?")
    Call<DataResponse> getData(@Query("id") String id, @Query("sheet") String sheet);



}
