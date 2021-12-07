package com.anu.kerkel_meal;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int totalTabs;
    public PagerAdapter(@NonNull FragmentManager fm, int totalTabs) {
        super(fm, totalTabs);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MenuFragment menuFragment = new MenuFragment();
                return menuFragment;
            case 1:
                AboutFragment aboutFragment = new AboutFragment();
                return aboutFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}


