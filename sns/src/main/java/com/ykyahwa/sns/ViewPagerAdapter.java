package com.ykyahwa.sns;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ehlee on 2016-03-31.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FacebookFragment();
            case 1:
                return new KakaoTalkFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return TabData.values().length;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return TabData.values()[position].getValue();
    }
}
