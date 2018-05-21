package com.mad.mvptest.main;

/**
 * Created by yujiazheng on 21/5/18.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mMainView;

    public MainPresenter(MainContract.View mainView) {
        mMainView = mainView;
        mMainView.setPresneter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getCalculateResult() {
        String text = "update text";
        mMainView.updateTextView(text);
    }
}
