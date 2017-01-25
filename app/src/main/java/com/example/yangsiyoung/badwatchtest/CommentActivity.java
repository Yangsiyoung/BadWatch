package com.example.yangsiyoung.badwatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.yangsiyoung.badwatchtest.data.heros.board.BoardCommentData;
import com.example.yangsiyoung.badwatchtest.list.BoardCommentAdapter;
import com.example.yangsiyoung.badwatchtest.list.DividerItemDecoration;
import com.example.yangsiyoung.badwatchtest.ui.UILocker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class CommentActivity extends AppCompatActivity {

    @Bind(R.id.txtCommentCount)
    TextView txtCommentCount;

    @Bind(R.id.imgButtonExit)
    ImageButton imgButtonExit;

    @Bind(R.id.recyclerViewComment)
    RecyclerView recyclerViewComment;

    @Bind(R.id.editComment)
    EditText editComment;

    @Bind(R.id.btnSendComment)
    Button btnSendComment;

    private String articleId;
    private String commentCount;

    private ArrayList<BoardCommentData> arrayListOfBoardCommentData;

    public static final String urlComment = "http://bad.watch/api/article-comment/";
    public static final String urlSendComment = "http://bad.watch/api/article-comment/write"
            ;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private UILocker uiLocker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        ButterKnife.bind(this);

        uiLocker = new UILocker(this);
        uiLocker.lock();
        Intent intent = getIntent();
        articleId = intent.getExtras().getString("articleId");
        commentCount = intent.getExtras().getString("commentCount");

        imgButtonExit.setOnClickListener(onClickListener);
        btnSendComment.setOnClickListener(onClickListener);


        new ConnectServer().run(urlComment+articleId);
    }

    class ConnectServer{
        OkHttpClient client = new OkHttpClient();

        public void run(String url){
            final Gson gson = new Gson();

            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Get Comment List Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                    try{

                        String result = response.body().string();
                        JSONObject jsonObject = new JSONObject(result);

                        if(!jsonObject.getString("commentData").isEmpty()){
                            arrayListOfBoardCommentData = gson.fromJson(jsonObject.getString("commentData"), new TypeToken<ArrayList<BoardCommentData>>(){}.getType());
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    BoardCommentAdapter boardCommentAdapter = new BoardCommentAdapter(arrayListOfBoardCommentData);
                                    recyclerViewComment.setAdapter(boardCommentAdapter);
                                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(CommentActivity.this);
                                    linearLayoutManager.setStackFromEnd(true);
                                    recyclerViewComment.setLayoutManager(linearLayoutManager);
                                    RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(CommentActivity.this, DividerItemDecoration.VERTICAL_LIST);
                                    recyclerViewComment.addItemDecoration(itemDecoration);
                                    txtCommentCount.setText("댓글("+commentCount+")");
                                    uiLocker.unlock();
                                }
                            });
                        }
                    }catch(Exception e){
                        Log.d("error", "Comment List Convert Error is " + e.toString());
                    }

                }
            });

        }

        public void post(String url, String content){

            RequestBody body = RequestBody.create(JSON, content);

            Request request = new Request.Builder().url(url).post(body).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Post Comment Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                        new ConnectServer().run(urlComment+articleId);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                editComment.setText("");
                                InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                                inputMethodManager.hideSoftInputFromWindow(editComment.getWindowToken(),0);
                                //recyclerViewComment.smoothScrollToPosition(arrayListOfBoardCommentData.size());
                            }
                        });

                    }
                    else if(!response.isSuccessful()){
                        Log.d("aaaa", response.message());
                    }
                }
            });
        }
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.imgButtonExit:

                    finish();

                    break;
                case R.id.btnSendComment:

                    uiLocker.lock();
                    String content = editComment.getText().toString();
                    String comment = makeContentToJson(articleId,content);
                    Log.d("aaaa", "Comment Content is " + comment);
                    new ConnectServer().post(urlSendComment, comment);

                    break;
            }
        }
    };

    public String makeContentToJson(String articleId, String content){
        return "{\"article_id\":\""+articleId+"\","+
                "\"content\":\""+content+"\"}";
    }
}
