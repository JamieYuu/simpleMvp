package com.mad.mvptest.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by yujiazheng on 21/5/18.
 */

public class ActivityUtils {

    public static void addFragmentToActivity (FragmentManager fragmentManager, Fragment fragment, int framId) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(framId, fragment);
        transaction.commit();
    }
}
