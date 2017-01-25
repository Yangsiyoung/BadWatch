package com.example.yangsiyoung.badwatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.data.heros.youtube.YoutubeCommentData;
import com.example.yangsiyoung.badwatchtest.data.heros.youtube.YoutubeData;
import com.example.yangsiyoung.badwatchtest.list.YoutubeCommentAdapter;
import com.example.yangsiyoung.badwatchtest.ui.UILocker;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class YouTubePlayActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    @Bind(R.id.youtubeView)
    YouTubePlayerView youtubeView;

    @Bind(R.id.txtYoutubeCommentCount)
    TextView txtYoutubeCommentCount;

    @Bind(R.id.txtYoutubeUserViewCount)
    TextView txtYoutubeUserViewCount;

    @Bind(R.id.imgButtonLikeThisMovie)
    ImageButton imgButtonLikeThisMovie;

    @Bind(R.id.txtLikeThisMovieCount)
    TextView txtLikeThisMovieCount;

    @Bind(R.id.editYoutubeComment)
    EditText editYoutubeComment;

    @Bind(R.id.btnSendYoutubeComment)
    Button btnSendYoutubeComment;

    @Bind(R.id.recyclerViewYoutubeComment)
    RecyclerView recyclerViewYoutubeComment;

    private static final int RECOVERY_REQUEST = 1;

    private YoutubeData youtubeData;

    public static final String urlForLoadComment = "http://bad.watch/api/youtube-comment";

    private YoutubeCommentAdapter youtubeCommentAdapter;

    private ArrayList<YoutubeCommentData> arrayListOfYoutubeCommentData;

    private UILocker uiLocker;

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube_play);
        ButterKnife.bind(this);

        try {
            uiLocker = new UILocker(YouTubePlayActivity.this);
            uiLocker.lock();
            Intent intent = getIntent();
            youtubeData = (YoutubeData) intent.getSerializableExtra("currentYoutubeData");
            youtubeView.initialize("AIzaSyBx1pHvEgZAQjPWCiaUVaVbrCK0jdhM48Q", this);
            txtYoutubeCommentCount.setText("댓글" + "(" + youtubeData.getCommentCount() + ")");
            txtYoutubeUserViewCount.setText(youtubeData.getHitCount() + "VIEW");
            txtLikeThisMovieCount.setText(youtubeData.getLikeCount());
            imgButtonLikeThisMovie.setSelected(youtubeData.getLikeStatus());
            btnSendYoutubeComment.setOnClickListener(onClickListener);
            new ConnectServer().loadComment(urlForLoadComment, youtubeData.getYoutubeId());
        }catch (Exception e){
            Log.d("error", "YoutubePlayActivity Load error is " + e.toString());
        }
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        if(!wasRestored){
            youTubePlayer.cueVideo(
                    youtubeData.getYoutubeKey());
            Log.d("aaaa", "youtube key is " + youtubeData.getYoutubeKey());
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
    if(youTubeInitializationResult.isUserRecoverableError()){
        youTubeInitializationResult.getErrorDialog(this, RECOVERY_REQUEST).show();;
    } else{
        Toast.makeText(this, "동영상 로드를 실패하였습니다ㅠㅠ", Toast.LENGTH_SHORT).show();
    }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == RECOVERY_REQUEST){
            youtubeView.initialize("AIzaSyBx1pHvEgZAQjPWCiaUVaVbrCK0jdhM48Q", this);
        }
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.imgButtonLikeThisMovie:

                    break;

                case R.id.btnSendYoutubeComment:
                    if(editYoutubeComment.getText().toString().isEmpty()){
                        Toast.makeText(YouTubePlayActivity.this, "내용을 입력해주세요ㅠㅠ", Toast.LENGTH_SHORT).show();
                    }else{
                        uiLocker.lock();
                        String content = makeContentToJson(youtubeData.getYoutubeId(), editYoutubeComment.getText().toString());
                        new ConnectServer().postComment(urlForLoadComment, youtubeData.getYoutubeId(), content);
                    }
                    break;
            }

        }
    };

    class ConnectServer{

        OkHttpClient client = new OkHttpClient();

        public void loadComment(String url ,String youtubeId){
            final Gson gson = new Gson();

            HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
            urlBuilder.addQueryParameter("id", youtubeId);
            String urlForLoadComment = urlBuilder.toString();

            final Request request = new Request.Builder().url(urlForLoadComment).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Load Comment Request Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        String result = response.body().string();
                        JSONObject jsonObject = new JSONObject(result);
                        int responseCode = Integer.parseInt(jsonObject.getString("responseCode"));

                        if(responseCode == 10){
                            arrayListOfYoutubeCommentData = gson.fromJson(jsonObject.getString("commentData"),new TypeToken<ArrayList<YoutubeCommentData>>(){}.getType());
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    youtubeCommentAdapter = new YoutubeCommentAdapter(arrayListOfYoutubeCommentData);
                                    recyclerViewYoutubeComment.setAdapter(youtubeCommentAdapter);
                                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                                    recyclerViewYoutubeComment.setLayoutManager(linearLayoutManager);
                                    uiLocker.unlock();
                                }
                            });
                        }
                    } catch (Exception e){
                        Log.d("error", "Response Error is " + e.toString());
                    }

                }
            });
        }

        public void postComment(String url, final String youtubeId, String content){

            RequestBody requestBody = RequestBody.create(JSON, content);

            Request request = new Request.Builder().url(url).post(requestBody).build();
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "postComment Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                        new ConnectServer().loadComment(urlForLoadComment,youtubeId);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                editYoutubeComment.setText("");
                                uiLocker.unlock();
                            }
                        });
                    }
                }
            });
        }
    }

    public String makeContentToJson(String youtubeId, String content){
        return "{\"youtube_id\" : \""+youtubeId+"\"," +
                "\"content\" : \""+content+"\"}";
    }
}
