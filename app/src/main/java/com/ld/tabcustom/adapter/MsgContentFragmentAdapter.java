package com.ld.tabcustom.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ld.tabcustom.fragment.MsgContentFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Billta on 2019-01-09.
 */
//消息内容子界面适配器
public class MsgContentFragmentAdapter extends FragmentPagerAdapter {
    private List<String> names;

    public MsgContentFragmentAdapter(FragmentManager fm) {
        super(fm);
        this.names = new ArrayList<>();
    }

    /**
     * 数据列表
     *
     * @param datas
     */
    public void setList(List<String> datas) {
        this.names.clear();
        this.names.addAll(datas);
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        MsgContentFragment fragment = new MsgContentFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", names.get(position));
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String plateName = names.get(position);
        if (plateName == null) {
            plateName = "";
        } else if (plateName.length() > 15) {
            plateName = plateName.substring(0, 15) + "...";
        }
        return plateName;
    }
}
