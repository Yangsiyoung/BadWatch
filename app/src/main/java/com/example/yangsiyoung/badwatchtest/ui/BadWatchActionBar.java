package com.example.yangsiyoung.badwatchtest.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.yangsiyoung.badwatchtest.R;

/**
 * Created by Yang Si Young on 2016-08-16.
 */

public class BadWatchActionBar {

    // ActionBar 를 활성화시킬 activity
    private AppCompatActivity activity;

    // activity로부터 가져온 ActionBar
    private ActionBar actionBar;

    // tabAnalysis Tab
    private ActionBar.Tab tabAnalysis;

    // tabTeam Tab
    private ActionBar.Tab tabTeam;

    // tabMovie Tab
    private ActionBar.Tab tabMovie;

    // tabBoard Tab
    private ActionBar.Tab tabBoard;

    /**
     *
     * @param act
     *            ActionBar를 활성화 시킬 Activity activity.getActionBar()로 actionBar
     *            를 사용하기위해서 받아옵니다.
     */
    @SuppressLint("NewApi")
    public BadWatchActionBar(AppCompatActivity act) {
        try {
            activity = act;
            actionBar = activity.getSupportActionBar();
           // actionBar.setTitle("BadWatch");
           // actionBar.setIcon(null);
            actionBar.setCustomView(R.layout.actionbar_layout);
           // actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4B58A2")));
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayUseLogoEnabled(false);
            actionBar.setHomeButtonEnabled(false);
           // actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#4B58A2")));
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        }catch(Exception e){
            Log.d("error" , "ActionBar 초기화 error is " + e.toString());
        }
        initTabs();


    }

    public void initTabs() {

        tabAnalysis = actionBar.newTab().setIcon(R.drawable.record_selector);
        tabTeam = actionBar.newTab().setIcon(R.drawable.team_selector);
        tabMovie = actionBar.newTab().setIcon(R.drawable.movie_selector);
        tabBoard = actionBar.newTab().setIcon(R.drawable.board_selector);
    }

    public void setTabListener(ActionBar.TabListener tabListener) {

        tabAnalysis.setTabListener(tabListener);
        tabTeam.setTabListener(tabListener);
        tabMovie.setTabListener(tabListener);
        tabBoard.setTabListener(tabListener);

        actionBar.addTab(tabAnalysis);
        actionBar.addTab(tabTeam);
        actionBar.addTab(tabMovie);
        actionBar.addTab(tabBoard);
    }

    /**
     * Fragment에서 스와이프로 탭을 옮겨가면 탭 선택자도 바꾸기위해서 ViewPager를 받아옵니다.
     *
     * @param pager
     *            Fragment가 사용하는 ViewPager
     */
    public void setViewPager(ViewPager pager) {
        pager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onPageSelected(int position) {
                try {
                    actionBar.setSelectedNavigationItem(position);
                } catch (Exception e) {
                    Log.d("aaaa", e.toString());
                }
            }
        });
    }
}