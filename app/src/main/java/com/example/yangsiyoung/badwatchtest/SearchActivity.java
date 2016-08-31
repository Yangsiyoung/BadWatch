package com.example.yangsiyoung.badwatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.data.heros.user.UserQuickInfo;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SearchActivity extends AppCompatActivity {

    @Bind(R.id.editId)
    EditText editId;

    @Bind(R.id.btnLogin)
    Button btnLogin;

    public static final String url= "http://bad.watch/api/user/quick/";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        btnLogin.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String userId = editId.getText().toString();

            if(!userId.isEmpty()){
                userId = userId.replace("#","-");
                String urlUser = url+userId;

                new ConnectServer().run(urlUser);

            }else{
                Toast.makeText(getApplicationContext(),"아이디를 입력해주세요.", Toast.LENGTH_SHORT).show();
            }

        }
    };

    class ConnectServer{

        OkHttpClient client = new OkHttpClient();

        public void run(String url){
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

                        if (responseCode == 2) {
                            //gson을 통해 UserQuickInfo 저장
                            UserQuickInfo userQuickInfo = gson.fromJson(jsonObject.getJSONObject("userData").toString(), UserQuickInfo.class);

                            //저장된 UserQuickInfo 전달
                            Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                            intent.putExtra("userQuickInfo", userQuickInfo);
                            startActivity(intent);

                            Log.d("aaaa", "userQuickInfo의 userId는 " + userQuickInfo.getUserId());
                            //Intent intent = new Intent(getApplicationContext(), NextActivity.class);

                        } else{
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "해당 아이디의 정보가 존재하지않습니다.", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    }
                    catch (Exception e){
                        Log.d("error","Gson error is "+ e.toString());
                    }

                }
            });
        }
    }
}
