package com.example.admin.demorxandroid.screen;

import com.example.admin.demorxandroid.data.model.Genre;

import java.util.List;

/**
 * Created by TamTT on 9/5/2018.
 */

public interface MainContract {
    interface View{
        void showListGenres(List<Genre> genres);

        void showLoadListFailure(String err);
    }

    interface Presenter{

        void subscribe();

        void unsubscribe();
    }
}
