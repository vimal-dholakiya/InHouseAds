package com.newAds2021.adsmodels;

import
android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newAds2021.R;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class AdsPrefernce {
    Context context;
    SharedPreferences adsPreference;
    SharedPreferences.Editor editor;


    public AdsPrefernce(Context context) {
        this.context = context;
        adsPreference = context.getSharedPreferences("MyAdsPrefrence", Context.MODE_PRIVATE);
        editor = adsPreference.edit();

    }


    public void setAdsDefaults(String extra_para1, Boolean extra_para2, String extra_para3, String extra_para4,
                               Boolean extra_para5, String extra_para6, Boolean extra_para7, String extra_para8,
                               String extra_para9, String extra_para10, String extra_para11, String extra_para12,
                               Boolean extra_para13, String extra_para14, String extra_para15, String extra_para16,String extra_para17
    ) {
        if (adsPreference != null) {
            editor = adsPreference.edit();
            editor.putString("extra_para1", extra_para1);
            editor.putBoolean("extra_para2", extra_para2);
            editor.putString("extra_para3", extra_para3);
            editor.putString("extra_para4", extra_para4);
            editor.putBoolean("extra_para5", extra_para5);
            editor.putString("extra_para6", extra_para6);
            editor.putBoolean("extra_para7", extra_para7);
            editor.putString("extra_para8", extra_para8);
            editor.putString("extra_para9", extra_para9);
            editor.putString("extra_para10", extra_para10);
            editor.putString("extra_para11", extra_para11);
            editor.putString("extra_para12", extra_para12);
            editor.putBoolean("extra_para13", extra_para13);
            editor.putString("extra_para14", extra_para14);
            editor.putString("extra_para15", extra_para15);
            editor.putString("extra_para16", extra_para16);
            editor.putString("extra_para17", extra_para17);

            editor.apply();
        }
    }

    public String extrapara1() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para1", "");
        }
        return var;
    }

    public boolean extrapara2() {
        boolean output = false;
        if (adsPreference != null) {
            output = adsPreference.getBoolean("extra_para2", true);
        }
        return output;
    }

    public String extrapara3() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para3", "");
        }
        return var;
    }

    public String extrapara4() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para4", "");
        }
        return var;
    }
    public boolean extrapara5() {
        boolean output = false;
        if (adsPreference != null) {
            output = adsPreference.getBoolean("extra_para5", true);
        }
        return output;
    }

    public String extrapara6() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para6", "");
        }
        return var;
    }

    public boolean extrapara7() {
        boolean output = false;
        if (adsPreference != null) {
            output = adsPreference.getBoolean("extra_para7", true);
        }
        return output;
    }

    public String extrapara8() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para8", "");
        }
        return var;
    }
    public String extrapara9() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para9", "");
        }
        return var;
    }

    public String extrapara10() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para10", "");
        }
        return var;
    }

    public String extrapara11() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para11", "");
        }
        return var;
    }

    public String extrapara12() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para12", "");
        }
        return var;
    }

    public boolean extrapara13() {
        boolean output = false;
        if (adsPreference != null) {
            output = adsPreference.getBoolean("extra_para13", true);
        }
        return output;
    }

    public String extrapara14() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para14", "");
        }
        return var;
    }

    public String extrapara15() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para15", "");
        }
        return var;
    }

    public String extrapara16() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para16", "");
        }
        return var;
    }
    public String extrapara17() {
        String var = "";
        if (adsPreference != null) {
            var = adsPreference.getString("extra_para17", "");
        }
        return var;
    }

    public void setInHouseLoaded(boolean isLoaded) {
        editor.putBoolean("isInHouseAdLoaded", isLoaded);
        editor.apply();
    }

    public void setInHouseAdDetails(ArrayList<IhAdsDetail> arrayList) {
        Gson gson = new Gson();
        String json = gson.toJson(arrayList);
        editor.remove("inHouseAdList");
        editor.apply();
        editor.putString("inHouseAdList", json);
        setInHouseLoaded(true);
        editor.apply();
    }

    public ArrayList<IhAdsDetail> getInHouseAds() {
        Gson gson = new Gson();
        String json = adsPreference.getString("inHouseAdList", "");
        Type type = new TypeToken<ArrayList<IhAdsDetail>>() {
        }.getType();
        ArrayList<IhAdsDetail> ihAdsDetails = gson.fromJson(json, type);
        return ihAdsDetails;
    }

    public Boolean isInHouseAdLoaded() {
        return adsPreference.getBoolean("isInHouseAdLoaded", false);
    }

}



