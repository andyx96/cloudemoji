package org.ktachibana.cloudemoji.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import org.ktachibana.cloudemoji.R;
import org.ktachibana.cloudemoji.adapters.EmojiconsPagerAdapter;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class EmojiconsFragment extends Fragment {
    @InjectView(R.id.pager)
    ViewPager mPager;
    @InjectView(R.id.tabs)
    PagerSlidingTabStrip mTabs;

    public EmojiconsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Setup views
        View rootView = inflater.inflate(R.layout.fragment_emojicons, container, false);
        ButterKnife.inject(this, rootView);

        // Setup contents
        mPager.setAdapter(new EmojiconsPagerAdapter(getChildFragmentManager()));
        mTabs.setViewPager(mPager);
        mTabs.setIndicatorColorResource(R.color.accent);

        return rootView;
    }


}
