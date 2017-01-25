package com.example.yangsiyoung.badwatchtest;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.data.heros.code.ResultCode;
import com.example.yangsiyoung.badwatchtest.ui.UILocker;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class WriteArticleActivity extends AppCompatActivity implements ResultCode {

    private ActionBar actionBar;

    @Bind(R.id.txtArticleTitle)
    TextView txtArticleTitle;

    @Bind(R.id.editArticleTitle)
    EditText editArticleTitle;

    @Bind(R.id.txtArticleContent)
    TextView txtArticleContent;

    @Bind(R.id.editArticleContent)
    EditText editArticleContent;

    private String boardType;

    public static final String urlSendArticle = "http://bad.watch/api/article/write";

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private UILocker uiLocker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_article);
        ButterKnife.bind(this);

        uiLocker = new UILocker(WriteArticleActivity.this);

        Intent intent = getIntent();
        boardType = intent.getStringExtra("boardType");

        actionBar = getSupportActionBar();
        actionBar.setCustomView(R.layout.actionbar_layout_edit_article);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        View customView = actionBar.getCustomView();
        Button btnSendArticle = (Button)customView.findViewById(R.id.btnSendArticle);
        btnSendArticle.setOnClickListener(onClickListener);
        ImageButton imgButtonExitEditArticle = (ImageButton) customView.findViewById(R.id.imgButtonExitEditArticle);
        imgButtonExitEditArticle.setOnClickListener(onClickListener);
        
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnSendArticle:
                    if(!editArticleTitle.getText().toString().isEmpty()&&!editArticleContent.getText().toString().isEmpty()) {
                        uiLocker.lock();
                        String json = makeDataToJson(editArticleTitle.getText().toString(), editArticleContent.getText().toString(), boardType);
                        new ConnectServer().post(urlSendArticle, json);
                    } else{
                        Toast.makeText(WriteArticleActivity.this, "제목과 내용 모두 입력해주세요오~!!!", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.imgButtonExitEditArticle:
                    setResult(WRITE_ARTICLE_FAIL);
                    finish();
                    break;
            }
        }
    };

    class ConnectServer{
        OkHttpClient client = new OkHttpClient();

        public void post(String url, String jsonBody){
            RequestBody body = RequestBody.create(JSON, jsonBody);

            Request request = new Request.Builder().url(url).post(body).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Send Article Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                uiLocker.unlock();
                                setResult(WRITE_ARTICLE_SUCCESS);
                                finish();
                            }
                        });
                    }
                }
            });
        }
    }

    public String makeDataToJson(String title, String content, String boardType){
        return "{\"title\":\""+title+"\","+
                "\"content\":\""+content+"\"," +
                "\"boardtype\":\""+boardType+"\"}";
    }
}
