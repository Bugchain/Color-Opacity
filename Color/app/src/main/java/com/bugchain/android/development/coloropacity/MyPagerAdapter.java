package com.bugchain.android.development.coloropacity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by BUG CHAIN on 8/12/2557.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private final int NUM_ITEMS = 2;

    public MyPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0)
            return  ShowColor.newInstance();
        else if(position == 1){
            return SetValues.newInstance();
        }

        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
