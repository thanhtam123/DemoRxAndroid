package com.example.admin.demorxandroid.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TamTT on 9/6/2018.
 */

public class Collection {
    @SerializedName("track")
    @Expose
    public Track track;
    @SerializedName("score")
    @Expose
    public Integer score;

    @Override
    public String toString() {
        return "Collection{" +
                "track=" + track +
                ", score=" + score +
                '}';
    }
}
