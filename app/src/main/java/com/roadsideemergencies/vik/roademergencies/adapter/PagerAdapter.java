package com.roadsideemergencies.vik.roademergencies.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.roadsideemergencies.vik.roademergencies.fragments.BaseFragment;
import com.roadsideemergencies.vik.roademergencies.fragments.TabFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        BaseFragment tab1;
        switch (position) {
            case 0:
                tab1 = new TabFragment();
                tab1.setSearchingText("Hospitals");
                return tab1;
            case 1:
                tab1 = new TabFragment();
                tab1.setSearchingText("Atm");
                return tab1;
            case 2:
                tab1 = new TabFragment();
                tab1.setSearchingText("Restaurants");
                return tab1;
            case 3:
                tab1 = new TabFragment();
                tab1.setSearchingText("Mechanic");
                return tab1;
            case 4:
                tab1 = new TabFragment();
                tab1.setSearchingText("Ambulance");
                return tab1;
            case 5:
                tab1 = new TabFragment();
                tab1.setSearchingText("gas_station");
                return tab1;
            case 6:
                tab1 = new TabFragment();
                tab1.setSearchingText("police");
                return tab1;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}