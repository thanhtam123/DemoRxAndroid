package com.example.admin.demorxandroid.screen;

import android.util.Log;

import com.example.admin.demorxandroid.BuildConfig;
import com.example.admin.demorxandroid.data.model.Genre;
import com.example.admin.demorxandroid.data.model.GenreType;
import com.example.admin.demorxandroid.data.remote.network.NetworkClient;
import com.example.admin.demorxandroid.data.remote.network.NetworkService;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function6;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by TamTT on 9/5/2018.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private CompositeDisposable mCompositeDisposable;
    private Disposable mDisposable;

    public MainPresenter(MainContract.View genreView) {
        mView = genreView;
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void subscribe() {
        getAllGenres();
        Log.e("TAG_subscribe", "" + mDisposable.isDisposed());
    }

    @Override
    public void unsubscribe() {
        mCompositeDisposable.clear();
        //mCompositeDisposable.dispose();
        Log.e("TAG_unsubscribe", "" + mDisposable.isDisposed());
        Log.e("TAG_unsubscribe", "" + mCompositeDisposable.isDisposed());
    }

    private void getAllGenres() {
        Single.zip(getObservable(GenreType.ALL_MUSIC),
                getObservable(GenreType.ALL_AUDIO),
                getObservable(GenreType.ALTERNATIVEROCK),
                getObservable(GenreType.AMBIENT),
                getObservable(GenreType.CLASSICAL),
                getObservable(GenreType.COUNTRY),
                new Function6<Genre, Genre, Genre, Genre, Genre, Genre, List<Genre>>() {
                    @Override
                    public List<Genre> apply(Genre genreAllMusic,
                                             Genre genreAllAudio,
                                             Genre genreAlternativerock,
                                             Genre genreAmbient,
                                             Genre genreClassical,
                                             Genre genreCountry) throws Exception {
                        List<Genre> genres = new ArrayList<>();
                        genres.add(genreAllMusic);
                        genres.add(genreAllAudio);
                        genres.add(genreAlternativerock);
                        genres.add(genreAmbient);
                        genres.add(genreClassical);
                        genres.add(genreCountry);
                        return genres;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Genre>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mDisposable = d;
                        Log.e("TAG", "onSubscribe");
                    }

                    @Override
                    public void onSuccess(List<Genre> genres) {
                        //Update Ui here
                        mView.showListGenres(genres);
                        for (Genre genre : genres) {
                            Log.e("TAG", genre.toString());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("TAG", e.toString());
                        mView.showLoadListFailure(e.toString());
                    }
                });
        mCompositeDisposable.add(mDisposable);
    }
    private Single<Genre> getObservable(@GenreType String type) {
        return NetworkClient.getClient().create(NetworkService.class)
                .getTrack("top", type, BuildConfig.ApiKey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
