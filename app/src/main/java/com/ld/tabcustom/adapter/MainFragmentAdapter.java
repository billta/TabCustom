package com.ld.tabcustom.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ld.tabcustom.fragment.ContactFragment;
import com.ld.tabcustom.fragment.FindFragment;
import com.ld.tabcustom.fragment.MeFragment;
import com.ld.tabcustom.fragment.MsgFragment;

/**
 * Created by Billta on 2019-01-09.
 */
//主界面底部菜单适配器
public class MainFragmentAdapter extends FragmentPagerAdapter {
    public MainFragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new MsgFragment();
                break;
            case 1:
                fragment = new ContactFragment();
                break;
            case 2:
                fragment = new FindFragment();
                break;
            case 3:
                fragment = new MeFragment();
                break;
            default:
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
