package com.example.yangsiyoung.badwatchtest.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.R;
import com.example.yangsiyoung.badwatchtest.YouTubePlayActivity;
import com.example.yangsiyoung.badwatchtest.data.heros.youtube.YoutubeData;
import com.example.yangsiyoung.badwatchtest.list.EndlessRecyclerViewScrollListener;
import com.example.yangsiyoung.badwatchtest.list.YoutubeAdapter;
import com.example.yangsiyoung.badwatchtest.ui.UILocker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Yang Si Young on 2016-08-14.
 */
public class FragmentMovie extends Fragment{

    public final static String urlForLoadYoutube = "http://bad.watch/api/youtube-list";

    @Bind(R.id.recyclerViewYoutube)
    RecyclerView recyclerViewYoutube;

    private ArrayList<YoutubeData> arrayListOfYoutubeData;
    private YoutubeAdapter youtubeAdapter;
    private UILocker uiLocker;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, parent, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        uiLocker = new UILocker(getView().getContext());
        new ConnectServer().load(urlForLoadYoutube, "hit", "1");
        //uiLocker.lock();
    }

    class ConnectServer{

        OkHttpClient client = new OkHttpClient();

        public void load(final String url, final String listingType, String pageNum){
            final Gson gson = new Gson();

            HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
            urlBuilder.addQueryParameter("page", pageNum);
            urlBuilder.addQueryParameter("order", listingType);

            final String requestUrl = urlBuilder.build().toString();

            Request request = new Request.Builder().url(requestUrl).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Load Youtube List Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                        try{

                            String result = response.body().string();
                            JSONObject jsonObject = new JSONObject(result);
                            int responseCode = Integer.parseInt(jsonObject.getString("responseCode"));
                            Log.d("aaaa", "Youtube Data RequestCode is " + responseCode);

                            if(responseCode == 6){
                                arrayListOfYoutubeData = gson.fromJson(jsonObject.getString("youtubeData"), new TypeToken<ArrayList<YoutubeData>>(){}.getType());

                                getActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {

                                        youtubeAdapter = new YoutubeAdapter(arrayListOfYoutubeData);
                                        recyclerViewYoutube.setAdapter(youtubeAdapter);
                                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getView().getContext());
                                        recyclerViewYoutube.setLayoutManager(linearLayoutManager);
                                        recyclerViewYoutube.addOnItemTouchListener(onItemTouchListener);
                                        recyclerViewYoutube.addOnScrollListener(new EndlessRecyclerViewScrollListener(linearLayoutManager) {
                                            @Override
                                            public void onLoadMore(int page, int totalItemsCount) {
                                                new ConnectServer().reload(url, listingType, ""+page);
                                                uiLocker.lock();
                                                Log.d("aaaa", "LoadMore 실행");

                                            }
                                        });
                                        uiLocker.unlock();
                                    }
                                });

                            } else{
                                getActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getActivity().getApplicationContext(), "유투브 영상 로드 실패입니다.", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }

                        }catch (Exception e){
                            Log.d("error", "Gson error is " + e.toString());
                        }
                    }
                }
            });
        }

        public void reload(String url, final String listingType, String pageNum){
            final Gson gson = new Gson();

            HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
            urlBuilder.addQueryParameter("page", pageNum);
            urlBuilder.addQueryParameter("order", listingType);

            final String requestUrl = urlBuilder.build().toString();

            Request request = new Request.Builder().url(requestUrl).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Load Youtube List Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                        try{
                            String result = response.body().string();
                            JSONObject jsonObject = new JSONObject(result);
                            int responseCode = Integer.parseInt(jsonObject.getString("responseCode"));
                            final ArrayList<YoutubeData> arrayListOfReloadYoutubeData;

                            if(responseCode == 6){
                                arrayListOfReloadYoutubeData = gson.fromJson(jsonObject.getString("youtubeData"), new TypeToken<ArrayList<YoutubeData>>(){}.getType());

                                        final int currentArrayListOfYoutubeDataSize = arrayListOfYoutubeData.size();
                                        arrayListOfYoutubeData.addAll(arrayListOfReloadYoutubeData);
                                        //recyclerViewYoutube.addOnItemTouchListener();

                                        getActivity().runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                youtubeAdapter.notifyItemRangeInserted(currentArrayListOfYoutubeDataSize, arrayListOfReloadYoutubeData.size());
                                                uiLocker.unlock();
                                            }
                                        });

                            } else{
                                getActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getActivity().getApplicationContext(), "유투브 영상 로드 실패입니다.", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }

                        }catch (Exception e){
                            Log.d("error", "Gson error is " + e.toString());
                        }
                    }
                }
            });
        }
    }

    RecyclerView.OnItemTouchListener onItemTouchListener = new RecyclerView.OnItemTouchListener(){

        final GestureDetector gestureDetector = new GestureDetector(getActivity(), new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            View childView = rv.findChildViewUnder(e.getX(), e.getY());

            if(childView != null && gestureDetector.onTouchEvent(e)){
                YoutubeData currentYoutubeData = arrayListOfYoutubeData.get(rv.getChildAdapterPosition(childView));
                Intent intent = new Intent(getActivity().getApplicationContext(), YouTubePlayActivity.class);
                intent.putExtra("currentYoutubeData", currentYoutubeData);
                startActivity(intent);
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {

        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    };
}
