package com.newAds2021.adsmodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModel {

    @SerializedName("id")
    @Expose
    private String Id;
    @SerializedName("img")
    @Expose
    private String Img;
    @SerializedName("link")
    @Expose
    private String Link;
    @SerializedName("type")
    @Expose
    private String Type;
    @SerializedName("extra_one")
    @Expose
    private String Extra1;
    @SerializedName("extra_two")
    @Expose
    private String Extra2;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getExtra1() {
        return Extra1;
    }

    public void setExtra1(String extra1) {
        Extra1 = extra1;
    }

    public String getExtra2() {
        return Extra2;
    }

    public void setExtra2(String extra2) {
        Extra2 = extra2;
    }
}
