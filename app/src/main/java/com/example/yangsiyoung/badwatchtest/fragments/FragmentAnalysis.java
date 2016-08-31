package com.example.yangsiyoung.badwatchtest.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.MainActivity;
import com.example.yangsiyoung.badwatchtest.R;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserQuickInfo;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserRankInfo;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Yang Si Young on 2016-08-14.
 */
public class FragmentAnalysis extends Fragment {

    @Bind(R.id.editId)
    EditText editId;

    @Bind(R.id.btnSearch)
    Button btnSearch;

    @Bind(R.id.checkBoxAutoLogin)
    CheckBox checkBoxAutoLogin;

    private SharedPreferences sharedPreferencesAutoLogin;

    public static final String url = "http://bad.watch/api/user/quick/";

    public static final String urlRank = "http://bad.watch/api/user/rank/";

    ReloadFragmentForRecord reloadFragmentForRecord;

    UserQuickInfo userQuickInfo;

    String userId;

    public interface ReloadFragmentForRecord {
        void reload(UserQuickInfo userQuickInfo, UserRankInfo userRankInfo);
    }

    ;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            reloadFragmentForRecord = (ReloadFragmentForRecord) context;
        } catch (Exception e) {
            Log.d("error", "reload error is " + e.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        //layout을 셋팅해줌
        View view = inflater.inflate(R.layout.fragment_analysis, parent, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //여기서 view를 초기화해주고, Listener도 달아준다
        // ButterKnife.bind(view);
        btnSearch.setOnClickListener(onClickListener);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            userId = editId.getText().toString();

            if (!userId.isEmpty()) {
                userId = userId.replace("#", "-");
                String urlUser = url + userId;

                new ConnectServer().run(urlUser, "quick");

            } else {
                Toast.makeText(getView().getContext(), "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show();
            }

        }
    };

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
                            userQuickInfo = gson.fromJson(jsonObject.getJSONObject("userData").toString(), UserQuickInfo.class);

                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    if(checkBoxAutoLogin.isChecked()) {
                                        sharedPreferencesAutoLogin = getActivity().getSharedPreferences("autoLoginId", Activity.MODE_PRIVATE);
                                        SharedPreferences.Editor editor = sharedPreferencesAutoLogin.edit();
                                        editor.putString("autoLoginId", userId);
                                        editor.commit();
                                    }

                                }
                            });

                            String urlForRankRecord = urlRank+userId;
                            new ConnectServer().run(urlForRankRecord, "rank");
                            Log.d("aaaa", "userQuickInfo의 userId는 " + userQuickInfo.getUserId());
                            //Intent intent = new Intent(getApplicationContext(), NextActivity.class);

                        }else if(responseCode == 2 && gameType.equals("rank")){

                            final UserRankInfo userRankInfo = gson.fromJson(jsonObject.getJSONObject("userData").toString(), UserRankInfo.class);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    reloadFragmentForRecord.reload(userQuickInfo, userRankInfo);
                                }
                            });


                        }else if(responseCode == 3){
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getActivity().getApplicationContext(), "해당 아이디의 정보가 존재하지않습니다.", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                        else {
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getActivity().getApplicationContext(), "서버에러입니다. 다시 시도해주세요.", Toast.LENGTH_SHORT).show();
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


