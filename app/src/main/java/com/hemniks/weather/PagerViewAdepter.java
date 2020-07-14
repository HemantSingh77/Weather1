package com.hemniks.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdepter extends FragmentPagerAdapter {
    public PagerViewAdepter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new CurrentFragment();
                break;
            case 1:
                fragment = new DateFragment();
                break;
            case 2:
                fragment = new MonthFragment();
                break;
            case 3:
                fragment = new SettingsFragment();
                break;
        }
        assert fragment != null;
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
