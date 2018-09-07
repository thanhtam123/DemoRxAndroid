package com.example.admin.demorxandroid.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.admin.demorxandroid.R;
import com.example.admin.demorxandroid.data.model.Genre;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;

    @BindView(R.id.text_result)
    TextView mTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mPresenter = new MainPresenter(this);
        mPresenter.subscribe();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.subscribe();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.unsubscribe();
    }

    @Override
    public void showListGenres(List<Genre> genres) {
        mTextResult.setText(genres.toString());
    }

    @Override
    public void showLoadListFailure(String err) {
        mTextResult.setText(err);
    }
}
