package com.example.yangsiyoung.badwatchtest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Yang Si Young on 2016-08-17.
 */

public class TestFragmentPagerAdapter extends FragmentPagerAdapter {
    Context context;
    public TestFragmentPagerAdapter(FragmentManager fragmentmanager, Context context){
        super(fragmentmanager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
