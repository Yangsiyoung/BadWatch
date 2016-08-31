package com.example.yangsiyoung.badwatchtest;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.data.heros.user.UserQuickInfo;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserRankInfo;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentAnalysis;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentBoard;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentMovie;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentRecord;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentTeam;
import com.example.yangsiyoung.badwatchtest.ui.BadWatchFragmentActivity;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.example.yangsiyoung.badwatchtest.MainActivity.isChanged;

public class MainActivity extends BadWatchFragmentActivity implements FragmentAnalysis.ReloadFragmentForRecord {

    public static boolean isChanged = false;

    SectionsPagerAdapter sectionsPagerAdapter;

    @Bind(R.id.viewPager)
    ViewPager viewPager;

    Intent intent;
    ActionBar actionBarCustom;


    @Override
    public void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        actionBarCustom = getSupportActionBar();
        View customView = actionBarCustom.getCustomView();
        ImageButton imageButton = (ImageButton) customView.findViewById(R.id.imgButtonSearch);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();
            }
        });
        intent = getIntent();

        if(intent.hasExtra("autoUserQuickInfo")){
            UserQuickInfo userQuickInfo = (UserQuickInfo)intent.getSerializableExtra("autoUserQuickInfo");
            UserRankInfo userRankInfo = (UserRankInfo)intent.getSerializableExtra("autoUserRankInfo");

            sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(),userQuickInfo, userRankInfo);
            viewPager.setAdapter(sectionsPagerAdapter);
            actionBar.setViewPager(viewPager);


        }else if(!intent.hasExtra("autoUserQuickInfo")) {
            sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
            viewPager.setAdapter(sectionsPagerAdapter);
            actionBar.setViewPager(viewPager);
        }
    }

    public void reLoadFragmentForAnalysis() {
        sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(sectionsPagerAdapter);
        actionBar.setViewPager(viewPager);
    }

    @Override
    protected void tabSelected(int i) {
        viewPager.setCurrentItem(i);
    }

    @Override
    public void reload(UserQuickInfo userQuickInfo, UserRankInfo userRankInfo) {

       // sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        sectionsPagerAdapter.reloadArrayListOfFragment(userQuickInfo, userRankInfo);
       // isChanged = true;
        sectionsPagerAdapter.notifyDataSetChanged();
       // viewPager.setAdapter(sectionsPagerAdapter);
       // actionBar.setViewPager(viewPager);

    }

    /**
     * Fragment를 ViewPager에 적용시키기위한 아답터.
     */
    class SectionsPagerAdapter extends FragmentStatePagerAdapter {

        // Tab에 들어가는 Fragment를 담는 ArrayList
        ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        private Context mContext;

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
            initFragments();
        }

        public SectionsPagerAdapter(FragmentManager fm, UserQuickInfo userQuickInfo, UserRankInfo userRankInfo){
            super(fm);
            initAutoLoginFragments(userQuickInfo, userRankInfo);
        }

        private void initFragments() {
            fragments.add(new FragmentAnalysis());
            fragments.add(new FragmentTeam());
            fragments.add(new FragmentMovie());
            fragments.add(new FragmentBoard());
        }

        private void initAutoLoginFragments(UserQuickInfo userQuickInfo, UserRankInfo userRankInfo){
            FragmentRecord fragmentRecord = new FragmentRecord();
            fragmentRecord.setUserQuickInfo(userQuickInfo);
            fragmentRecord.setUserRankInfo(userRankInfo);
            fragments.add(fragmentRecord);
            fragments.add(new FragmentTeam());
            fragments.add(new FragmentMovie());
            fragments.add(new FragmentBoard());
        }

        public void reloadArrayListOfFragment(UserQuickInfo userQuickInfo, UserRankInfo userRankInfo) {
            fragments.remove(0);
            FragmentRecord fragmentRecord = new FragmentRecord();
            fragmentRecord.setUserQuickInfo(userQuickInfo);
            fragmentRecord.setUserRankInfo(userRankInfo);
            fragments.add(0, fragmentRecord);
        }


        @Override
        public int getItemPosition(Object object) {
            return POSITION_NONE;
        }

        /**
         * @param position tab이 선택된 위치
         * @return 선택된 Fragment
         */
        @Override
        public Fragment getItem(int position) {
            // 만약에 이상한숫자가 들어온다면 0으로 position을 바꿈. 이거없으면 ArrayIndexOutOfBound 날수있음
            if (position > fragments.size()) {
                position = 0;
            }

            Fragment fragment = fragments.get(position);
            // Bundle args = new Bundle();
             //args.putInt("position", position + 1); // tab의 인덱스는 항상 position으로
            // // Bundle에 넘김.
             //fragment.setArguments(args);
            return fragment;
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

    }

}