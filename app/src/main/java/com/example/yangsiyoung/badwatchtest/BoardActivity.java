package com.example.yangsiyoung.badwatchtest;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.data.heros.board.BoardMoreData;
import com.example.yangsiyoung.badwatchtest.ui.UILocker;
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

public class BoardActivity extends AppCompatActivity {

    private ActionBar actionBar;

    public static final String url = "http://bad.watch/api/article/";
    public static final String urlLike = "http://bad.watch/api/article-like/";
    public static final String urlUnlike = "http://bad.watch/api/article-dislike/";

    @Bind(R.id.txtBoardType)
    TextView txtBoardType;

    @Bind(R.id.txtBoardTitle)
    TextView txtBoardTitle;

    @Bind(R.id.txtUserName)
    TextView txtUserName;

    @Bind(R.id.txtWriteDate)
    TextView txtWriteDate;

    @Bind(R.id.txtBoardContent)
    TextView txtBoardContent;

    @Bind(R.id.txtBoardCommentCount)
    TextView txtBoardCommentCount;

    @Bind(R.id.txtBoardViewCount)
    TextView txtBoardViewCount;

    @Bind(R.id.txtBoardLikeCount)
    TextView txtBoardLikeCount;

    @Bind(R.id.imgButtonComment)
    ImageButton imgButtonComment;

    @Bind(R.id.imgButtonLike)
    ImageButton imgButtonLike;

    BoardMoreData boardMoreData;

    private String boardType;
    private String boardTitle;
    private String userName;
    private String writeDate;
    private String boardContent;
    private String boardCommentCount;
    private String boardViewCount;
    private String boardLikeCount;

    private String articleId;

    private boolean isAuthenticated;
    private boolean likeStatus;

    private UILocker uiLocker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        ButterKnife.bind(this);

        uiLocker = new UILocker(BoardActivity.this);
        uiLocker.lock();
        Intent intent = getIntent();
        String boardUrl = url+intent.getExtras().getString("boardType")+"/"+intent.getExtras().getString("articleId");
        articleId = intent.getExtras().getString("articleId");

        imgButtonComment.setOnClickListener(onClickListener);
        imgButtonLike.setOnClickListener(onClickListener);

        actionBar = getSupportActionBar();
        actionBar.setCustomView(R.layout.actionbar_layout_read_article);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        View customView = actionBar.getCustomView();
        ImageButton imgButtonExitReadArticle = (ImageButton) customView.findViewById(R.id.imgButtonExitReadArticle);
        imgButtonExitReadArticle.setOnClickListener(onClickListener);

        new ConnectServer().run(boardUrl);
    }

    class ConnectServer{

        OkHttpClient client = new OkHttpClient();

        public void run(String url){

            final Gson gson = new Gson();

            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                     Log.d("error", "Board Activity Connect Server Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try{

                        String result = response.body().string();
                        JSONObject jsonObject = new JSONObject(result);
                        int responseCode = Integer.parseInt(jsonObject.getString("responseCode"));

                        if(responseCode == 18){
                            boardMoreData = gson.fromJson(jsonObject.getJSONObject("articleData").toString(), BoardMoreData.class);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    boardType = boardMoreData.getBoardType();
                                    boardTitle = boardMoreData.getTitle();
                                    userName = boardMoreData.getName();
                                    writeDate = boardMoreData.getWrittenTime();
                                    boardContent = boardMoreData.getContent();
                                    boardCommentCount = boardMoreData.getCommentCount();
                                    boardViewCount = boardMoreData.getHitCount();
                                    boardLikeCount = boardMoreData.getLikeCount();

                                    isAuthenticated = boardMoreData.getAuthentication();
                                    likeStatus = boardMoreData.getLikeStatus();

                                    if(boardType.equals("free")){
                                        boardType = "게시판 > 자유게시판";
                                    } else if(boardType.equals("strategy")){
                                        boardType = "게시판 > 전략게시판";
                                    }

                                    if(userName == null){
                                        userName = "익명";
                                    }

                                    txtBoardType.setText(boardType);
                                    txtBoardTitle.setText(boardTitle);
                                    txtUserName.setText(userName);
                                    String writtenTime = writeDate;
                                    writtenTime = writtenTime.replace("T"," ");
                                    writtenTime = writtenTime.substring(0,19);
                                    txtWriteDate.setText(writtenTime);
                                    txtBoardContent.setText(boardContent);
                                    txtBoardCommentCount.setText(boardCommentCount);
                                    txtBoardViewCount.setText(boardViewCount + " " + "VIEW");
                                    txtBoardLikeCount.setText(boardLikeCount);
                                    imgButtonLike.setSelected(likeStatus);
                                    uiLocker.unlock();

                                }
                            });

                        } else if(responseCode == 19){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "게시판 글 로드 실패입니다ㅠㅠㅠ", Toast.LENGTH_SHORT).show();
                                }
                            });

                        }
                    }catch(Exception e){
                        Log.d("error", " Response Error is " + e.toString());
                    }

                }
            });

        }

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch(v.getId()){

                case R.id.imgButtonComment:
                    Intent intent = new Intent(getApplicationContext(), CommentActivity.class);
                    intent.putExtra("articleId", articleId);
                    startActivity(intent);

                    break;

                case R.id.imgButtonLike:
                    if(isAuthenticated) {
                        likeStatus = !likeStatus;
                        imgButtonLike.setSelected(likeStatus);
                        if (likeStatus) {


                            OkHttpClient client = new OkHttpClient();
                            Request request = new Request.Builder().url(urlLike + articleId).build();
                            try {
                                client.newCall(request).enqueue(new Callback() {
                                    @Override
                                    public void onFailure(Call call, IOException e) {
                                        Log.d("error", "Like Request Error is " + e.toString());
                                    }

                                    @Override
                                    public void onResponse(Call call, Response response) throws IOException {
                                        if (response.isSuccessful()) {
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    int likeCount = Integer.parseInt(boardLikeCount);
                                                    likeCount++;
                                                    txtBoardLikeCount.setText("" + likeCount);
                                                }
                                            });
                                        }
                                    }
                                });
                            } catch (Exception e) {
                                Log.d("error", "Like Error is " + e.toString());
                            }

                        } else {
                            OkHttpClient client = new OkHttpClient();
                            Request request = new Request.Builder().url(urlUnlike + articleId).build();
                            try {
                                client.newCall(request).enqueue(new Callback() {
                                    @Override
                                    public void onFailure(Call call, IOException e) {
                                        Log.d("error", "UnLike Request Error is " + e.toString());
                                    }

                                    @Override
                                    public void onResponse(Call call, Response response) throws IOException {
                                        if (response.isSuccessful()) {
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    int likeCount = Integer.parseInt(boardLikeCount);
                                                    likeCount--;
                                                    txtBoardLikeCount.setText(likeCount);
                                                }
                                            });
                                        }
                                    }
                                });
                            } catch (Exception e) {
                                Log.d("error", "UnLike Error is " + e.toString());
                            }
                        }
                    } else if(!isAuthenticated){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(BoardActivity.this, "로그인이 필요합니다.", Toast.LENGTH_SHORT).show();
                            }
                        });

                    }
                    break;

                case R.id.imgButtonExitReadArticle:
                    finish();
                    break;
            }

        }
    };
}
