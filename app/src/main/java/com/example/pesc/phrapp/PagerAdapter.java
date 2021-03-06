package com.example.pesc.phrapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by PESC on 2016-09-14.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int _numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this._numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment1 tab1 = new Fragment1();
                return tab1;
            case 1:
                Fragment2 tab2 = new Fragment2();
                return tab2;
            case 2:
                Fragment3 tab3 = new Fragment3();
                return tab3;
            case 3:
                Fragment4 tab4 = new Fragment4();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return _numOfTabs;
    }
}