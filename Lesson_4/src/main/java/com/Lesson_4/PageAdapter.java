package com.Lesson_4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    public PageAdapter(FragmentManager mgr){
        super(mgr);
    }

    public Fragment getItem(int i) {
        return PageFragment.newInstance(i);
    }

    public int getCount() {
        return 10;
    }
}
