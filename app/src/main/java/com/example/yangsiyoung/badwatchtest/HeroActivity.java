package com.example.yangsiyoung.badwatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yangsiyoung.badwatchtest.data.heros.code.HeroCode;
import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Ana;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Bastion;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Dva;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Genji;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Hanzo;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Junkrat;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Lucio;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Mccree;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Mei;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Mercy;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Pharah;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Reaper;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Reinhardt;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Roadhog;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Soldier;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Symmetra;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Torbjon;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Tracer;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Widowmaker;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Winston;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Zarya;
import com.example.yangsiyoung.badwatchtest.data.heros.quick.Zenyatta;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.AnaRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.BastionRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.DvaRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.GenjiRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.HanzoRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.JunkratRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.LucioRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.MccreeRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.MeiRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.MercyRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.PharahRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.ReaperRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.ReinhardtRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.RoadhogRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.SoldierRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.SymmetraRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.TorbjonRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.TracerRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.WidowmakerRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.WinstonRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.ZaryaRank;
import com.example.yangsiyoung.badwatchtest.data.heros.rank.ZenyattaRank;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserQuickInfo;
import com.example.yangsiyoung.badwatchtest.data.heros.user.UserRankInfo;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.view.View.GONE;

public class HeroActivity extends AppCompatActivity implements HeroCode {

    @Bind(R.id.btnShowRank)
    Button btnShowRank;

    @Bind(R.id.btnShowQuick)
    Button btnShowQuick;

    @Bind(R.id.btnCloseHeroActivity)
    ImageButton btnCloseHeroActivity;

    private String overWatchId;

    Intent intent;

    public static final String url = "http://bad.watch/api/heros/";

    private String gameType = "quick";

    private String hero = "";

    @Bind(R.id.layoutQuickRankChoice)
    LinearLayout layoutQuickRankChoice;

    @Bind(R.id.btnShowRecordForAna)
    ImageButton btnShowRecordForAna;

    @Bind(R.id.btnShowRecordForBastion)
    ImageButton btnShowRecordForBastion;

    @Bind(R.id.btnShowRecordForDva)
    ImageButton btnShowRecordForDva;

    @Bind(R.id.btnShowRecordForGenji)
    ImageButton btnShowRecordForGenji;

    @Bind(R.id.btnShowRecordForHanzo)
    ImageButton btnShowRecordForHanzo;

    @Bind(R.id.btnShowRecordForJunkrat)
    ImageButton btnShowRecordForJunkrat;

    @Bind(R.id.btnShowRecordForLucio)
    ImageButton btnShowRecordForLucio;

    @Bind(R.id.btnShowRecordForTorbjorn)
    ImageButton btnShowRecordForTorbjorn;

    @Bind(R.id.btnShowRecordForMei)
    ImageButton btnShowRecordForMei;

    @Bind(R.id.btnShowRecordForMercy)
    ImageButton btnShowRecordForMercy;

    @Bind(R.id.btnShowRecordForPharah)
    ImageButton btnShowRecordForPharah;

    @Bind(R.id.btnShowRecordForReaper)
    ImageButton btnShowRecordForReaper;

    @Bind(R.id.btnShowRecordForReinhardt)
    ImageButton btnShowRecordForReinhardt;

    @Bind(R.id.btnShowRecordForRoadhog)
    ImageButton btnShowRecordForRoadhog;

    @Bind(R.id.btnShowRecordForSoldier)
    ImageButton btnShowRecordForSoldier;

    @Bind(R.id.btnShowRecordForMccree)
    ImageButton btnShowRecordForMccree;

    @Bind(R.id.btnShowRecordForSymmetra)
    ImageButton btnShowRecordForSymmetra;

    @Bind(R.id.btnShowRecordForTracer)
    ImageButton btnShowRecordForTracer;

    @Bind(R.id.btnShowRecordForWidowmaker)
    ImageButton btnShowRecordForWidowmaker;

    @Bind(R.id.btnShowRecordForWinston)
    ImageButton btnShowRecordForWinston;

    @Bind(R.id.btnShowRecordForZarya)
    ImageButton btnShowRecordForZarya;

    @Bind(R.id.btnShowRecordForZenyatta)
    ImageButton btnShowRecordForZenyatta;

    @Bind(R.id.scrollViewHero)
    ScrollView scrollViewHero;

    @Bind(R.id.layoutHeroRecord)
    RelativeLayout layoutHeroRecord;

    @Bind(R.id.imgHero)
    ImageView imgHero;

    @Bind(R.id.txtHero)
    TextView txtHero;

    @Bind(R.id.imageButtonExitHeroRecord)
    ImageButton imageButtonExitHeroRecord;

    @Bind(R.id.txtUserHeroWinLosePercentage)
    TextView txtUserHeroWinLosePercentage;

    @Bind(R.id.txtUserHeroKillDeathPercentage)
    TextView txtUserHeroKillDeathPercentage;

    @Bind(R.id.txtUserHeroGameCount)
    TextView txtUserHeroGameCount;

    @Bind(R.id.txtUserHeroAvgFloodTime)
    TextView txtUserHeroAvgFloodTime;

    @Bind(R.id.txtComment)
    TextView txtComment;

    @Bind(R.id.txtHeroGoldMedal)
    TextView txtHereGoldMedal;

    @Bind(R.id.txtHeroSilverMedal)
    TextView txtHeroSilverMedal;

    @Bind(R.id.txtHeroBronzeMedal)
    TextView txtHeroBronzeMedal;

    @Bind(R.id.txtUserHeroKill)
    TextView txtUserHeroKill;

    @Bind(R.id.txtUserHeroLastShot)
    TextView txtUserHeroLastShot;

    @Bind(R.id.txtUserHeroSoloKill)
    TextView txtUserHeroSoloKill;

    @Bind(R.id.txtUserHeroDeal)
    TextView txtUserHeroDeal;

    @Bind(R.id.txtUserHeroMissonKill)
    TextView txtUserHeroMissionKill;

    @Bind(R.id.txtUserHeroOneCombo)
    TextView txtUserHeroOneCombo;

    @Bind(R.id.txtUserHeroMeleeLastShot)
    TextView txtUserHeroMeleeLastShot;

    @Bind(R.id.txtUserHeroCritical)
    TextView txtUserHeroCritical;

    @Bind(R.id.txtUserHeroCriticalAccuracy)
    TextView txtUserHeroCriticalAccuracy;

    @Bind(R.id.txtUserHeroAccuracy)
    TextView txtUserHeroAccuracy;

    @Bind(R.id.txtUserHeroDestroyTelePort)
    TextView txtUserHeroDestroyTeleport;

    @Bind(R.id.txtUserHeroSelfHeal)
    TextView txtUserHeroSelfHeal;

    @Bind(R.id.txtUserHeroBestKillInLife)
    TextView txtUserHeroBestKillInLife;

    @Bind(R.id.txtUserHeroBestDealInLife)
    TextView txtUserHeroBestDealInLife;

    @Bind(R.id.txtUserHeroBestHealInLife)
    TextView txtUserHeroBestHealInLife;

    @Bind(R.id.txtUserHeroBestDealInGame)
    TextView txtUserHeroBestDealInGame;

    @Bind(R.id.txtUserHeroBestHealInGame)
    TextView txtUserHeroBestHealInGame;

    @Bind(R.id.txtUserHeroBestKillInGame)
    TextView txtUserHeroBestKillInGame;

    @Bind(R.id.txtUserHeroBestLastShotInGame)
    TextView txtUserHeroBestLastShotInGame;

    @Bind(R.id.txtUserHeroBestMissionKillInGame)
    TextView txtUserHeroBestMissionKillInGame;

    @Bind(R.id.txtUserHeroBestMissionTimeInGame)
    TextView txtUserHeroBestMissionTimeInGame;

    @Bind(R.id.txtUserHeroBestSoloKillInGame)
    TextView txtUserHeroBestSoloKillInGame;

    @Bind(R.id.txtUserHeroBestCriticalInGame)
    TextView txtUserHeroBestCriticalInGame;

    @Bind(R.id.txtUserHeroBestSelfHealInGame)
    TextView txtUserHeroBestSelfHealInGame;

    @Bind(R.id.txtUserHeroDeath)
    TextView txtUserHeroDeath;

    @Bind(R.id.txtUserHeroEnvironmentDeath)
    TextView txtUserHeroEnvironmentDeath;

    @Bind(R.id.txtUserHeroCard)
    TextView txtUserHeroCard;

    @Bind(R.id.txtUserHeroPlayTime)
    TextView txtUserHeroPlayTime;

    @Bind(R.id.txtUserHeroWin)
    TextView txtUserHeroWin;

    @Bind(R.id.txtUserHeroMissionTime)
    TextView txtUserHeroMissionTime;

    @Bind(R.id.txtUserHeroFloodTime)
    TextView txtUserHeroFloodTime;

    @Bind(R.id.layoutHeroSkill1)
    RelativeLayout layoutHeroSkill1;

    @Bind(R.id.txtHeroSkill1)
    TextView txtHeroSkill1;

    @Bind(R.id.txtUserHeroSkill1)
    TextView txtUserHeroSkill1;

    @Bind(R.id.layoutHeroSkill2)
    RelativeLayout layoutHeroSkill2;

    @Bind(R.id.txtHeroSkill2)
    TextView txtHeroSkill2;

    @Bind(R.id.txtUserHeroSkill2)
    TextView txtUserHeroSkill2;

    @Bind(R.id.layoutHeroSkill3)
    RelativeLayout layoutHeroSkill3;

    @Bind(R.id.txtHeroSkill3)
    TextView txtHeroSkill3;

    @Bind(R.id.txtUserHeroSkill3)
    TextView txtUserHeroSkill3;

    @Bind(R.id.layoutHeroSkill4)
    RelativeLayout layoutHeroSkill4;

    @Bind(R.id.txtHeroSkill4)
    TextView txtHeroSkill4;

    @Bind(R.id.txtUserHeroSkill4)
    TextView txtUserHeroSkill4;

    @Bind(R.id.layoutHeroSkill5)
    RelativeLayout layoutHeroSkill5;

    @Bind(R.id.txtHeroSkill5)
    TextView txtHeroSkill5;

    @Bind(R.id.txtUserHeroSkill5)
    TextView txtUserHeroSkill5;

    @Bind(R.id.layoutHeroSkill6)
    RelativeLayout layoutHeroSkill6;

    @Bind(R.id.txtHeroSkill6)
    TextView txtHeroSkill6;

    @Bind(R.id.txtUserHeroSkill6)
    TextView txtUserHeroSkill6;

    @Bind(R.id.layoutHeroSkill7)
    RelativeLayout layoutHeroSkill7;

    @Bind(R.id.txtHeroSkill7)
    TextView txtHeroSkill7;

    @Bind(R.id.txtUserHeroSkill7)
    TextView txtUserHeroSkill7;

    @Bind(R.id.layoutHeroSkill8)
    RelativeLayout layoutHeroSkill8;

    @Bind(R.id.txtHeroSkill8)
    TextView txtHeroSkill8;

    @Bind(R.id.txtUserHeroSkill8)
    TextView txtUserHeroSkill8;

    @Bind(R.id.layoutHeroSkill9)
    RelativeLayout layoutHeroSkill9;

    @Bind(R.id.txtHeroSkill9)
    TextView txtHeroSkill9;

    @Bind(R.id.txtUserHeroSkill9)
    TextView txtUserHeroSkill9;

    @Bind(R.id.layoutHeroSkill10)
    RelativeLayout layoutHeroSkill10;

    @Bind(R.id.txtHeroSkill10)
    TextView txtHeroSkill10;

    @Bind(R.id.txtUserHeroSkill10)
    TextView txtUserHeroSkill10;

    @Bind(R.id.layoutHeroSkill11)
    RelativeLayout layoutHeroSkill11;

    @Bind(R.id.txtHeroSkill11)
    TextView txtHeroSkill11;

    @Bind(R.id.txtUserHeroSkill11)
    TextView txtUserHeroSkill11;

    public static final String urlForHeroRecord = "http://bad.watch/api/heros/";

    public static int heroCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
        ButterKnife.bind(this);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        intent = getIntent();
        overWatchId = intent.getStringExtra("overWatchId");
        btnShowQuick.setSelected(true);

        btnShowRank.setOnClickListener(onClickListener);
        btnShowQuick.setOnClickListener(onClickListener);
        try {
            btnCloseHeroActivity.setOnClickListener(onClickListener);
        } catch (Exception e) {
            Log.d("error", "ImageButton OnClickListener Error is " + e.toString());
        }

        btnShowRecordForAna.setOnClickListener(onClickListener);
        btnShowRecordForBastion.setOnClickListener(onClickListener);
        btnShowRecordForDva.setOnClickListener(onClickListener);
        btnShowRecordForGenji.setOnClickListener(onClickListener);
        btnShowRecordForHanzo.setOnClickListener(onClickListener);
        btnShowRecordForJunkrat.setOnClickListener(onClickListener);
        btnShowRecordForLucio.setOnClickListener(onClickListener);
        btnShowRecordForMccree.setOnClickListener(onClickListener);
        btnShowRecordForMei.setOnClickListener(onClickListener);
        btnShowRecordForMercy.setOnClickListener(onClickListener);
        btnShowRecordForPharah.setOnClickListener(onClickListener);
        btnShowRecordForReaper.setOnClickListener(onClickListener);
        btnShowRecordForReinhardt.setOnClickListener(onClickListener);
        btnShowRecordForRoadhog.setOnClickListener(onClickListener);
        btnShowRecordForSoldier.setOnClickListener(onClickListener);
        btnShowRecordForSymmetra.setOnClickListener(onClickListener);
        btnShowRecordForTorbjorn.setOnClickListener(onClickListener);
        btnShowRecordForTracer.setOnClickListener(onClickListener);
        btnShowRecordForWidowmaker.setOnClickListener(onClickListener);
        btnShowRecordForWinston.setOnClickListener(onClickListener);
        btnShowRecordForZarya.setOnClickListener(onClickListener);
        btnShowRecordForZenyatta.setOnClickListener(onClickListener);
        imageButtonExitHeroRecord.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.btnShowRank:
                    btnShowRank.setSelected(true);
                    btnShowQuick.setSelected(false);
                    gameType = "rank";

                    break;
                case R.id.btnShowQuick:
                    btnShowQuick.setSelected(true);
                    btnShowRank.setSelected(false);
                    gameType = "quick";

                    break;

                case R.id.btnCloseHeroActivity:
                    finish();

                    break;

                case R.id.btnShowRecordForAna:
                    hero = "ana";
                    heroCode = ANA;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForBastion:
                    hero = "bastion";
                    heroCode = BASTION;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForDva:
                    hero = "dva";
                    heroCode = DVA;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForGenji:
                    hero = "genji";
                    heroCode = GENJI;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForHanzo:
                    hero = "hanzo";
                    heroCode = HANZO;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForJunkrat:
                    hero = "junkrat";
                    heroCode = JUNKRAT;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForLucio:
                    hero = "lucio";
                    heroCode = LUCIO;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForMccree:
                    hero = "mccree";
                    heroCode = MCCREE;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForMei:
                    hero = "mei";
                    heroCode = MEI;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForMercy:
                    hero = "mercy";
                    heroCode = MERCY;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForPharah:
                    hero = "pharah";
                    heroCode = PHARAH;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForReaper:
                    hero = "reaper";
                    heroCode = REAPER;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForReinhardt:
                    hero = "reinhardt";
                    heroCode = REINHARDT;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForRoadhog:
                    hero = "roadhog";
                    heroCode = ROADHOG;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForSoldier:
                    hero = "soldier";
                    heroCode = SOLDIER;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForSymmetra:
                    hero = "symmetra";
                    heroCode = SYMMETRA;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForTorbjorn:
                    hero = "torbjorn";
                    heroCode = TORBJON;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;
                case R.id.btnShowRecordForTracer:
                    hero = "tracer";
                    heroCode = TRACER;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForWidowmaker:
                    hero = "widowmaker";
                    heroCode = WIDOWMAKER;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForWinston:
                    hero = "winston";
                    heroCode = WINSTON;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForZarya:
                    hero = "zarya";
                    heroCode = ZARYA;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.btnShowRecordForZenyatta:
                    hero = "zenyatta";
                    heroCode = ZENYATTA;
                    new ConnectServer().run(urlForHeroRecord, gameType, hero, overWatchId);

                    break;

                case R.id.imageButtonExitHeroRecord:
                    layoutQuickRankChoice.setVisibility(View.VISIBLE);
                    scrollViewHero.setVisibility(View.VISIBLE);;
                    layoutHeroRecord.setVisibility(GONE);

                    break;


            }

        }
    };

    class ConnectServer {

        OkHttpClient client = new OkHttpClient();

        public void run(String url, final String gameType, String hero, String overWatchId) {
            Log.d("aaaa", "url은 " + url);
            //HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
            final Gson gson = new Gson();
            String recordUrl = url+gameType+"/"+hero+"/"+ overWatchId;
            Request request = new Request.Builder().url(recordUrl).build();
            //Log.d("aaaa", "Build된 url은 " + urlBuilder.build().toString());
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.d("error", "ConnectServer Error is " + e.toString());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                    try {

                        //아래의 메서드로 http status code를 가져올 수 있다.(ex. 201, 404, 502 etc...)
                        //response.code();

                        if (response.isSuccessful()) {
                            String result = response.body().string();
                            JSONObject jsonObject = new JSONObject(result);
                            Log.d("aaaa", "responseCode is " + jsonObject.getString("responseCode"));
                            int responseCode = Integer.parseInt(jsonObject.getString("responseCode"));


                            if (responseCode == 4 && gameType.equals("quick")) {
                                //gson을 통해 UserQuickInfo 저장

                                final QuickCharacter quickCharacterRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), QuickCharacter.class);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {

                                        layoutQuickRankChoice.setVisibility(GONE);
                                        scrollViewHero.setVisibility(GONE);
                                        ;
                                        layoutHeroRecord.setVisibility(View.VISIBLE);
                                        txtUserHeroWinLosePercentage.setText(quickCharacterRecord.getQuickWinRate() + "%");
                                        txtUserHeroKillDeathPercentage.setText(quickCharacterRecord.getQuickKda());
                                        txtUserHeroGameCount.setText(quickCharacterRecord.getQuickGameCount());
                                        txtUserHeroAvgFloodTime.setText(String.format("%.1f", (((double) Integer.parseInt(quickCharacterRecord.getQuickFloodTime()) / (double) Integer.parseInt(quickCharacterRecord.getQuickGameCount())))) + "s");
                                        txtComment.setText(quickCharacterRecord.getReputation());
                                        txtHereGoldMedal.setText(quickCharacterRecord.getQuickGoldMedal());
                                        txtHeroSilverMedal.setText(quickCharacterRecord.getQuickSilverMedal());
                                        txtHeroBronzeMedal.setText(quickCharacterRecord.getQuickBronzeMedal());
                                        txtUserHeroKill.setText(quickCharacterRecord.getQuickKill());
                                        txtUserHeroLastShot.setText(quickCharacterRecord.getQuickLastShot());
                                        txtUserHeroSoloKill.setText(quickCharacterRecord.getQuickSoloKill());
                                        txtUserHeroDeal.setText(quickCharacterRecord.getQuickDeal());
                                        txtUserHeroMissionKill.setText(quickCharacterRecord.getQuickMissionKill());
                                        txtUserHeroOneCombo.setText(quickCharacterRecord.getQuickOneCombo());
                                        txtUserHeroMeleeLastShot.setText(quickCharacterRecord.getQuickMeleeLastShot());
                                        txtUserHeroCritical.setText(quickCharacterRecord.getQuickCritical());
                                        txtUserHeroCriticalAccuracy.setText(quickCharacterRecord.getQuickCriticalAccuracy());
                                        txtUserHeroAccuracy.setText(quickCharacterRecord.getQuickAccuracy());
                                        txtUserHeroDestroyTeleport.setText(quickCharacterRecord.getQuickDestroyTelePort());
                                        txtUserHeroSelfHeal.setText(quickCharacterRecord.getQuickSelfHeal());
                                        txtUserHeroBestKillInLife.setText(quickCharacterRecord.getQuickBestKillInLife());
                                        txtUserHeroBestDealInLife.setText(quickCharacterRecord.getQuickBestDealInLife());
                                        txtUserHeroBestHealInLife.setText(quickCharacterRecord.getQuickBestHealInLife());
                                        txtUserHeroBestDealInGame.setText(quickCharacterRecord.getQuickBestDealInGame());
                                        txtUserHeroBestHealInGame.setText(quickCharacterRecord.getQuickBestHealInGame());
                                        txtUserHeroBestKillInGame.setText(quickCharacterRecord.getQuickBestKillInGame());
                                        txtUserHeroBestLastShotInGame.setText(quickCharacterRecord.getQuickBestLastShotInGame());
                                        txtUserHeroBestMissionKillInGame.setText(quickCharacterRecord.getQuickBestMissionKillInGame());
                                        txtUserHeroBestMissionTimeInGame.setText(quickCharacterRecord.getQuickBestMissionTimeInGame());
                                        txtUserHeroBestSoloKillInGame.setText(quickCharacterRecord.getQuickBestSoloKillInGame());
                                        txtUserHeroBestCriticalInGame.setText(quickCharacterRecord.getQuickBestCriticalInGame());
                                        txtUserHeroBestSelfHealInGame.setText(quickCharacterRecord.getQuickBestSelfHealInGame());
                                        txtUserHeroDeath.setText(quickCharacterRecord.getQuickDeath());
                                        txtUserHeroEnvironmentDeath.setText(quickCharacterRecord.getQuickEnvironmentDeath());
                                        txtUserHeroCard.setText(quickCharacterRecord.getQuickCard());
                                        txtUserHeroPlayTime.setText(quickCharacterRecord.getQuickPlayTime());
                                        txtUserHeroWin.setText(quickCharacterRecord.getQuickWin());
                                        txtUserHeroMissionTime.setText(quickCharacterRecord.getQuickMissionTime());
                                        txtUserHeroFloodTime.setText(quickCharacterRecord.getQuickFloodTime());
                                        layoutHeroSkill1.setVisibility(GONE);
                                        layoutHeroSkill2.setVisibility(GONE);
                                        layoutHeroSkill3.setVisibility(GONE);
                                        layoutHeroSkill4.setVisibility(GONE);
                                        layoutHeroSkill5.setVisibility(GONE);
                                        layoutHeroSkill6.setVisibility(GONE);
                                        layoutHeroSkill7.setVisibility(GONE);
                                        layoutHeroSkill8.setVisibility(GONE);
                                        layoutHeroSkill9.setVisibility(GONE);
                                        layoutHeroSkill10.setVisibility(GONE);
                                        layoutHeroSkill11.setVisibility(GONE);
                                    }
                                });

                                switch (heroCode) {

                                    case ANA:

                                        final Ana anaRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Ana.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                imgHero.setImageResource(R.drawable.ana);
                                                txtHero.setText("Ana");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill1.setText(anaRecord.getQuickBestMeleeLastShotInGame());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("나노 강화제 주입");
                                                txtUserHeroSkill2.setText(anaRecord.getQuickNanoBoostsApplied());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("나노 강화제 도움");
                                                txtUserHeroSkill3.setText(anaRecord.getQuickNanoBoostsSupport());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("나노 강화제 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(anaRecord.getQuickBestNanoBoostsSupportInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("소총 명중률");
                                                txtUserHeroSkill5.setText(anaRecord.getQuickUnscopedAccuracy());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("저격 명중률");
                                                txtUserHeroSkill6.setText(anaRecord.getQuickScopedAccuracy());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("재운 적");
                                                txtUserHeroSkill7.setText(anaRecord.getQuickEnemySlept());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("재운적 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(anaRecord.getQuickBestEnemySleptInGame());
                                            }
                                        });

                                        break;

                                    case BASTION:

                                        final Bastion bastionRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Bastion.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                imgHero.setImageResource(R.drawable.bastion);
                                                txtHero.setText("Bastion");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("수색 모드로 처치");
                                                txtUserHeroSkill1.setText(bastionRecord.getQuickReconKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("경계 모드로 처치");
                                                txtUserHeroSkill2.setText(bastionRecord.getQuickSentryKill());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("전차 모드로 처치");
                                                txtUserHeroSkill3.setText(bastionRecord.getQuickTankKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("수색 모드로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(bastionRecord.getQuickBestReconKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("수색 모드로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(bastionRecord.getQuickBestSentryKillInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("전차 모드로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(bastionRecord.getQuickBestTankKillInGame());
                                            }
                                        });

                                        break;

                                    case DVA:

                                        final Dva dvaRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Dva.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.dva);
                                                txtHero.setText("Dva");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("호출한 로봇");
                                                txtUserHeroSkill1.setText(dvaRecord.getQuickMechCalled());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("호출한 로봇 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(dvaRecord.getQuickBestMechCalledInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("막은 피해");
                                                txtUserHeroSkill3.setText(dvaRecord.getQuickDamageBlocked());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(dvaRecord.getQuickBestDamageBlockedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("파괴된 로봇");
                                                txtUserHeroSkill5.setText(dvaRecord.getQuickMechDestroyed());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(dvaRecord.getQuickBestMeleeLastShotInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("자폭으로 처치");
                                                txtUserHeroSkill7.setText(dvaRecord.getQuickSelfDestructKill());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("자폭으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(dvaRecord.getQuickBestSelfDestructKill());
                                            }
                                        });

                                        break;

                                    case GENJI:

                                        final Genji genjiRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Genji.class);
                                        Log.d("aaaa", "겐지 전적 왔습니다요오");

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                imgHero.setImageResource(R.drawable.genji);
                                                txtHero.setText("Genji");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("용검으로 처치");
                                                txtUserHeroSkill1.setText(genjiRecord.getQuickDragonBladeKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("용검으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(genjiRecord.getQuickBestDragonBladeKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("튕겨낸 피해");
                                                txtUserHeroSkill3.setText(genjiRecord.getQuickDamageReflected());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("튕겨낸 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(genjiRecord.getQuickBestDamageReflectedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(genjiRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });

                                        break;

                                    case HANZO:

                                        final Hanzo hanzoRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Hanzo.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.hanzo);
                                                txtHero.setText("Hanzo");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("용의 일격으로 처치");
                                                txtUserHeroSkill1.setText(hanzoRecord.getQuickDragonStrikeKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("용의 일격으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(hanzoRecord.getQuickBestDragonStrikeKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("갈래 화살로 처치");
                                                txtUserHeroSkill3.setText(hanzoRecord.getQuickScatterArrowKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("갈래 화살로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(hanzoRecord.getQuickBestScatterArrowKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("처치 시야 지원 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(hanzoRecord.getQuickBestViewSupportInGame());
                                            }
                                        });


                                        break;

                                    case JUNKRAT:

                                        final Junkrat junkratRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Junkrat.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.junkrat);
                                                txtHero.setText("Junkrat");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("덫에 걸린 적");
                                                txtUserHeroSkill1.setText(junkratRecord.getQuickTrappedEnemy());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("덫에 걸린 적 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(junkratRecord.getQuickBestTrappedEnemyInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("죽이는 타이어로 처치");
                                                txtUserHeroSkill3.setText(junkratRecord.getQuickRiptireKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("죽이는 타이어로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(junkratRecord.getQuickBestRiptireKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("분당 덫에 걸린 적");
                                                txtUserHeroSkill5.setText(junkratRecord.getQuickTrappedEnemyPerMinute());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(junkratRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case LUCIO:

                                        final Lucio lucioRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Lucio.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                imgHero.setImageResource(R.drawable.lucio);
                                                txtHero.setText("Lucio");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("소리 방벽 제공");
                                                txtUserHeroSkill1.setText(lucioRecord.getQuickSoundBarrier());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("소리 방벽 제공 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(lucioRecord.getQuickBestSoundBarrierInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(lucioRecord.getQuickBestMeleeLastShotInGame());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("공격형 도움");
                                                txtUserHeroSkill4.setText(lucioRecord.getQuickAttackSupport());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("공격형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(lucioRecord.getQuickBestAttackSupportInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("방어형 도움");
                                                txtUserHeroSkill6.setText(lucioRecord.getQuickDefenceSupport());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("방어형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(lucioRecord.getQuickBestDefenceSupportInGame());

                                            }
                                        });

                                        break;

                                    case MCCREE:

                                        final Mccree mccreeRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Mccree.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.mccree);
                                                txtHero.setText("Mccree");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("황야의 무법자로 처치");
                                                txtUserHeroSkill1.setText(mccreeRecord.getQuickDeadEyeKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("황야의 무법자로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(mccreeRecord.getQuickBestDeadEyeKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("퍼스키퍼 난사로 처치");
                                                txtUserHeroSkill3.setText(mccreeRecord.getQuickFanTheHammerKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("퍼스키퍼 난사로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(mccreeRecord.getQuickBestFanTheHammerKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(mccreeRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });

                                        break;

                                    case MEI:

                                        final Mei meiRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Mei.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.mei);
                                                txtHero.setText("Mei");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("얼린 적");
                                                txtUserHeroSkill1.setText(meiRecord.getQuickEnemyFrozen());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("얼린 적 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(meiRecord.getQuickBestEnemyFrozenIngame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("눈보라로 처치");
                                                txtUserHeroSkill3.setText(meiRecord.getQuickBlizzardKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("눈보라로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(meiRecord.getQuickBestBlizzardKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("막은 피해");
                                                txtUserHeroSkill5.setText(meiRecord.getQuickDamageBloked());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(meiRecord.getQuickBestDamageBlockedInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(meiRecord.getQuickBestMeleeLastShotInGame());

                                            }
                                        });

                                        break;

                                    case MERCY:

                                        final Mercy mercyRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Mercy.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.mercy);
                                                txtHero.setText("Mercy");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("부활한 플레이어");
                                                txtUserHeroSkill1.setText(mercyRecord.getQuickResurrected());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("부활한 플레이어 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(mercyRecord.getQuickBestResurrectedInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(mercyRecord.getQuickBestMeleeLastShotInGame());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("블라스터로 처치");
                                                txtUserHeroSkill4.setText(mercyRecord.getQuickBlasterKill());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("블라스터로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(mercyRecord.getQuickBestBlasterKillInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("공격형 도움");
                                                txtUserHeroSkill6.setText(mercyRecord.getQuickAttackSupport());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("공격형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(mercyRecord.getQuickBestAttackSupportInGame());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("방어형 도움");
                                                txtUserHeroSkill8.setText(mercyRecord.getQuickDefenceSupport());
                                                layoutHeroSkill9.setVisibility(View.VISIBLE);
                                                txtHeroSkill9.setText("방어형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill9.setText(mercyRecord.getQuickBestDefenceSupportInGame());
                                            }
                                        });

                                        break;

                                    case PHARAH:

                                        final Pharah pharahRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Pharah.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.pharah);
                                                txtHero.setText("Pharah");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("로켓 명중");
                                                txtUserHeroSkill1.setText(pharahRecord.getQuickRocketHit());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("포화로 처치");
                                                txtUserHeroSkill2.setText(pharahRecord.getQuickBarrageKill());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("로켓 명중 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(pharahRecord.getQuickBestRocketHitInGame());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("포화로 처치 - 한게임 최고기록");
                                                txtUserHeroSkill4.setText(pharahRecord.getQuickBestBarrageKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(pharahRecord.getQuickBestMeleeLastShotInGame());

                                            }
                                        });

                                        break;

                                    case REAPER:

                                        final Reaper reaperRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Reaper.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.reaper);
                                                txtHero.setText("Reaper");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("거둔 영혼");
                                                txtUserHeroSkill1.setText(reaperRecord.getQuickSoulConsumed());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("죽음의 꽃으로 처치");
                                                txtUserHeroSkill2.setText(reaperRecord.getQuickDeathBlossomKill());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("거둔 영혼 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(reaperRecord.getQuickMostSoulComsumed());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("죽음의 꽃으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(reaperRecord.getQuickMostDeathBlossomKill());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(reaperRecord.getQuickMostMeleeLastShot());
                                            }
                                        });

                                        break;

                                    case REINHARDT:

                                        final Reinhardt reinhardtRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Reinhardt.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.reinhardt);
                                                txtHero.setText("Reinhardt");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("막은 피해");
                                                txtUserHeroSkill1.setText(reinhardtRecord.getQuickDamageBlocked());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(reinhardtRecord.getQuickBestDamageBlockedInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("돌진으로 처치");
                                                txtUserHeroSkill3.setText(reinhardtRecord.getQuickChargeKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("돌진으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(reinhardtRecord.getQuickBestChargeKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("화염 강타로 처치");
                                                txtUserHeroSkill5.setText(reinhardtRecord.getQuickFireStrikeKill());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("화염 강타로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(reinhardtRecord.getQuickBestFireStrikeKillInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("대지분쇄로 처치");
                                                txtUserHeroSkill7.setText(reinhardtRecord.getQuickEarthShatterKill());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("대지분쇄로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(reinhardtRecord.getQuickBestEarthShatterKillInGame());
                                            }
                                        });


                                        break;

                                    case ROADHOG:

                                        final Roadhog roadhogRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Roadhog.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.roadhog);
                                                txtHero.setText("Roadhog");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("갈고리로 끌어오기");
                                                txtUserHeroSkill1.setText(roadhogRecord.getQuickHook());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("갈고리로 끌어오기 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(roadhogRecord.getQuickBestHookInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("갈고리 시도");
                                                txtUserHeroSkill3.setText(roadhogRecord.getQuickHookAttempted());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("갈고리 명중률");
                                                txtUserHeroSkill4.setText(roadhogRecord.getQuickHookAccuracy());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("갈고리 명중률 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(roadhogRecord.getQuickBestHookAccuracyInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("돼재앙으로 처치");
                                                txtUserHeroSkill6.setText(roadhogRecord.getQuickWholeHogKill());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("돼재앙으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(roadhogRecord.getQuickBestWholeHogKillInGame());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(roadhogRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case SOLDIER:

                                        final Soldier soldierRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Soldier.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.soldier);
                                                txtHero.setText("Solider");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("나선 로켓으로 처치");
                                                txtUserHeroSkill1.setText(soldierRecord.getQuickHelixRocketKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("나선 로켓으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(soldierRecord.getQuickBestHelixaRoacketKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("전술 조준경으로 처치");
                                                txtUserHeroSkill3.setText(soldierRecord.getQuickTacticalVisorKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("전술 조준경으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(soldierRecord.getQuickBestHelixaRoacketKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("생체장 생성");
                                                txtUserHeroSkill5.setText(soldierRecord.getQuickBioticFieldDeployed());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("생체장으로 치유");
                                                txtUserHeroSkill6.setText(soldierRecord.getQuickBioticFieldHeal());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(soldierRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });

                                        break;

                                    case SYMMETRA:

                                        final Symmetra symmetraRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Symmetra.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.symmetra);
                                                txtHero.setText("Symmetra");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("감시 포탑으로 처치");
                                                txtUserHeroSkill1.setText(symmetraRecord.getQuickTurretKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("감시 포탑으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(symmetraRecord.getQuickBestTurretKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("순간이동한 플레이어");
                                                txtUserHeroSkill3.setText(symmetraRecord.getQuickPlayerTeleported());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("순간이동한 플레이어 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(symmetraRecord.getQuickBestPlayerTeleportedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("보호막 제공");
                                                txtUserHeroSkill5.setText(symmetraRecord.getQuickShieldProvided());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("보호막 제공 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(symmetraRecord.getQuickBestShieldProvidedInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("순간이동기 가동 시간");
                                                txtUserHeroSkill7.setText(symmetraRecord.getQuickTeleportUpTime());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("순간이동기 가동 시간 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(symmetraRecord.getQuickBestTeleportUpTimeInGame());
                                            }
                                        });

                                        break;

                                    case TORBJON:

                                        final Torbjon torbjonRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Torbjon.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.torbjon);
                                                txtHero.setText("Torbjon");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("생성한 방어구 팩");
                                                txtUserHeroSkill1.setText(torbjonRecord.getQuickArmorPackCreated());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("토르비욘이 직접 처치");
                                                txtUserHeroSkill2.setText(torbjonRecord.getQuickTorbjonKill());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("토르비욘이 직접 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(torbjonRecord.getQuickBestTorbjonKillInGame());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("포탑으로 처치");
                                                txtUserHeroSkill4.setText(torbjonRecord.getQuickTurretKill());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("초고열 용광로로 처치");
                                                txtUserHeroSkill5.setText(torbjonRecord.getQuickMoltenCoreKill());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("초고열 용광로로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(torbjonRecord.getQuickBestMoltenCoreKillInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(torbjonRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case TRACER:

                                        final Tracer tracerRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Tracer.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.tracer);
                                                txtHero.setText("Tracer");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("펄스 폭탄으로 처치");
                                                txtUserHeroSkill1.setText(tracerRecord.getQuickPulseBombKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("펄스 폭탄으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(tracerRecord.getQuickBestPulseBombKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("펄스 폭탄 부착");
                                                txtUserHeroSkill3.setText(tracerRecord.getQuickPulseBombAttached());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("펄스 폭탄 부착 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(tracerRecord.getQuickBestPulsBombAttachedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(tracerRecord.getQuickMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case WIDOWMAKER:

                                        final Widowmaker widowmakerRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Widowmaker.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.widowmaker);
                                                txtHero.setText("Widowmaker");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("맹독 지뢰로 처치");
                                                txtUserHeroSkill1.setText(widowmakerRecord.getQuickVenomMineKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("맹독 지뢰로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(widowmakerRecord.getQuickBestVenomMineKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("저격 치명타");
                                                txtUserHeroSkill3.setText(widowmakerRecord.getQuickScopedCritical());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("저격 치명타 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(widowmakerRecord.getQuickBestScopedCriticalInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("처치 사야 지원 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(widowmakerRecord.getQuickBestViewSupportInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("저격 명중률");
                                                txtUserHeroSkill6.setText(widowmakerRecord.getQuickScopedAccuracy());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("저격 명중률 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(widowmakerRecord.getQuickBestScopedAccuracyInGame());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(widowmakerRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case WINSTON:

                                        final Winston winstonRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Winston.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.winston);
                                                txtHero.setText("Winston");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("밀쳐낸 플레이어");
                                                txtUserHeroSkill1.setText(winstonRecord.getQuickKnockedBack());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("밀쳐낸 플레이어 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(winstonRecord.getQuickBestKnockedBackInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("막은 피해");
                                                txtUserHeroSkill3.setText(winstonRecord.getQuickDamageBlocked());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(winstonRecord.getQuickBestDamageBlockedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격으로 처치");
                                                txtUserHeroSkill5.setText(winstonRecord.getQuickMeleeKill());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("근접 공격으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(winstonRecord.getQuickBestMeleeKillInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("점프 팩으로 처치");
                                                txtUserHeroSkill7.setText(winstonRecord.getQuickJumpPackKill());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("점프 팩으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(winstonRecord.getQuickBestJumpPackKillInGame());
                                                layoutHeroSkill9.setVisibility(View.VISIBLE);
                                                txtHeroSkill9.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill9.setText(winstonRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case ZARYA:

                                        final Zarya zaryaRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Zarya.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.zarya);
                                                txtHero.setText("Zarya");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("막은 피해");
                                                txtUserHeroSkill1.setText(zaryaRecord.getQuickDamageBlocked());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(zaryaRecord.getQuickBestDamageBlockedInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("중력탄으로 처치");
                                                txtUserHeroSkill3.setText(zaryaRecord.getQuickGravitonSurgeKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("중력탄으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(zaryaRecord.getQuickBestGravitonKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("고에너지로 처치");
                                                txtUserHeroSkill5.setText(zaryaRecord.getQuickHignEnergyKill());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("고에너지로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(zaryaRecord.getQuickBestHignEnergyKillInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("방벽 씌우기");
                                                txtUserHeroSkill7.setText(zaryaRecord.getQuickBarrier());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("방벽 씌우기 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(zaryaRecord.getQuickBestBarrierInGame());
                                                layoutHeroSkill9.setVisibility(View.VISIBLE);
                                                txtHeroSkill9.setText("평균 에너지 - 한 게임 최고기록");
                                                txtUserHeroSkill9.setText(zaryaRecord.getQuickBestAverageEnergyInGame());
                                            }
                                        });


                                        break;

                                    case ZENYATTA:

                                        final Zenyatta zenyattaRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), Zenyatta.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.zenyatta);
                                                txtHero.setText("Zenyatta");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("초월로 치유");
                                                txtUserHeroSkill1.setText(zenyattaRecord.getQuickTranscendenceHeal());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("초월로 치유 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(zenyattaRecord.getQuickBestTranscendenceHeal());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("공격형 도움");
                                                txtUserHeroSkill3.setText(zenyattaRecord.getQuickAttackSupport());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("공격형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(zenyattaRecord.getQuickBestAttackSupportInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("방어형 도움");
                                                txtUserHeroSkill5.setText(zenyattaRecord.getQuickDefenceSupport());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("방어형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(zenyattaRecord.getQuickBestDefenceSupportInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(zenyattaRecord.getQuickBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                }


                            } else if (responseCode == 4 && gameType.equals("rank")) {

                                final RankCharacter rankCharacterRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), RankCharacter.class);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        layoutQuickRankChoice.setVisibility(GONE);
                                        scrollViewHero.setVisibility(GONE);
                                        ;
                                        layoutHeroRecord.setVisibility(View.VISIBLE);
                                        txtUserHeroWinLosePercentage.setText(rankCharacterRecord.getRankWinRate() + "%");
                                        txtUserHeroKillDeathPercentage.setText(rankCharacterRecord.getRankKda());
                                        txtUserHeroGameCount.setText(rankCharacterRecord.getRankGameCount());
                                        txtUserHeroAvgFloodTime.setText(String.format("%.1f", (((double) Integer.parseInt(rankCharacterRecord.getRankFloodTime()) / (double) Integer.parseInt(rankCharacterRecord.getRankGameCount())))) + "s");
                                        txtComment.setText(rankCharacterRecord.getReputation());
                                        txtHereGoldMedal.setText(rankCharacterRecord.getRankGoldMedal());
                                        txtHeroSilverMedal.setText(rankCharacterRecord.getRankSilverMedal());
                                        txtHeroBronzeMedal.setText(rankCharacterRecord.getRankBronzeMedal());
                                        txtUserHeroKill.setText(rankCharacterRecord.getRankKill());
                                        txtUserHeroLastShot.setText(rankCharacterRecord.getRankLastShot());
                                        txtUserHeroSoloKill.setText(rankCharacterRecord.getRankSoloKill());
                                        txtUserHeroDeal.setText(rankCharacterRecord.getRankDeal());
                                        txtUserHeroMissionKill.setText(rankCharacterRecord.getRankMissionKill());
                                        txtUserHeroOneCombo.setText(rankCharacterRecord.getRankOneCombo());
                                        txtUserHeroMeleeLastShot.setText(rankCharacterRecord.getRankMeleeLastShot());
                                        txtUserHeroCritical.setText(rankCharacterRecord.getRankCritical());
                                        txtUserHeroCriticalAccuracy.setText(rankCharacterRecord.getRankCriticalAccuracy());
                                        txtUserHeroAccuracy.setText(rankCharacterRecord.getRankAccuracy());
                                        txtUserHeroDestroyTeleport.setText(rankCharacterRecord.getRankDestroyTelePort());
                                        txtUserHeroSelfHeal.setText(rankCharacterRecord.getRankSelfHeal());
                                        txtUserHeroBestKillInLife.setText(rankCharacterRecord.getRankBestKillInLife());
                                        txtUserHeroBestDealInLife.setText(rankCharacterRecord.getRankBestDealInLife());
                                        txtUserHeroBestHealInLife.setText(rankCharacterRecord.getRankBestHealInLife());
                                        txtUserHeroBestDealInGame.setText(rankCharacterRecord.getRankBestDealInGame());
                                        txtUserHeroBestHealInGame.setText(rankCharacterRecord.getRankBestHealInGame());
                                        txtUserHeroBestKillInGame.setText(rankCharacterRecord.getRankBestKillInGame());
                                        txtUserHeroBestLastShotInGame.setText(rankCharacterRecord.getRankBestLastShotInGame());
                                        txtUserHeroBestMissionKillInGame.setText(rankCharacterRecord.getRankBestMissionKillInGame());
                                        txtUserHeroBestMissionTimeInGame.setText(rankCharacterRecord.getRankBestMissionTimeInGame());
                                        txtUserHeroBestSoloKillInGame.setText(rankCharacterRecord.getRankBestSoloKillInGame());
                                        txtUserHeroBestCriticalInGame.setText(rankCharacterRecord.getRankBestCriticalInGame());
                                        txtUserHeroBestSelfHealInGame.setText(rankCharacterRecord.getRankBestSelfHealInGame());
                                        txtUserHeroDeath.setText(rankCharacterRecord.getRankDeath());
                                        txtUserHeroEnvironmentDeath.setText(rankCharacterRecord.getRankEnvironmentDeath());
                                        txtUserHeroCard.setText(rankCharacterRecord.getRankCard());
                                        txtUserHeroPlayTime.setText(rankCharacterRecord.getRankPlayTime());
                                        txtUserHeroWin.setText(rankCharacterRecord.getRankWin());
                                        txtUserHeroMissionTime.setText(rankCharacterRecord.getRankMissionTime());
                                        txtUserHeroFloodTime.setText(rankCharacterRecord.getRankFloodTime());
                                        layoutHeroSkill1.setVisibility(GONE);
                                        layoutHeroSkill2.setVisibility(GONE);
                                        layoutHeroSkill3.setVisibility(GONE);
                                        layoutHeroSkill4.setVisibility(GONE);
                                        layoutHeroSkill5.setVisibility(GONE);
                                        layoutHeroSkill6.setVisibility(GONE);
                                        layoutHeroSkill7.setVisibility(GONE);
                                        layoutHeroSkill8.setVisibility(GONE);
                                        layoutHeroSkill9.setVisibility(GONE);
                                        layoutHeroSkill10.setVisibility(GONE);
                                        layoutHeroSkill11.setVisibility(GONE);
                                    }
                                });

                                switch (heroCode) {

                                    case ANA:

                                        final AnaRank anaRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), AnaRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                imgHero.setImageResource(R.drawable.ana);
                                                txtHero.setText("Ana");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill1.setText(anaRecord.getRankBestMeleeLastShotInGame());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("나노 강화제 주입");
                                                txtUserHeroSkill2.setText(anaRecord.getRankNanoBoostsApplied());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("나노 강화제 도움");
                                                txtUserHeroSkill3.setText(anaRecord.getRankNanoBoostsSupport());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("나노 강화제 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(anaRecord.getRankBestNanoBoostsSupportInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("소총 명중률");
                                                txtUserHeroSkill5.setText(anaRecord.getRankUnscopedAccuracy());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("저격 명중률");
                                                txtUserHeroSkill6.setText(anaRecord.getRankScopedAccuracy());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("재운 적");
                                                txtUserHeroSkill7.setText(anaRecord.getRankEnemySlept());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("재운적 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(anaRecord.getRankBestEnemySleptInGame());
                                            }
                                        });

                                        break;

                                    case BASTION:

                                        final BastionRank bastionRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), BastionRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                imgHero.setImageResource(R.drawable.bastion);
                                                txtHero.setText("Bastion");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("수색 모드로 처치");
                                                txtUserHeroSkill1.setText(bastionRecord.getRankReconKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("경계 모드로 처치");
                                                txtUserHeroSkill2.setText(bastionRecord.getRankSentryKill());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("전차 모드로 처치");
                                                txtUserHeroSkill3.setText(bastionRecord.getRankTankKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("수색 모드로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(bastionRecord.getRankBestReconKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("수색 모드로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(bastionRecord.getRankBestSentryKillInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("전차 모드로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(bastionRecord.getRankBestTankKillInGame());
                                            }
                                        });

                                        break;

                                    case DVA:

                                        final DvaRank dvaRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), DvaRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.dva);
                                                txtHero.setText("Dva");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("호출한 로봇");
                                                txtUserHeroSkill1.setText(dvaRecord.getRankMechCalled());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("호출한 로봇 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(dvaRecord.getRankBestMechCalledInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("막은 피해");
                                                txtUserHeroSkill3.setText(dvaRecord.getRankDamageBlocked());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(dvaRecord.getRankBestDamageBlockedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("파괴된 로봇");
                                                txtUserHeroSkill5.setText(dvaRecord.getRankMechDestroyed());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(dvaRecord.getRankBestMeleeLastShotInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("자폭으로 처치");
                                                txtUserHeroSkill7.setText(dvaRecord.getRankSelfDestructKill());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("자폭으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(dvaRecord.getRankBestSelfDestructKill());
                                            }
                                        });

                                        break;

                                    case GENJI:

                                        final GenjiRank genjiRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), GenjiRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.genji);
                                                txtHero.setText("Genji");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("용검으로 처치");
                                                txtUserHeroSkill1.setText(genjiRecord.getRankDragonBladeKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("용검으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(genjiRecord.getRankBestDragonBladeKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("튕겨낸 피해");
                                                txtUserHeroSkill3.setText(genjiRecord.getRankDamageReflected());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("튕겨낸 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(genjiRecord.getRankBestDamageReflectedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(genjiRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });

                                        break;

                                    case HANZO:

                                        final HanzoRank hanzoRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), HanzoRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.hanzo);
                                                txtHero.setText("Hanzo");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("용의 일격으로 처치");
                                                txtUserHeroSkill1.setText(hanzoRecord.getRankDragonStrikeKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("용의 일격으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(hanzoRecord.getRankBestDragonStrikeKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("갈래 화살로 처치");
                                                txtUserHeroSkill3.setText(hanzoRecord.getRankScatterArrowKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("갈래 화살로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(hanzoRecord.getRankBestScatterArrowKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("처치 시야 지원 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(hanzoRecord.getRankBestViewSupportInGame());
                                            }
                                        });


                                        break;

                                    case JUNKRAT:

                                        final JunkratRank junkratRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), JunkratRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.junkrat);
                                                txtHero.setText("Junkrat");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("덫에 걸린 적");
                                                txtUserHeroSkill1.setText(junkratRecord.getRankTrappedEnemy());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("덫에 걸린 적 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(junkratRecord.getRankBestTrappedEnemyInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("죽이는 타이어로 처치");
                                                txtUserHeroSkill3.setText(junkratRecord.getRankRiptireKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("죽이는 타이어로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(junkratRecord.getRankBestRiptireKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("분당 덫에 걸린 적");
                                                txtUserHeroSkill5.setText(junkratRecord.getRankTrappedEnemyPerMinute());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(junkratRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case LUCIO:

                                        final LucioRank lucioRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), LucioRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                imgHero.setImageResource(R.drawable.lucio);
                                                txtHero.setText("Lucio");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("소리 방벽 제공");
                                                txtUserHeroSkill1.setText(lucioRecord.getRankSoundBarrier());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("소리 방벽 제공 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(lucioRecord.getRankBestSoundBarrierInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(lucioRecord.getRankBestMeleeLastShotInGame());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("공격형 도움");
                                                txtUserHeroSkill4.setText(lucioRecord.getRankAttackSupport());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("공격형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(lucioRecord.getRankBestAttackSupportInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("방어형 도움");
                                                txtUserHeroSkill6.setText(lucioRecord.getRankDefenceSupport());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("방어형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(lucioRecord.getRankBestDefenceSupportInGame());
                                            }
                                        });

                                        break;

                                    case MCCREE:

                                        final MccreeRank mccreeRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), MccreeRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.mccree);
                                                txtHero.setText("Mccree");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("황야의 무법자로 처치");
                                                txtUserHeroSkill1.setText(mccreeRecord.getRankDeadEyeKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("황야의 무법자로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(mccreeRecord.getRankBestDeadEyeKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("퍼스키퍼 난사로 처치");
                                                txtUserHeroSkill3.setText(mccreeRecord.getRankFanTheHammerKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("퍼스키퍼 난사로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(mccreeRecord.getRankBestFanTheHammerKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(mccreeRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });

                                        break;

                                    case MEI:

                                        final MeiRank meiRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), MeiRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.mei);
                                                txtHero.setText("Mei");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("얼린 적");
                                                txtUserHeroSkill1.setText(meiRecord.getRankEnemyFrozen());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("얼린 적 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(meiRecord.getRankBestEnemyFrozenIngame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("눈보라로 처치");
                                                txtUserHeroSkill3.setText(meiRecord.getRankBlizzardKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("눈보라로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(meiRecord.getRankBestBlizzardKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("막은 피해");
                                                txtUserHeroSkill5.setText(meiRecord.getRankDamageBloked());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(meiRecord.getRankBestDamageBlockedInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(meiRecord.getRankBestMeleeLastShotInGame());

                                            }
                                        });

                                        break;

                                    case MERCY:

                                        final MercyRank mercyRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), MercyRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.mercy);
                                                txtHero.setText("Mercy");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("부활한 플레이어");
                                                txtUserHeroSkill1.setText(mercyRecord.getRankResurrected());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("부활한 플레이어 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(mercyRecord.getRankBestResurrectedInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(mercyRecord.getRankBestMeleeLastShotInGame());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("블라스터로 처치");
                                                txtUserHeroSkill4.setText(mercyRecord.getRankBlasterKill());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("블라스터로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(mercyRecord.getRankBestBlasterKillInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("공격형 도움");
                                                txtUserHeroSkill6.setText(mercyRecord.getRankAttackSupport());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("공격형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(mercyRecord.getRankBestAttackSupportInGame());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("방어형 도움");
                                                txtUserHeroSkill8.setText(mercyRecord.getRankDefenceSupport());
                                                layoutHeroSkill9.setVisibility(View.VISIBLE);
                                                txtHeroSkill9.setText("방어형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill9.setText(mercyRecord.getRankBestDefenceSupportInGame());
                                            }
                                        });

                                        break;

                                    case PHARAH:

                                        final PharahRank pharahRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), PharahRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.pharah);
                                                txtHero.setText("Pharah");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("로켓 명중");
                                                txtUserHeroSkill1.setText(pharahRecord.getRankRocketHit());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("포화로 처치");
                                                txtUserHeroSkill2.setText(pharahRecord.getRankBarrageKill());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("로켓 명중 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(pharahRecord.getRankBestRocketHitInGame());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("포화로 처치 - 한게임 최고기록");
                                                txtUserHeroSkill4.setText(pharahRecord.getRankBestBarrageKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(pharahRecord.getRankBestMeleeLastShotInGame());

                                            }
                                        });

                                        break;

                                    case REAPER:

                                        final ReaperRank reaperRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), ReaperRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.reaper);
                                                txtHero.setText("Reaper");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("거둔 영혼");
                                                txtUserHeroSkill1.setText(reaperRecord.getRankSoulConsumed());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("죽음의 꽃으로 처치");
                                                txtUserHeroSkill2.setText(reaperRecord.getRankDeathBlossomKill());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("거둔 영혼 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(reaperRecord.getRankMostSoulComsumed());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("죽음의 꽃으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(reaperRecord.getRankMostDeathBlossomKill());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(reaperRecord.getRankMostMeleeLastShot());
                                            }
                                        });

                                        break;

                                    case REINHARDT:

                                        final ReinhardtRank reinhardtRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), ReinhardtRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.reinhardt);
                                                txtHero.setText("Reinhardt");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("막은 피해");
                                                txtUserHeroSkill1.setText(reinhardtRecord.getRankDamageBlocked());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(reinhardtRecord.getRankBestDamageBlockedInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("돌진으로 처치");
                                                txtUserHeroSkill3.setText(reinhardtRecord.getRankChargeKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("돌진으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(reinhardtRecord.getRankBestChargeKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("화염 강타로 처치");
                                                txtUserHeroSkill5.setText(reinhardtRecord.getRankFireStrikeKill());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("화염 강타로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(reinhardtRecord.getRankBestFireStrikeKillInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("대지분쇄로 처치");
                                                txtUserHeroSkill7.setText(reinhardtRecord.getRankEarthShatterKill());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("대지분쇄로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(reinhardtRecord.getRankBestEarthShatterKillInGame());
                                            }
                                        });


                                        break;

                                    case ROADHOG:

                                        final RoadhogRank roadhogRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), RoadhogRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.roadhog);
                                                txtHero.setText("Roadhog");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("갈고리로 끌어오기");
                                                txtUserHeroSkill1.setText(roadhogRecord.getRankHook());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("갈고리로 끌어오기 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(roadhogRecord.getRankBestHookInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("갈고리 시도");
                                                txtUserHeroSkill3.setText(roadhogRecord.getRankHookAttempted());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("갈고리 명중률");
                                                txtUserHeroSkill4.setText(roadhogRecord.getRankHookAccuracy());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("갈고리 명중률 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(roadhogRecord.getRankBestHookAccuracyInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("돼재앙으로 처치");
                                                txtUserHeroSkill6.setText(roadhogRecord.getRankWholeHogKill());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("돼재앙으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(roadhogRecord.getRankBestWholeHogKillInGame());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(roadhogRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case SOLDIER:

                                        final SoldierRank soldierRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), SoldierRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.soldier);
                                                txtHero.setText("Solider");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("나선 로켓으로 처치");
                                                txtUserHeroSkill1.setText(soldierRecord.getRankHelixRocketKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("나선 로켓으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(soldierRecord.getRankBestHelixaRoacketKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("전술 조준경으로 처치");
                                                txtUserHeroSkill3.setText(soldierRecord.getRankTacticalVisorKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("전술 조준경으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(soldierRecord.getRankBestHelixaRoacketKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("생체장 생성");
                                                txtUserHeroSkill5.setText(soldierRecord.getRankBioticFieldDeployed());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("생체장으로 치유");
                                                txtUserHeroSkill6.setText(soldierRecord.getRankBioticFieldHeal());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(soldierRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });

                                        break;

                                    case SYMMETRA:

                                        final SymmetraRank symmetraRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), SymmetraRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.symmetra);
                                                txtHero.setText("Symmetra");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("감시 포탑으로 처치");
                                                txtUserHeroSkill1.setText(symmetraRecord.getRankTurretKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("감시 포탑으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(symmetraRecord.getRankBestTurretKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("순간이동한 플레이어");
                                                txtUserHeroSkill3.setText(symmetraRecord.getRankPlayerTeleported());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("순간이동한 플레이어 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(symmetraRecord.getRankBestPlayerTeleportedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("보호막 제공");
                                                txtUserHeroSkill5.setText(symmetraRecord.getRankShieldProvided());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("보호막 제공 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(symmetraRecord.getRankBestShieldProvidedInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("순간이동기 가동 시간");
                                                txtUserHeroSkill7.setText(symmetraRecord.getRankTeleportUpTime());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("순간이동기 가동 시간 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(symmetraRecord.getRankBestTeleportUpTimeInGame());
                                            }
                                        });

                                        break;

                                    case TORBJON:

                                        final TorbjonRank torbjonRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), TorbjonRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.torbjon);
                                                txtHero.setText("Torbjon");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("생성한 방어구 팩");
                                                txtUserHeroSkill1.setText(torbjonRecord.getRankArmorPackCreated());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("토르비욘이 직접 처치");
                                                txtUserHeroSkill2.setText(torbjonRecord.getRankTorbjonKill());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("토르비욘이 직접 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill3.setText(torbjonRecord.getRankBestTorbjonKillInGame());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("포탑으로 처치");
                                                txtUserHeroSkill4.setText(torbjonRecord.getRankTurretKill());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("초고열 용광로로 처치");
                                                txtUserHeroSkill5.setText(torbjonRecord.getRankMoltenCoreKill());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("초고열 용광로로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(torbjonRecord.getRankBestMoltenCoreKillInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(torbjonRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case TRACER:

                                        final TracerRank tracerRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), TracerRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.tracer);
                                                txtHero.setText("Tracer");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("펄스 폭탄으로 처치");
                                                txtUserHeroSkill1.setText(tracerRecord.getRankPulseBombKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("펄스 폭탄으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(tracerRecord.getRankBestPulseBombKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("펄스 폭탄 부착");
                                                txtUserHeroSkill3.setText(tracerRecord.getRankPulseBombAttached());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("펄스 폭탄 부착 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(tracerRecord.getRankBestPulsBombAttachedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(tracerRecord.getRankMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case WIDOWMAKER:

                                        final WidowmakerRank widowmakerRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), WidowmakerRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.widowmaker);
                                                txtHero.setText("Widowmaker");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("맹독 지뢰로 처치");
                                                txtUserHeroSkill1.setText(widowmakerRecord.getRankVenomMineKill());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("맹독 지뢰로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(widowmakerRecord.getRankBestVenomMineKillInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("저격 치명타");
                                                txtUserHeroSkill3.setText(widowmakerRecord.getRankScopedCritical());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("저격 치명타 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(widowmakerRecord.getRankBestScopedCriticalInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("처치 사야 지원 - 한 게임 최고기록");
                                                txtUserHeroSkill5.setText(widowmakerRecord.getRankBestViewSupportInGame());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("저격 명중률");
                                                txtUserHeroSkill6.setText(widowmakerRecord.getRankScopedAccuracy());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("저격 명중률 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(widowmakerRecord.getRankBestScopedAccuracyInGame());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(widowmakerRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case WINSTON:

                                        final WinstonRank winstonRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), WinstonRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.winston);
                                                txtHero.setText("Winston");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("밀쳐낸 플레이어");
                                                txtUserHeroSkill1.setText(winstonRecord.getRankKnockedBack());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("밀쳐낸 플레이어 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(winstonRecord.getRankBestKnockedBackInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("막은 피해");
                                                txtUserHeroSkill3.setText(winstonRecord.getRankDamageBlocked());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(winstonRecord.getRankBestDamageBlockedInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("근접 공격으로 처치");
                                                txtUserHeroSkill5.setText(winstonRecord.getRankMeleeKill());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("근접 공격으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(winstonRecord.getRankBestMeleeKillInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("점프 팩으로 처치");
                                                txtUserHeroSkill7.setText(winstonRecord.getRankJumpPackKill());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("점프 팩으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(winstonRecord.getRankBestJumpPackKillInGame());
                                                layoutHeroSkill9.setVisibility(View.VISIBLE);
                                                txtHeroSkill9.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill9.setText(winstonRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;

                                    case ZARYA:

                                        final ZaryaRank zaryaRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), ZaryaRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.zarya);
                                                txtHero.setText("Zarya");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("막은 피해");
                                                txtUserHeroSkill1.setText(zaryaRecord.getRankDamageBlocked());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("막은 피해 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(zaryaRecord.getRankBestDamageBlockedInGame());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("중력탄으로 처치");
                                                txtUserHeroSkill3.setText(zaryaRecord.getRankGravitonSurgeKill());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("중력탄으로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(zaryaRecord.getRankBestGravitonKillInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("고에너지로 처치");
                                                txtUserHeroSkill5.setText(zaryaRecord.getRankHignEnergyKill());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("고에너지로 처치 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(zaryaRecord.getRankBestHignEnergyKillInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("방벽 씌우기");
                                                txtUserHeroSkill7.setText(zaryaRecord.getRankBarrier());
                                                layoutHeroSkill8.setVisibility(View.VISIBLE);
                                                txtHeroSkill8.setText("방벽 씌우기 - 한 게임 최고기록");
                                                txtUserHeroSkill8.setText(zaryaRecord.getRankBestBarrierInGame());
                                                layoutHeroSkill9.setVisibility(View.VISIBLE);
                                                txtHeroSkill9.setText("평균 에너지 - 한 게임 최고기록");
                                                txtUserHeroSkill9.setText(zaryaRecord.getRankBestAverageEnergyInGame());
                                            }
                                        });


                                        break;

                                    case ZENYATTA:

                                        final ZenyattaRank zenyattaRecord = gson.fromJson(jsonObject.getJSONObject("heroData").toString(), ZenyattaRank.class);

                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {

                                                imgHero.setImageResource(R.drawable.zenyatta);
                                                txtHero.setText("Zenyatta");
                                                layoutHeroSkill1.setVisibility(View.VISIBLE);
                                                txtHeroSkill1.setText("초월로 치유");
                                                txtUserHeroSkill1.setText(zenyattaRecord.getRankTranscendenceHeal());
                                                layoutHeroSkill2.setVisibility(View.VISIBLE);
                                                txtHeroSkill2.setText("초월로 치유 - 한 게임 최고기록");
                                                txtUserHeroSkill2.setText(zenyattaRecord.getRankBestTranscendenceHeal());
                                                layoutHeroSkill3.setVisibility(View.VISIBLE);
                                                txtHeroSkill3.setText("공격형 도움");
                                                txtUserHeroSkill3.setText(zenyattaRecord.getRankAttackSupport());
                                                layoutHeroSkill4.setVisibility(View.VISIBLE);
                                                txtHeroSkill4.setText("공격형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill4.setText(zenyattaRecord.getRankBestAttackSupportInGame());
                                                layoutHeroSkill5.setVisibility(View.VISIBLE);
                                                txtHeroSkill5.setText("방어형 도움");
                                                txtUserHeroSkill5.setText(zenyattaRecord.getRankDefenceSupport());
                                                layoutHeroSkill6.setVisibility(View.VISIBLE);
                                                txtHeroSkill6.setText("방어형 도움 - 한 게임 최고기록");
                                                txtUserHeroSkill6.setText(zenyattaRecord.getRankBestDefenceSupportInGame());
                                                layoutHeroSkill7.setVisibility(View.VISIBLE);
                                                txtHeroSkill7.setText("근접 공격 결정타 - 한 게임 최고기록");
                                                txtUserHeroSkill7.setText(zenyattaRecord.getRankBestMeleeLastShotInGame());
                                            }
                                        });


                                        break;
                                }


                            } else if (responseCode == 5) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "해당 아이디의 정보가 존재하지않습니다.", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            } else {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "서버오류입니다. 다시 시도해주세요.", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }
                        }else  if(!response.isSuccessful()){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "플레이하지 않은 영웅이거나, 일시적인 서버 오류 입니다.", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                        }catch(Exception e){
                            Log.d("error", "Gson error is " + e.toString());
                        }


                }

            });
        }


    }
}
