package com.mad.mvptest.main;

import com.mad.mvptest.BasePresenter;
import com.mad.mvptest.BaseView;

/**
 * Created by yujiazheng on 21/5/18.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {
        void updateTextView(String text);
    }

    interface Presenter extends BasePresenter {
        void getCalculateResult();
    }
}
