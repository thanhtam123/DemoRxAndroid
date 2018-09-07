package com.example.admin.demorxandroid.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by TamTT on 9/6/2018.
 */

public class Genre {
    @SerializedName("genre")
    @Expose
    public String genre;
    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("last_updated")
    @Expose
    public String lastUpdated;
    @SerializedName("collection")
    @Expose
    public List<Collection> collection = null;
    @SerializedName("query_urn")
    @Expose
    public String queryUrn;
    @SerializedName("next_href")
    @Expose
    public String nextHref;

    @Override
    public String toString() {
        return "Genre{" +
                "genre='" + genre + '\'' +
                ", kind='" + kind + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", collection=" + collection +
                ", queryUrn='" + queryUrn + '\'' +
                ", nextHref='" + nextHref + '\'' +
                '}';
    }
}
