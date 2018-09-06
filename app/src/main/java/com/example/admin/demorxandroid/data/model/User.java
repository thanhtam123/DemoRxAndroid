package com.example.admin.demorxandroid.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TamTT on 9/5/2018.
 */

public class User {
    @SerializedName("avatar_url")
    @Expose
    public String avatarUrl;
    @SerializedName("first_name")
    @Expose
    public String firstName;
    @SerializedName("full_name")
    @Expose
    public String fullName;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("last_modified")
    @Expose
    public String lastModified;
    @SerializedName("last_name")
    @Expose
    public String lastName;
    @SerializedName("permalink")
    @Expose
    public String permalink;
    @SerializedName("permalink_url")
    @Expose
    public String permalinkUrl;
    @SerializedName("uri")
    @Expose
    public String uri;
    @SerializedName("urn")
    @Expose
    public String urn;
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("verified")
    @Expose
    public Boolean verified;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("country_code")
    @Expose
    public String countryCode;

    @Override
    public String toString() {
        return "User{" +
                "avatarUrl='" + avatarUrl + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", id=" + id +
                ", kind='" + kind + '\'' +
                ", lastModified='" + lastModified + '\'' +
                ", lastName='" + lastName + '\'' +
                ", permalink='" + permalink + '\'' +
                ", permalinkUrl='" + permalinkUrl + '\'' +
                ", uri='" + uri + '\'' +
                ", urn='" + urn + '\'' +
                ", username='" + username + '\'' +
                ", verified=" + verified +
                ", city='" + city + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
