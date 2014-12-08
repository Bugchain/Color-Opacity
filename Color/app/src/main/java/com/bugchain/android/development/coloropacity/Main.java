package com.bugchain.android.development.coloropacity;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class Main extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ViewPager pager = (ViewPager)findViewById(R.id.veiwPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }

}
