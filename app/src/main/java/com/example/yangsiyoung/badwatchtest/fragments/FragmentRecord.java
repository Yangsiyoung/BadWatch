package com.example.yangsiyoung.badwatchtest.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.yangsiyoung.badwatchtest.HeroActivity;
import com.example.yangsiyoung.badwatchtest.LoadingActivity;
import com.example.yangsiyoung.badwatchtest.MainActivity;
import com.example.yangsiyoung.badwatchtest.R;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserQuickInfo;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserRankInfo;
import com.example.yangsiyoung.badwatchtest.ui.UILocker;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.example.yangsiyoung.badwatchtest.R.id.btnRankRecord;
import static com.example.yangsiyoung.badwatchtest.R.id.btnRefresh;
import static com.example.yangsiyoung.badwatchtest.R.id.txtBronzeMedal;
import static com.example.yangsiyoung.badwatchtest.R.id.txtSilverMedal;
import static com.example.yangsiyoung.badwatchtest.R.id.txtUserPlayTime;

/**
 * Created by Yang Si Young on 2016-08-19.
 */

public class FragmentRecord extends Fragment {

    UserQuickInfo userQuickInfo;
    UserRankInfo userRankInfo;

    @Bind(R.id.imgProfile)
    ImageView imgProfile;

    @Bind(R.id.txtId)
    TextView txtId;

    @Bind(R.id.txtRefresh)
    TextView txtRefresh;

    @Bind(R.id.txtLevel)
    TextView txtLevel;

    @Bind(R.id.txtUserLevel)
    TextView txtUserLevel;

    @Bind(R.id.txtRank)
    TextView txtRank;

    @Bind(R.id.txtUserRank)
    TextView txtUserRank;

    @Bind(R.id.txtComment)
    TextView txtComment;

    @Bind(R.id.txtMedal)
    TextView txtMedal;

    @Bind(R.id.txtGoldMedal)
    TextView txtGoldMedal;

    @Bind(R.id.txtSilverMedal)
    TextView txtSilverMedal;

    @Bind(R.id.txtBronzeMedal)
    TextView txtBronzeMedal;

    @Bind(R.id.txtUserWinLosePercentage)
    TextView txtUserWinLosePercentage;

    @Bind(R.id.txtUserKillDeath)
    TextView txtUserKillDeath;

    @Bind(R.id.txtUserSoloKill)
    TextView txtUserSoloKill;

    @Bind(R.id.txtUserKill)
    TextView txtUserKill;

    @Bind(R.id.txtUserMostMissonKill)
    TextView txtUserMostMissionKill;

    @Bind(R.id.txtUserMostMissionTime)
    TextView txtUserMostMissionTime;

    @Bind(R.id.txtUserMostOneCombo)
    TextView txtUserMostOneCombo;

    @Bind(R.id.txtUserMostSoloKill)
    TextView txtUserMostSoloKill;

    @Bind(R.id.txtUserMostDeal)
    TextView txtUserMostDeal;

    @Bind(R.id.txtUserPlayTime)
    TextView txtUserPlayTime;

    @Bind(R.id.txtUserMostHeal)
    TextView txtUserMostHeal;

    @Bind(R.id.floatingButtonLookHeros)
    ImageButton floatingButtonLookHeros;

    @Bind(R.id.btnQuickRecord)
    Button btnQuickRecord;

    @Bind(R.id.btnRankRecord)
    Button btnRankRecord;

    @Bind(R.id.btnRefresh)
    Button btnRefresh;

    private String overWatchId;

    public static final String urlRefresh = "http://bad.watch/api/renew-user/";
    public static final String urlReload = "http://bad.watch/api/user/";

    private UILocker uiLocker;

    private String userId;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_record, parent, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        overWatchId = userQuickInfo.getOverWatchId();
        Glide.with(getActivity().getApplicationContext()).load(userQuickInfo.getAvatarUrl()).into(imgProfile);
        txtId.setText(userQuickInfo.getName());
        txtUserLevel.setText(userQuickInfo.getLevel());
        txtUserRank.setText("실력 평점 " + userQuickInfo.getPoint());
        txtComment.setText(userQuickInfo.getQuickReputation());
        txtGoldMedal.setText(userQuickInfo.getQuickGoldMedal());
        txtSilverMedal.setText(userQuickInfo.getQuickSilverMedal());
        txtBronzeMedal.setText(userQuickInfo.getQuickBronzeMedal());
        txtUserWinLosePercentage.setText(String.format("%.1f",(((double)Integer.parseInt(userQuickInfo.getQuickWin())/(double)Integer.parseInt(userQuickInfo.getQuickGameCount()))*100))+"%");
        txtUserKillDeath.setText(String.format("%.1f",(((double)Integer.parseInt(userQuickInfo.getQuickKill())/(double)Integer.parseInt(userQuickInfo.getQuickDeath())))));
        txtUserSoloKill.setText(userQuickInfo.getQuickSoloKill());
        txtUserKill.setText(userQuickInfo.getQuickMostKill());
        txtUserMostMissionKill.setText(userQuickInfo.getQuickMostMissionKill());
        txtUserMostMissionTime.setText(userQuickInfo.getQuickMostMissionTime());
        txtUserMostOneCombo.setText(userQuickInfo.getQuickMostOneCombo());
        txtUserMostSoloKill.setText(userQuickInfo.getQuickMostSoloKill());
        txtUserMostDeal.setText(userQuickInfo.getQuickMostDeal());
        txtUserPlayTime.setText(userQuickInfo.getQuickPlayTime()+"시간");
        txtUserMostHeal.setText(userQuickInfo.getQuickMostHeal());

        btnQuickRecord.setOnClickListener(onClickListener);
        btnQuickRecord.setSelected(true);

        btnRankRecord.setOnClickListener(onClickListener);
        floatingButtonLookHeros.setOnClickListener(onClickListener);
        btnRefresh.setOnClickListener(onClickListener);
        uiLocker = new UILocker(getView().getContext());




        Toast.makeText(getActivity().getApplicationContext(),""+userQuickInfo.getUserId(),Toast.LENGTH_SHORT).show();
    }

    public void setUserQuickInfo(UserQuickInfo userQuickInfo){
        this.userQuickInfo = userQuickInfo;
    }

    public void setUserRankInfo(UserRankInfo userRankInfo){
        this.userRankInfo = userRankInfo;
    }

    public void setUserId(String userId){
        this.userId = userId;
        Log.d("aaaa", "UserId is " + userId);
    }

 View.OnClickListener onClickListener = new View.OnClickListener() {
     @Override
     public void onClick(View view) {

         switch (view.getId()){
             case R.id.btnQuickRecord:
                 btnRankRecord.setSelected(false);
                 btnQuickRecord.setSelected(true);

                 Glide.with(getActivity().getApplicationContext()).load(userQuickInfo.getAvatarUrl()).into(imgProfile);
                 txtId.setText(userQuickInfo.getName());
                 txtUserLevel.setText(userQuickInfo.getLevel());
                 txtUserRank.setText("실력 평점 " + userQuickInfo.getPoint());
                 txtComment.setText(userQuickInfo.getQuickReputation());
                 txtGoldMedal.setText(userQuickInfo.getQuickGoldMedal());
                 txtSilverMedal.setText(userQuickInfo.getQuickSilverMedal());
                 txtBronzeMedal.setText(userQuickInfo.getQuickBronzeMedal());
                 txtUserWinLosePercentage.setText(String.format("%.1f",(((double)Integer.parseInt(userQuickInfo.getQuickWin())/(double)Integer.parseInt(userQuickInfo.getQuickGameCount()))*100))+"%");
                 txtUserKillDeath.setText(String.format("%.1f",(((double)Integer.parseInt(userQuickInfo.getQuickKill())/(double)Integer.parseInt(userQuickInfo.getQuickDeath())))));
                 txtUserSoloKill.setText(userQuickInfo.getQuickSoloKill());
                 txtUserKill.setText(userQuickInfo.getQuickMostKill());
                 txtUserMostMissionKill.setText(userQuickInfo.getQuickMostMissionKill());
                 txtUserMostMissionTime.setText(userQuickInfo.getQuickMostMissionTime());
                 txtUserMostOneCombo.setText(userQuickInfo.getQuickMostOneCombo());
                 txtUserMostSoloKill.setText(userQuickInfo.getQuickMostSoloKill());
                 txtUserMostDeal.setText(userQuickInfo.getQuickMostDeal());
                 txtUserPlayTime.setText(userQuickInfo.getQuickPlayTime()+"시간");
                 txtUserMostHeal.setText(userQuickInfo.getQuickMostHeal());
                 break;

             case R.id.btnRankRecord:
                 btnQuickRecord.setSelected(false);
                 btnRankRecord.setSelected(true);
                 Glide.with(getActivity().getApplicationContext()).load(userRankInfo.getAvatarUrl()).into(imgProfile);
                 txtId.setText(userRankInfo.getName());
                 txtUserLevel.setText(userRankInfo.getLevel());
                 txtUserRank.setText("실력 평점 " + userRankInfo.getPoint());
                 txtComment.setText(userRankInfo.getRankReputation());
                 txtGoldMedal.setText(userRankInfo.getRankGoldMedal());
                 txtSilverMedal.setText(userRankInfo.getRankSilverMedal());
                 txtBronzeMedal.setText(userRankInfo.getRankBronzeMedal());
                 txtUserWinLosePercentage.setText(String.format("%.1f",(((double)Integer.parseInt(userRankInfo.getRankWin())/(double)Integer.parseInt(userRankInfo.getRankGameCount()))*100))+"%");
                 txtUserKillDeath.setText(String.format("%.1f",(((double)Integer.parseInt(userRankInfo.getRankKill())/(double)Integer.parseInt(userRankInfo.getRankDeath())))));
                 txtUserSoloKill.setText(userRankInfo.getRankSoloKill());
                 txtUserKill.setText(userRankInfo.getRankMostKill());
                 txtUserMostMissionKill.setText(userRankInfo.getRankMostMissionKill());
                 txtUserMostMissionTime.setText(userRankInfo.getRankMostMissionTime());
                 txtUserMostOneCombo.setText(userRankInfo.getRankMostOneCombo());
                 txtUserMostSoloKill.setText(userRankInfo.getRankMostSoloKill());
                 txtUserMostDeal.setText(userRankInfo.getRankMostDeal());
                 txtUserPlayTime.setText(userRankInfo.getRankPlayTime()+"시간");
                 txtUserMostHeal.setText(userRankInfo.getRankMostHeal());

                 break;

             case R.id.floatingButtonLookHeros:
                 Intent intent = new Intent(getActivity().getApplicationContext(), HeroActivity.class);
                 intent.putExtra("overWatchId",userQuickInfo.getOverWatchId());
                 startActivity(intent);
                 break;

             case R.id.btnRefresh:
                 uiLocker.lock();
                 new ConnectServer().refresh(urlRefresh+overWatchId);
                 break;
         }


     }
 };

    class ConnectServer{
        OkHttpClient client = new OkHttpClient();

        public void refresh(final String url){
            final Gson gson = new Gson();

            final Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Request Refresh Error is "+e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        if (response.isSuccessful()) {
                            String result = response.body().string();
                            JSONObject jsonObject = new JSONObject(result);
                            if(Integer.parseInt(jsonObject.getString("responseCode")) == 54){
                                new ConnectServer().reload(urlReload, "quick");
                            }

                        }
                    }catch(Exception e){
                        Log.d("error", "Refresh Json Error is " + e.toString());
                    }
                }
            });
        }

        public void reload(final String url, final String gameType){

            final Gson gson = new Gson();

            final Request request = new Request.Builder().url(url+gameType+'/'+userId).build();
            Log.d("aaaa", "Reload Url is " + url+gameType+'/'+userId);

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "Request Refresh Error is "+e.toString());
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
                            new ConnectServer().reload(url, "rank");
                            userQuickInfo = gson.fromJson(jsonObject.getJSONObject("userData").toString(), UserQuickInfo.class);
                            //Intent intent = new Intent(getApplicationContext(), NextActivity.class);

                        }else if(responseCode == 2 && gameType.equals("rank")){

                            userRankInfo = gson.fromJson(jsonObject.getJSONObject("userData").toString(), UserRankInfo.class);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Glide.with(getActivity().getApplicationContext()).load(userQuickInfo.getAvatarUrl()).into(imgProfile);
                                    txtId.setText(userQuickInfo.getName());
                                    txtUserLevel.setText(userQuickInfo.getLevel());
                                    txtUserRank.setText("실력 평점 " + userQuickInfo.getPoint());
                                    txtComment.setText(userQuickInfo.getQuickReputation());
                                    txtGoldMedal.setText(userQuickInfo.getQuickGoldMedal());
                                    txtSilverMedal.setText(userQuickInfo.getQuickSilverMedal());
                                    txtBronzeMedal.setText(userQuickInfo.getQuickBronzeMedal());
                                    txtUserWinLosePercentage.setText(String.format("%.1f",(((double)Integer.parseInt(userQuickInfo.getQuickWin())/(double)Integer.parseInt(userQuickInfo.getQuickGameCount()))*100))+"%");
                                    txtUserKillDeath.setText(String.format("%.1f",(((double)Integer.parseInt(userQuickInfo.getQuickKill())/(double)Integer.parseInt(userQuickInfo.getQuickDeath())))));
                                    txtUserSoloKill.setText(userQuickInfo.getQuickSoloKill());
                                    txtUserKill.setText(userQuickInfo.getQuickMostKill());
                                    txtUserMostMissionKill.setText(userQuickInfo.getQuickMostMissionKill());
                                    txtUserMostMissionTime.setText(userQuickInfo.getQuickMostMissionTime());
                                    txtUserMostOneCombo.setText(userQuickInfo.getQuickMostOneCombo());
                                    txtUserMostSoloKill.setText(userQuickInfo.getQuickMostSoloKill());
                                    txtUserMostDeal.setText(userQuickInfo.getQuickMostDeal());
                                    txtUserPlayTime.setText(userQuickInfo.getQuickPlayTime()+"시간");
                                    txtUserMostHeal.setText(userQuickInfo.getQuickMostHeal());

                                    btnQuickRecord.setSelected(true);

                                    uiLocker.unlock();
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
