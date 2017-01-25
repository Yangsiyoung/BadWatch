package com.example.yangsiyoung.badwatchtest.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.BoardActivity;
import com.example.yangsiyoung.badwatchtest.R;
import com.example.yangsiyoung.badwatchtest.WriteArticleActivity;
import com.example.yangsiyoung.badwatchtest.data.heros.board.BoardData;
import com.example.yangsiyoung.badwatchtest.data.heros.code.RequestCode;
import com.example.yangsiyoung.badwatchtest.list.BoardAdapter;
import com.example.yangsiyoung.badwatchtest.list.EndlessRecyclerViewScrollListener;
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
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Yang Si Young on 2016-08-14.
 */
public class FragmentBoard extends Fragment implements RequestCode{

    @Bind(R.id.spinnerSelectFreeStrategy)
    Spinner spinnerSelectFreeStrategy;

    @Bind(R.id.recyclerViewBoard)
    RecyclerView recyclerViewBoard;

    @Bind(R.id.floatingButtonWriteArticle)
    ImageButton floatingButtonWriteArticle;

    public static final String urlBoard = "http://bad.watch/api/article/";

    private ArrayList<BoardData> arrayListOfBoardData;

    private String boardType = "free";

    private UILocker uiLocker;

    private BoardAdapter boardAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_board, parent, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        uiLocker = new UILocker(getView().getContext());
        uiLocker.lock();
        floatingButtonWriteArticle.setOnClickListener(onClickListener);
        String[] gameTypes = getResources().getStringArray(R.array.gameType);
        ArrayAdapter<String> gameTypeAdapter = new ArrayAdapter<String>(getView().getContext(),android.R.layout.simple_spinner_dropdown_item, gameTypes);
        spinnerSelectFreeStrategy.setAdapter(gameTypeAdapter);
        spinnerSelectFreeStrategy.setPrompt("자유게시판");
        spinnerSelectFreeStrategy.setOnItemSelectedListener(onItemSelectedListener);
        new ConnectServer().run(urlBoard, "free", "1");
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch(view.getId()){
                case R.id.floatingButtonWriteArticle:
                    Intent intent = new Intent(getView().getContext(), WriteArticleActivity.class);
                    intent.putExtra("boardType", boardType);
                    startActivityForResult(intent, WRITE_ARTICLE);
                    break;
            }

        }
    };

    class ConnectServer {

        OkHttpClient client = new OkHttpClient();

        public void run(String url, final String boardType , String pageNum){
            final Gson gson = new Gson();

            String boardUrl = url + boardType;
            HttpUrl.Builder urlBuilder = HttpUrl.parse(boardUrl).newBuilder();
            boardUrl= urlBuilder.addQueryParameter("page", pageNum).toString();

            Request request = new Request.Builder().url(boardUrl).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "ConnectServer Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                    try{

                        String result = response.body().string();
                        JSONObject jsonObject = new JSONObject(result);
                        Log.d("aaaa","responseCode is " + jsonObject.getString("responseCode"));
                        int responseCode = Integer.parseInt(jsonObject.getString("responseCode"));

                        if(responseCode == 18){
                            arrayListOfBoardData = gson.fromJson(jsonObject.getString("articleData"), new TypeToken<ArrayList<BoardData>>(){}.getType());
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    boardAdapter = new BoardAdapter(arrayListOfBoardData);
                                    recyclerViewBoard.setAdapter(boardAdapter);
                                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getView().getContext());
                                    recyclerViewBoard.setLayoutManager(linearLayoutManager);
                                    recyclerViewBoard.addOnItemTouchListener(onItemTouchListener);
                                    recyclerViewBoard.addOnScrollListener(new EndlessRecyclerViewScrollListener(linearLayoutManager) {
                                        @Override
                                        public void onLoadMore(int page, int totalItemsCount) {
                                            uiLocker.lock();
                                            new ConnectServer().reload(urlBoard, boardType, ""+page);
                                        }
                                    });
                                    uiLocker.unlock();
                                }
                            });

                        } else if(responseCode == 19){
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getActivity().getApplicationContext(), "게시판 로드 실패입니다ㅠㅠ", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }

                    }catch(Exception e){
                        Log.d("error", "response error is " + e.toString());
                    }

                }
            });
        }

        public void reload(String url, final String boardType , String pageNum){
            final Gson gson = new Gson();

            String boardUrl = url + boardType;
            HttpUrl.Builder urlBuilder = HttpUrl.parse(boardUrl).newBuilder();
            boardUrl= urlBuilder.addQueryParameter("page", pageNum).toString();

            Request request = new Request.Builder().url(boardUrl).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "ConnectServer Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                    try{

                        String result = response.body().string();
                        JSONObject jsonObject = new JSONObject(result);
                        Log.d("aaaa","responseCode is " + jsonObject.getString("responseCode"));
                        int responseCode = Integer.parseInt(jsonObject.getString("responseCode"));
                        final ArrayList<BoardData> reloadedArrayListOfBoardData;

                        if(responseCode == 18){
                            reloadedArrayListOfBoardData = gson.fromJson(jsonObject.getString("articleData"), new TypeToken<ArrayList<BoardData>>(){}.getType());
                            final int currentArrayListOfBoardDataSize = arrayListOfBoardData.size();
                            arrayListOfBoardData.addAll(reloadedArrayListOfBoardData);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    boardAdapter.notifyItemRangeInserted(currentArrayListOfBoardDataSize, reloadedArrayListOfBoardData.size());

                                    uiLocker.unlock();
                                }
                            });

                        } else if(responseCode == 19){
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getActivity().getApplicationContext(), "게시판 로드 실패입니다ㅠㅠ", Toast.LENGTH_SHORT).show();
                                }
                            });

                        }

                    }catch(Exception e){
                        Log.d("error", "response error is " + e.toString());
                    }

                }
            });
        }
    }

    RecyclerView.OnItemTouchListener onItemTouchListener = new RecyclerView.OnItemTouchListener() {

        final GestureDetector gestureDetector = new GestureDetector(getActivity(), new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
            View childView = rv.findChildViewUnder(e.getX(), e.getY());
            if(childView != null&&gestureDetector.onTouchEvent(e)) {
                Toast.makeText(getView().getContext(), "누른 아이템 위치는 " + rv.getChildAdapterPosition(childView), Toast.LENGTH_SHORT).show();
                BoardData currentBoardData = arrayListOfBoardData.get(rv.getChildAdapterPosition(childView));
                Intent intent = new Intent(getView().getContext(), BoardActivity.class);
                intent.putExtra("articleId", currentBoardData.getArticleId());
                intent.putExtra("boardType", boardType);
                intent.putExtra("commentCount", currentBoardData.getCommentCount());
                getActivity().startActivity(intent);
                return true;
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
            //Toast.makeText(getView().getContext(), "누른 아이템 위치는 "+ e.getActionIndex(), Toast.LENGTH_SHORT).show();
            //e.getActionIndex();

        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    };

    AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String selectedGameType = (String) parent.getItemAtPosition(position);
            if(selectedGameType.equals("자유게시판")){
                boardType = "free";
            }else if(selectedGameType.equals("전략게시판")){
                boardType = "strategy";
            }
            new ConnectServer().run(urlBoard, boardType, "1");
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
}
