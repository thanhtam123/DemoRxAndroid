package com.example.admin.demorxandroid.data.remote.network;

import com.example.admin.demorxandroid.data.model.Genre;
import com.example.admin.demorxandroid.data.model.GenreType;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by TamTT on 9/5/2018.
 */

public interface NetworkService {
    @GET("/charts")
    Single<Genre> getTrack(@Query("kind") String order,
                           @Query("genre") @GenreType String type,
                           @Query("client_id") String api_key);
}
