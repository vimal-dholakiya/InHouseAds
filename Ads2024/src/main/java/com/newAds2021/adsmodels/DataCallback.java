package com.newAds2021.adsmodels;

import java.util.ArrayList;

public interface DataCallback {
    void onSuccess(ArrayList<DataModel> data);
    void onFailure(Throwable t);
}
