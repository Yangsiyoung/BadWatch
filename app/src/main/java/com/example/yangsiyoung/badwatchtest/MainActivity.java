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
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.data.heros.code.RequestCode;
import com.example.yangsiyoung.badwatchtest.data.heros.code.ResultCode;
import com.example.yangsiyoung.badwatchtest.data.heros.cookiehandler.WebViewCookieHandler;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserQuickInfo;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserRankInfo;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentAnalysis;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentBoard;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentMovie;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentRecord;
import com.example.yangsiyoung.badwatchtest.fragments.FragmentTeam;
import com.example.yangsiyoung.badwatchtest.ui.BadWatchFragmentActivity;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.framed.Header;

import static com.example.yangsiyoung.badwatchtest.MainActivity.isChanged;
import static com.example.yangsiyoung.badwatchtest.data.heros.code.ResultCode.WRITE_ARTICLE_SUCCESS;

public class MainActivity extends BadWatchFragmentActivity implements FragmentAnalysis.ReloadFragmentForRecord, RequestCode, ResultCode {

    public static boolean isChanged = false;

    SectionsPagerAdapter sectionsPagerAdapter;

    @Bind(R.id.viewPager)
    ViewPager viewPager;

    Intent intent;

    ActionBar actionBarCustom;

    String userId;

    public static final String urlForBattleNetLoginInfo = "http://bad.watch/api/session";

    CookieManager cookieManager;


    @Override
    public void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        cookieManager = CookieManager.getInstance();
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
    public void reload(UserQuickInfo userQuickInfo, UserRankInfo userRankInfo, String userId) {

        this.userId = userId;
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
            SharedPreferences sharedPreferencesUserId = getSharedPreferences("autoLoginId", Activity.MODE_PRIVATE);
            userId = sharedPreferencesUserId.getString("autoLoginId","");
            fragmentRecord.setUserId(userId);
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
            fragmentRecord.setUserId(userId);
            fragments.add(0, fragmentRecord);
        }

        public void refreshFragmentBoard(){
            fragments.remove(3);
            fragments.add(3, new FragmentBoard());
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (resultCode){
            case WRITE_ARTICLE:
                if(resultCode == WRITE_ARTICLE_SUCCESS){
                    Toast.makeText(MainActivity.this, "게시글을 등록하였습니다.", Toast.LENGTH_SHORT).show();
                    sectionsPagerAdapter.refreshFragmentBoard();
                    sectionsPagerAdapter.notifyDataSetChanged();

                } else if(resultCode == WRITE_ARTICLE_FAIL){
                    Toast.makeText(MainActivity.this, "게시글 작성을 취소하였습니다.", Toast.LENGTH_SHORT).show();
                }
            break;

            case BATTLE_NET_LOGIN_SUCCESS:
                //cookieManager.setCookie(urlForBattleNetLoginInfo, data.getStringExtra("loginCookie"));
                new ConnectServer().login(urlForBattleNetLoginInfo);
                break;

            case BATTLE_NET_LOGIN_FAIL:
                Toast.makeText(MainActivity.this, "배틀넷 로그인을 취소하였습니다.", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    class ConnectServer{

        //OkHttpClient client = new OkHttpClient.Builder().cookieJar(new JavaNetCookieJar(new WebViewCookieHandler())).build();
       /* OkHttpClient client = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {

            @Override
            public Response intercept(Chain chain) {
                try{
                    final Request original = chain.request();

                    final Request authorized = original.newBuilder().addHeader("Cookie", cookieManager.getCookie(BattleNetLoginActivity.battleNetLoginUrl)).build();

                    return chain.proceed(authorized);
                }catch (Exception e){
                    Log.d("error", "Intercept Error is " + e.toString());
                }
                return null;
            }
        }).build();*/

        OkHttpClient client = new OkHttpClient();


        public void login(String url){

           Log.d("aaaa", "URL의 URI는 " + URI.create(url).toString());
            RequestBody body = RequestBody.create(null, new byte[0]);
            RequestBody body2 = new FormBody.Builder().build();
           Request request = new Request.Builder().addHeader("Cookie",cookieManager.getCookie(BattleNetLoginActivity.battleNetLoginUrl)).post(body).url(url).build();
           // Request request = new Request.Builder().post(body).url(url).build();

            String headerCookie = request.header("Cookie");
            Log.d("aaaa", "Header에 들어간 Cookie는 " + headerCookie);
            client.newCall(request).enqueue(new Callback() {

                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Battle Net Login Info Request Fail is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()) {
                        String result = response.body().string();
                        Log.d("aaaa", "Battle Net Login Info is " + result);
                        Log.d("aaaa", "Cookie is " + cookieManager.getCookie(BattleNetLoginActivity.battleNetLoginUrl));

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "배틀넷 로그인 성공!!!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }
            });

        }

    }
}