package com.example.yangsiyoung.badwatchtest;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.data.heros.user.UserQuickInfo;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserRankInfo;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;

public class LoadingActivity extends AppCompatActivity {
    private TimerTask timerTask;
    private Timer timer;
    private SharedPreferences sharedPreferencesAutoLogin;
    public static final String url = "http://bad.watch/api/user/quick/";
    public static final String urlRank = "http://bad.watch/api/user/rank/";
    private boolean timerIsRun = false;
    private String userId;
    UserQuickInfo autoUserQuickInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        sharedPreferencesAutoLogin = getSharedPreferences("autoLoginId", Activity.MODE_PRIVATE);

        if (sharedPreferencesAutoLogin.contains("autoLoginId")) {
            userId = sharedPreferencesAutoLogin.getString("autoLoginId","");
            String autoLoginUrl = url+userId;
            new ConnectServer().run(autoLoginUrl,"quick");

        } else if (!sharedPreferencesAutoLogin.contains("autoLoginId")) {
            timerIsRun = true;
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            };

            timer = new Timer();
            timer.schedule(timerTask, 2000);
        }

    }

    @Override
    protected void onDestroy() {
        if(timerIsRun){
        timer.cancel();
        }
        super.onDestroy();
    }

    class ConnectServer {

        OkHttpClient client = new OkHttpClient();

        public void run(String url, final String gameType) {
            Log.d("aaaa", "url은 " + url);
            //HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
            final Gson gson = new Gson();
            Request request = new Request.Builder().url(url).build();
            //Log.d("aaaa", "Build된 url은 " + urlBuilder.build().toString());
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "ConnectServer Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                    try {

                        String result = response.body().string();
                        JSONObject jsonObject = new JSONObject(result);
                        Log.d("aaaa", "responseCode is " + jsonObject.getString("responseCode"));
                        int responseCode = Integer.parseInt(jsonObject.getString("responseCode"));


                        if (responseCode == 2 && gameType.equals("quick")) {
                            //gson을 통해 UserQuickInfo 저장

                            autoUserQuickInfo = gson.fromJson(jsonObject.getJSONObject("userData").toString(), UserQuickInfo.class);
                            String urlForRankRecord = urlRank+userId;
                            new ConnectServer().run(urlForRankRecord,"rank");
                            Log.d("aaaa", "userQuickInfo의 userId는 " + autoUserQuickInfo.getUserId());
                            //Intent intent = new Intent(getApplicationContext(), NextActivity.class);

                        }else if(responseCode == 2 && gameType.equals("rank")){
                            timerIsRun = true;
                            final UserQuickInfo userQuickInfo = autoUserQuickInfo;
                            final UserRankInfo userRankInfo = gson.fromJson(jsonObject.getJSONObject("userData").toString(), UserRankInfo.class);
                            timerTask = new TimerTask() {
                                @Override
                                public void run() {
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    intent.putExtra("autoUserQuickInfo", userQuickInfo);
                                    intent.putExtra("autoUserRankInfo", userRankInfo);
                                    startActivity(intent);
                                    finish();
                                }
                            };

                            timer = new Timer();
                            timer.schedule(timerTask, 50);
                        }

                        else if(responseCode == 3) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "해당 아이디의 정보가 존재하지않습니다.", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }

                        else{
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "서버오류입니다. 다시 시도해주세요.", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    } catch (Exception e) {
                        Log.d("error", "Gson error is " + e.toString());
                    }

                }
            });
        }

    }
}





