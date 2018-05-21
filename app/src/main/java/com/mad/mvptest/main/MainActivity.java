package com.mad.mvptest.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mad.mvptest.R;
import com.mad.mvptest.util.ActivityUtils;

public class MainActivity extends AppCompatActivity {
    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_act);

        MainFragment mainFragment = (MainFragment) getSupportFragmentManager()
                .findFragmentById(R.id.main_contentFrame);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), mainFragment, R.id.main_contentFrame);
        }

        mMainPresenter = new MainPresenter(mainFragment);
    }
}
