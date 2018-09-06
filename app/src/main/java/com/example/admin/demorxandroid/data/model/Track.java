package com.example.admin.demorxandroid.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TamTT on 9/5/2018.
 */

public class Track {

    @SerializedName("artwork_url")
    @Expose
    public String artworkUrl;
    @SerializedName("commentable")
    @Expose
    public Boolean commentable;
    @SerializedName("comment_count")
    @Expose
    public Integer commentCount;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("downloadable")
    @Expose
    public Boolean downloadable;
    @SerializedName("download_count")
    @Expose
    public Integer downloadCount;
    @SerializedName("download_url")
    @Expose
    public String downloadUrl;
    @SerializedName("duration")
    @Expose
    public Integer duration;
    @SerializedName("full_duration")
    @Expose
    public Integer fullDuration;
    @SerializedName("embeddable_by")
    @Expose
    public String embeddableBy;
    @SerializedName("genre")
    @Expose
    public String genre;
    @SerializedName("has_downloads_left")
    @Expose
    public Boolean hasDownloadsLeft;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("label_name")
    @Expose
    public Object labelName;
    @SerializedName("last_modified")
    @Expose
    public String lastModified;
    @SerializedName("license")
    @Expose
    public String license;
    @SerializedName("likes_count")
    @Expose
    public Integer likesCount;
    @SerializedName("permalink")
    @Expose
    public String permalink;
    @SerializedName("permalink_url")
    @Expose
    public String permalinkUrl;
    @SerializedName("playback_count")
    @Expose
    public Integer playbackCount;
    @SerializedName("public")
    @Expose
    public Boolean _public;
    @SerializedName("purchase_title")
    @Expose
    public Object purchaseTitle;
    @SerializedName("purchase_url")
    @Expose
    public Object purchaseUrl;
    @SerializedName("release_date")
    @Expose
    public Object releaseDate;
    @SerializedName("reposts_count")
    @Expose
    public Integer repostsCount;
    @SerializedName("secret_token")
    @Expose
    public Object secretToken;
    @SerializedName("sharing")
    @Expose
    public String sharing;
    @SerializedName("state")
    @Expose
    public String state;
    @SerializedName("streamable")
    @Expose
    public Boolean streamable;
    @SerializedName("tag_list")
    @Expose
    public String tagList;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("uri")
    @Expose
    public String uri;
    @SerializedName("urn")
    @Expose
    public String urn;
    @SerializedName("user_id")
    @Expose
    public Integer userId;
    @SerializedName("visuals")
    @Expose
    public Object visuals;
    @SerializedName("waveform_url")
    @Expose
    public String waveformUrl;
    @SerializedName("display_date")
    @Expose
    public String displayDate;
    @SerializedName("monetization_model")
    @Expose
    public String monetizationModel;
    @SerializedName("policy")
    @Expose
    public String policy;
    @SerializedName("user")
    @Expose
    public User user;

    @Override
    public String toString() {
        return "Track{" +
                "artworkUrl='" + artworkUrl + '\'' +
                ", commentable=" + commentable +
                ", commentCount=" + commentCount +
                ", createdAt='" + createdAt + '\'' +
                ", description='" + description + '\'' +
                ", downloadable=" + downloadable +
                ", downloadCount=" + downloadCount +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", duration=" + duration +
                ", fullDuration=" + fullDuration +
                ", embeddableBy='" + embeddableBy + '\'' +
                ", genre='" + genre + '\'' +
                ", hasDownloadsLeft=" + hasDownloadsLeft +
                ", id=" + id +
                ", kind='" + kind + '\'' +
                ", labelName=" + labelName +
                ", lastModified='" + lastModified + '\'' +
                ", license='" + license + '\'' +
                ", likesCount=" + likesCount +
                ", permalink='" + permalink + '\'' +
                ", permalinkUrl='" + permalinkUrl + '\'' +
                ", playbackCount=" + playbackCount +
                ", _public=" + _public +
                ", purchaseTitle=" + purchaseTitle +
                ", purchaseUrl=" + purchaseUrl +
                ", releaseDate=" + releaseDate +
                ", repostsCount=" + repostsCount +
                ", secretToken=" + secretToken +
                ", sharing='" + sharing + '\'' +
                ", state='" + state + '\'' +
                ", streamable=" + streamable +
                ", tagList='" + tagList + '\'' +
                ", title='" + title + '\'' +
                ", uri='" + uri + '\'' +
                ", urn='" + urn + '\'' +
                ", userId=" + userId +
                ", visuals=" + visuals +
                ", waveformUrl='" + waveformUrl + '\'' +
                ", displayDate='" + displayDate + '\'' +
                ", monetizationModel='" + monetizationModel + '\'' +
                ", policy='" + policy + '\'' +
                ", user=" + user +
                '}';
    }
}
