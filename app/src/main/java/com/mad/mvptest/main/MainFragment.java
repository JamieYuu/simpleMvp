package com.mad.mvptest.main;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mad.mvptest.R;

/**
 * Created by yujiazheng on 21/5/18.
 */

public class MainFragment extends Fragment implements MainContract.View{
    private MainContract.Presenter mPresenter;

    private TextView mTextView;
    private Button mButton;
    private String mText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main, container, false);
        mTextView = (TextView) root.findViewById(R.id.test_tv);
        mButton = (Button) root.findViewById(R.id.test_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getCalculateResult();
            }
        });

        return root;
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void setPresneter(MainContract.Presenter presneter) {
        mPresenter = presneter;
    }

    @Override
    public void updateTextView(String text) {
        mTextView.setText(text);
    }


}
